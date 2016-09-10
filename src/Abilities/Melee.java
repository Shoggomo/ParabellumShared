package Abilities;

/**
 * Created by Nik on 05.09.2016.
 */
public class Melee extends Ability {

    public Melee(int infantryDamage, int cavalryDamage, int artilleryDamage, int efficiencyDamage){
        super(AbilityType.Melee, 2, Integer.MAX_VALUE, infantryDamage, cavalryDamage, artilleryDamage, efficiencyDamage);
    }
}
