package com.lolanalysis.project.services;

import com.lolanalysis.project.clients.RiotApiMatchClient;
import com.lolanalysis.project.clients.RiotApiUserClient;
import com.lolanalysis.project.models.matchAverage.MatchDetailsAv;
import com.lolanalysis.project.models.matchAverage.MatchDetailsAverage;
import com.lolanalysis.project.models.match.MatchDetails;
import com.lolanalysis.project.models.match.Participant;
import com.lolanalysis.project.models.timeline.MatchTimeline;
import com.lolanalysis.project.models.User;
import com.lolanalysis.project.utils.MatchDetailAverageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class RiotService {

    @Value("${riot.api.key}")
    private String apiKey;

    private final RiotApiUserClient riotApiUserClient;
    private final RiotApiMatchClient riotApiMatch;
    private final ChatGptService chatGptService;

    @Autowired
    public RiotService(RiotApiUserClient riotApiUserClient, RiotApiMatchClient riotApiMatch, ChatGptService chatGptService){
        this.riotApiUserClient = riotApiUserClient;
        this.riotApiMatch = riotApiMatch;
        this.chatGptService = chatGptService;
    }

    public User getUser(String name) {
        User user = riotApiUserClient.getUser(name,apiKey);
        return user;
    }

    public List<String> getMatches(String name, int count) {
        String puuid = riotApiUserClient.getUser(name, apiKey).getPuuid();
        return riotApiMatch.getMatchs(puuid, count,apiKey);
    }

    public Page<String> getMatchesPageable(String name, Pageable pageable) {
        List<String> matches = getMatches(name,100);
        int start = (int) pageable.getOffset();
        int end = Math.min((start + pageable.getPageSize()), matches.size());
        return new PageImpl<>(matches.subList(start, end), pageable, matches.size());
    }

    public List<MatchTimeline> getMatchTimeline(String name){
        List<String> matches = getMatches(name,10);
        List<MatchTimeline> matchInfos = new ArrayList<>();
        for(String match: matches) {
            matchInfos.add(riotApiMatch.getMatchTimeline(match,apiKey));
        }
        return matchInfos;
    }

    public List<MatchDetails> getMatchDetail(String name){
        List<String> matches = getMatches(name,10);
        List<MatchDetails> matchInfos = new ArrayList<>();
        for(String match: matches) {
            //Testing
            MatchDetails matchDetails = riotApiMatch.getMatchDetails(match,apiKey);
            List<Participant> temp = matchDetails.getInfo().getParticipants().stream()
                                    .filter(p -> p.getSummonerName().equals(name))
                                    .findFirst().stream().toList();
            matchDetails.getInfo().setParticipants(temp);
            matchInfos.add(matchDetails);
        }
        return matchInfos;
    }

    public MatchDetailsAv getMatchDetailSummary(String name){
        List<String> matches = getMatches(name,10);
        List<MatchDetails> matchInfos = new ArrayList<>();
        for(String match: matches) {
            matchInfos.add(riotApiMatch.getMatchDetails(match,apiKey));
        }
        MatchDetailsAv matchDetailsAv = MatchDetailAverageMapper.tomatchDetailsAverage(matchInfos, name);
        //toString
        //llamar chatgpt
        //ChatGptResponse response = chatGptService.getCompletion(matchDetailsAverage.toString());
        //System.out.println(matchDetailsAverage.toString());
        //System.out.println(response);
        return matchDetailsAv;
    }
}
