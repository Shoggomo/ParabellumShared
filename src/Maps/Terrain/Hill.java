package Maps.Terrain;

/**
 * Created by Nik on 14.09.2016.
 */
public class Hill extends Terrain {

    public Hill() {
        terrainType = TerrainType.Hill;
    }

    protected void initInfantry() {
        meleeShield = 20;
        rangedShield = 20;
        artilleryShield = 20;
        chargeShield = 20;
        meleeBonus = 20;
        rangedBonus = 20;
        artilleryBonus = 20;
        chargeBonus = 20;
        passable = true;
    }

    protected void initCavalry() {
        meleeShield = 0;
        rangedShield = 0;
        artilleryShield = 0;
        chargeShield = 0;
        meleeBonus = 0;
        rangedBonus = 0;
        artilleryBonus = 0;
        chargeBonus = 0;
        passable = true;
    }

    protected void initArtillery() {
        meleeShield = 0;
        rangedShield = 0;
        artilleryShield = 0;
        chargeShield = 0;
        meleeBonus = 0;
        rangedBonus = 0;
        artilleryBonus = 0;
        chargeBonus = 0;
        passable = true;
    }
}