package Units;

import Abilities.Charge;
import Abilities.Melee;
import Abilities.Ranged;
import Etc.PlayerType;
import Etc.Trait;

/**
 * Created by Nik on 20.09.2016.
 */
public class Lancer extends Unit {

    public Lancer(PlayerType owner){
        unitType = UnitType.Cavalry;
        maxHealth = 180;
        currentHealth = maxHealth;
        maxMovementRange = 9;
        currentMovementRange = maxMovementRange;
        firstAbility = new Melee(1, 1, 1, 1);
        secondAbility = new Charge(1,1,1,1,1);
        meleeArmor = 1;
        rangedArmor = 1;
        chargeArmor = 1;
        cost = 1;
        this.owner = owner;
        traits.add(Trait.Steadfast);
    }
}
