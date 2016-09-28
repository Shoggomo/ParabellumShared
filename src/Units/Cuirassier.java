package Units;

import Abilities.Melee;
import Abilities.Ranged;
import Etc.PlayerType;
import Etc.Trait;

/**
 * Created by Nik on 20.09.2016.
 */
public class Cuirassier extends Unit {
//Pistol
    public Cuirassier(PlayerType owner){
        super(UnitName.Cuirassier);
        unitType = UnitType.Cavalry;
        maxHealth = 160;
        currentHealth = maxHealth;
        maxMovementRange = 6;
        currentMovementRange = maxMovementRange;
        firstAbility = new Melee(50, 50, 80, 0);
        secondAbility = new Ranged(3, 6, 40, 40, 40, 1);
        meleeArmor = 25;
        rangedArmor = 25;
        chargeArmor = 25;
        cost = 30;
        this.owner = owner;
    }
}
