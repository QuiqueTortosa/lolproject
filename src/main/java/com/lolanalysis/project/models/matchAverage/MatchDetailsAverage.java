package com.lolanalysis.project.models.matchAverage;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MatchDetailsAverage {

    private RolDetailsAverage adCarry = new RolDetailsAverage();
    private RolDetailsAverage support = new RolDetailsAverage();
    private RolDetailsAverage top = new RolDetailsAverage();
    private RolDetailsAverage mid = new RolDetailsAverage();
    private RolDetailsAverage jungle = new RolDetailsAverage();

}
