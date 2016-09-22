package Maps.Terrain;

/**
 * Created by Nik on 14.09.2016.
 */
public class Forest extends Terrain {

    public Forest() {
        terrainType = TerrainType.Forest;
    }
    
    protected void initInfantry() {
        meleeShield = 20;
        rangedShield = 40;
        artilleryShield = 40;
        chargeShield = 50;
        meleeBonus = -20;
        rangedBonus = 0;
        artilleryBonus = 0;
        chargeBonus = 0;
        passable = true;
    }

    protected void initCavalry() {
        meleeShield = 20;
        rangedShield = 20;
        artilleryShield = 40;
        chargeShield = 50;
        meleeBonus = -40;
        rangedBonus = -20;
        artilleryBonus = 0;
        chargeBonus = -40;
        passable = true;
    }

    protected void initArtillery() {
        meleeShield = 0;
        rangedShield = 20;
        artilleryShield = 40;
        chargeShield = 20;
        meleeBonus = 0;
        rangedBonus = 0;
        artilleryBonus = 0;
        chargeBonus = 0;
        passable = true;
    }
}