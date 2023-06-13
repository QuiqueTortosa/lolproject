package com.lolanalysis.project.utils;

import com.lolanalysis.project.models.dtos.MatchDetailsAverageDto;

public class MatchDetailAverageString {

    public String genericToString(MatchDetailsAverageDto dto){
        StringBuilder ret = new StringBuilder(startString(dto));
        return ret.toString();
    }

    private static String adcToString(MatchDetailsAverageDto dto){
        return "";
    }

    private static String midToString(MatchDetailsAverageDto dto){
        return "";
    }

    private static String topToString(MatchDetailsAverageDto dto){
        return "";
    }

    private static String junglToString(MatchDetailsAverageDto dto){
        return "";
    }

    private static String startString(MatchDetailsAverageDto dto){
        StringBuilder sb = new StringBuilder();
        //Decir cual es su rol principal
        sb.append("A continuación le mostrare un resumen de las ultimas 100 partidas del jugador x");
        sb.append("Las partidas tienen una duracion media de " + dto.getGameDuration() + " minutos");
        return sb.toString();
    }

    private String visionString(MatchDetailsAverageDto dto){
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
