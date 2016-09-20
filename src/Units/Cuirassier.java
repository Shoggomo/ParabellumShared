package Units;

import Abilities.Melee;
import Abilities.Ranged;
import Etc.PlayerType;
import Etc.Trait;

/**
 * Created by Nik on 20.09.2016.
 */
public class Cuirassier extends Unit {

    public Cuirassier(PlayerType owner){
        unitType = UnitType.Cavalry;
        maxHealth = 100;
        currentHealth = maxHealth;
        maxMovementRange = 11;
        currentMovementRange = maxMovementRange;
        firstAbility = new Melee(1, 1, 1, 1);
        secondAbility = new Ranged(3, 6, 1, 1, 1, 1);
        meleeArmor = 1;
        rangedArmor = 1;
        chargeArmor = 1;
        cost = 1;
        this.owner = owner;
        traits.add(Trait.HitAndRun);
    }
}
