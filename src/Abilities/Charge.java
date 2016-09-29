package Abilities;

/**
 * Created by Nik on 05.09.2016.
 */
public class Charge extends Ability {

    public Charge(int limit, int infantryDamage, int cavalryDamage, int artilleryDamage, int orderDamage) {
        super(AbilityType.Charge, 1, limit, infantryDamage, cavalryDamage, artilleryDamage, orderDamage);
    }
}
