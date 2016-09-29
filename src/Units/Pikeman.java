package Units;

import Abilities.Melee;
import Etc.PlayerType;
import Etc.Trait;

/**
 * Created by Nik on 20.09.2016.
 */
public class Pikeman extends Unit {

    public Pikeman(PlayerType owner){
        super(UnitName.Pikeman);
        unitType = UnitType.Infantry;
        maxHealth = 140;
        currentHealth = maxHealth;
        maxMovement = 3;
        currentMovement = maxMovement;
        firstAbility = new Melee(30, 60, 60, 0);
        secondAbility = null;
        meleeArmor = 10;
        rangedArmor = 10;
        chargeArmor = 50;
        cost = 10;
        this.owner = owner;
        trait = Trait.Pikewall;
    }
}
