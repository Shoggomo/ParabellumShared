package Maps.Terrain;

/**
 * Created by Nik on 14.09.2016.
 */
public class Swamp extends Terrain {

    public Swamp() {
        terrainType = TerrainType.Swamp;
    }

    protected void initInfantry() {
        meleeShield = -20;
        rangedShield = -20;
        artilleryShield = 20;
        chargeShield = 40;
        meleeBonus = -20;
        rangedBonus = -20;
        artilleryBonus = 0;
        chargeBonus = 0;
        passable = true;
    }

    protected void initCavalry() {
        meleeShield = -20;
        rangedShield = -20;
        artilleryShield = 20;
        chargeShield = 40;
        meleeBonus = -20;
        rangedBonus = -20;
        artilleryBonus = 0;
        chargeBonus = -60;
        passable = true;
    }

    protected void initArtillery() {
        meleeShield = -20;
        rangedShield = -20;
        artilleryShield = 20;
        chargeShield = 40;
        meleeBonus = 0;
        rangedBonus = 0;
        artilleryBonus = -20;
        chargeBonus = 0;
        passable = false;
    }
}