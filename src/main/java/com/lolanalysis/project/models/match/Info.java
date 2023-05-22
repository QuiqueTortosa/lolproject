package com.lolanalysis.project.models.match;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Info {

    @JsonProperty("gameCreation")
    private long gameCreation;
    @JsonProperty("gameDuration")
    private int gameDuration;
    @JsonProperty("gameEndTimestamp")
    private long gameEndTimestamp;
    @JsonProperty("gameId")
    private long gameId;
    @JsonProperty("gameMode")
    private String gameMode;
    @JsonProperty("gameName")
    private String gameName;
    @JsonProperty("gameType")
    private String gameType;
    @JsonProperty("gameVersion")
    private String gameVersion;
    @JsonProperty("mapId")
    private int mapId;
    @JsonProperty("participants")
    private List<Participant> participants;
    @JsonProperty("platformId")
    private String platformId;
    @JsonProperty("queueId")
    private int queueId;
    @JsonProperty("teams")
    private List<Team> teams;
    @JsonProperty("tournamentCode")
    private int tournamentCode;

}
