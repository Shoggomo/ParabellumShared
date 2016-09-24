package Units;

import Abilities.Artillery;
import Abilities.Melee;
import Abilities.Ranged;
import Etc.PlayerType;
import Etc.Trait;

/**
 * Created by Nik on 20.09.2016.
 */
public class Field_Cannon extends Unit {

    public Field_Cannon(PlayerType owner){
        super("Field_Cannon");
        unitType = UnitType.Artillery;
        maxHealth = 100;
        currentHealth = maxHealth;
        maxMovementRange = 5;
        currentMovementRange = maxMovementRange;
        firstAbility = new Artillery(13,12,30,20,30,3);
        secondAbility = new Ranged(5, 5, 60, 50, 50, 3);
        meleeArmor = 0;
        rangedArmor = 0;
        chargeArmor = 0;
        cost = 1;
        this.owner = owner;
        traits.add(Trait.SmallTarget);
    }
}
