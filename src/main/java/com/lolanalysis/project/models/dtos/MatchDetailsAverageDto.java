package com.lolanalysis.project.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MatchDetailsAverageDto {

    private long gameDuration;
    private long timePlayed;
    private double gameEndedInSurrender;
    private double pings;
    private double firstBloodOrAssist;
    private double firstTowerOrAssist;
    private double turretKills;
    private double damageDealtToTurrets;
    private double turretPlatesTaken;
    private double neutralMinionsKilled;
    private double junglMinionsKill;
    private double moreEnemyJungleThanOpponent;
    private double quickFirstTurret;
    private double quickSoloKills;
    private double baronKills;
    private double dragonKills;
    private double teamElderDragonKills;
    private double teamRiftHeraldKills;
    private double visionScorePerMinute;
    private double detectorWardsPlaced;
    private double stealthWardsPlaced;
    private double visionScore;
    private double visionWardsBoughtInGame;
    private double wardsKilled;
    private double wardsPlaced;
    private double earlyLaningPhaseGoldExpAdvantage;
    private double effectiveHealAndShielding;
    private double goldPerMinute;
    private double jungleCsBefore10Minutes;
    private double laneMinionsFirst10Minutes;
    private double laningPhaseGoldExpAdvantage;
    private double maxCsAdvantageOnLaneOpponent;
    private double visionScoreAdvantageLaneOpponent;
    private double maxLevelLeadLaneOpponent;
    private double saveAllyFromDeath;
    private double kills;
    private double deaths;
    private double kda;
    private double killParticipation;
    private double damageDealtToObjectives;
    private double goldEarned;
    private double longestTimeSpentLiving;
    private double magicDamageDealtToChampions;
    private double magicDamageTaken;
    private double physicalDamageTaken;
    private double physicalDamageDealtToChampions;
    private double damagePerMinute;
    private double damageTakenOnTeamPercentage;
    private double teamDamagePercentage;
    private double totalDamageDealtToChampions;
    private double totalDamageShieldedOnTeammates;
    private double totalDamageTaken;
    private double totalHeal;
    private double totalHealsOnTeammates;
    private double totalMinionsKilled;
    private double totalTimeSpentDead;
    private double totalUnitsHealed;
    private double win;
    private double summonerName;
    private double profileIcon;
    private double championId;
    private double championName;
    private double lane;
    private double role;
    private Map<ChampDto,Integer> champTimes;
    private double supportRole;
    private double adcRole;
    private double jungleRole;
    private double midRole;
    private double topRole;


}
