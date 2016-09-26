package Units;

import Abilities.Melee;
import Abilities.Ranged;
import Etc.PlayerType;
import Etc.Trait;

/**
 * Created by Nik on 20.09.2016.
 */
public class Longbowman extends Unit {
//Longbow
    public Longbowman(PlayerType owner){
        super("Longbowman");
        unitType = UnitType.Infantry;
        maxHealth = 120;
        currentHealth = maxHealth;
        maxMovementRange = 7;
        currentMovementRange = maxMovementRange;
        firstAbility = new Melee(30, 30, 60, 0);
        secondAbility = new Ranged(9, 12, 30, 30, 30, 0);
        meleeArmor = 10;
        rangedArmor = 10;
        chargeArmor = 10;
        cost = 1;
        this.owner = owner;
        //traits.add(Trait.Quickdraw);
    }
}
