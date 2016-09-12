package Maps.Terrains;

/**
 * Created by Shoggomo on 02.09.2016.
 */
public class TowerTerrain extends Terrain {
    private static TowerTerrain ourInstance = new TowerTerrain();

    private TowerTerrain() {
        terrain = TerrainType.Tower;
    }

    public static TowerTerrain getInstance() {
        return ourInstance;
    }
}
