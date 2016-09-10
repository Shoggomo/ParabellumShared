package Maps.Terrains;

import Etc.Trait;

/**
 * Created by Shoggomo on 02.09.2016.
 */
public class TowerTerrain extends Terrain {
    private static TowerTerrain ourInstance = new TowerTerrain();

    private TowerTerrain() {
        traitTerrain = Trait.Tower;
    }

    public static TowerTerrain getInstance() {
        return ourInstance;
    }
}
