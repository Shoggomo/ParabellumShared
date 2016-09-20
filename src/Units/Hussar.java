package Units;

import Abilities.Melee;
import Abilities.Ranged;
import Etc.PlayerType;
import Etc.Trait;

/**
 * Created by Nik on 20.09.2016.
 */
public class Hussar extends Unit {

    public Hussar(PlayerType owner){
        unitType = UnitType.Infantry;
        maxHealth = 140;
        currentHealth = maxHealth;
        maxMovementRange = 13;
        currentMovementRange = maxMovementRange;
        firstAbility = new Melee(1, 1, 1, 1);
        secondAbility = new Ranged(5, 12, 1, 1, 1, 1);
        meleeArmor = 1;
        rangedArmor = 1;
        chargeArmor = 1;
        cost = 1;
        this.owner = owner;
        traits.add(Trait.HitAndRun);
    }
}
