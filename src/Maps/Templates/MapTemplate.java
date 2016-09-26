package Maps.Templates;

import Maps.StartType;
import Maps.Terrain.*;

/**
 * Created by Shoggomo on 02.09.2016.
 */
public class MapTemplate {
    protected final Terrain M = new Mountain();
    protected final Terrain R = new River();
    protected final Terrain F = new Forest();
    protected final Terrain S = new Swamp();
    protected final Terrain P = new Plain();
    protected final Terrain T = new Tower();
    protected final Terrain H = new Hill();
    protected final Terrain B1 = new Base_Player1();
    protected final Terrain B2 = new Base_Player2();
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
