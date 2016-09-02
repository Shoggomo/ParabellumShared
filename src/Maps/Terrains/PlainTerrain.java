package Maps.Terrains;

/**
 * Created by Shoggomo on 02.09.2016.
 */
public class PlainTerrain extends Terrain {
    private static PlainTerrain ourInstance = new PlainTerrain();

    private PlainTerrain() {
        traitAll = null;
        traitCavalry = null;
        traitArtillery = null;
    }

    public static PlainTerrain getInstance() {
        return ourInstance;
    }
}
