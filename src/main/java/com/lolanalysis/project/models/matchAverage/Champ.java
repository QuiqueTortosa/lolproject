package com.lolanalysis.project.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ChampDto {

    private String champ;
    private String rol;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChampDto champDto = (ChampDto) o;
        return Objects.equals(champ, champDto.champ) && Objects.equals(rol, champDto.rol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(champ, rol);
    }
}
