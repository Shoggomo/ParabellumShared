package Units;

import Abilities.Charge;
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
        firstAbility = new Melee(40, 40, 80, 0);
        secondAbility = new Charge(8,60,60,100,1);
        meleeArmor = 15;
        rangedArmor = 15;
        chargeArmor = 15;
        cost = 20;
        this.owner = owner;
        traits.add(Trait.HitAndRun);
    }
}
