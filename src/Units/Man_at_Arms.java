package Units;

import Abilities.Melee;
import Abilities.Ranged;
import Etc.PlayerType;
import Etc.Trait;

/**
 * Created by Nik on 20.09.2016.
 */
public class Man_at_Arms extends Unit {
//Helmet & (Hammer or Greatsword)
    public Man_at_Arms(PlayerType owner){
        super("Man_at_Arms");
        unitType = UnitType.Infantry;
        maxHealth = 200;
        currentHealth = maxHealth;
        maxMovementRange = 5;
        currentMovementRange = maxMovementRange;
        firstAbility = new Melee(50, 40, 80, 0);
        secondAbility = null;
        meleeArmor = 30;
        rangedArmor = 30;
        chargeArmor = 30;
        cost = 24;
        this.owner = owner;
        //traits.add(Trait.Steadfast);
    }
}
