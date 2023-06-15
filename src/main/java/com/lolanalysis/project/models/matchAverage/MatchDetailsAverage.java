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

    private MatchDetailsAverage adCarry = new MatchDetailsAverage();
    private MatchDetailsAverage support = new MatchDetailsAverage();
    private MatchDetailsAverage top = new MatchDetailsAverage();
    private MatchDetailsAverage mid = new MatchDetailsAverage();
    private MatchDetailsAverage jungle = new MatchDetailsAverage();

}
