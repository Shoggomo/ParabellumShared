package Units;

import Actions.MeeleAction;
import Actions.RangedAction;
import Actions.UniqueAction;
import Etc.PlayerType;
import Etc.Traits;

import java.util.List;

/**
 * Created by Shoggomo on 02.09.2016.
 */
public class Unit {
    protected int maxHealth;
    protected int currentHealth;
    protected int maxMovementPoints;
    protected int currentMovementPoints;
    protected int armorTier;
    protected int cost;
    protected boolean hasCombatAction;
    protected MeeleAction meeleAction;
    protected RangedAction rangedAction;
    protected UniqueAction uniqueAction;
    protected UnitType unitType;
    protected PlayerType owner;
    protected List<Traits> activeTraits;

    public void setHasCombatAction(boolean hasCombatAction) {
        this.hasCombatAction = hasCombatAction;
    }

    public List<Traits> getActiveTraits() {
        return activeTraits;
    }

    public int getCurrentMovementPoints() {
        return currentMovementPoints;
    }

    public void setCurrentMovementPoints(int currentMovementPoints) {
        this.currentMovementPoints = currentMovementPoints;
    }

    public boolean hasCombatAction() {
        return hasCombatAction;
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

    public int getMaxMovementPoints() {
        return maxMovementPoints;
    }

    public int getArmorTier() {
        return armorTier;
    }

    public int getCost() {
        return cost;
    }

    public MeeleAction getMeeleAction() {
        return meeleAction;
    }

    public RangedAction getRangedAction() {
        return rangedAction;
    }

    public UniqueAction getUniqueAction() {
        return uniqueAction;
    }

    public UnitType getUnitType() {
        return unitType;
    }

    public PlayerType getOwner() {
        return owner;
    }

}
