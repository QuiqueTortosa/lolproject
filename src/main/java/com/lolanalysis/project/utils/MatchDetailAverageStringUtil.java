package com.lolanalysis.project.utils;

import com.lolanalysis.project.models.matchAverage.MatchDetailsAverage;

public class MatchDetailAverageStringUtil {

    public String genericToString(MatchDetailsAverage dto){
        StringBuilder ret = new StringBuilder(startString(dto));
        ret.append(adcToString(dto));
        ret.append(midToString(dto));
        ret.append(topToString(dto));
        ret.append(junglToString(dto));
        ret.append(suppToString(dto));
        return ret.toString();
    }

    private static String adcToString(MatchDetailsAverage dto){
        return "";
    }

    private static String midToString(MatchDetailsAverage dto){
        return "";
    }

    private static String topToString(MatchDetailsAverage dto){
        return "";
    }

    private static String junglToString(MatchDetailsAverage dto){
        return "";
    }
    private static String suppToString(MatchDetailsAverage dto){
        return "";
    }


    private static String startString(MatchDetailsAverage dto){
        StringBuilder sb = new StringBuilder();
        //Decir cual es su rol principal
        sb.append("A continuación le mostrare un resumen de las ultimas 100 partidas del jugador x");

        sb.append("Las partidas tienen una duracion media de " + dto.getGameDuration() + " minutos");
        return sb.toString();
    }

    private String visionString(MatchDetailsAverage dto){
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

}
