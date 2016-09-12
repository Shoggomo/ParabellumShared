package Units;

import Abilities.Ability;
import Etc.PlayerType;
import Etc.Trait;
import Maps.Terrains.TerrainType;

import java.util.List;

/**
 * Created by Shoggomo on 02.09.2016.
 */
public class Unit {
    protected int maxHealth;
    protected int currentHealth;
    protected int maxEfficiency = 10;
    protected int efficiency = maxEfficiency;
    protected int maxMovementRange;
    protected int currentMovementRange;
    protected int meleeArmor;
    protected int rangedArmor;
    protected int shockArmor;
    protected int cost;
    protected boolean combatReady = true;
    protected Ability meleeAbility;
    protected Ability nonFirstAbility;
    protected UnitType unitType;
    protected PlayerType owner;
    protected List<Trait> traits;

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public int getMaxEfficiency() {
        return maxEfficiency;
    }

    public void setMaxEfficiency(int maxEfficiency) {
        this.maxEfficiency = maxEfficiency;
    }

    public int getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(int efficiency) {
        this.efficiency = efficiency;
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

    public int getShockArmor() {
        return shockArmor;
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
        return meleeAbility;
    }

    public Ability getSecondAbility() {
        return nonFirstAbility;
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
