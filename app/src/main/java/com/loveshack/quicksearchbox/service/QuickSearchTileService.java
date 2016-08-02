package com.loveshack.quicksearchbox.service;

import android.content.Intent;
import android.service.quicksettings.TileService;

/**
 * Extension of TileService that creates a QS tile for search
 *
 * Created by joe on 8/2/16.
 */
public class QuickSearchTileService extends TileService {

    @Override
    public void onClick(){
        super.onClick();
        Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
        startActivityAndCollapse(intent);
    }
}
