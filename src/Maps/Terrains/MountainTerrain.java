package Maps.Terrains;

import Etc.Trait;

/**
 * Created by Shoggomo on 02.09.2016.
 */
public class MountainTerrain extends Terrain {
    private static MountainTerrain ourInstance = new MountainTerrain();

    private MountainTerrain() {
        traitTerrain = Trait.Mountain;
    }

    public static MountainTerrain getInstance() {
        return ourInstance;
    }
}
