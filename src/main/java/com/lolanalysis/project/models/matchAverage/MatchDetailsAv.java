package com.lolanalysis.project.models.matchAverage;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MatchDetailsAv {

    private MatchDetailsAverage adCarry;
    private MatchDetailsAverage support;
    private MatchDetailsAverage top;
    private MatchDetailsAverage mid;
    private MatchDetailsAverage jungle;

}
