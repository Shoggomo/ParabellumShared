package Maps;

import Maps.Templates.MapTemplate;
import Maps.Terrain.Terrain;

/**
 * Created by Shoggomo on 02.09.2016.
 */
public class MapGenerator {

    public static GameMap createMapFromTemplate(MapTemplate template) {
        String name = template.getName();
        Terrain[][] terrains = template.getTerrains();
        StartType[][] startMap = template.getStartMap();
        Tile[][] tiles = createTiles(terrains, startMap);
        GameMap result = new GameMap(name, tiles);
        return result;
    }

    private static Tile[][] createTiles(Terrain[][] terrains, StartType[][] startMap) {
        Tile[][] result = new Tile[terrains.length][terrains[0].length];

        for (int x = 0; x < terrains.length; x++) {
            for (int y = 0; y < terrains[x].length; y++) {
                result[x][y] = createTile(terrains[x][y], startMap[x][y]);
            }
        }
        return result;
    }

    private static Tile createTile(Terrain terrain, StartType startType) {
        Tile result = new Tile(terrain, startType);
        return result;
    }

}
