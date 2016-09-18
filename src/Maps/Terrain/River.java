package Maps.Terrain;

/**
 * Created by Nik on 14.09.2016.
 */
public class River extends Terrain {

    public River() {
        terrainType = TerrainType.River;
    }

    protected void initInfantry() {
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