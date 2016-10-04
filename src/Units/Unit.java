package Units;

import Abilities.Ability;
import Etc.PlayerType;
import Etc.Traits;

/**
 * Created by Shoggomo on 02.09.2016.
 */
public class Unit {
    protected String name;
    protected UnitName unitName;
    protected int maxHealth;
    protected int currentHealth;
    protected int maxOrder = 10;
    protected int currentOrder = maxOrder;
    protected int maxMovement;
    protected int currentMovement;
    protected int meleeArmor;
    protected int rangedArmor;
    protected int chargeArmor;
    protected int cost;
    protected boolean combatReady = true;
    protected Ability firstAbility;
    protected Ability secondAbility;
    protected UnitType unitType;
    protected PlayerType owner;
    protected Traits trait;

    public Unit(UnitName unitName){
        this.unitName = unitName;
        name = unitName.toString();
    }

    public String getName(){
        return name;
    }

    public UnitName getUnitName(){
        return unitName;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth){
        this.currentHealth = currentHealth;
    }

    public int getMaxOrder() {
        return maxOrder;
    }

    public void setMaxOrder(int maxOrder) {
        this.maxOrder = maxOrder;
    }

    public int getCurrentOrder() {
        return currentOrder;
    }

    public void setCurrentOrder(int currentOrder) {
        this.currentOrder = currentOrder;
    }

    public int getMaxMovement() {
        return maxMovement;
    }

    public int getCurrentMovement() {
        return currentMovement;
    }

    public void setCurrentMovement(int currentMovement) {
        this.currentMovement = currentMovement;
    }

    public int getMeleeArmor() {
        return meleeArmor;
    }

    public int getRangedArmor() {
        return rangedArmor;
    }

    public int getChargeArmor() {
        return chargeArmor;
    }

    public int getCost() {
        return cost;
    }

    public boolean isCombatReady() {
        return combatReady;
    }

    public void setCombatReady(boolean combatReady) {
        this.combatReady = combatReady;
    }

    public Ability getFirstAbility() {
        return firstAbility;
    }

    public Ability getSecondAbility() {
        return secondAbility;
    }

    public UnitType getUnitType() {
        return unitType;
    }

    public PlayerType getOwner() {
        return owner;
    }

    public Traits getTrait() {
        return trait;
    }
}
