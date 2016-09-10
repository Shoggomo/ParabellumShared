package Units;

import Abilities.Melee;
import Abilities.Ranged;
import Etc.PlayerType;

/**
 * Created by Nik on 10.09.2016.
 */
public class MusketeerDummy extends Unit {

    public MusketeerDummy(PlayerType owner) {
        unitType = UnitType.Infantry;
        maxHealth = 100;
        currentHealth = maxHealth;
        maxMovementRange = 6;
        currentMovementRange = maxMovementRange;
        meleeAbility = new Melee(1, 1, 1, 1);
        nonMeleeAbility = new Ranged(5, 12, 1, 1, 1, 1);
        meleeArmor = 1;
        rangedArmor = 1;
        shockArmor = 1;
        cost = 1;
        this.owner = owner;
    }
}
