package Units;

import Abilities.Artillery;
import Abilities.Ranged;
import Etc.PlayerType;
import Etc.Traits;

/**
 * Created by Nik on 20.09.2016.
 */
public class Cannon extends Unit {

    public Cannon(PlayerType owner){
        super(UnitName.Field_Cannon);
        unitType = UnitType.Artillery;
        maxHealth = 100;
        currentHealth = maxHealth;
        maxMovement = 2;
        currentMovement = maxMovement;
        firstAbility = new Artillery(13,12,30,20,30,3);
        secondAbility = new Ranged(5, 5, 60, 50, 50, 3);
        meleeArmor = 0;
        rangedArmor = 0;
        chargeArmor = 0;
        cost = 24;
        this.owner = owner;
        trait = Traits.Artillery;
    }
}
