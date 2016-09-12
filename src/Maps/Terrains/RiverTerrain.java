package Maps.Terrains;

/**
 * Created by Shoggomo on 02.09.2016.
 */
public class RiverTerrain extends Terrain {
    private static RiverTerrain ourInstance = new RiverTerrain();

    private RiverTerrain() {
        terrain = TerrainType.River;
    }

    public static RiverTerrain getInstance() {
        return ourInstance;
    }
}
