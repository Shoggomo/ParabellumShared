package Logic;

import Abilities.Ability;
import Units.Unit;
import Units.UnitType;

/**
 * Created by Nik on 12.09.2016.
 */
public class CombatRaw {

    Unit attacker;
    Unit defender;
    Ability ability;
    int damage;
    int armor;

    public CombatRaw(Unit attacker, Unit defender, Ability ability){
        this.attacker = attacker;
        this.defender = defender;
        this.ability = ability;
        getDamage();
        getArmor();
    }

    private void getDamage(){
        switch(defender.getUnitType()){
            case Infantry: damage = ability.getInfantryDamage();
                break;
            case Cavalry: damage = ability.getCavalryDamage();
                break;
            case Artillery: damage = ability.getArtilleryDamage();
        }
    }

    private void getArmor() {
        switch (ability.getAbilityType()) {
            case Melee:
                armor = defender.getMeleeArmor();
                break;
            case Shock:
                armor = defender.getShockArmor();
                break;
            case Ranged:
                armor = defender.getRangedArmor();
                break;
            case Artillery:
                armor = 0;
        }
    }

    public int getRawDamage(){
        damage -= armor;
        return damage;
    }
}
