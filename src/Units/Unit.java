package Units;

import Abilities.Ability;
import Etc.PlayerType;
import Etc.Trait;

import java.util.List;

/**
 * Created by Shoggomo on 02.09.2016.
 */
public class Unit {
    protected String name;
    protected UnitName unitName;
    protected int maxHealth;
    protected int currentHealth;
    protected int maxOrder = 10;
    protected int order = maxOrder;
    protected int maxMovementRange;
    protected int currentMovementRange;
    protected int meleeArmor;
    protected int rangedArmor;
    protected int chargeArmor;
    protected int cost;
    protected boolean combatReady = true;
    protected Ability firstAbility;
    protected Ability secondAbility;
    protected UnitType unitType;
    protected PlayerType owner;
    protected List<Trait> traits;

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

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public int getMaxOrder() {
        return maxOrder;
    }

    public void setMaxOrder(int maxOrder) {
        this.maxOrder = maxOrder;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getMaxMovementRange() {
        return maxMovementRange;
    }

    public int getCurrentMovementRange() {
        return currentMovementRange;
    }

    public void setCurrentMovementRange(int currentMovementRange) {
        this.currentMovementRange = currentMovementRange;
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

    public void setCombatReadyReady(boolean combatReady) {
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

    public List<Trait> getTraits() {
        return traits;
    }
}
