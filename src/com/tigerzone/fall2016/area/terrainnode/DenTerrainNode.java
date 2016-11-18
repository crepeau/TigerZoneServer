package com.tigerzone.fall2016.area.terrainnode;

import com.tigerzone.fall2016.area.Area;
import com.tigerzone.fall2016.area.DenArea;
import com.tigerzone.fall2016.tileplacement.terrain.DenTerrain;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Aidan on 11/15/2016.
 */
public class DenTerrainNode extends TerrainNode {

    public DenTerrainNode(){
        this.setZones(Arrays.asList(5));
    }

    @Override
    public Area createArea() {
        return null;
    }


}
