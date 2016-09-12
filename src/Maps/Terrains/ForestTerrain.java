package Maps.Terrains;

/**
 * Created by Shoggomo on 02.09.2016.
 */
public class ForestTerrain extends Terrain {
    private static ForestTerrain ourInstance = new ForestTerrain();

    private ForestTerrain() {
        terrain = TerrainType.Forest;
    }

    public static ForestTerrain getInstance() {
        return ourInstance;
    }
}
