package Abilities;

import Etc.AbilityType;

/**
 * Created by Nik on 05.09.2016.
 */
public class Melee extends Ability {

    public Melee(){
        abilityType = AbilityType.Melee;
        attackRange = 2;
        limit = Integer.MAX_VALUE;
    }
}
