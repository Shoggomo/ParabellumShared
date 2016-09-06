package Maps.Terrains;

import Etc.Traits;

/**
 * Created by Shoggomo on 02.09.2016.
 */
public class WallTerrain extends Terrain {
    private static WallTerrain ourInstance = new WallTerrain();

    private WallTerrain() {
        traitTerrain = Traits.Wall;
    }

    public static WallTerrain getInstance() {
        return ourInstance;
    }
}