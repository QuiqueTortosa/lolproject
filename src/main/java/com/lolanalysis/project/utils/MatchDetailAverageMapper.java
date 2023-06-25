package com.lolanalysis.project.utils;

import com.lolanalysis.project.models.matchAverage.Champ;
import com.lolanalysis.project.models.matchAverage.MatchDetailsAverage;
import com.lolanalysis.project.models.matchAverage.RolDetailsAverage;
import com.lolanalysis.project.models.match.MatchDetails;
import com.lolanalysis.project.models.match.Participant;
import java.util.List;

public class MatchDetailAverageMapper {

    public static MatchDetailsAverage tomatchDetailsAverage (List<MatchDetails> matchs, String name){
        MatchDetailsAverage matchDetailsAverage = new MatchDetailsAverage();
        for(MatchDetails match: matchs){
            Participant participant = match.getInfo().getParticipants().stream()
                    .filter(p -> p.getSummonerName().equals(name))
                    .findFirst()
                    .get(); //habria que lanzar un error si no encuentra ninguno
            if(participant.getIndividualPosition().equals("BOTTOM")) {
                matchDetailsAverage.setAdCarry(setFields(matchDetailsAverage.getAdCarry(), match,participant));
            }else if(participant.getIndividualPosition().equals("MIDDLE")){
                matchDetailsAverage.setMid(setFields(matchDetailsAverage.getMid(), match,participant));
            }else if(participant.getIndividualPosition().equals("JUNGLE")){
                matchDetailsAverage.setJungle(setFields(matchDetailsAverage.getJungle(), match,participant));
            }else if(participant.getIndividualPosition().equals("TOP")){
                matchDetailsAverage.setTop(setFields(matchDetailsAverage.getTop(), match,participant));
            }else {
                matchDetailsAverage.setSupport(setFields(matchDetailsAverage.getSupport(), match,participant));
            }
        }
        format(matchDetailsAverage.getAdCarry());
        format(matchDetailsAverage.getMid());
        format(matchDetailsAverage.getSupport());
        format(matchDetailsAverage.getTop());
        format(matchDetailsAverage.getJungle());
        return matchDetailsAverage;
    }

