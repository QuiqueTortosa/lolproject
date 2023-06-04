package com.lolanalysis.project.utils;

import com.lolanalysis.project.models.dtos.ChampDto;
import com.lolanalysis.project.models.dtos.MatchDetailsAverageDto;
import com.lolanalysis.project.models.match.MatchDetails;
import com.lolanalysis.project.models.match.Participant;

import java.util.List;

public class MatchDetailAverageMapper {

    public MatchDetailsAverageDto toMatchDetailsAverageDto (List<MatchDetails> matchs){
        MatchDetailsAverageDto matchDetailsAverageDto = new MatchDetailsAverageDto();
        int surrenderCount = 0, firstBloodOrAssistCount=0, firstTowerOrAssistCount=0, winCount=0;
        int suppCount=0,adcCount=0,junglCount=0,midCount=0,topCount=0;
        for(MatchDetails match: matchs){
            Participant participant = match.getInfo().getParticipants().get(0);
            if(participant.isGameEndedInSurrender()) surrenderCount++;
            if(participant.isFirstBloodAssist() || participant.isFirstBloodKill()) firstBloodOrAssistCount++;
            if(participant.isFirstTowerAssist() || participant.isFirstTowerKill()) firstTowerOrAssistCount++;
            if(participant.isWin()) winCount++;
            if(participant.getTeamPosition().equals("BOTTOM")) adcCount++;
            if(participant.getTeamPosition().equals("MIDDLE")) midCount++;
            if(participant.getTeamPosition().equals("UTILITY")) suppCount++;
            if(participant.getTeamPosition().equals("JUNGLE")) junglCount++;
            if(participant.getTeamPosition().equals("TOP")) topCount++;
            matchDetailsAverageDto.setDeaths(matchDetailsAverageDto.getDeaths()+participant.getDeaths());
            matchDetailsAverageDto.setGameDuration(matchDetailsAverageDto.getGameDuration()+match.getInfo().getGameDuration());
            matchDetailsAverageDto.setTimePlayed(matchDetailsAverageDto.getTimePlayed()+participant.getTimePlayed());
            matchDetailsAverageDto.setPings(matchDetailsAverageDto.getPings()+participant.getAllInPings()+participant.getAssistMePings()
                                                +participant.getBaitPings()+participant.getBasicPings()+ participant.getCommandPings()
                                                +participant.getDangerPings()+participant.getEnemyMissingPings()+participant.getEnemyVisionPings()
                                                +participant.getGetBackPings()+participant.getHoldPings()+participant.getNeedVisionPings()
                                                +participant.getOnMyWayPings()+ participant.getPushPings()+ participant.getVisionClearedPings());
            matchDetailsAverageDto.setTurretKills(matchDetailsAverageDto.getKills()+participant.getTurretKills());
            matchDetailsAverageDto.setDamageDealtToTurrets(matchDetailsAverageDto.getDamageDealtToTurrets()+participant.getDamageDealtToTurrets());
            matchDetailsAverageDto.setTurretPlatesTaken(matchDetailsAverageDto.getTurretPlatesTaken()+participant.getChallenges().getTurretPlatesTaken());
            matchDetailsAverageDto.setNeutralMinionsKilled(matchDetailsAverageDto.getNeutralMinionsKilled()+participant.getNeutralMinionsKilled());
            matchDetailsAverageDto.setJunglMinionsKill(matchDetailsAverageDto.getJunglMinionsKill()+participant.getTotalAllyJungleMinionsKilled()+participant.getTotalEnemyJungleMinionsKilled());
            matchDetailsAverageDto.setTotalMinionsKilled(matchDetailsAverageDto.getTotalMinionsKilled()+participant.getTotalMinionsKilled());
            matchDetailsAverageDto.setNeutralMinionsKilled(matchDetailsAverageDto.getNeutralMinionsKilled()+participant.getNeutralMinionsKilled());
            matchDetailsAverageDto.setMoreEnemyJungleThanOpponent(matchDetailsAverageDto.getMoreEnemyJungleThanOpponent()+participant.getChallenges().getMoreEnemyJungleThanOpponent());
            matchDetailsAverageDto.setQuickFirstTurret(matchDetailsAverageDto.getQuickFirstTurret()+participant.getChallenges().getQuickFirstTurret());
            matchDetailsAverageDto.setQuickSoloKills(matchDetailsAverageDto.getQuickSoloKills()+participant.getChallenges().getQuickSoloKills());
            matchDetailsAverageDto.setBaronKills(matchDetailsAverageDto.getBaronKills()+participant.getChallenges().getTeamBaronKills());
            matchDetailsAverageDto.setDragonKills(matchDetailsAverageDto.getDragonKills()+participant.getDragonKills());
            matchDetailsAverageDto.setTeamElderDragonKills(matchDetailsAverageDto.getTeamElderDragonKills()+participant.getChallenges().getTeamElderDragonKills());
            matchDetailsAverageDto.setTeamRiftHeraldKills(matchDetailsAverageDto.getTeamRiftHeraldKills()+participant.getChallenges().getTeamRiftHeraldKills());
            matchDetailsAverageDto.setVisionScorePerMinute(matchDetailsAverageDto.getVisionScorePerMinute()+participant.getChallenges().getVisionScorePerMinute());
            matchDetailsAverageDto.setDetectorWardsPlaced(matchDetailsAverageDto.getDetectorWardsPlaced()+participant.getDetectorWardsPlaced());
            matchDetailsAverageDto.setStealthWardsPlaced(matchDetailsAverageDto.getStealthWardsPlaced()+participant.getChallenges().getStealthWardsPlaced());
            matchDetailsAverageDto.setWardsPlaced(matchDetailsAverageDto.getWardsPlaced()+participant.getWardsPlaced());
            matchDetailsAverageDto.setVisionScore(matchDetailsAverageDto.getVisionScore()+participant.getVisionScore());
            matchDetailsAverageDto.setVisionWardsBoughtInGame(matchDetailsAverageDto.getVisionWardsBoughtInGame()+participant.getVisionWardsBoughtInGame());
            matchDetailsAverageDto.setWardsKilled(matchDetailsAverageDto.getWardsKilled()+participant.getWardsKilled());
            matchDetailsAverageDto.setEarlyLaningPhaseGoldExpAdvantage(matchDetailsAverageDto.getEarlyLaningPhaseGoldExpAdvantage()+participant.getChallenges().getEarlyLaningPhaseGoldExpAdvantage());
            matchDetailsAverageDto.setEffectiveHealAndShielding(matchDetailsAverageDto.getEffectiveHealAndShielding()+participant.getChallenges().getEffectiveHealAndShielding());
            matchDetailsAverageDto.setGoldPerMinute(matchDetailsAverageDto.getGoldPerMinute()+participant.getChallenges().getGoldPerMinute());
            matchDetailsAverageDto.setJungleCsBefore10Minutes(matchDetailsAverageDto.getJungleCsBefore10Minutes()+participant.getChallenges().getJungleCsBefore10Minutes());
            matchDetailsAverageDto.setLaneMinionsFirst10Minutes(matchDetailsAverageDto.getLaneMinionsFirst10Minutes()+participant.getChallenges().getLaneMinionsFirst10Minutes());
            matchDetailsAverageDto.setLaningPhaseGoldExpAdvantage(matchDetailsAverageDto.getLaningPhaseGoldExpAdvantage()+participant.getChallenges().getLaningPhaseGoldExpAdvantage());
            matchDetailsAverageDto.setMaxCsAdvantageOnLaneOpponent(matchDetailsAverageDto.getMaxCsAdvantageOnLaneOpponent()+participant.getChallenges().getMaxCsAdvantageOnLaneOpponent());
            matchDetailsAverageDto.setVisionScoreAdvantageLaneOpponent(matchDetailsAverageDto.getVisionScoreAdvantageLaneOpponent()+participant.getChallenges().getVisionScoreAdvantageLaneOpponent());
            matchDetailsAverageDto.setMaxLevelLeadLaneOpponent(matchDetailsAverageDto.getMaxLevelLeadLaneOpponent()+participant.getChallenges().getMaxLevelLeadLaneOpponent());
            matchDetailsAverageDto.setSaveAllyFromDeath(matchDetailsAverageDto.getSaveAllyFromDeath()+participant.getChallenges().getSaveAllyFromDeath());
            matchDetailsAverageDto.setKills(matchDetailsAverageDto.getKills()+participant.getKills());
            matchDetailsAverageDto.setKda(matchDetailsAverageDto.getKda()+participant.getChallenges().getKda());
            matchDetailsAverageDto.setKillParticipation(matchDetailsAverageDto.getKillParticipation()+participant.getChallenges().getKillParticipation());
            matchDetailsAverageDto.setDamageDealtToObjectives(matchDetailsAverageDto.getDamageDealtToObjectives()+participant.getDamageDealtToObjectives());
            matchDetailsAverageDto.setGoldEarned(matchDetailsAverageDto.getGoldEarned()+participant.getGoldEarned());
            matchDetailsAverageDto.setLongestTimeSpentLiving(matchDetailsAverageDto.getLongestTimeSpentLiving()+participant.getLongestTimeSpentLiving());
            matchDetailsAverageDto.setMagicDamageDealtToChampions(matchDetailsAverageDto.getMagicDamageDealtToChampions()+participant.getMagicDamageDealtToChampions());
            matchDetailsAverageDto.setMagicDamageTaken(matchDetailsAverageDto.getMagicDamageTaken()+participant.getMagicDamageTaken());
            matchDetailsAverageDto.setPhysicalDamageTaken(matchDetailsAverageDto.getPhysicalDamageTaken()+participant.getPhysicalDamageTaken());
            matchDetailsAverageDto.setPhysicalDamageDealtToChampions(matchDetailsAverageDto.getPhysicalDamageDealtToChampions()+participant.getPhysicalDamageDealtToChampions());
            matchDetailsAverageDto.setDamagePerMinute(matchDetailsAverageDto.getDamagePerMinute()+participant.getChallenges().getDamagePerMinute());
            matchDetailsAverageDto.setDamageTakenOnTeamPercentage(matchDetailsAverageDto.getDamageTakenOnTeamPercentage()+participant.getChallenges().getDamageTakenOnTeamPercentage());
            matchDetailsAverageDto.setTeamDamagePercentage(matchDetailsAverageDto.getTeamDamagePercentage()+participant.getChallenges().getTeamDamagePercentage());
            matchDetailsAverageDto.setTotalDamageDealtToChampions(matchDetailsAverageDto.getTotalDamageDealtToChampions()+participant.getTotalDamageDealtToChampions());
            matchDetailsAverageDto.setTotalDamageShieldedOnTeammates(matchDetailsAverageDto.getTotalDamageShieldedOnTeammates()+participant.getTotalDamageShieldedOnTeammates());
            matchDetailsAverageDto.setTotalDamageTaken(matchDetailsAverageDto.getTotalDamageTaken()+participant.getTotalDamageTaken());
            matchDetailsAverageDto.setTotalHeal(matchDetailsAverageDto.getTotalHeal()+participant.getTotalHeal());
            matchDetailsAverageDto.setTotalHealsOnTeammates(matchDetailsAverageDto.getTotalHealsOnTeammates()+participant.getTotalHealsOnTeammates());
            matchDetailsAverageDto.setTotalTimeSpentDead(matchDetailsAverageDto.getTotalTimeSpentDead()+participant.getTotalTimeSpentDead());
            matchDetailsAverageDto.setTotalUnitsHealed(matchDetailsAverageDto.getTotalUnitsHealed()+participant.getTotalUnitsHealed());
            ChampDto champdto = new ChampDto(participant.getChampionName(),participant.getIndividualPosition());
            matchDetailsAverageDto.getChampTimes().put(champdto,matchDetailsAverageDto.getChampTimes().get(champdto)+1);
        }
        return matchDetailsAverageDto;
    }

}
