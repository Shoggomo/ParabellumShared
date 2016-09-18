package Maps;

import Maps.Terrain.Terrain;
import Maps.Terrain.TerrainType;
import Units.Unit;
import Units.UnitType;


/**
 * Created by Shoggomo on 02.09.2016.
 */
public class Tile {
    Terrain terrain;
    StartType startType;
    Unit unit;

    public Tile(Terrain terrain, StartType startType) {
        this.terrain = terrain;
        this.startType = startType;
    }

    private Terrain getTerrain() {
        return terrain;
    }

    public TerrainType getTerrainType(){
        return getTerrain().getTerrainType();
    }

    public int getMeleeShield() {
        return getTerrain().getMeleeShield(unit.getUnitType());
    }

    public int getRangedShield() {
        return getTerrain().getRangedShield(unit.getUnitType());
    }

    public int getArtilleryShield() {
        return getTerrain().getArtilleryShield(unit.getUnitType());
    }

    public int getChargeShield() {
        return getTerrain().getChargeShield(unit.getUnitType());
    }

    public int getMeleeBonus() {
        return getTerrain().getMeleeBonus(unit.getUnitType());
    }

    public int getRangedBonus() {
        return getTerrain().getRangedBonus(unit.getUnitType());
    }

    public int getArtilleryBonus() {
        return getTerrain().getArtilleryBonus(unit.getUnitType());
    }

    public int getChargeBonus() {
        return getTerrain().getChargeBonus(unit.getUnitType());
    }

    public boolean isPassable() {
        return getTerrain().isPassable(unit.getUnitType());
    }

    public boolean isPassable(Unit unitToPass){
        if (unit == null){
            if(getTerrain().isPassable(unitToPass.getUnitType())) return true;
        }
        return false;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public boolean isStartP1() {
        return startType == StartType.Player1;
    }

    public boolean isStartP2() {
        return startType == StartType.Player2;
    }

    public boolean isNoStart() {
        return startType == StartType.NoStart;
    }
}
