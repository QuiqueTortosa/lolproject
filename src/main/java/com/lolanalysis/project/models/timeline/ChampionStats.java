package com.lolanalysis.project.models.timeline;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChampionStats {

    @JsonProperty("abilityHaste")
    private int abilityHaste;
    @JsonProperty("abilityPower")
    private int abilityPower;
    @JsonProperty("armor")
    private int armor;
    @JsonProperty("armorPen")
    private int armorPen;
    @JsonProperty("armorPenPercent")
    private int armorPenPercent;
    @JsonProperty("attackDamage")
    private int attackDamage;
    @JsonProperty("attackSpeed")
    private int attackSpeed;
    @JsonProperty("bonusArmorPenPercent")
    private int bonusArmorPenPercent;
    @JsonProperty("bonusMagicPenPercent")
    private int bonusMagicPenPercent;
    @JsonProperty("ccReduction")
    private int ccReduction;
    @JsonProperty("cooldownReduction")
    private int cooldownReduction;
    @JsonProperty("health")
    private int health;
    @JsonProperty("healthMax")
    private int healthMax;
    @JsonProperty("healthRegen")
    private int healthRegen;
    @JsonProperty("lifesteal")
    private int lifesteal;
    @JsonProperty("magicPen")
    private int magicPen;
    @JsonProperty("magicPenPercent")
    private int magicPenPercent;
    @JsonProperty("magicResist")
    private int magicResist;
    @JsonProperty("movementSpeed")
    private int movementSpeed;
    @JsonProperty("omnivamp")
    private int omnivamp;
    @JsonProperty("physicalVamp")
    private int physicalVamp;
    @JsonProperty("power")
    private int power;
    @JsonProperty("powerMax")
    private int powerMax;
    @JsonProperty("powerRegen")
    private int powerRegen;
    @JsonProperty("spellVamp")
    private int spellVamp;

}
