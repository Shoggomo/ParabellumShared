package Units;

import Abilities.Melee;
import Abilities.Ranged;
import Etc.PlayerType;

/**
 * Created by Nik on 20.09.2016.
 */
public class Dragonier extends Unit {

    public Dragonier(PlayerType owner){
        unitType = UnitType.Cavalry;
        maxHealth = 100;
        currentHealth = maxHealth;
        maxMovementRange = 13;
        currentMovementRange = maxMovementRange;
        firstAbility = new Melee(40, 30, 70, 0);
        secondAbility = new Ranged(5, 12, 40, 25, 25, 1);
        meleeArmor = 1;
        rangedArmor = 1;
        chargeArmor = 1;
        cost = 1;
        this.owner = owner;
    }
}
