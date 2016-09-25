package Maps.Terrain;

/**
 * Created by Nik on 14.09.2016.
 */
public class Base extends Terrain {

    public Base() {
        terrainType = TerrainType.Base;
    }

    protected void initInfantry() {
        meleeShield = 40;
        rangedShield = 40;
        artilleryShield = 20;
        chargeShield = 60;
        meleeBonus = 0;
        rangedBonus = 40;
        artilleryBonus = 0;
        chargeBonus = 0;
        passable = true;
    }

    protected void initCavalry() {
        meleeShield = 20;
        rangedShield = 20;
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
        artilleryShield = 40;
        chargeShield = 80;
        meleeBonus = 0;
        rangedBonus = 40;
        artilleryBonus = 40;
        chargeBonus = 0;
        passable = true;
    }
}