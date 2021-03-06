package Units;

import Abilities.Charge;
import Abilities.Melee;
import Etc.PlayerType;
import Etc.Traits;

/**
 * Created by Nik on 20.09.2016.
 */
public class Lancer extends Unit {

    public Lancer(PlayerType owner){
        super(UnitName.Lancer);
        unitType = UnitType.Cavalry;
        maxHealth = 180;
        currentHealth = maxHealth;
        maxMovement = 5;
        currentMovement = maxMovement;
        firstAbility = new Melee(50, 50, 80, 0);
        secondAbility = new Charge(6,80,80,100,3);
        meleeArmor = 30;
        rangedArmor = 30;
        chargeArmor = 30;
        cost = 32;
        this.owner = owner;
        trait = Traits.Shock;
    }
}
