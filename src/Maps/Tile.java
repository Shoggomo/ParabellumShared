package Maps;

import Maps.Terrains.Terrain;
import Units.Unit;

import java.awt.*;


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

    public Terrain getTerrain() {
        return terrain;
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
