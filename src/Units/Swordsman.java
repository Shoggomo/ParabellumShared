package Units;

import Abilities.Melee;
import Etc.PlayerType;
import Etc.Trait;

/**
 * Created by Nik on 20.09.2016.
 */
public class Swordsman extends Unit {

    public Swordsman(PlayerType owner){
        super(UnitName.Swordsman);
        unitType = UnitType.Infantry;
        maxHealth = 180;
        currentHealth = maxHealth;
        maxMovement = 3;
        currentMovement = maxMovement;
        firstAbility = new Melee(30, 30, 60, 0);
        secondAbility = null;
        meleeArmor = 30;
        rangedArmor = 40;
        chargeArmor = 20;
        cost = 16;
        this.owner = owner;
        trait = Trait.Shieldwall;
    }
}
