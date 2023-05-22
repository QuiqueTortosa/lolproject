package com.lolanalysis.project.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Metadata {
    @JsonProperty("dataVersion")
    private String dataVersion;

    @JsonProperty("matchId")
    private String matchId;

    @JsonProperty("participants")
    private List<String> participants;

}
