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
public class Participant {

    @JsonProperty("allInPings")
    private int allInPings;
    @JsonProperty("assistMePings")
    private int assistMePings;
    @JsonProperty("assists")
    private int assists;
    @JsonProperty("baitPings")
    private int baitPings;
    @JsonProperty("baronKills")
    private int baronKills;
    @JsonProperty("basicPings")
    private int basicPings;
    @JsonProperty("bountyLevel")
    private int bountyLevel;
    @JsonProperty("challenges")
    private Challenges challenges;
    @JsonProperty("champExperience")
    private int champExperience;
    @JsonProperty("champLevel")
    private int champLevel;
    @JsonProperty("championId")
    private int championId;
    @JsonProperty("championName")
    private String championName;
    @JsonProperty("championTransform")
    private int championTransform;
    @JsonProperty("commandPings")
    private int commandPings;
    @JsonProperty("consumablesPurchased")
    private int consumablesPurchased;
    @JsonProperty("damageDealtToBuildings")
    private int damageDealtToBuildings;
    @JsonProperty("damageDealtToObjectives")
    private int damageDealtToObjectives;
    @JsonProperty("damageDealtToTurrets")
    private int damageDealtToTurrets;
    @JsonProperty("damageSelfMitigated")
    private int damageSelfMitigated;
    @JsonProperty("dangerPings")
    private int dangerPings;
    @JsonProperty("deaths")
    private int deaths;
    @JsonProperty("detectorWardsPlaced")
    private int detectorWardsPlaced;
    @JsonProperty("doubleKills")
    private int doubleKills;
    @JsonProperty("dragonKills")
    private int dragonKills;
    @JsonProperty("eligibleForProgression")
    private boolean eligibleForProgression;
    @JsonProperty("enemyMissingPings")
    private int enemyMissingPings;
    @JsonProperty("enemyVisionPings")
    private int enemyVisionPings;
    @JsonProperty("firstBloodAssist")
    private boolean firstBloodAssist;
    @JsonProperty("firstBloodKill")
    private boolean firstBloodKill;
    @JsonProperty("firstTowerAssist")
    private boolean firstTowerAssist;
    @JsonProperty("firstTowerKill")
    private boolean firstTowerKill;
    @JsonProperty("gameEndedInEarlySurrender")
    private boolean gameEndedInEarlySurrender;
    @JsonProperty("gameEndedInSurrender")
    private boolean gameEndedInSurrender;
    @JsonProperty("getBackPings")
    private int getBackPings;
    @JsonProperty("goldEarned")
    private int goldEarned;
    @JsonProperty("goldSpent")
    private int goldSpent;
    @JsonProperty("holdPings")
    private int holdPings;
    @JsonProperty("individualPosition")
    private String individualPosition;
    @JsonProperty("inhibitorKills")
    private int inhibitorKills;
    @JsonProperty("inhibitorTakedowns")
    private int inhibitorTakedowns;
    @JsonProperty("inhibitorsLost")
    private int inhibitorsLost;
    @JsonProperty("item0")
    private int item0;
    @JsonProperty("item1")
    private int item1;
    @JsonProperty("item2")
    private int item2;
    @JsonProperty("item3")
    private int item3;
    @JsonProperty("item4")
    private int item4;
    @JsonProperty("item5")
    private int item5;
    @JsonProperty("item6")
    private int item6;
    @JsonProperty("itemsPurchased")
    private int itemsPurchased;
    @JsonProperty("killingSprees")
    private int killingSprees;
    @JsonProperty("kills")
    private int kills;
    @JsonProperty("lane")
    private String lane;
    @JsonProperty("largestCriticalStrike")
    private int largestCriticalStrike;
    @JsonProperty("largestKillingSpree")
    private int largestKillingSpree;
    @JsonProperty("largestMultiKill")
    private int largestMultiKill;
    @JsonProperty("longestTimeSpentLiving")
    private int longestTimeSpentLiving;
    @JsonProperty("magicDamageDealt")
    private int magicDamageDealt;
    @JsonProperty("magicDamageDealtToChampions")
    private int magicDamageDealtToChampions;
    @JsonProperty("magicDamageTaken")
    private int magicDamageTaken;
    @JsonProperty("needVisionPings")
    private int needVisionPings;
    @JsonProperty("neutralMinionsKilled")
    private int neutralMinionsKilled;
    @JsonProperty("nexusKills")
    private int nexusKills;
    @JsonProperty("nexusLost")
    private int nexusLost;
    @JsonProperty("nexusTakedowns")
    private int nexusTakedowns;
    @JsonProperty("objectivesStolen")
    private int objectivesStolen;
    @JsonProperty("objectivesStolenAssists")
    private int objectivesStolenAssists;
    @JsonProperty("onMyWayPings")
    private int onMyWayPings;
    @JsonProperty("participantId")
    private int participantId;
    @JsonProperty("pentaKills")
    private int pentaKills;
    @JsonProperty("physicalDamageDealt")
    private int physicalDamageDealt;
    @JsonProperty("physicalDamageDealtToChampions")
    private int physicalDamageDealtToChampions;
    @JsonProperty("physicalDamageTaken")
    private int physicalDamageTaken;
    @JsonProperty("profileIcon")
    private int profileIcon;
    @JsonProperty("pushPings")
    private int pushPings;
    @JsonProperty("puuid")
    private String puuid;
    @JsonProperty("quadraKills")
    private int quadraKills;
    @JsonProperty("riotIdName")
    private String riotIdName;
    @JsonProperty("riotIdTagline")
    private String riotIdTagline;
    @JsonProperty("role")
    private String role;
    @JsonProperty("sightWardsBoughtInGame")
    private int sightWardsBoughtInGame;
    @JsonProperty("spell1Casts")
    private int spell1Casts;
    @JsonProperty("spell2Casts")
    private int spell2Casts;
    @JsonProperty("spell3Casts")
    private int spell3Casts;
    @JsonProperty("spell4Casts")
    private int spell4Casts;
    @JsonProperty("summoner1Casts")
    private int summoner1Casts;
    @JsonProperty("summoner1Id")
    private int summoner1Id;
    @JsonProperty("summoner2Casts")
    private int summoner2Casts;
    @JsonProperty("summoner2Id")
    private int summoner2Id;
    @JsonProperty("summonerId")
    private String summonerId;
    @JsonProperty("summonerLevel")
    private int summonerLevel;
    @JsonProperty("summonerName")
    private String summonerName;
    @JsonProperty("teamEarlySurrendered")
    private boolean teamEarlySurrendered;
    @JsonProperty("teamId")
    private int teamId;
    @JsonProperty("teamPosition")
    private String teamPosition;
    @JsonProperty("timeCCingOthers")
    private int timeCCingOthers;
    @JsonProperty("timePlayed")
    private int timePlayed;
    @JsonProperty("totalAllyJungleMinionsKilled")
    private int totalAllyJungleMinionsKilled;
    @JsonProperty("totalDamageDealt")
    private int totalDamageDealt;
    @JsonProperty("totalDamageDealtToChampions")
    private int totalDamageDealtToChampions;
    @JsonProperty("totalDamageShieldedOnTeammates")
    private int totalDamageShieldedOnTeammates;
    @JsonProperty("totalDamageTaken")
    private int totalDamageTaken;
    @JsonProperty("totalEnemyJungleMinionsKilled")
    private int totalEnemyJungleMinionsKilled;
    @JsonProperty("totalHeal")
    private int totalHeal;
    @JsonProperty("totalHealsOnTeammates")
    private int totalHealsOnTeammates;
    @JsonProperty("totalMinionsKilled")
    private int totalMinionsKilled;
    @JsonProperty("totalTimeCCDealt")
    private int totalTimeCCDealt;
    @JsonProperty("totalTimeSpentDead")
    private int totalTimeSpentDead;
    @JsonProperty("totalUnitsHealed")
    private int totalUnitsHealed;
    @JsonProperty("tripleKills")
    private int tripleKills;
    @JsonProperty("trueDamageDealt")
    private int trueDamageDealt;
    @JsonProperty("trueDamageDealtToChampions")
    private int trueDamageDealtToChampions;
    @JsonProperty("trueDamageTaken")
    private int trueDamageTaken;
    @JsonProperty("turretKills")
    private int turretKills;
    @JsonProperty("turretTakedowns")
    private int turretTakedowns;
    @JsonProperty("turretsLost")
    private int turretsLost;
    @JsonProperty("unrealKills")
    private int unrealKills;
    @JsonProperty("visionClearedPings")
    private int visionClearedPings;
    @JsonProperty("visionScore")
    private int visionScore;
    @JsonProperty("visionWardsBoughtInGame")
    private int visionWardsBoughtInGame;
    @JsonProperty("wardsKilled")
    private int wardsKilled;
    @JsonProperty("wardsPlaced")
    private int wardsPlaced;
    @JsonProperty("win")
    private boolean win;


}
