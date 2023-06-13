package com.lolanalysis.project.utils;

import com.lolanalysis.project.models.matchAverage.Champ;
import com.lolanalysis.project.models.matchAverage.MatchDetailsAv;
import com.lolanalysis.project.models.matchAverage.MatchDetailsAverage;
import com.lolanalysis.project.models.match.MatchDetails;
import com.lolanalysis.project.models.match.Participant;

import java.util.HashMap;
import java.util.List;

public class MatchDetailAverageMapper {

    public static MatchDetailsAv tomatchDetailsAverage (List<MatchDetails> matchs, String name){
        MatchDetailsAv matchDetailsAv = new MatchDetailsAv();
        //matchDetailsAverage.setChampTimes(new HashMap<>());
        for(MatchDetails match: matchs){
            Participant participant = match.getInfo().getParticipants().stream()
                    .filter(p -> p.getSummonerName().equals(name))
                    .findFirst()
                    .get(); //habria que lanzar un error si no encuentra ninguno
            if(participant.getIndividualPosition().equals("adc")) {
                matchDetailsAv.setAdCarry(setFields(matchDetailsAv.getAdCarry(), match,participant));
            }else if(participant.getIndividualPosition().equals("mid")){
                matchDetailsAv.setMid(setFields(matchDetailsAv.getMid(), match,participant));
            }else if(participant.getIndividualPosition().equals("jungl")){
                matchDetailsAv.setJungle(setFields(matchDetailsAv.getJungle(), match,participant));
            }else if(participant.getIndividualPosition().equals("top")){
                matchDetailsAv.setTop(setFields(matchDetailsAv.getTop(), match,participant));
            }else {
                matchDetailsAv.setSupport(setFields(matchDetailsAv.getSupport(), match,participant));
            }
        }
        return matchDetailsAv;
        //return format(matchDetailsAverage);
    }

