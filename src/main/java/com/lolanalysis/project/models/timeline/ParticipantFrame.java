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
public class ParticipantFrame {

    @JsonProperty("championStats")
    private ChampionStats championStats;

    @JsonProperty("currentGold")
    private int currentGold;
    @JsonProperty("damageStats")
    private DamageStats damageStats;
    @JsonProperty("goldPerSecond")
    private int goldPerSecond;
    @JsonProperty("jungleMinionsKilled")
    private int jungleMinionsKilled;
    @JsonProperty("level")
    private int level;
    @JsonProperty("minionsKilled")
    private int minionsKilled;
    @JsonProperty("participantId")
    private int participantId;
    @JsonProperty("position")
    private Position position;
    @JsonProperty("timeEnemySpentControlled")
    private int timeEnemySpentControlled;
    @JsonProperty("totalGold")
    private int totalGold;
    @JsonProperty("xp")
    private int xp;
}
