package com.lolanalysis.project.utils;

import com.lolanalysis.project.models.dtos.ChampDto;
import com.lolanalysis.project.models.dtos.MatchDetailsAverageDto;
import com.lolanalysis.project.models.match.MatchDetails;
import com.lolanalysis.project.models.match.Participant;

import java.util.HashMap;
import java.util.List;

public class MatchDetailAverageMapper {

    public static MatchDetailsAverageDto toMatchDetailsAverageDto (List<MatchDetails> matchs, String name){
        MatchDetailsAverageDto matchDetailsAverageDto = new MatchDetailsAverageDto();
        int surrenderCount = 0, firstBloodOrAssistCount=0, firstTowerOrAssistCount=0, winCount=0;
        int suppCount=0,adcCount=0,junglCount=0,midCount=0,topCount=0;
        matchDetailsAverageDto.setChampTimes(new HashMap<>());
        for(MatchDetails match: matchs){
            Participant participant = match.getInfo().getParticipants().stream()
                    .filter(p -> p.getSummonerName().equals(name))
                    .findFirst()
                    .get(); //habria que lanzar un error si no encuentra ninguno
            if(participant.isGameEndedInSurrender()) surrenderCount++;
            if(participant.isFirstBloodAssist() || participant.isFirstBloodKill()) firstBloodOrAssistCount++;
            if(participant.isFirstTowerAssist() || participant.isFirstTowerKill()) firstTowerOrAssistCount++;
            if(participant.isWin()) winCount++;
            if(participant.getTeamPosition().equals("BOTTOM")) adcCount++;
            if(participant.getTeamPosition().equals("MIDDLE")) midCount++;
            if(participant.getTeamPosition().equals("UTILITY")) suppCount++;
            if(participant.getTeamPosition().equals("JUNGLE")) junglCount++;
            if(participant.getTeamPosition().equals("TOP")) topCount++;
            matchDetailsAverageDto.setDeaths(matchDetailsAverageDto.getDeaths()+((double)participant.getDeaths()/matchs.size()));
            matchDetailsAverageDto.setGameDuration(matchDetailsAverageDto.getGameDuration()+(match.getInfo().getGameDuration()/matchs.size()));
            matchDetailsAverageDto.setTimePlayed(matchDetailsAverageDto.getTimePlayed()+(participant.getTimePlayed()/matchs.size()));
            matchDetailsAverageDto.setPings(matchDetailsAverageDto.getPings()+((participant.getAllInPings()+participant.getAssistMePings()
                                                +participant.getBaitPings()+participant.getBasicPings()+ participant.getCommandPings()
                                                +participant.getDangerPings()+participant.getEnemyMissingPings()+participant.getEnemyVisionPings()
                                                +participant.getGetBackPings()+participant.getHoldPings()+participant.getNeedVisionPings()
                                                +participant.getOnMyWayPings()+participant.getPushPings()+participant.getVisionClearedPings())/(double)matchs.size()));
            matchDetailsAverageDto.setTurretKills(matchDetailsAverageDto.getTurretKills()+((double)participant.getTurretKills()/matchs.size()));
            matchDetailsAverageDto.setDamageDealtToTurrets(matchDetailsAverageDto.getDamageDealtToTurrets()+(participant.getDamageDealtToTurrets()/matchs.size()));
            matchDetailsAverageDto.setTurretPlatesTaken(matchDetailsAverageDto.getTurretPlatesTaken()+((double)participant.getChallenges().getTurretPlatesTaken()/matchs.size()));
            matchDetailsAverageDto.setNeutralMinionsKilled(matchDetailsAverageDto.getNeutralMinionsKilled()+((double)participant.getNeutralMinionsKilled()/matchs.size()));
            matchDetailsAverageDto.setJunglMinionsKill(matchDetailsAverageDto.getJunglMinionsKill()+((double)(participant.getTotalAllyJungleMinionsKilled()+participant.getTotalEnemyJungleMinionsKilled())/matchs.size()));
            matchDetailsAverageDto.setTotalMinionsKilled(matchDetailsAverageDto.getTotalMinionsKilled()+((double)participant.getTotalMinionsKilled()/matchs.size()));
            matchDetailsAverageDto.setNeutralMinionsKilled(matchDetailsAverageDto.getNeutralMinionsKilled()+((double)participant.getNeutralMinionsKilled()/matchs.size()));
            matchDetailsAverageDto.setMoreEnemyJungleThanOpponent(matchDetailsAverageDto.getMoreEnemyJungleThanOpponent()+((double) participant.getChallenges().getMoreEnemyJungleThanOpponent()/matchs.size()));
            matchDetailsAverageDto.setQuickFirstTurret(matchDetailsAverageDto.getQuickFirstTurret()+((double) participant.getChallenges().getQuickFirstTurret()/matchs.size()));
            matchDetailsAverageDto.setQuickSoloKills(matchDetailsAverageDto.getQuickSoloKills()+((double) participant.getChallenges().getQuickSoloKills()/matchs.size()));
            matchDetailsAverageDto.setBaronKills(matchDetailsAverageDto.getBaronKills()+((double)participant.getChallenges().getTeamBaronKills()/matchs.size()));
            matchDetailsAverageDto.setDragonKills(matchDetailsAverageDto.getDragonKills()+((double)participant.getDragonKills()/matchs.size()));
            matchDetailsAverageDto.setTeamElderDragonKills(matchDetailsAverageDto.getTeamElderDragonKills()+((double)participant.getChallenges().getTeamElderDragonKills()/matchs.size()));
            matchDetailsAverageDto.setTeamRiftHeraldKills(matchDetailsAverageDto.getTeamRiftHeraldKills()+((double)participant.getChallenges().getTeamRiftHeraldKills()/matchs.size()));
            matchDetailsAverageDto.setVisionScorePerMinute(matchDetailsAverageDto.getVisionScorePerMinute()+((double)participant.getChallenges().getVisionScorePerMinute()/matchs.size()));
            matchDetailsAverageDto.setDetectorWardsPlaced(matchDetailsAverageDto.getDetectorWardsPlaced()+((double)participant.getDetectorWardsPlaced()/matchs.size()));
            matchDetailsAverageDto.setStealthWardsPlaced(matchDetailsAverageDto.getStealthWardsPlaced()+((double)participant.getChallenges().getStealthWardsPlaced()/matchs.size()));
            matchDetailsAverageDto.setWardsPlaced(matchDetailsAverageDto.getWardsPlaced()+((double)participant.getWardsPlaced()/matchs.size()));
            matchDetailsAverageDto.setVisionScore(matchDetailsAverageDto.getVisionScore()+((double) participant.getVisionScore()/matchs.size()));
            matchDetailsAverageDto.setVisionWardsBoughtInGame(matchDetailsAverageDto.getVisionWardsBoughtInGame()+((double) participant.getVisionWardsBoughtInGame()/matchs.size()));
            matchDetailsAverageDto.setWardsKilled(matchDetailsAverageDto.getWardsKilled()+((double)participant.getWardsKilled()/matchs.size()));
            matchDetailsAverageDto.setEarlyLaningPhaseGoldExpAdvantage(matchDetailsAverageDto.getEarlyLaningPhaseGoldExpAdvantage()+((double)participant.getChallenges().getEarlyLaningPhaseGoldExpAdvantage()/matchs.size()));
            matchDetailsAverageDto.setEffectiveHealAndShielding(matchDetailsAverageDto.getEffectiveHealAndShielding()+((double)participant.getChallenges().getEffectiveHealAndShielding()/matchs.size()));
            matchDetailsAverageDto.setGoldPerMinute(matchDetailsAverageDto.getGoldPerMinute()+(participant.getChallenges().getGoldPerMinute()/matchs.size()));
            matchDetailsAverageDto.setJungleCsBefore10Minutes(matchDetailsAverageDto.getJungleCsBefore10Minutes()+((double)participant.getChallenges().getJungleCsBefore10Minutes()/matchs.size()));
            matchDetailsAverageDto.setLaneMinionsFirst10Minutes(matchDetailsAverageDto.getLaneMinionsFirst10Minutes()+((double)participant.getChallenges().getLaneMinionsFirst10Minutes()/matchs.size()));
            matchDetailsAverageDto.setLaningPhaseGoldExpAdvantage(matchDetailsAverageDto.getLaningPhaseGoldExpAdvantage()+((double)participant.getChallenges().getLaningPhaseGoldExpAdvantage()/matchs.size()));
            matchDetailsAverageDto.setMaxCsAdvantageOnLaneOpponent(matchDetailsAverageDto.getMaxCsAdvantageOnLaneOpponent()+((double)participant.getChallenges().getMaxCsAdvantageOnLaneOpponent()/matchs.size()));
            matchDetailsAverageDto.setVisionScoreAdvantageLaneOpponent(matchDetailsAverageDto.getVisionScoreAdvantageLaneOpponent()+((double)participant.getChallenges().getVisionScoreAdvantageLaneOpponent()/matchs.size()));
            matchDetailsAverageDto.setMaxLevelLeadLaneOpponent(matchDetailsAverageDto.getMaxLevelLeadLaneOpponent()+((double)participant.getChallenges().getMaxLevelLeadLaneOpponent()/matchs.size()));
            matchDetailsAverageDto.setSaveAllyFromDeath(matchDetailsAverageDto.getSaveAllyFromDeath()+((double)participant.getChallenges().getSaveAllyFromDeath()/matchs.size()));
            matchDetailsAverageDto.setKills(matchDetailsAverageDto.getKills()+((double)participant.getKills()/matchs.size()));
            matchDetailsAverageDto.setKda(matchDetailsAverageDto.getKda()+(participant.getChallenges().getKda()/matchs.size()));
            matchDetailsAverageDto.setKillParticipation(matchDetailsAverageDto.getKillParticipation()+(participant.getChallenges().getKillParticipation()/matchs.size()));
            matchDetailsAverageDto.setDamageDealtToObjectives(matchDetailsAverageDto.getDamageDealtToObjectives()+((double)participant.getDamageDealtToObjectives()/matchs.size()));
            matchDetailsAverageDto.setGoldEarned(matchDetailsAverageDto.getGoldEarned()+((double)participant.getGoldEarned()/matchs.size()));
            matchDetailsAverageDto.setLongestTimeSpentLiving(matchDetailsAverageDto.getLongestTimeSpentLiving()+((double)participant.getLongestTimeSpentLiving()/matchs.size()));
            matchDetailsAverageDto.setMagicDamageDealtToChampions(matchDetailsAverageDto.getMagicDamageDealtToChampions()+((double)participant.getMagicDamageDealtToChampions()/matchs.size()));
            matchDetailsAverageDto.setMagicDamageTaken(matchDetailsAverageDto.getMagicDamageTaken()+((double)participant.getMagicDamageTaken()/matchs.size()));
            matchDetailsAverageDto.setPhysicalDamageTaken(matchDetailsAverageDto.getPhysicalDamageTaken()+((double)participant.getPhysicalDamageTaken()/matchs.size()));
            matchDetailsAverageDto.setPhysicalDamageDealtToChampions(matchDetailsAverageDto.getPhysicalDamageDealtToChampions()+((double)participant.getPhysicalDamageDealtToChampions()/matchs.size()));
            matchDetailsAverageDto.setDamagePerMinute(matchDetailsAverageDto.getDamagePerMinute()+(participant.getChallenges().getDamagePerMinute()/matchs.size()));
            matchDetailsAverageDto.setDamageTakenOnTeamPercentage(matchDetailsAverageDto.getDamageTakenOnTeamPercentage()+(participant.getChallenges().getDamageTakenOnTeamPercentage()/matchs.size()));
            matchDetailsAverageDto.setTeamDamagePercentage(matchDetailsAverageDto.getTeamDamagePercentage()+(participant.getChallenges().getTeamDamagePercentage()/matchs.size()));
            matchDetailsAverageDto.setTotalDamageDealtToChampions(matchDetailsAverageDto.getTotalDamageDealtToChampions()+(double)(participant.getTotalDamageDealtToChampions()/matchs.size()));
            matchDetailsAverageDto.setTotalDamageShieldedOnTeammates(matchDetailsAverageDto.getTotalDamageShieldedOnTeammates()+((double)participant.getTotalDamageShieldedOnTeammates()/matchs.size()));
            matchDetailsAverageDto.setTotalDamageTaken(matchDetailsAverageDto.getTotalDamageTaken()+((double)participant.getTotalDamageTaken()/matchs.size()));
            matchDetailsAverageDto.setTotalHeal(matchDetailsAverageDto.getTotalHeal()+((double)participant.getTotalHeal()/matchs.size()));
            matchDetailsAverageDto.setTotalHealsOnTeammates(matchDetailsAverageDto.getTotalHealsOnTeammates()+(double)(participant.getTotalHealsOnTeammates()/matchs.size()));
            matchDetailsAverageDto.setTotalTimeSpentDead(matchDetailsAverageDto.getTotalTimeSpentDead()+((double)participant.getTotalTimeSpentDead()/matchs.size()));
            matchDetailsAverageDto.setTotalUnitsHealed(matchDetailsAverageDto.getTotalUnitsHealed()+((double)participant.getTotalUnitsHealed()/matchs.size()));
            ChampDto champdto = new ChampDto(participant.getChampionName(),participant.getIndividualPosition());
            if(matchDetailsAverageDto.getChampTimes().get(champdto) == null){
                matchDetailsAverageDto.getChampTimes().put(champdto,1);
            } else {
                matchDetailsAverageDto.getChampTimes().put(champdto,matchDetailsAverageDto.getChampTimes().get(champdto)+1);
            }
        }
        matchDetailsAverageDto.setGameEndedInSurrender((double) surrenderCount/matchs.size());
        matchDetailsAverageDto.setFirstBloodOrAssist((double) firstBloodOrAssistCount/matchs.size());
        matchDetailsAverageDto.setFirstTowerOrAssist((double) firstTowerOrAssistCount/matchs.size());
        matchDetailsAverageDto.setWin(winCount/matchs.size());
        matchDetailsAverageDto.setAdcRole(adcCount/matchs.size());
        matchDetailsAverageDto.setMidRole(midCount/matchs.size());
        matchDetailsAverageDto.setTopRole(topCount/matchs.size());
        matchDetailsAverageDto.setSupportRole(suppCount/matchs.size());
        matchDetailsAverageDto.setJungleRole(junglCount/matchs.size());
        return matchDetailsAverageDto;
    }

}
