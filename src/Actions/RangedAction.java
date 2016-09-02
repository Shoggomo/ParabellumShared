package Actions;

/**
 * Created by Shoggomo on 02.09.2016.
 */
public class RangedAction {
    int maxAmmunition;
    int currentAmmunition;
    int range;

    public RangedAction(int maxAmmunition, int range) {
        this.maxAmmunition = maxAmmunition;
        this.range = range;
        currentAmmunition = maxAmmunition;
    }

    public void decreaseAmmunition() {
        currentAmmunition--;
    }

    public int getMaxAmmunition() {
        return maxAmmunition;
    }

    public int getCurrentAmmunition() {
        return currentAmmunition;
    }

    public void setCurrentAmmunition(int currentAmmunition) {
        this.currentAmmunition = currentAmmunition;
    }

    public int getRange() {
        return range;
    }
}
