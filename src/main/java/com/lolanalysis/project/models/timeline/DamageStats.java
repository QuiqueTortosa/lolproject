package com.lolanalysis.project.models.timeline;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class DamageStats {

    @JsonProperty("magicDamageDone")
    private int magicDamageDone;
    @JsonProperty("magicDamageDoneToChampions")
    private int magicDamageDoneToChampions;
    @JsonProperty("magicDamageTaken")
    private int magicDamageTaken;
    @JsonProperty("physicalDamageDone")
    private int physicalDamageDone;
    @JsonProperty("physicalDamageDoneToChampions")
    private int physicalDamageDoneToChampions;
    @JsonProperty("physicalDamageTaken")
    private int physicalDamageTaken;
    @JsonProperty("totalDamageDone")
    private int totalDamageDone;
    @JsonProperty("totalDamageDoneToChampions")
    private int totalDamageDoneToChampions;
    @JsonProperty("totalDamageTaken")
    private int totalDamageTaken;
    @JsonProperty("trueDamageDone")
    private int trueDamageDone;
    @JsonProperty("trueDamageDoneToChampions")
    private int trueDamageDoneToChampions;
    @JsonProperty("trueDamageTaken")
    private int trueDamageTaken;

}
