package com.example.jmgarzo.dublinbusscreen.provider;

import net.simonvt.schematic.annotation.AutoIncrement;
import net.simonvt.schematic.annotation.ConflictResolutionType;
import net.simonvt.schematic.annotation.DataType;
import net.simonvt.schematic.annotation.NotNull;
import net.simonvt.schematic.annotation.PrimaryKey;

/**
 * Created by jmgarzo on 13/08/2017.
 */

public class DublinBusContract {


    public interface StopIdEntry {
        @DataType(DataType.Type.INTEGER)
        @PrimaryKey(onConflict = ConflictResolutionType.REPLACE)
        @AutoIncrement
        public static final String COLUMN_ID = "_id";

        @DataType(DataType.Type.TEXT)
        @NotNull
        public static final String COLUMN_STOP_ID = "stopid";

        @DataType(DataType.Type.TEXT)
        @NotNull
        public static final String COLUMN_DISPLAY_STOP_ID = "displaystopid";

        @DataType(DataType.Type.TEXT)
        @NotNull
        public static final String COLUMN_SHORT_NAME = "shortname";

        @DataType(DataType.Type.TEXT)
        @NotNull
        public static final String COLUMN_SHORT_NAME_LOCALIZED = "shortnamelocalized";


        @DataType(DataType.Type.TEXT)
        @NotNull
        public static final String COLUMN_LATITUDE = "latitude";

        @DataType(DataType.Type.TEXT)
        @NotNull
        public static final String COLUMN_LONGITUDE = "longitude";

        @DataType(DataType.Type.TEXT)
        @NotNull
        public static final String COLUMN_LAST_UPDATE = "lastupdated";
    }

    public interface StopIdRealTime{
        @DataType(DataType.Type.INTEGER)
        @PrimaryKey(onConflict = ConflictResolutionType.REPLACE)
        @AutoIncrement
        public static final String COLUMN_ID = "_id";


    }







}
