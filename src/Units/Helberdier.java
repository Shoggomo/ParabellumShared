package Units;

import Abilities.Melee;
import Abilities.Ranged;
import Etc.PlayerType;
import Etc.Trait;

/**
 * Created by Nik on 20.09.2016.
 */
public class Helberdier extends Unit {

    public Helberdier(PlayerType owner){
        unitType = UnitType.Infantry;
        maxHealth = 160;
        currentHealth = maxHealth;
        maxMovementRange = 5;
        currentMovementRange = maxMovementRange;
        firstAbility = new Melee(40, 60, 80, 0);
        secondAbility = null;
        meleeArmor = 1;
        rangedArmor = 1;
        chargeArmor = 1;
        cost = 1;
        this.owner = owner;
        traits.add(Trait.Breakthrough);
    }
}
