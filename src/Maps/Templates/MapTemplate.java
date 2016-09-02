package Maps.Templates;

import Maps.StartType;
import Maps.Terrains.*;

/**
 * Created by Shoggomo on 02.09.2016.
 */
public class MapTemplate {
    protected final Terrain M = MountainTerrain.getInstance();
    protected final Terrain R = RiverTerrain.getInstance();
    protected final Terrain F = ForestTerrain.getInstance();
    protected final Terrain S = SwampTerrain.getInstance();
    protected final Terrain P = PlainTerrain.getInstance();
    protected final Terrain T = TowerTerrain.getInstance();
    protected final Terrain W = WallTerrain.getInstance();
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
