package Maps.Templates;

import Etc.Terrain;
import Maps.StartType;

/**
 * Created by Shoggomo on 02.09.2016.
 */
public class MapTemplate {
    protected final Terrain M = Terrain.Mountain;
    protected final Terrain R = Terrain.River;
    protected final Terrain F = Terrain.Forest;
    protected final Terrain S = Terrain.Swamp;
    protected final Terrain P = Terrain.Plain;
    protected final Terrain T = Terrain.Tower;
    protected final Terrain W = Terrain.Wall;
    protected final Terrain H = Terrain.Hill;
    protected final StartType P1 = StartType.Player1;
    protected final StartType P2 = StartType.Player2;
    protected final StartType NP = StartType.NoStart;
    protected String name;
    protected Terrain[][] terrains;
    protected StartType[][] startMap;

    public String getName() {
        return name;
    }

    public Terrain[][] getTerrains() {
        return terrains;
    }

    public StartType[][] getStartMap() {
        return startMap;
    }
}
