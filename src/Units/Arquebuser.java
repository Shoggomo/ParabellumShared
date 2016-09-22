package Units;

import Abilities.Melee;
import Abilities.Ranged;
import Etc.PlayerType;

/**
 * Created by Nik on 20.09.2016.
 */
public class Arquebuser extends Unit {

    public Arquebuser(PlayerType owner){
        unitType = UnitType.Infantry;
        maxHealth = 100;
        currentHealth = maxHealth;
        maxMovementRange = 7;
        currentMovementRange = maxMovementRange;
        firstAbility = new Melee(30, 30, 60, 0);
        secondAbility = new Ranged(5, 8, 50, 50, 50, 1);
        meleeArmor = 5;
        rangedArmor = 5;
        chargeArmor = 5;
        cost = 10;
        this.owner = owner;
    }
}
