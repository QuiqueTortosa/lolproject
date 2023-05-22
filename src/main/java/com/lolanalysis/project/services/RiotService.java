package com.lolanalysis.project.services;

import com.lolanalysis.project.clients.RiotApiMatch;
import com.lolanalysis.project.clients.RiotApiUser;
import com.lolanalysis.project.models.timeline.MatchInfo;
import com.lolanalysis.project.models.User;
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
    @Autowired
    private RiotApiUser riotApiUser;

    @Autowired
    private RiotApiMatch riotApiMatch;

    public User getUser(String name) {
        User user = riotApiUser.getUser(name,apiKey);
        return user;
    }

    public List<String> getMatches(String name, int count) {
        String puuid = riotApiUser.getUser(name, apiKey).getPuuid();
        return riotApiMatch.getMatchs(puuid, count,apiKey);
    }

    public Page<String> getMatchesPageable(String name, Pageable pageable) {
        List<String> matches = getMatches(name,100);
        int start = (int) pageable.getOffset();
        int end = Math.min((start + pageable.getPageSize()), matches.size());
        return new PageImpl<>(matches.subList(start, end), pageable, matches.size());
    }

    public List<MatchInfo> getMatchDetail(String name){
        List<String> matches = getMatches(name,10);
        List<MatchInfo> matchInfos = new ArrayList<>();
        for(String match: matches) {
            matchInfos.add(riotApiMatch.getMatchTimeline(match,apiKey));
        }
        System.out.println(matchInfos.get(0).toString());
        return matchInfos;
    }
}
