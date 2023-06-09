package com.lolanalysis.project.clients;

import com.lolanalysis.project.models.match.MatchDetails;
import com.lolanalysis.project.models.timeline.MatchTimeline;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.List;

@FeignClient(name = "riotApiMatch", url = "https://europe.api.riotgames.com")
public interface RiotApiMatchClient {

    @GetMapping("/lol/match/v5/matches/by-puuid/{puuid}/ids?count={count}")
    List<String> getMatchs(@PathVariable String puuid, @PathVariable int count, @RequestHeader(value = "X-Riot-Token", required = true) String apiKey);

    @GetMapping("/lol/match/v5/matches/{matchId}")
    MatchDetails getMatchDetails(@PathVariable String matchId, @RequestHeader(value = "X-Riot-Token", required = true) String apiKey);

    @GetMapping("/lol/match/v5/matches/{matchId}/timeline")
    MatchTimeline getMatchTimeline(@PathVariable String matchId, @RequestHeader(value = "X-Riot-Token", required = true) String apiKey);

}
