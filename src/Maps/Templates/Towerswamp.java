package Maps.Templates;

import Maps.StartType;
import Maps.Terrain.Terrain;

/**
 * Created by Nik on 18.09.2016.
 */
public class Towerswamp extends MapTemplate {

    public Towerswamp() {

        name = "Towerswamp";
        terrains = new Terrain[][]{
                {T, F, T, F, F, F, M, M, M, F, F, F, M, M, M, F, F, F, F, T, B},
                {F, F, F, F, P, P, H, H, H, P, P, P, H, H, H, P, P, F, F, T, T},
                {T, F, F, P, P, P, P, P, P, P, P, P, P, P, P, P, P, P, F, F, F},
                {F, F, P, P, P, H, P, P, P, P, H, H, P, P, F, F, P, P, P, F, F},
                {F, P, P, P, H, M, H, P, P, H, M, M, H, P, F, F, F, P, P, P, F},
                {F, P, P, H, M, H, P, P, P, H, M, H, S, P, P, F, F, F, P, P, F},
                {M, H, P, P, H, P, P, P, H, M, M, H, S, S, P, P, F, F, P, H, M},
                {M, H, P, P, P, P, P, P, F, H, H, F, S, S, S, P, P, P, P, H, M},
                {M, H, P, P, P, P, H, F, F, F, F, F, F, S, S, S, H, P, P, H, M},
                {F, P, P, P, H, H, M, H, F, T, S, T, F, F, H, H, M, H, P, P, F},
                {F, P, P, H, M, M, M, H, F, S, S, S, F, H, M, M, M, H, P, P, F},
                {F, P, P, H, M, H, H, F, F, T, S, T, F, H, M, H, H, P, P, P, F},
                {M, H, P, P, H, S, S, S, F, F, F, F, F, F, H, P, P, P, P, H, M},
                {M, H, P, P, P, P, S, S, S, F, H, H, F, P, P, P, P, P, P, H, M},
                {M, H, P, F, F, P, P, S, S, H, M, M, H, P, P, P, H, P, P, H, M},
                {F, P, P, F, F, F, P, P, S, H, M, H, P, P, P, H, M, H, P, P, F},
                {F, P, P, P, F, F, F, P, H, M, M, H, P, P, H, M, H, P, P, P, F},
                {F, F, P, P, P, F, F, P, P, H, H, P, P, P, P, H, P, P, P, F, F},
                {F, F, F, P, P, P, P, P, P, P, P, P, P, P, P, P, P, P, F, F, T},
                {T, T, F, F, P, P, H, H, H, P, P, P, H, H, H, P, P, F, F, F, F},
                {B, T, F, F, F, F, M, M, M, F, F, F, M, M, M, F, F, F, T, F, T},
        };
        startMap = new StartType[][]{
                {NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, P2, P2, P2, P2, P2, P2},
                {NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, P2, P2, P2, P2, P2, P2},
                {NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, P2, P2, P2, P2, P2, P2},
                {NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, P2, P2, P2, P2, P2},
                {NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, P2, P2, P2, P2},
                {NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, P2, P2, P2},
                {NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP},
                {NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP},
                {NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP},
                {NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP},
                {NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP},
                {NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP},
                {NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP},
                {NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP},
                {NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP},
                {P1, P1, P1, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP},
                {P1, P1, P1, P1, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP},
                {P1, P1, P1, P1, P1, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP},
                {P1, P1, P1, P1, P1, P1, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP},
                {P1, P1, P1, P1, P1, P1, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP},
                {P1, P1, P1, P1, P1, P1, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP, NP},
        };
    }
}
