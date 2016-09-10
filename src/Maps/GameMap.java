package Maps;

/**
 * Created by Shoggomo on 02.09.2016.
 */
public class GameMap {
    private String name;
    private Tile[][] tiles;

    public GameMap(String name, Tile[][] tiles) {
        this.name = name;
        this.tiles = tiles;
    }

    public String getName() {
        return name;
    }

    public Tile[][] getTiles() {
        return tiles;
    }
}
