package Units;

import Abilities.Artillery;
import Abilities.Melee;
import Abilities.Ranged;
import Etc.PlayerType;
import Etc.Trait;

/**
 * Created by Nik on 20.09.2016.
 */
public class Mortar extends Unit {

    public Mortar(PlayerType owner){
        super("Mortar");
        unitType = UnitType.Infantry;
        maxHealth = 100;
        currentHealth = maxHealth;
        maxMovementRange = 3;
        currentMovementRange = maxMovementRange;
        firstAbility = new Artillery(9,12,40,40,40,3);
        secondAbility = null;
        meleeArmor = 0;
        rangedArmor = 0;
        chargeArmor = 0;
        cost = 20;
        this.owner = owner;
        traits.add(Trait.SmallTarget);
    }
}
