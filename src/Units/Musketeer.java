package Units;

import Abilities.Melee;
import Abilities.Ranged;
import Etc.PlayerType;

/**
 * Created by Nik on 10.09.2016.
 */
public class Musketeer extends Unit {

    public Musketeer(PlayerType owner) {
        unitType = UnitType.Infantry;
        maxHealth = 100;
        currentHealth = maxHealth;
        maxMovementRange = 5;
        currentMovementRange = maxMovementRange;
        firstAbility = new Melee(20, 20, 40, 0);
        secondAbility = new Ranged(7, 8, 60, 40, 40, 1);
        meleeArmor = 1;
        rangedArmor = 1;
        chargeArmor = 1;
        cost = 1;
        this.owner = owner;
    }
}
