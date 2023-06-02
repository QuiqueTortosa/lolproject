package com.lolanalysis.project.utils;

import com.lolanalysis.project.models.MatchDetailsAverageDto;
import com.lolanalysis.project.models.match.MatchDetails;

import java.util.List;

public class MatchDetailAverageMapper {

    public MatchDetailsAverageDto toMatchDetailsAverageDto (List<MatchDetails> matchs){
        MatchDetailsAverageDto matchDetailsAverageDto = new MatchDetailsAverageDto();
        for(MatchDetails match: matchs){
            matchDetailsAverageDto.setDeaths((matchDetailsAverageDto.getDeaths()+match.getInfo().getParticipants().get(0).getDeaths())/matchs.size());
        }
        return matchDetailsAverageDto;
    }

}
