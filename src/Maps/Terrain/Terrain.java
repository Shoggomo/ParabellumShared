package Maps.Terrain;

import Units.UnitType;

/**
 * Created by Nik on 13.09.2016.
 */
public class Terrain {

    protected TerrainType terrainType;
    protected int meleeShield;
    protected int rangedShield;
    protected int artilleryShield;
    protected int chargeShield;
    protected int meleeBonus;
    protected int rangedBonus;
    protected int artilleryBonus;
    protected int chargeBonus;
    protected boolean canBeCharged;
    protected boolean passable;

    public TerrainType getTerrainType(){
        return terrainType;
    }

    public int getMeleeShield(UnitType unitType) {
        initUnitType(unitType);
        return meleeShield;
    }

    public int getRangedShield(UnitType unitType) {
        initUnitType(unitType);
        return rangedShield;
    }

    public int getArtilleryShield(UnitType unitType) {
        initUnitType(unitType);
        return artilleryShield;
    }

    public int getChargeShield(UnitType unitType) {
        initUnitType(unitType);
        return chargeShield;
    }

    public int getMeleeBonus(UnitType unitType) {
        initUnitType(unitType);
        return meleeBonus;
    }

    public int getRangedBonus(UnitType unitType) {
        initUnitType(unitType);
        return rangedBonus;
    }

    public int getArtilleryBonus(UnitType unitType) {
        initUnitType(unitType);
        return artilleryBonus;
    }

    public int getChargeBonus(UnitType unitType) {
        initUnitType(unitType);
        return chargeBonus;
    }

    public boolean canBeCharged(UnitType unitType) {
        initUnitType(unitType);
        return canBeCharged;
    }

    public boolean isPassable(UnitType unitType) {
        initUnitType(unitType);
        return passable;
    }

    protected void initUnitType(UnitType unitType){
        switch ((unitType)) {
            case Infantry:
                initInfantry();
                break;
            case Cavalry:
                initCavalry();
                break;
            case Artillery:
                initArtillery();
                break;
            default: initDefault();
        }
    }

    protected void initInfantry(){};
    protected void initCavalry(){};
    protected void initArtillery(){};
    protected void initDefault(){
        meleeShield = 0;
        rangedShield = 0;
        artilleryShield = 0;
        chargeShield = 0;
        meleeBonus = 0;
        rangedBonus = 0;
        artilleryBonus = 0;
        chargeBonus = 0;
        canBeCharged = true;
        passable = true;
    }
}
