package Units;

import Abilities.Ability;
import Abilities.Combat;
import Etc.PlayerType;
import Etc.Traits;

import java.util.List;

/**
 * Created by Shoggomo on 02.09.2016.
 */
public class Unit {
    protected int maxHealth;
    public int getMaxHealth() {
        return maxHealth;
    }

    protected int currentHealth;
    public int getCurrentHealth() {
        return currentHealth;
    }
    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    protected int efficiency;
    public int getEfficiency() {
        return efficiency;
    }
    public void setEfficiency(int efficiency) {
        this.efficiency = efficiency;
    }

    protected int maxMovementRange;
    public int getMaxMovementRange() {
        return maxMovementRange;
    }

    protected int currentMovementRange;
    public int getCurrentMovementRange() {
        return currentMovementRange;
    }
    public void setCurrentMovementRange(int currentMovementRange) {
        this.currentMovementRange = currentMovementRange;
    }

    protected int meleeArmor;
    public int getMeleeArmor() {
        return meleeArmor;
    }

    protected int rangedArmor;
    public int getRangedArmor() {
        return rangedArmor;
    }

    protected int shockArmor;
    public int getShockArmor() {
        return shockArmor;
    }

    protected int cost;
    public int getCost() {
        return cost;
    }

    protected boolean combatReady;
    public boolean areCombatReady() {
        return combatReady;
    }
    public void setCombatReadyReady(boolean combatReady) {
        this.combatReady = combatReady;
    }

    protected Ability meleeAbility;
    public Ability getMeleeAbility() {
        return  meleeAbility;
    }

    protected Ability nonMeleeAbility;
    public Ability getnonMeleeAbility() {
        return nonMeleeAbility;
    }

    protected UnitType unitType;
    public UnitType getUnitType() {
        return unitType;
    }

    protected PlayerType owner;
    public PlayerType getOwner() {
        return owner;
    }

    protected List<Traits> unitTraits;
    public List<Traits> getUnitTraits() {
        return unitTraits;
    }

    protected Traits terrainTrait;
    public Traits getTerrainTrait() {
        return terrainTrait;
    }
    public void setTerrainTrait(Traits terrainTrait) {
        this.terrainTrait = terrainTrait;
    }

    protected List<Traits> combatTraits;
    public List<Traits> getCombatTraits() {
        return combatTraits;
    }
    public void setCombatTraits(List<Traits> combatTraits) {
        this.combatTraits = combatTraits;
    }
}
