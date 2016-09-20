package Maps.Templates;

import Maps.StartType;
import Maps.Terrain.Terrain;

/**
 * Created by Jakob on 20.09.2016.
 */
public class TextMap2x2 extends MapTemplate{

    public TextMap2x2() {

        name = "TestMap";
        terrains = new Terrain[][]{
                {M, F},
                {P, P}
        };
        startMap = new StartType[][]{
                {NP, P1},
                {P2, NP}
        };

    }
}
