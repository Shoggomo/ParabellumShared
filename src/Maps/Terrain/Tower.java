package Maps.Terrain;

/**
 * Created by Nik on 14.09.2016.
 */
public class Tower extends Terrain {

    public Tower() {
        terrainType = TerrainType.Tower;
    }

    protected void initInfantry() {
        meleeShield = 40;
        rangedShield = 40;
        artilleryShield = 20;
        chargeShield = 60;
        meleeBonus = 0;
        rangedBonus = 30;
        artilleryBonus = 0;
        chargeBonus = 0;
        passable = true;
    }

    protected void initCavalry() {
        meleeShield = 30;
        rangedShield = 30;
        artilleryShield = 20;
        chargeShield = 60;
        meleeBonus = -20;
        rangedBonus = 20;
        artilleryBonus = 0;
        chargeBonus = -20;
        passable = true;
    }

    protected void initArtillery() {
        meleeShield = 40;
        rangedShield = 40;
        artilleryShield = 20;
        chargeShield = 60;
        meleeBonus = 0;
        rangedBonus = 30;
        artilleryBonus = 30;
        chargeBonus = 0;
        passable = true;
    }
}