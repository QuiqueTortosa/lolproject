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
            matchDetailsAverageDto.setDeaths(matchDetailsAverageDto.getDeaths()+(participant.getDeaths()/matchs.size()));
            matchDetailsAverageDto.setGameDuration(matchDetailsAverageDto.getGameDuration()+(match.getInfo().getGameDuration()/matchs.size()));
            matchDetailsAverageDto.setTimePlayed(matchDetailsAverageDto.getTimePlayed()+(participant.getTimePlayed()/matchs.size()));
            matchDetailsAverageDto.setPings(matchDetailsAverageDto.getPings()+((participant.getAllInPings()+participant.getAssistMePings()
                                                +participant.getBaitPings()+participant.getBasicPings()+ participant.getCommandPings()
                                                +participant.getDangerPings()+participant.getEnemyMissingPings()+participant.getEnemyVisionPings()
                                                +participant.getGetBackPings()+participant.getHoldPings()+participant.getNeedVisionPings()
                                                +participant.getOnMyWayPings()+participant.getPushPings()+participant.getVisionClearedPings())/matchs.size()));
            matchDetailsAverageDto.setTurretKills(matchDetailsAverageDto.getKills()+(participant.getTurretKills()/matchs.size()));
            matchDetailsAverageDto.setDamageDealtToTurrets(matchDetailsAverageDto.getDamageDealtToTurrets()+(participant.getDamageDealtToTurrets()/matchs.size()));
            matchDetailsAverageDto.setTurretPlatesTaken(matchDetailsAverageDto.getTurretPlatesTaken()+(participant.getChallenges().getTurretPlatesTaken()/matchs.size()));
            matchDetailsAverageDto.setNeutralMinionsKilled(matchDetailsAverageDto.getNeutralMinionsKilled()+(participant.getNeutralMinionsKilled()/matchs.size()));
            matchDetailsAverageDto.setJunglMinionsKill(matchDetailsAverageDto.getJunglMinionsKill()+((participant.getTotalAllyJungleMinionsKilled()+participant.getTotalEnemyJungleMinionsKilled())/matchs.size()));
            matchDetailsAverageDto.setTotalMinionsKilled(matchDetailsAverageDto.getTotalMinionsKilled()+(participant.getTotalMinionsKilled()/matchs.size()));
            matchDetailsAverageDto.setNeutralMinionsKilled(matchDetailsAverageDto.getNeutralMinionsKilled()+(participant.getNeutralMinionsKilled()/matchs.size()));
            matchDetailsAverageDto.setMoreEnemyJungleThanOpponent(matchDetailsAverageDto.getMoreEnemyJungleThanOpponent()+(participant.getChallenges().getMoreEnemyJungleThanOpponent()/matchs.size()));
            matchDetailsAverageDto.setQuickFirstTurret(matchDetailsAverageDto.getQuickFirstTurret()+(participant.getChallenges().getQuickFirstTurret()/matchs.size()));
            matchDetailsAverageDto.setQuickSoloKills(matchDetailsAverageDto.getQuickSoloKills()+(participant.getChallenges().getQuickSoloKills()/matchs.size()));
            matchDetailsAverageDto.setBaronKills(matchDetailsAverageDto.getBaronKills()+(participant.getChallenges().getTeamBaronKills()/matchs.size()));
            matchDetailsAverageDto.setDragonKills(matchDetailsAverageDto.getDragonKills()+(participant.getDragonKills()/matchs.size()));
            matchDetailsAverageDto.setTeamElderDragonKills(matchDetailsAverageDto.getTeamElderDragonKills()+(participant.getChallenges().getTeamElderDragonKills()/matchs.size()));
            matchDetailsAverageDto.setTeamRiftHeraldKills(matchDetailsAverageDto.getTeamRiftHeraldKills()+(participant.getChallenges().getTeamRiftHeraldKills()/matchs.size()));
            matchDetailsAverageDto.setVisionScorePerMinute(matchDetailsAverageDto.getVisionScorePerMinute()+(participant.getChallenges().getVisionScorePerMinute()/matchs.size()));
            matchDetailsAverageDto.setDetectorWardsPlaced(matchDetailsAverageDto.getDetectorWardsPlaced()+(participant.getDetectorWardsPlaced()/matchs.size()));
            matchDetailsAverageDto.setStealthWardsPlaced(matchDetailsAverageDto.getStealthWardsPlaced()+(participant.getChallenges().getStealthWardsPlaced()/matchs.size()));
            matchDetailsAverageDto.setWardsPlaced(matchDetailsAverageDto.getWardsPlaced()+(participant.getWardsPlaced()/matchs.size()));
            matchDetailsAverageDto.setVisionScore(matchDetailsAverageDto.getVisionScore()+(participant.getVisionScore()/matchs.size()));
            matchDetailsAverageDto.setVisionWardsBoughtInGame(matchDetailsAverageDto.getVisionWardsBoughtInGame()+(participant.getVisionWardsBoughtInGame()/matchs.size()));
            matchDetailsAverageDto.setWardsKilled(matchDetailsAverageDto.getWardsKilled()+(participant.getWardsKilled()/matchs.size()));
            matchDetailsAverageDto.setEarlyLaningPhaseGoldExpAdvantage(matchDetailsAverageDto.getEarlyLaningPhaseGoldExpAdvantage()+(participant.getChallenges().getEarlyLaningPhaseGoldExpAdvantage()/matchs.size()));
            matchDetailsAverageDto.setEffectiveHealAndShielding(matchDetailsAverageDto.getEffectiveHealAndShielding()+(participant.getChallenges().getEffectiveHealAndShielding()/matchs.size()));
            matchDetailsAverageDto.setGoldPerMinute(matchDetailsAverageDto.getGoldPerMinute()+(participant.getChallenges().getGoldPerMinute()/matchs.size()));
            matchDetailsAverageDto.setJungleCsBefore10Minutes(matchDetailsAverageDto.getJungleCsBefore10Minutes()+(participant.getChallenges().getJungleCsBefore10Minutes()/matchs.size()));
            matchDetailsAverageDto.setLaneMinionsFirst10Minutes(matchDetailsAverageDto.getLaneMinionsFirst10Minutes()+(participant.getChallenges().getLaneMinionsFirst10Minutes()/matchs.size()));
            matchDetailsAverageDto.setLaningPhaseGoldExpAdvantage(matchDetailsAverageDto.getLaningPhaseGoldExpAdvantage()+(participant.getChallenges().getLaningPhaseGoldExpAdvantage()/matchs.size()));
            matchDetailsAverageDto.setMaxCsAdvantageOnLaneOpponent(matchDetailsAverageDto.getMaxCsAdvantageOnLaneOpponent()+(participant.getChallenges().getMaxCsAdvantageOnLaneOpponent()/matchs.size()));
            matchDetailsAverageDto.setVisionScoreAdvantageLaneOpponent(matchDetailsAverageDto.getVisionScoreAdvantageLaneOpponent()+(participant.getChallenges().getVisionScoreAdvantageLaneOpponent()/matchs.size()));
            matchDetailsAverageDto.setMaxLevelLeadLaneOpponent(matchDetailsAverageDto.getMaxLevelLeadLaneOpponent()+(participant.getChallenges().getMaxLevelLeadLaneOpponent()/matchs.size()));
            matchDetailsAverageDto.setSaveAllyFromDeath(matchDetailsAverageDto.getSaveAllyFromDeath()+(participant.getChallenges().getSaveAllyFromDeath()/matchs.size()));
            matchDetailsAverageDto.setKills(matchDetailsAverageDto.getKills()+(participant.getKills()/matchs.size()));
            matchDetailsAverageDto.setKda(matchDetailsAverageDto.getKda()+(participant.getChallenges().getKda()/matchs.size()));
            matchDetailsAverageDto.setKillParticipation(matchDetailsAverageDto.getKillParticipation()+(participant.getChallenges().getKillParticipation()/matchs.size()));
            matchDetailsAverageDto.setDamageDealtToObjectives(matchDetailsAverageDto.getDamageDealtToObjectives()+(participant.getDamageDealtToObjectives()/matchs.size()));
            matchDetailsAverageDto.setGoldEarned(matchDetailsAverageDto.getGoldEarned()+(participant.getGoldEarned()/matchs.size()));
            matchDetailsAverageDto.setLongestTimeSpentLiving(matchDetailsAverageDto.getLongestTimeSpentLiving()+(participant.getLongestTimeSpentLiving()/matchs.size()));
            matchDetailsAverageDto.setMagicDamageDealtToChampions(matchDetailsAverageDto.getMagicDamageDealtToChampions()+(participant.getMagicDamageDealtToChampions()/matchs.size()));
            matchDetailsAverageDto.setMagicDamageTaken(matchDetailsAverageDto.getMagicDamageTaken()+(participant.getMagicDamageTaken()/matchs.size()));
            matchDetailsAverageDto.setPhysicalDamageTaken(matchDetailsAverageDto.getPhysicalDamageTaken()+(participant.getPhysicalDamageTaken()/matchs.size()));
            matchDetailsAverageDto.setPhysicalDamageDealtToChampions(matchDetailsAverageDto.getPhysicalDamageDealtToChampions()+(participant.getPhysicalDamageDealtToChampions()/matchs.size()));
            matchDetailsAverageDto.setDamagePerMinute(matchDetailsAverageDto.getDamagePerMinute()+(participant.getChallenges().getDamagePerMinute()/matchs.size()));
            matchDetailsAverageDto.setDamageTakenOnTeamPercentage(matchDetailsAverageDto.getDamageTakenOnTeamPercentage()+(participant.getChallenges().getDamageTakenOnTeamPercentage()/matchs.size()));
            matchDetailsAverageDto.setTeamDamagePercentage(matchDetailsAverageDto.getTeamDamagePercentage()+(participant.getChallenges().getTeamDamagePercentage()/matchs.size()));
            matchDetailsAverageDto.setTotalDamageDealtToChampions(matchDetailsAverageDto.getTotalDamageDealtToChampions()+(participant.getTotalDamageDealtToChampions()/matchs.size()));
            matchDetailsAverageDto.setTotalDamageShieldedOnTeammates(matchDetailsAverageDto.getTotalDamageShieldedOnTeammates()+(participant.getTotalDamageShieldedOnTeammates()/matchs.size()));
            matchDetailsAverageDto.setTotalDamageTaken(matchDetailsAverageDto.getTotalDamageTaken()+(participant.getTotalDamageTaken()/matchs.size()));
            matchDetailsAverageDto.setTotalHeal(matchDetailsAverageDto.getTotalHeal()+(participant.getTotalHeal()/matchs.size()));
            matchDetailsAverageDto.setTotalHealsOnTeammates(matchDetailsAverageDto.getTotalHealsOnTeammates()+(participant.getTotalHealsOnTeammates()/matchs.size()));
            matchDetailsAverageDto.setTotalTimeSpentDead(matchDetailsAverageDto.getTotalTimeSpentDead()+(participant.getTotalTimeSpentDead()/matchs.size()));
            matchDetailsAverageDto.setTotalUnitsHealed(matchDetailsAverageDto.getTotalUnitsHealed()+(participant.getTotalUnitsHealed()/matchs.size()));
            ChampDto champdto = new ChampDto(participant.getChampionName(),participant.getIndividualPosition());
            matchDetailsAverageDto.getChampTimes().put(champdto,matchDetailsAverageDto.getChampTimes().get(champdto)+1);
        }
        matchDetailsAverageDto.setGameEndedInSurrender(surrenderCount/matchs.size());
        matchDetailsAverageDto.setFirstBloodOrAssist(firstBloodOrAssistCount/matchs.size());
        matchDetailsAverageDto.setFirstTowerOrAssist(firstTowerOrAssistCount/matchs.size());
        matchDetailsAverageDto.setWin(winCount/matchs.size());
        matchDetailsAverageDto.setAdcRole(adcCount/matchs.size());
        matchDetailsAverageDto.setMidRole(midCount/matchs.size());
        matchDetailsAverageDto.setTopRole(topCount/matchs.size());
        matchDetailsAverageDto.setSupportRole(suppCount/matchs.size());
        matchDetailsAverageDto.setJungleRole(junglCount/matchs.size());
        return matchDetailsAverageDto;
    }

}
