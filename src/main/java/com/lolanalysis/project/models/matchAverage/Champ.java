package com.lolanalysis.project.models.matchAverage;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Champ {

    private String champ;
    private String rol;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Champ champDto = (Champ) o;
        return Objects.equals(champ, champDto.champ) && Objects.equals(rol, champDto.rol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(champ, rol);
    }
}
