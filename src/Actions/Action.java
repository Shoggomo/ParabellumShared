package Actions;

/**
 * Created by Shoggomo on 02.09.2016.
 */
public class Action {
    protected int damage;
    protected int weaponTier;
    protected ActionType actionType;
    protected ISpecial special;

    public Action(int damage, int weaponTier, ActionType actionType, ISpecial special) {
        this.damage = damage;
        this.weaponTier = weaponTier;
        this.actionType = actionType;
        this.special = special;
    }

    public int getDamage() {
        return damage;
    }

    public int getWeaponTier() {
        return weaponTier;
    }

    public ActionType getActionType() {
        return actionType;
    }

    public ISpecial getSpecial() {
        return special;
    }
}
