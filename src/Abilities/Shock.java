package Abilities;

/**
 * Created by Nik on 05.09.2016.
 */
public class Shock extends Ability {

    public Shock(int limit, int infantryDamage, int cavalryDamage, int artilleryDamage, int efficiencyDamage) {
        super(AbilityType.Shock, 2, limit, infantryDamage, cavalryDamage, artilleryDamage, efficiencyDamage);
    }
}
