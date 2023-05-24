package com.lolanalysis.project.models.timeline;

import com.fasterxml.jackson.annotation.*;

import com.lolanalysis.project.models.Metadata;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({ "metadata", "info" })
public class MatchTimeline {

    @JsonProperty("metadata")
    private Metadata metadata;
    @JsonProperty("info")
    private Info info;

    @Override
    public String toString() {
        //return ""+info.getFrames().get(0).getParticipantFrames().keySet();
        StringBuilder ret = new StringBuilder();
        ret.append("Partida: "+metadata.getMatchId());
        ret.append("\n\t Rol del jugador: ");
        ret.append("\n\t Asesinatos: ");
        ret.append("\n\t Muertes: ");
        ret.append("\n\t Asistencias: ");
        ret.append("\n\t Subditos asesinados: ");
        ret.append("\n\t Daño realizado: ");
        ret.append("\n\t Daño recibido: ");
        ret.append("\n\t Curaciones: ");
        ret.append("\n\t Wards colocados: ");
        ret.append("\n\t Oro: ");
        ret.append("\n\t Tiempo muerto: ");

        return ""+info.getFrames().get(info.getFrames().size()-1).getParticipantFrames().get("1").getChampionStats().getArmor();
    }
}
