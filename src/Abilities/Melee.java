package Abilities;

/**
 * Created by Nik on 05.09.2016.
 */
public class Melee extends Ability {

    public Melee(int infantryDamage, int cavalryDamage, int artilleryDamage, int orderDamage){
        super(AbilityType.Melee, 1, Integer.MAX_VALUE, infantryDamage, cavalryDamage, artilleryDamage, orderDamage);
    }
}
