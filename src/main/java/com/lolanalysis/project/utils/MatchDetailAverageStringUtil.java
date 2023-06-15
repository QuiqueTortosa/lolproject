package com.lolanalysis.project.utils;

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

    private String visionString(RolDetailsAverage dto){
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
