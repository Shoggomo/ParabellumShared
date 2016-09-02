package Actions;

/**
 * Created by Shoggomo on 02.09.2016.
 */
public class MeeleAction extends Action {

    public MeeleAction(int damage, int weaponTier, ISpecial special) {
        super(damage, weaponTier, ActionType.Combat, special);
    }
}
