package Units;

import Etc.PlayerType;
import Etc.Traits;

import java.util.ArrayList;

/**
 * Created by Shoggomo on 02.09.2016.
 */
public class ArquebuseerUnit extends Unit {

    public ArquebuseerUnit(PlayerType owner) {
        maxHealth = 100;
        maxMovementPoints = 8;
        armorTier = 1;
        cost = 100;
        meeleAction = null;
        rangedAction = null;
        uniqueAction = null;
        unitType = UnitType.Infantry;

        currentHealth = maxHealth;
        currentMovementPoints = maxMovementPoints;
        hasCombatAction = true;
        this.owner = owner;
        activeTraits = new ArrayList<Traits>();
    }
}
