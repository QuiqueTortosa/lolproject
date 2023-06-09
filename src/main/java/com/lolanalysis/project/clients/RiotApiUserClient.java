package com.lolanalysis.project.clients;

import com.lolanalysis.project.models.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "riotApiUser", url = "https://euw1.api.riotgames.com")
public interface RiotApiUserClient {

    @GetMapping("/lol/summoner/v4/summoners/by-name/{name}")
    User getUser(@PathVariable String name, @RequestHeader(value = "X-Riot-Token", required = true) String apiKey);

}
