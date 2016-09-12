package Maps.Templates;

import Etc.Terrain;
import Maps.StartType;

/**
 * Created by Shoggomo on 02.09.2016.
 */
public class TestMap extends MapTemplate {

    public TestMap() {

        name = "TestMap";
        terrains = new Terrain[][]{
                {M, F, S},
                {P, P, P},
                {R, S, W}
        };
        startMap = new StartType[][]{
                {NP, P1, NP},
                {NP, NP, NP},
                {NP, P2, NP}
        };
    }

}
