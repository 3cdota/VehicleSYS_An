package com.yhy.drawtracedemo.util;

import org.osmdroid.tileprovider.MapTile;
import org.osmdroid.tileprovider.tilesource.OnlineTileSourceBase;


public class MyXYTileSource extends OnlineTileSourceBase {
    public MyXYTileSource(final String aName, final int aZoomMinLevel,
                        final int aZoomMaxLevel, final int aTileSizePixels, final String aImageFilenameEnding,
                        final String[] aBaseUrl) {

        super(aName, aZoomMinLevel, aZoomMaxLevel, aTileSizePixels,
                aImageFilenameEnding, aBaseUrl);
    }

    @Override
    public String getTileURLString(final MapTile aTile) {
        return getBaseUrl() +"?l=" +aTile.getZoomLevel()
                            + "&x=" + aTile.getX()
                            + "&y=" + aTile.getY();
    }
}
