package Maps.Templates;

import Maps.StartType;
import Maps.Terrain.Terrain;

/**
 * Created by Jakob on 20.09.2016.
 */
public class TestMap8x8 extends MapTemplate {

    public TestMap8x8() {
        name = "TestMap";
        terrains = new Terrain[][]{
                {M, F, S, T, H, H, F, R},
                {P, P, P, R, R, R, R, R},
                {P, P, P, R, S, S, S, S},
                {P, P, P, R, F, F, F, F},
                {P, P, P, P, R, P, P, P},
                {P, P, P, R, R, R, M, M},
                {P, P, P, R, R, R, R, R},
                {P, P, P, R, H, H, H, H}
        };
        startMap = new StartType[][]{
                {NP, P1, P1, P1, P1, P1, P1, NP},
                {NP, NP, NP, NP, NP, NP, NP, NP},
                {NP, NP, NP, NP, NP, NP, NP, NP},
                {NP, NP, NP, NP, NP, NP, NP, NP},
                {NP, NP, NP, NP, NP, NP, NP, NP},
                {NP, NP, NP, NP, NP, NP, NP, NP},
                {NP, NP, NP, NP, NP, NP, NP, NP},
                {NP, P2, P2, P2, P2, P2, P2, NP}
        };


    }
}


