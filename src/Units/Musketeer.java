package Units;

import Abilities.Melee;
import Abilities.Ranged;
import Etc.PlayerType;

/**
 * Created by Nik on 10.09.2016.
 */
public class Musketeer extends Unit {

    public Musketeer(PlayerType owner) {
        super("Musketeer");
        unitType = UnitType.Infantry;
        maxHealth = 100;
        currentHealth = maxHealth;
        maxMovementRange = 5;
        currentMovementRange = maxMovementRange;
        firstAbility = new Melee(20, 20, 40, 0);
        secondAbility = new Ranged(7, 8, 60, 60, 50, 1);
        meleeArmor = 0;
        rangedArmor = 0;
        chargeArmor = 0;
        cost = 1;
        this.owner = owner;
    }
}
