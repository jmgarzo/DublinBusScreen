package com.example.jmgarzo.dublinbusscreen.provider;

import net.simonvt.schematic.annotation.Database;
import net.simonvt.schematic.annotation.Table;

/**
 * Created by jmgarzo on 13/08/2017.
 */

@Database(version = DublinBusDatabase.VERSION)

public  class DublinBusDatabase {

        public static final int VERSION = 1;

        @Table(DublinBusContract.StopIdEntry.class)
        public static final String DublinBusStops = "stops";
}