    private static RolDetailsAverage setFields(RolDetailsAverage rolDetailsAverage, MatchDetails match, Participant participant){
        if(participant.isGameEndedInSurrender()) rolDetailsAverage.setSurrenderCount(rolDetailsAverage.getSurrenderCount()+1);
        if(participant.isFirstBloodAssist() || participant.isFirstBloodKill()) rolDetailsAverage.setFirstBloodOrAssistCount(rolDetailsAverage.getFirstBloodOrAssistCount()+1);
        if(participant.isFirstTowerAssist() || participant.isFirstTowerKill()) rolDetailsAverage.setFirstTowerOrAssistCount(rolDetailsAverage.getFirstTowerOrAssistCount()+1);
        if(participant.isWin()) rolDetailsAverage.setWinCount(rolDetailsAverage.getWinCount()+1);
        rolDetailsAverage.setDeaths(rolDetailsAverage.getDeaths()+participant.getDeaths());
        rolDetailsAverage.setGameDuration(rolDetailsAverage.getGameDuration()+match.getInfo().getGameDuration());
        rolDetailsAverage.setTimePlayed(rolDetailsAverage.getTimePlayed()+participant.getTimePlayed());
        rolDetailsAverage.setPings(rolDetailsAverage.getPings()+(participant.getAllInPings()+participant.getAssistMePings()
                +participant.getBaitPings()+participant.getBasicPings()+ participant.getCommandPings()
                +participant.getDangerPings()+participant.getEnemyMissingPings()+participant.getEnemyVisionPings()
                +participant.getGetBackPings()+participant.getHoldPings()+participant.getNeedVisionPings()
                +participant.getOnMyWayPings()+participant.getPushPings()+participant.getVisionClearedPings()));
        rolDetailsAverage.setTurretKills(rolDetailsAverage.getTurretKills()+participant.getTurretKills());
        rolDetailsAverage.setDamageDealtToTurrets(rolDetailsAverage.getDamageDealtToTurrets()+participant.getDamageDealtToTurrets());
        rolDetailsAverage.setTurretPlatesTaken(rolDetailsAverage.getTurretPlatesTaken()+participant.getChallenges().getTurretPlatesTaken());
        rolDetailsAverage.setNeutralMinionsKilled(rolDetailsAverage.getNeutralMinionsKilled()+participant.getNeutralMinionsKilled());
        rolDetailsAverage.setJunglMinionsKill(rolDetailsAverage.getJunglMinionsKill()+(participant.getTotalAllyJungleMinionsKilled()+participant.getTotalEnemyJungleMinionsKilled()));
        rolDetailsAverage.setTotalMinionsKilled(rolDetailsAverage.getTotalMinionsKilled()+participant.getTotalMinionsKilled());
        rolDetailsAverage.setMoreEnemyJungleThanOpponent(rolDetailsAverage.getMoreEnemyJungleThanOpponent()+ participant.getChallenges().getMoreEnemyJungleThanOpponent());
        rolDetailsAverage.setQuickFirstTurret(rolDetailsAverage.getQuickFirstTurret()+ participant.getChallenges().getQuickFirstTurret());
        rolDetailsAverage.setQuickSoloKills(rolDetailsAverage.getQuickSoloKills()+ participant.getChallenges().getQuickSoloKills());
        rolDetailsAverage.setBaronKills(rolDetailsAverage.getBaronKills()+participant.getChallenges().getTeamBaronKills());
        rolDetailsAverage.setDragonKills(rolDetailsAverage.getDragonKills()+participant.getDragonKills());
        rolDetailsAverage.setTeamElderDragonKills(rolDetailsAverage.getTeamElderDragonKills()+participant.getChallenges().getTeamElderDragonKills());
        rolDetailsAverage.setTeamRiftHeraldKills(rolDetailsAverage.getTeamRiftHeraldKills()+participant.getChallenges().getTeamRiftHeraldKills());
        rolDetailsAverage.setVisionScorePerMinute(rolDetailsAverage.getVisionScorePerMinute()+participant.getChallenges().getVisionScorePerMinute());
        rolDetailsAverage.setDetectorWardsPlaced(rolDetailsAverage.getDetectorWardsPlaced()+participant.getDetectorWardsPlaced());
        rolDetailsAverage.setStealthWardsPlaced(rolDetailsAverage.getStealthWardsPlaced()+participant.getChallenges().getStealthWardsPlaced());
        rolDetailsAverage.setWardsPlaced(rolDetailsAverage.getWardsPlaced()+participant.getWardsPlaced());
        rolDetailsAverage.setVisionScore(rolDetailsAverage.getVisionScore()+ participant.getVisionScore());
        rolDetailsAverage.setVisionWardsBoughtInGame(rolDetailsAverage.getVisionWardsBoughtInGame()+ participant.getVisionWardsBoughtInGame());
        rolDetailsAverage.setWardsKilled(rolDetailsAverage.getWardsKilled()+participant.getWardsKilled());
        rolDetailsAverage.setEarlyLaningPhaseGoldExpAdvantage(rolDetailsAverage.getEarlyLaningPhaseGoldExpAdvantage()+participant.getChallenges().getEarlyLaningPhaseGoldExpAdvantage());
        rolDetailsAverage.setEffectiveHealAndShielding(rolDetailsAverage.getEffectiveHealAndShielding()+participant.getChallenges().getEffectiveHealAndShielding());
        rolDetailsAverage.setGoldPerMinute(rolDetailsAverage.getGoldPerMinute()+participant.getChallenges().getGoldPerMinute());
        rolDetailsAverage.setJungleCsBefore10Minutes(rolDetailsAverage.getJungleCsBefore10Minutes()+participant.getChallenges().getJungleCsBefore10Minutes());
        rolDetailsAverage.setLaneMinionsFirst10Minutes(rolDetailsAverage.getLaneMinionsFirst10Minutes()+participant.getChallenges().getLaneMinionsFirst10Minutes());
        rolDetailsAverage.setLaningPhaseGoldExpAdvantage(rolDetailsAverage.getLaningPhaseGoldExpAdvantage()+participant.getChallenges().getLaningPhaseGoldExpAdvantage());
        rolDetailsAverage.setMaxCsAdvantageOnLaneOpponent(rolDetailsAverage.getMaxCsAdvantageOnLaneOpponent()+participant.getChallenges().getMaxCsAdvantageOnLaneOpponent());
        rolDetailsAverage.setVisionScoreAdvantageLaneOpponent(rolDetailsAverage.getVisionScoreAdvantageLaneOpponent()+participant.getChallenges().getVisionScoreAdvantageLaneOpponent());
        rolDetailsAverage.setMaxLevelLeadLaneOpponent(rolDetailsAverage.getMaxLevelLeadLaneOpponent()+participant.getChallenges().getMaxLevelLeadLaneOpponent());
        rolDetailsAverage.setSaveAllyFromDeath(rolDetailsAverage.getSaveAllyFromDeath()+participant.getChallenges().getSaveAllyFromDeath());
        rolDetailsAverage.setKills(rolDetailsAverage.getKills()+participant.getKills());
        rolDetailsAverage.setKda(rolDetailsAverage.getKda()+participant.getChallenges().getKda());
        rolDetailsAverage.setKillParticipation(rolDetailsAverage.getKillParticipation()+participant.getChallenges().getKillParticipation());
        rolDetailsAverage.setDamageDealtToObjectives(rolDetailsAverage.getDamageDealtToObjectives()+participant.getDamageDealtToObjectives());
        rolDetailsAverage.setGoldEarned(rolDetailsAverage.getGoldEarned()+participant.getGoldEarned());
        rolDetailsAverage.setLongestTimeSpentLiving(rolDetailsAverage.getLongestTimeSpentLiving()+participant.getLongestTimeSpentLiving());
        rolDetailsAverage.setMagicDamageDealtToChampions(rolDetailsAverage.getMagicDamageDealtToChampions()+participant.getMagicDamageDealtToChampions());
        rolDetailsAverage.setMagicDamageTaken(rolDetailsAverage.getMagicDamageTaken()+participant.getMagicDamageTaken());
        rolDetailsAverage.setPhysicalDamageTaken(rolDetailsAverage.getPhysicalDamageTaken()+participant.getPhysicalDamageTaken());
        rolDetailsAverage.setPhysicalDamageDealtToChampions(rolDetailsAverage.getPhysicalDamageDealtToChampions()+participant.getPhysicalDamageDealtToChampions());
        rolDetailsAverage.setDamagePerMinute(rolDetailsAverage.getDamagePerMinute()+participant.getChallenges().getDamagePerMinute());
        rolDetailsAverage.setDamageTakenOnTeamPercentage(rolDetailsAverage.getDamageTakenOnTeamPercentage()+participant.getChallenges().getDamageTakenOnTeamPercentage());
        rolDetailsAverage.setTeamDamagePercentage(rolDetailsAverage.getTeamDamagePercentage()+participant.getChallenges().getTeamDamagePercentage());
        rolDetailsAverage.setTotalDamageDealtToChampions(rolDetailsAverage.getTotalDamageDealtToChampions()+participant.getTotalDamageDealtToChampions());
        rolDetailsAverage.setTotalDamageShieldedOnTeammates(rolDetailsAverage.getTotalDamageShieldedOnTeammates()+participant.getTotalDamageShieldedOnTeammates());
        rolDetailsAverage.setTotalDamageTaken(rolDetailsAverage.getTotalDamageTaken()+participant.getTotalDamageTaken());
        rolDetailsAverage.setTotalHeal(rolDetailsAverage.getTotalHeal()+participant.getTotalHeal());
        rolDetailsAverage.setTotalHealsOnTeammates(rolDetailsAverage.getTotalHealsOnTeammates()+participant.getTotalHealsOnTeammates());
        rolDetailsAverage.setTotalTimeSpentDead(rolDetailsAverage.getTotalTimeSpentDead()+participant.getTotalTimeSpentDead());
        rolDetailsAverage.setTotalUnitsHealed(rolDetailsAverage.getTotalUnitsHealed()+participant.getTotalUnitsHealed());
        rolDetailsAverage.setRolCount(rolDetailsAverage.getRolCount()+1);
        Champ champdto = new Champ(participant.getChampionName(),participant.getIndividualPosition());
        if(rolDetailsAverage.getChampTimes().get(champdto) == null){
            rolDetailsAverage.getChampTimes().put(champdto,1);
        } else {
            rolDetailsAverage.getChampTimes().put(champdto, rolDetailsAverage.getChampTimes().get(champdto)+1);
        }
        return rolDetailsAverage;
    }

