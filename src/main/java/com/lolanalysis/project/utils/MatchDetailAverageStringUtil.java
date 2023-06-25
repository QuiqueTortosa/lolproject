package com.lolanalysis.project.utils;

import com.lolanalysis.project.models.matchAverage.Champ;
import com.lolanalysis.project.models.matchAverage.RolDetailsAverage;

public class MatchDetailAverageStringUtil {

    public String genericToString(RolDetailsAverage dto){
        StringBuilder ret = new StringBuilder(startString(dto));
        ret.append(adcToString(dto));
        ret.append(midToString(dto));
        ret.append(topToString(dto));
        ret.append(junglToString(dto));
        ret.append(suppToString(dto));
        return ret.toString();
    }

    private static String adcToString(RolDetailsAverage dto){
        return "";
    }

    private static String midToString(RolDetailsAverage dto){
        return "";
    }

    private static String topToString(RolDetailsAverage dto){
        return "";
    }

    private static String junglToString(RolDetailsAverage dto){
        return "";
    }
    private static String suppToString(RolDetailsAverage dto){
        return "";
    }


    private static String startString(RolDetailsAverage dto){
        StringBuilder sb = new StringBuilder();
        //Decir cual es su rol principal
        sb.append("A continuación le mostrare un resumen de las ultimas 100 partidas del jugador x");

        sb.append("Las partidas tienen una duracion media de " + dto.getGameDuration() + " minutos");
        return sb.toString();
    }

    private static String visionString(RolDetailsAverage dto){
        StringBuilder sb = new StringBuilder();
        sb.append("En cuanto a la visión tenemos los siguientes datos por partida: \n");
        sb.append("Stealth wards colocados por partida: "+dto.getStealthWardsPlaced()+"\n");
        sb.append("Detector wards colocados por partida: "+dto.getDetectorWardsPlaced()+"\n");
        sb.append("Wards colocados por partida: "+dto.getWardsPlaced()+"\n");
        sb.append("Wards eliminados por partida: "+dto.getWardsKilled()+"\n");
        sb.append("Wards comprados por partida: "+dto.getVisionWardsBoughtInGame()+"\n");
        sb.append("Vision por minuto por partida: "+dto.getVisionScorePerMinute()+"\n");
        sb.append("Vision score por partida: "+dto.getVisionScore()+"\n");
        return sb.toString();
    }

    private static String objectives(RolDetailsAverage dto){
        StringBuilder sb = new StringBuilder();
        sb.append("En cuanto a los objetivos tenemos los siguientes datos por partida: \n");
        sb.append("Torretas destruidas: "+dto.getTurretKills()+"\n");
        sb.append("Placas de torre obtenidas: "+dto.getTurretPlatesTaken()+"\n");
        sb.append("Daño a torretas: "+dto.getDamageDealtToTurrets()+"\n");
        sb.append("Primera torreta destruida: "+dto.getQuickFirstTurret()+"\n");
        sb.append("Baron eliminados: "+dto.getBaronKills()+"\n");
        sb.append("Dragones eliminados: "+dto.getDragonKills()+"\n");
        sb.append("Elders eliminados: "+dto.getTeamElderDragonKills()+"\n");
        sb.append("Subditos eliminados: "+dto.getTotalMinionsKilled()+"\n");
        sb.append("Minions 10 primeros minutos: "+dto.getLaneMinionsFirst10Minutes()+"\n");
        sb.append("Daño total a objetivos: "+dto.getDamageDealtToObjectives()+"\n");
        return sb.toString();
    }

    private static String advantage(RolDetailsAverage dto){
        StringBuilder sb = new StringBuilder();
        sb.append("En cuanto a la ventaja con la linea rival: \n");
        sb.append("Maxima ventaja de subditos: "+dto.getMaxCsAdvantageOnLaneOpponent()+"\n");
        sb.append("Maxima ventaja en vision: "+dto.getVisionScoreAdvantageLaneOpponent()+"\n");
        sb.append("Maxima ventaja de nivel: "+dto.getMaxLevelLeadLaneOpponent()+"\n");
        //junglcslead
        return sb.toString();
    }

