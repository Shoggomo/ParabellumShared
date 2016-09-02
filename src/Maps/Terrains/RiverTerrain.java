package Maps.Terrains;

import Etc.Traits;

/**
 * Created by Shoggomo on 02.09.2016.
 */
public class RiverTerrain extends Terrain {
    private static RiverTerrain ourInstance = new RiverTerrain();

    private RiverTerrain() {
        traitAll = Traits.Unpassable;
        traitCavalry = null;
        traitArtillery = null;
    }

    public static RiverTerrain getInstance() {
        return ourInstance;
    }

}
