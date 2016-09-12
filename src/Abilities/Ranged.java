package Abilities;

/**
 * Created by Nik on 05.09.2016.
 */
public class Ranged extends Ability {

    public Ranged(int attackRange, int limit, int infantryDamage, int cavalryDamage, int artilleryDamage, int orderDamage) {
        super(AbilityType.Ranged, attackRange, limit, infantryDamage, cavalryDamage, artilleryDamage, orderDamage);
    }
}
