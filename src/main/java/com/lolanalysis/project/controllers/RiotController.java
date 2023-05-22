package com.lolanalysis.project.controllers;

import com.lolanalysis.project.models.timeline.MatchInfo;
import com.lolanalysis.project.models.User;
import com.lolanalysis.project.services.RiotService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RiotController {

    private final RiotService riotService;

    public RiotController(RiotService riotService) {
        this.riotService = riotService;
    }

    @GetMapping("/{name}")
    public User getUser(@PathVariable String name){
        return riotService.getUser(name);
    }
    @GetMapping("/matches/{name}")
    public Page<String> getMatches(@PathVariable String name,
                                   @PageableDefault(page = 0, size = 10)Pageable pageable) {
        return riotService.getMatchesPageable(name, pageable);
    }

    @GetMapping("/matchDetail/{name}")
    public List<MatchInfo> getMatchTimelines(@PathVariable String name) {
     return riotService.getMatchDetail(name);
    }
}