    private static MatchDetailsAverage setFields(MatchDetailsAverage matchDetailsAverage, MatchDetails match, Participant participant){
        int surrenderCount = 0, firstBloodOrAssistCount=0, firstTowerOrAssistCount=0, winCount=0;
        //int suppCount=0,adcCount=0,junglCount=0,midCount=0,topCount=0;
        if(participant.isGameEndedInSurrender()) surrenderCount++;
        if(participant.isFirstBloodAssist() || participant.isFirstBloodKill()) firstBloodOrAssistCount++;
        if(participant.isFirstTowerAssist() || participant.isFirstTowerKill()) firstTowerOrAssistCount++;
        if(participant.isWin()) winCount++;
        matchDetailsAverage.setDeaths(matchDetailsAverage.getDeaths()+participant.getDeaths());
        matchDetailsAverage.setGameDuration(matchDetailsAverage.getGameDuration()+match.getInfo().getGameDuration());
        matchDetailsAverage.setTimePlayed(matchDetailsAverage.getTimePlayed()+participant.getTimePlayed());
        matchDetailsAverage.setPings(matchDetailsAverage.getPings()+(participant.getAllInPings()+participant.getAssistMePings()
                +participant.getBaitPings()+participant.getBasicPings()+ participant.getCommandPings()
                +participant.getDangerPings()+participant.getEnemyMissingPings()+participant.getEnemyVisionPings()
                +participant.getGetBackPings()+participant.getHoldPings()+participant.getNeedVisionPings()
                +participant.getOnMyWayPings()+participant.getPushPings()+participant.getVisionClearedPings()));
        matchDetailsAverage.setTurretKills(matchDetailsAverage.getTurretKills()+participant.getTurretKills());
        matchDetailsAverage.setDamageDealtToTurrets(matchDetailsAverage.getDamageDealtToTurrets()+participant.getDamageDealtToTurrets());
        matchDetailsAverage.setTurretPlatesTaken(matchDetailsAverage.getTurretPlatesTaken()+participant.getChallenges().getTurretPlatesTaken());
        matchDetailsAverage.setNeutralMinionsKilled(matchDetailsAverage.getNeutralMinionsKilled()+participant.getNeutralMinionsKilled());
        matchDetailsAverage.setJunglMinionsKill(matchDetailsAverage.getJunglMinionsKill()+(participant.getTotalAllyJungleMinionsKilled()+participant.getTotalEnemyJungleMinionsKilled()));
        matchDetailsAverage.setTotalMinionsKilled(matchDetailsAverage.getTotalMinionsKilled()+participant.getTotalMinionsKilled());
        matchDetailsAverage.setNeutralMinionsKilled(matchDetailsAverage.getNeutralMinionsKilled()+participant.getNeutralMinionsKilled());
        matchDetailsAverage.setMoreEnemyJungleThanOpponent(matchDetailsAverage.getMoreEnemyJungleThanOpponent()+ participant.getChallenges().getMoreEnemyJungleThanOpponent());
        matchDetailsAverage.setQuickFirstTurret(matchDetailsAverage.getQuickFirstTurret()+ participant.getChallenges().getQuickFirstTurret());
        matchDetailsAverage.setQuickSoloKills(matchDetailsAverage.getQuickSoloKills()+ participant.getChallenges().getQuickSoloKills());
        matchDetailsAverage.setBaronKills(matchDetailsAverage.getBaronKills()+participant.getChallenges().getTeamBaronKills());
        matchDetailsAverage.setDragonKills(matchDetailsAverage.getDragonKills()+participant.getDragonKills());
        matchDetailsAverage.setTeamElderDragonKills(matchDetailsAverage.getTeamElderDragonKills()+participant.getChallenges().getTeamElderDragonKills());
        matchDetailsAverage.setTeamRiftHeraldKills(matchDetailsAverage.getTeamRiftHeraldKills()+participant.getChallenges().getTeamRiftHeraldKills());
        matchDetailsAverage.setVisionScorePerMinute(matchDetailsAverage.getVisionScorePerMinute()+participant.getChallenges().getVisionScorePerMinute());
        matchDetailsAverage.setDetectorWardsPlaced(matchDetailsAverage.getDetectorWardsPlaced()+participant.getDetectorWardsPlaced());
        matchDetailsAverage.setStealthWardsPlaced(matchDetailsAverage.getStealthWardsPlaced()+participant.getChallenges().getStealthWardsPlaced());
        matchDetailsAverage.setWardsPlaced(matchDetailsAverage.getWardsPlaced()+participant.getWardsPlaced());
        matchDetailsAverage.setVisionScore(matchDetailsAverage.getVisionScore()+ participant.getVisionScore());
        matchDetailsAverage.setVisionWardsBoughtInGame(matchDetailsAverage.getVisionWardsBoughtInGame()+ participant.getVisionWardsBoughtInGame());
        matchDetailsAverage.setWardsKilled(matchDetailsAverage.getWardsKilled()+participant.getWardsKilled());
        matchDetailsAverage.setEarlyLaningPhaseGoldExpAdvantage(matchDetailsAverage.getEarlyLaningPhaseGoldExpAdvantage()+participant.getChallenges().getEarlyLaningPhaseGoldExpAdvantage());
        matchDetailsAverage.setEffectiveHealAndShielding(matchDetailsAverage.getEffectiveHealAndShielding()+participant.getChallenges().getEffectiveHealAndShielding());
        matchDetailsAverage.setGoldPerMinute(matchDetailsAverage.getGoldPerMinute()+participant.getChallenges().getGoldPerMinute());
        matchDetailsAverage.setJungleCsBefore10Minutes(matchDetailsAverage.getJungleCsBefore10Minutes()+participant.getChallenges().getJungleCsBefore10Minutes());
        matchDetailsAverage.setLaneMinionsFirst10Minutes(matchDetailsAverage.getLaneMinionsFirst10Minutes()+participant.getChallenges().getLaneMinionsFirst10Minutes());
        matchDetailsAverage.setLaningPhaseGoldExpAdvantage(matchDetailsAverage.getLaningPhaseGoldExpAdvantage()+participant.getChallenges().getLaningPhaseGoldExpAdvantage());
        matchDetailsAverage.setMaxCsAdvantageOnLaneOpponent(matchDetailsAverage.getMaxCsAdvantageOnLaneOpponent()+participant.getChallenges().getMaxCsAdvantageOnLaneOpponent());
        matchDetailsAverage.setVisionScoreAdvantageLaneOpponent(matchDetailsAverage.getVisionScoreAdvantageLaneOpponent()+participant.getChallenges().getVisionScoreAdvantageLaneOpponent());
        matchDetailsAverage.setMaxLevelLeadLaneOpponent(matchDetailsAverage.getMaxLevelLeadLaneOpponent()+participant.getChallenges().getMaxLevelLeadLaneOpponent());
        matchDetailsAverage.setSaveAllyFromDeath(matchDetailsAverage.getSaveAllyFromDeath()+participant.getChallenges().getSaveAllyFromDeath());
        matchDetailsAverage.setKills(matchDetailsAverage.getKills()+participant.getKills());
        matchDetailsAverage.setKda(matchDetailsAverage.getKda()+participant.getChallenges().getKda());
        matchDetailsAverage.setKillParticipation(matchDetailsAverage.getKillParticipation()+participant.getChallenges().getKillParticipation());
        matchDetailsAverage.setDamageDealtToObjectives(matchDetailsAverage.getDamageDealtToObjectives()+participant.getDamageDealtToObjectives());
        matchDetailsAverage.setGoldEarned(matchDetailsAverage.getGoldEarned()+participant.getGoldEarned());
        matchDetailsAverage.setLongestTimeSpentLiving(matchDetailsAverage.getLongestTimeSpentLiving()+participant.getLongestTimeSpentLiving());
        matchDetailsAverage.setMagicDamageDealtToChampions(matchDetailsAverage.getMagicDamageDealtToChampions()+participant.getMagicDamageDealtToChampions());
        matchDetailsAverage.setMagicDamageTaken(matchDetailsAverage.getMagicDamageTaken()+participant.getMagicDamageTaken());
        matchDetailsAverage.setPhysicalDamageTaken(matchDetailsAverage.getPhysicalDamageTaken()+participant.getPhysicalDamageTaken());
        matchDetailsAverage.setPhysicalDamageDealtToChampions(matchDetailsAverage.getPhysicalDamageDealtToChampions()+participant.getPhysicalDamageDealtToChampions());
        matchDetailsAverage.setDamagePerMinute(matchDetailsAverage.getDamagePerMinute()+participant.getChallenges().getDamagePerMinute());
        matchDetailsAverage.setDamageTakenOnTeamPercentage(matchDetailsAverage.getDamageTakenOnTeamPercentage()+participant.getChallenges().getDamageTakenOnTeamPercentage());
        matchDetailsAverage.setTeamDamagePercentage(matchDetailsAverage.getTeamDamagePercentage()+participant.getChallenges().getTeamDamagePercentage());
        matchDetailsAverage.setTotalDamageDealtToChampions(matchDetailsAverage.getTotalDamageDealtToChampions()+participant.getTotalDamageDealtToChampions());
        matchDetailsAverage.setTotalDamageShieldedOnTeammates(matchDetailsAverage.getTotalDamageShieldedOnTeammates()+participant.getTotalDamageShieldedOnTeammates());
        matchDetailsAverage.setTotalDamageTaken(matchDetailsAverage.getTotalDamageTaken()+participant.getTotalDamageTaken());
        matchDetailsAverage.setTotalHeal(matchDetailsAverage.getTotalHeal()+participant.getTotalHeal());
        matchDetailsAverage.setTotalHealsOnTeammates(matchDetailsAverage.getTotalHealsOnTeammates()+participant.getTotalHealsOnTeammates());
        matchDetailsAverage.setTotalTimeSpentDead(matchDetailsAverage.getTotalTimeSpentDead()+participant.getTotalTimeSpentDead());
        matchDetailsAverage.setTotalUnitsHealed(matchDetailsAverage.getTotalUnitsHealed()+participant.getTotalUnitsHealed());
        Champ champdto = new Champ(participant.getChampionName(),participant.getIndividualPosition());
        if(matchDetailsAverage.getChampTimes().get(champdto) == null){
            matchDetailsAverage.getChampTimes().put(champdto,1);
        } else {
            matchDetailsAverage.getChampTimes().put(champdto,matchDetailsAverage.getChampTimes().get(champdto)+1);
        }
        return matchDetailsAverage;
    }

    private static MatchDetailsAverage format(MatchDetailsAverage dto){
        dto.setTimePlayed(dto.getTimePlayed()/60);
        dto.setGameDuration(dto.getGameDuration()/60);
        return dto;
    }

}
