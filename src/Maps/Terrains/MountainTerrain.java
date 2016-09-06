package Maps.Terrains;

import Etc.Traits;

/**
 * Created by Shoggomo on 02.09.2016.
 */
public class MountainTerrain extends Terrain {
    private static MountainTerrain ourInstance = new MountainTerrain();

    private MountainTerrain() {
        traitTerrain = Traits.Mountain;
    }

    public static MountainTerrain getInstance() {
        return ourInstance;
    }
}
