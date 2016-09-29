package Units;

import Abilities.Charge;
import Abilities.Melee;
import Etc.PlayerType;
import Etc.Trait;

/**
 * Created by Nik on 20.09.2016.
 */
public class Hussar extends Unit {

    public Hussar(PlayerType owner){
        super(UnitName.Hussar);
        unitType = UnitType.Infantry;
        maxHealth = 140;
        currentHealth = maxHealth;
        maxMovement = 7;
        currentMovement = maxMovement;
        firstAbility = new Melee(40, 40, 80, 0);
        secondAbility = new Charge(8,60,60,100,1);
        meleeArmor = 15;
        rangedArmor = 15;
        chargeArmor = 15;
        cost = 20;
        this.owner = owner;
        trait = Trait.HitAndRun;
    }
}
