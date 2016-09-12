package Abilities;

/**
 * Created by Nik on 06.09.2016.
 */
public class Artillery extends Ability {

    public Artillery(int attackRange, int limit, int infantryDamage, int cavalryDamage, int artilleryDamage, int orderDamage) {
        super(AbilityType.Artillery, attackRange, limit, infantryDamage, cavalryDamage, artilleryDamage, orderDamage);
    }
}