    private static String damageDealt(RolDetailsAverage dto){
        StringBuilder sb = new StringBuilder();
        sb.append("En cuanto al daño provocado a campeones: \n");
        sb.append("Daño fisico: "+dto.getPhysicalDamageDealtToChampions()+"\n");
        sb.append("Daño mágico: "+dto.getMagicDamageDealtToChampions()+"\n");
        sb.append("Daño total: "+dto.getTotalDamageDealtToChampions()+"\n");
        sb.append("Porcentaje de daño del equipo: "+dto.getTeamDamagePercentage()+"\n");
        sb.append("Daño por minuto: "+dto.getDamagePerMinute()+"\n");
        return sb.toString();
    }

    private static String damageReceived(RolDetailsAverage dto){
        StringBuilder sb = new StringBuilder();
        sb.append("En cuanto al daño recibido de campeones: \n");
        sb.append("Daño fisico: "+dto.getPhysicalDamageTaken()+"\n");
        sb.append("Daño mágico: "+dto.getMagicDamageTaken()+"\n");
        sb.append("Daño total: "+dto.getTotalDamageTaken()+"\n");
        sb.append("Porcentaje de daño del equipo: "+dto.getTeamDamagePercentage()+"\n");
        return sb.toString();
    }

    private static String supportStats(RolDetailsAverage dto){
        StringBuilder sb = new StringBuilder();
        sb.append("En cuanto estadisticas de support: \n");
        sb.append("Curación total: "+dto.getTotalHeal()+"\n");
        sb.append("Curacion total a compañeros: "+dto.getTotalHealsOnTeammates()+"\n");
        sb.append("Unidades curadas: "+dto.getTotalUnitsHealed()+"\n");;
        sb.append("Daño total blindado en compañeros de equipo: "+dto.getTotalDamageShieldedOnTeammates()+"\n");
        sb.append("Curacion y blindaje efectivo: "+dto.getEffectiveHealAndShielding()+"\n");
        sb.append("Salvar a compañeros: "+dto.getSaveAllyFromDeath()+"\n");
        return sb.toString();
    }

    private static String junglStats(RolDetailsAverage dto){
        StringBuilder sb = new StringBuilder();
        sb.append("En cuanto estadisticas de jungla: \n");
        sb.append("Minions jungla eliminados: "+dto.getTeamDamagePercentage()+"\n");
        sb.append("Mas minions de jungla que el rival: "+dto.getTeamDamagePercentage()+"\n");
        sb.append("Heraldos eliminados: "+dto.getTeamDamagePercentage()+"\n");;
        sb.append("Minions de jungla antes de 10 minutos  : "+dto.getPhysicalDamageTaken()+"\n");
        return sb.toString();
    }

    private static String generalStats(RolDetailsAverage dto){
        StringBuilder sb = new StringBuilder();
        sb.append("En cuanto estadisticas generales: \n");
        sb.append("Asesinatos: "+dto.getPhysicalDamageTaken()+"\n");
        sb.append("Muerte: "+dto.getMagicDamageTaken()+"\n");
        sb.append("Kda: "+dto.getTotalDamageTaken()+"\n");
        sb.append("Victorias: "+dto.getTeamDamagePercentage()+"\n");
        sb.append("Surrender: "+dto.getTeamDamagePercentage()+"\n");
        sb.append("Primer kill: "+dto.getTeamDamagePercentage()+"\n");
        sb.append("Duración de partida: "+dto.getTeamDamagePercentage()+"\n");
        return sb.toString();
    }

    private static String champStats(RolDetailsAverage dto, String lane){
        StringBuilder sb = new StringBuilder();
        sb.append("En cuanto ha los campones se ha jugado: ");
        for(Champ champ:dto.getChampTimes().keySet()) {
            sb.append(champ.getChamp()+": "+ dto.getChampTimes().get(champ)+" veces");
        }
        return sb.toString();
    }
}
