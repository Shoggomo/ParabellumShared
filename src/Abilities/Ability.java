package Abilities;

/**
 * Created by Nik on 05.09.2016.
 */
public class Ability {
    protected int infantryDamage;
    protected int cavalryDamage;
    protected int artilleryDamage;
    protected int efficiencyDamage;
    protected int attackRange;
    protected int limit;
    protected AbilityType abilityType;

    public Ability(AbilityType abilityType, int attackRange, int limit, int infantryDamage, int cavalryDamage, int artilleryDamage, int efficiencyDamage) {
        this.abilityType = abilityType;
        this.attackRange = attackRange;
        this.limit = limit;
        this.infantryDamage = infantryDamage;
        this.cavalryDamage = cavalryDamage;
        this.artilleryDamage = artilleryDamage;
        this.efficiencyDamage = efficiencyDamage;
    }

}
