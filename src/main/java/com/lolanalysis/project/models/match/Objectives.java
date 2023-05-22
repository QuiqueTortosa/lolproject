package com.lolanalysis.project.models.match;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Objectives {

    @JsonProperty("baron")
    private Baron baron;
    @JsonProperty("champion")
    private Champion champion;
    @JsonProperty("dragon")
    private Dragon dragon;
    @JsonProperty("inhibitor")
    private Inhibitor inhibitor;
    @JsonProperty("riftHerald")
    private RiftHerald riftHerald;
    @JsonProperty("tower")
    private Tower tower;

}
