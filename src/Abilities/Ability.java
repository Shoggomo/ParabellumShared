package Abilities;

/**
 * Created by Nik on 05.09.2016.
 */
public class Ability {
    protected int infantryDamage;
    protected int cavalryDamage;
    protected int artilleryDamage;
    protected int orderDamage;
    protected int attackRange;
    protected int limit;
    protected AbilityType abilityType;

    public Ability(AbilityType abilityType, int attackRange, int limit, int infantryDamage, int cavalryDamage, int artilleryDamage, int orderDamage) {
        this.abilityType = abilityType;
        this.attackRange = attackRange;
        this.limit = limit;
        this.infantryDamage = infantryDamage;
        this.cavalryDamage = cavalryDamage;
        this.artilleryDamage = artilleryDamage;
        this.orderDamage = orderDamage;
    }

    public int getInfantryDamage() {
        return infantryDamage;
    }

    public int getCavalryDamage() {
        return cavalryDamage;
    }

    public int getArtilleryDamage() {
        return artilleryDamage;
    }

    public int getOrderDamage() {
        return orderDamage;
    }

    public int getAttackRange() {
        return attackRange;
    }

    public int getLimit() {
        return limit;
    }

    public AbilityType getAbilityType() {
        return abilityType;
    }

}
