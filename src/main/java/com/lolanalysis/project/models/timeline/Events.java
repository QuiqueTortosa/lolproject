package com.lolanalysis.project.models.timeline;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Events {

    @JsonProperty("realTimeStamp")
    private long realTimeStamp;
    @JsonProperty("participantId")
    private int participantId;
    @JsonProperty("creatorId")
    private int creatorId;
    @JsonProperty("timestamp")
    private int timestamp;
    @JsonProperty("wardType")
    private String wardType;
    @JsonProperty("skillSlot")
    private int skillSlot;
    @JsonProperty("type")
    private String type;

}
