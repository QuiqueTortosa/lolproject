package com.lolanalysis.project.models.match;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Team {

    @JsonProperty("bans")
    private String[] bans;
    @JsonProperty("objectives")
    private Objectives objectives;
    @JsonProperty("teamId")
    private int teamId;
    @JsonProperty("win")
    private boolean win;

}
