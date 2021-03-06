package Maps.Terrain;

/**
 * Created by Nik on 14.09.2016.
 */
public class Swamp extends Terrain {

    public Swamp() {
        terrainType = TerrainType.Swamp;
    }

    protected void initInfantry() {
        meleeShield = 0;
        rangedShield = -40;
        artilleryShield = 0;
        chargeShield = 40;
        meleeBonus = -20;
        rangedBonus = -20;
        artilleryBonus = 0;
        chargeBonus = 0;
        passable = true;
    }

    protected void initCavalry() {
        meleeShield = 0;
        rangedShield = -40;
        artilleryShield = 0;
        chargeShield = 40;
        meleeBonus = -20;
        rangedBonus = -20;
        artilleryBonus = 0;
        chargeBonus = -40;
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
        passable = false;
    }
}