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
public class Challenges {

    @JsonProperty("12AssistStreakCount")
    private int assistStreakCount;
    @JsonProperty("abilityUses")
    private int abilityUses;
    @JsonProperty("acesBefore15Minutes")
    private int acesBefore15Minutes;
    @JsonProperty("alliedJungleMonsterKills")
    private int alliedJungleMonsterKills;
    @JsonProperty("baronTakedowns")
    private int baronTakedowns;
    @JsonProperty("blastConeOppositeOpponentCount")
    private int blastConeOppositeOpponentCount;
    @JsonProperty("bountyGold")
    private int bountyGold;
    @JsonProperty("buffsStolen")
    private int buffsStolen;
    @JsonProperty("completeSupportQuestInTime")
    private int completeSupportQuestInTime;
    @JsonProperty("controlWardsPlaced")
    private int controlWardsPlaced;
    @JsonProperty("damagePerMinute")
    private double damagePerMinute;
    @JsonProperty("damageTakenOnTeamPercentage")
    private double damageTakenOnTeamPercentage;
    @JsonProperty("dancedWithRiftHerald")
    private int dancedWithRiftHerald;
    @JsonProperty("deathsByEnemyChamps")
    private int deathsByEnemyChamps;
    @JsonProperty("dodgeSkillShotsSmallWindow")
    private int dodgeSkillShotsSmallWindow;
    @JsonProperty("doubleAces")
    private int doubleAces;
    @JsonProperty("dragonTakedowns")
    private int dragonTakedowns;
    @JsonProperty("earlyLaningPhaseGoldExpAdvantage")
    private int earlyLaningPhaseGoldExpAdvantage;
    @JsonProperty("effectiveHealAndShielding")
    private int effectiveHealAndShielding;
    @JsonProperty("elderDragonKillsWithOpposingSoul")
    private int elderDragonKillsWithOpposingSoul;
    @JsonProperty("elderDragonMultikills")
    private int elderDragonMultikills;
    @JsonProperty("enemyChampionImmobilizations")
    private int enemyChampionImmobilizations;
    @JsonProperty("enemyJungleMonsterKills")
    private int enemyJungleMonsterKills;
    @JsonProperty("epicMonsterKillsNearEnemyJungler")
    private int epicMonsterKillsNearEnemyJungler;
    @JsonProperty("epicMonsterKillsWithin30SecondsOfSpawn")
    private int epicMonsterKillsWithin30SecondsOfSpawn;
    @JsonProperty("epicMonsterSteals")
    private int epicMonsterSteals;
    @JsonProperty("epicMonsterStolenWithoutSmite")
    private int epicMonsterStolenWithoutSmite;
    @JsonProperty("firstTurretKilled")
    private int firstTurretKilled;
    @JsonProperty("flawlessAces")
    private int flawlessAces;
    @JsonProperty("fullTeamTakedown")
    private int fullTeamTakedown;
    @JsonProperty("gameLength")
    private double gameLength;
    @JsonProperty("getTakedownsInAllLanesEarlyJungleAsLaner")
    private int getTakedownsInAllLanesEarlyJungleAsLaner;
    @JsonProperty("goldPerMinute")
    private double goldPerMinute;
    @JsonProperty("hadOpenNexus")
    private int hadOpenNexus;
    @JsonProperty("immobilizeAndKillWithAlly")
    private int immobilizeAndKillWithAlly;
    @JsonProperty("initialBuffCount")
    private int initialBuffCount;
    @JsonProperty("initialCrabCount")
    private int initialCrabCount;
    @JsonProperty("jungleCsBefore10Minutes")
    private int jungleCsBefore10Minutes;
    @JsonProperty("junglerTakedownsNearDamagedEpicMonster")
    private int junglerTakedownsNearDamagedEpicMonster;
    @JsonProperty("kTurretsDestroyedBeforePlatesFall")
    private int kTurretsDestroyedBeforePlatesFall;
    @JsonProperty("kda")
    private double kda;
    @JsonProperty("killAfterHiddenWithAlly")
    private int killAfterHiddenWithAlly;
    @JsonProperty("killParticipation")
    private double killParticipation;
    @JsonProperty("killedChampTookFullTeamDamageSurvived")
    private int killedChampTookFullTeamDamageSurvived;
    @JsonProperty("killingSprees")
    private int killingSprees;
    @JsonProperty("killsNearEnemyTurret")
    private int killsNearEnemyTurret;
    @JsonProperty("killsOnOtherLanesEarlyJungleAsLaner")
    private int killsOnOtherLanesEarlyJungleAsLaner;
    @JsonProperty("killsOnRecentlyHealedByAramPack")
    private int killsOnRecentlyHealedByAramPack;
    @JsonProperty("killsUnderOwnTurret")
    private int killsUnderOwnTurret;
    @JsonProperty("killsWithHelpFromEpicMonster")
    private int killsWithHelpFromEpicMonster;
    @JsonProperty("knockEnemyIntoTeamAndKill")
    private int knockEnemyIntoTeamAndKill;
    @JsonProperty("landSkillShotsEarlyGame")
    private int landSkillShotsEarlyGame;
    @JsonProperty("laneMinionsFirst10Minutes")
    private int laneMinionsFirst10Minutes;
    @JsonProperty("laningPhaseGoldExpAdvantage")
    private int laningPhaseGoldExpAdvantage;
    @JsonProperty("legendaryCount")
    private int legendaryCount;
    @JsonProperty("lostAnInhibitor")
    private int lostAnInhibitor;
    @JsonProperty("maxCsAdvantageOnLaneOpponent")
    private int maxCsAdvantageOnLaneOpponent;
    @JsonProperty("maxKillDeficit")
    private int maxKillDeficit;
    @JsonProperty("maxLevelLeadLaneOpponent")
    private int maxLevelLeadLaneOpponent;
    @JsonProperty("mejaisFullStackInTime")
    private int mejaisFullStackInTime;
    @JsonProperty("moreEnemyJungleThanOpponent")
    private int moreEnemyJungleThanOpponent;
    @JsonProperty("multiKillOneSpell")
    private int multiKillOneSpell;
    @JsonProperty("multiTurretRiftHeraldCount")
    private int multiTurretRiftHeraldCount;
    @JsonProperty("multikills")
    private int multikills;
    @JsonProperty("multikillsAfterAggressiveFlash")
    private int multikillsAfterAggressiveFlash;
    @JsonProperty("mythicItemUsed")
    private int mythicItemUsed;
    @JsonProperty("outerTurretExecutesBefore10Minutes")
    private int outerTurretExecutesBefore10Minutes;
    @JsonProperty("outnumberedKills")
    private int outnumberedKills;
    @JsonProperty("outnumberedNexusKill")
    private int outnumberedNexusKill;
    @JsonProperty("perfectDragonSoulsTaken")
    private int perfectDragonSoulsTaken;
    @JsonProperty("perfectGame")
    private int perfectGame;
    @JsonProperty("pickKillWithAlly")
    private int pickKillWithAlly;
    @JsonProperty("poroExplosions")
    private int poroExplosions;
    @JsonProperty("quickCleanse")
    private int quickCleanse;
    @JsonProperty("quickFirstTurret")
    private int quickFirstTurret;
    @JsonProperty("quickSoloKills")
    private int quickSoloKills;
    @JsonProperty("riftHeraldTakedowns")
    private int riftHeraldTakedowns;
    @JsonProperty("saveAllyFromDeath")
    private int saveAllyFromDeath;
    @JsonProperty("scuttleCrabKills")
    private int scuttleCrabKills;
    @JsonProperty("skillshotsDodged")
    private int skillshotsDodged;
    @JsonProperty("skillshotsHit")
    private int skillshotsHit;
    @JsonProperty("snowballsHit")
    private int snowballsHit;
    @JsonProperty("soloBaronKills")
    private int soloBaronKills;
    @JsonProperty("soloKills")
    private int soloKills;
    @JsonProperty("stealthWardsPlaced")
    private int stealthWardsPlaced;
    @JsonProperty("survivedSingleDigitHpCount")
    private int survivedSingleDigitHpCount;
    @JsonProperty("survivedThreeImmobilizesInFight")
    private int survivedThreeImmobilizesInFight;
    @JsonProperty("takedownOnFirstTurret")
    private int takedownOnFirstTurret;
    @JsonProperty("takedowns")
    private int takedowns;
    @JsonProperty("takedownsAfterGainingLevelAdvantage")
    private int takedownsAfterGainingLevelAdvantage;
    @JsonProperty("takedownsBeforeJungleMinionSpawn")
    private int takedownsBeforeJungleMinionSpawn;
    @JsonProperty("takedownsFirstXMinutes")
    private int takedownsFirstXMinutes;
    @JsonProperty("takedownsInAlcove")
    private int takedownsInAlcove;
    @JsonProperty("takedownsInEnemyFountain")
    private int takedownsInEnemyFountain;
    @JsonProperty("teamBaronKills")
    private int teamBaronKills;
    @JsonProperty("teamDamagePercentage")
    private double teamDamagePercentage;
    @JsonProperty("teamElderDragonKills")
    private int teamElderDragonKills;
    @JsonProperty("teamRiftHeraldKills")
    private int teamRiftHeraldKills;
    @JsonProperty("threeWardsOneSweeperCount")
    private int threeWardsOneSweeperCount;
    @JsonProperty("tookLargeDamageSurvived")
    private int tookLargeDamageSurvived;
    @JsonProperty("turretPlatesTaken")
    private int turretPlatesTaken;
    @JsonProperty("turretTakedowns")
    private int turretTakedowns;
    @JsonProperty("turretsTakenWithRiftHerald")
    private int turretsTakenWithRiftHerald;
    @JsonProperty("twentyMinionsIn3SecondsCount")
    private int twentyMinionsIn3SecondsCount;
    @JsonProperty("unseenRecalls")
    private int unseenRecalls;
    @JsonProperty("visionScoreAdvantageLaneOpponent")
    private int visionScoreAdvantageLaneOpponent;
    @JsonProperty("visionScorePerMinute")
    private int visionScorePerMinute;
    @JsonProperty("wardTakedowns")
    private int wardTakedowns;
    @JsonProperty("wardTakedownsBefore20M")
    private int wardTakedownsBefore20M;
    @JsonProperty("wardsGuarded")
    private int wardsGuarded;




}
