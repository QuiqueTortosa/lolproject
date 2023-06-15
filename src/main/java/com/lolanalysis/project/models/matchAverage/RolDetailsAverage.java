package com.lolanalysis.project.models.matchAverage;

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
public class MatchDetailsAverage {

    private double gameDuration;
    private double timePlayed;
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
    private String summonerName;
    private String profileIcon;
    private Map<Champ,Integer> champTimes = new HashMap<>();
    private double rolPercentage;
    private int rolCount;
    private int surrenderCount;
    private int firstBloodOrAssistCount;
    private int firstTowerOrAssistCount;
    private int winCount;


}
