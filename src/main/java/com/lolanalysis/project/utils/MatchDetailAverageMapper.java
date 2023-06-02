package com.lolanalysis.project.utils;

import com.lolanalysis.project.models.MatchDetailsAverageDto;
import com.lolanalysis.project.models.match.MatchDetails;
import com.lolanalysis.project.models.match.Participant;

import java.util.List;

public class MatchDetailAverageMapper {

    public MatchDetailsAverageDto toMatchDetailsAverageDto (List<MatchDetails> matchs){
        MatchDetailsAverageDto matchDetailsAverageDto = new MatchDetailsAverageDto();
        for(MatchDetails match: matchs){
            Participant participant = match.getInfo().getParticipants().get(0);
            matchDetailsAverageDto.setDeaths((matchDetailsAverageDto.getDeaths()+participant.getDeaths())/matchs.size());
        }
        return matchDetailsAverageDto;
    }

}
