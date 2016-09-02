package Actions;

/**
 * Created by Shoggomo on 02.09.2016.
 */
public class UniqueAction {
    String name;
    int range;
    int maxAmmunition;
    int currentAmmunition;


    public UniqueAction(String name, int range, int maxAmmunition) {
        this.name = name;
        this.range = range;
        this.maxAmmunition = maxAmmunition;
        currentAmmunition = maxAmmunition;
    }

    public void decreaseAmmunition() {
        currentAmmunition--;
    }

    public String getName() {
        return name;
    }

    public int getRange() {
        return range;
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
}
