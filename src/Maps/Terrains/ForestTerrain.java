package Maps.Terrains;

import Etc.Traits;

/**
 * Created by Shoggomo on 02.09.2016.
 */
public class ForestTerrain extends Terrain {
    private static ForestTerrain ourInstance = new ForestTerrain();

    private ForestTerrain() {
        traitAll = Traits.Sheltered;
        traitCavalry = Traits.Obstructed;
        traitArtillery = null;
    }

    public static ForestTerrain getInstance() {
        return ourInstance;
    }
}
