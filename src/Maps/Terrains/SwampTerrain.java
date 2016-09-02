package Maps.Terrains;

import Etc.Traits;

/**
 * Created by Shoggomo on 02.09.2016.
 */
public class SwampTerrain extends Terrain {
    private static SwampTerrain ourInstance = new SwampTerrain();

    private SwampTerrain() {
        traitAll = Traits.Obstructed;
        traitCavalry = null;
        traitArtillery = Traits.Unpassable;
    }

    public static SwampTerrain getInstance() {
        return ourInstance;
    }
}
