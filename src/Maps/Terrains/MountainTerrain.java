package Maps.Terrains;

/**
 * Created by Shoggomo on 02.09.2016.
 */
public class MountainTerrain extends Terrain {
    private static MountainTerrain ourInstance = new MountainTerrain();

    private MountainTerrain() {
        terrain = TerrainType.Mountain;
    }

    public static MountainTerrain getInstance() {
        return ourInstance;
    }
}