    private static RolDetailsAverage format(RolDetailsAverage dto){
        if(dto.getRolCount()==0){
            return dto;
        }
        dto.setTimePlayed(dto.getTimePlayed()/dto.getRolCount());
        dto.setGameDuration(dto.getGameDuration()/dto.getRolCount());
        dto.setGameEndedInSurrender(((double)dto.getSurrenderCount()/dto.getRolCount())*100);
        dto.setPings(dto.getPings()/dto.getRolCount());
        dto.setFirstBloodOrAssist(((double)dto.getFirstBloodOrAssistCount()/dto.getRolCount())*100);
        dto.setFirstTowerOrAssist(((double)dto.getFirstTowerOrAssistCount()/dto.getRolCount())*100);
        dto.setTurretKills(dto.getTurretKills()/dto.getRolCount());
        dto.setDamageDealtToTurrets(dto.getDamageDealtToTurrets()/dto.getRolCount());
        dto.setTurretPlatesTaken(dto.getTurretPlatesTaken()/dto.getRolCount());
        dto.setNeutralMinionsKilled(dto.getNeutralMinionsKilled()/dto.getRolCount());
        dto.setJunglMinionsKill(dto.getJunglMinionsKill()/dto.getRolCount());
        dto.setMoreEnemyJungleThanOpponent(dto.getMoreEnemyJungleThanOpponent()/dto.getRolCount());
        dto.setQuickFirstTurret(dto.getQuickFirstTurret()/dto.getRolCount());
        dto.setQuickSoloKills(dto.getQuickSoloKills()/dto.getRolCount());
        dto.setBaronKills(dto.getBaronKills()/dto.getRolCount());
        dto.setDragonKills(dto.getDragonKills()/dto.getRolCount());
        dto.setTeamElderDragonKills(dto.getTeamElderDragonKills()/dto.getRolCount());
        dto.setTeamRiftHeraldKills(dto.getTeamRiftHeraldKills()/dto.getRolCount());
        dto.setVisionScorePerMinute(dto.getVisionScorePerMinute()/dto.getRolCount());
        dto.setDetectorWardsPlaced(dto.getDetectorWardsPlaced()/dto.getRolCount());
        dto.setStealthWardsPlaced(dto.getStealthWardsPlaced()/dto.getRolCount());
        dto.setVisionScore(dto.getVisionScore()/dto.getRolCount());
        dto.setVisionWardsBoughtInGame(dto.getVisionWardsBoughtInGame()/dto.getRolCount());
        dto.setWardsKilled(dto.getWardsKilled()/dto.getRolCount());
        dto.setWardsPlaced(dto.getWardsPlaced()/dto.getRolCount());
        return dto;
    }

}
