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
        maxHealth = 160;
        currentHealth = maxHealth;
        maxMovement = 3;
        currentMovement = maxMovement;
        firstAbility = new Melee(40, 60, 80, 0);
        secondAbility = null;
        meleeArmor = 20;
        rangedArmor = 20;
        chargeArmor = 40;
        cost = 16;
        this.owner = owner;
        trait = Trait.Shieldwall;
    }
}
