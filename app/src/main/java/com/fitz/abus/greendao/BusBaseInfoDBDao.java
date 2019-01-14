package com.fitz.abus.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.fitz.abus.bean.BusBaseInfoDB;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "BUS_BASE_INFO_DB".
*/
public class BusBaseInfoDBDao extends AbstractDao<BusBaseInfoDB, Long> {

    public static final String TABLENAME = "BUS_BASE_INFO_DB";

    /**
     * Properties of entity BusBaseInfoDB.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property CityID = new Property(1, String.class, "cityID", false, "CITY_ID");
        public final static Property LineId = new Property(2, String.class, "lineId", false, "LINE_ID");
        public final static Property BusName = new Property(3, String.class, "busName", false, "BUS_NAME");
        public final static Property StationID = new Property(4, String.class, "stationID", false, "STATION_ID");
        public final static Property StationName = new Property(5, String.class, "stationName", false, "STATION_NAME");
        public final static Property Direction = new Property(6, int.class, "direction", false, "DIRECTION");
        public final static Property StartStopDirection0 = new Property(7, String.class, "startStopDirection0", false, "START_STOP_DIRECTION0");
        public final static Property EndStopDirection0 = new Property(8, String.class, "endStopDirection0", false, "END_STOP_DIRECTION0");
        public final static Property StartEndTimeDirection0 = new Property(9, String.class, "startEndTimeDirection0", false, "START_END_TIME_DIRECTION0");
        public final static Property StartStopDirection1 = new Property(10, String.class, "startStopDirection1", false, "START_STOP_DIRECTION1");
        public final static Property EndStopDirection1 = new Property(11, String.class, "endStopDirection1", false, "END_STOP_DIRECTION1");
        public final static Property StartEndTimeDirection1 = new Property(12, String.class, "startEndTimeDirection1", false, "START_END_TIME_DIRECTION1");
    }


    public BusBaseInfoDBDao(DaoConfig config) {
        super(config);
    }
    
    public BusBaseInfoDBDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"BUS_BASE_INFO_DB\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"CITY_ID\" TEXT NOT NULL ," + // 1: cityID
                "\"LINE_ID\" TEXT NOT NULL ," + // 2: lineId
                "\"BUS_NAME\" TEXT NOT NULL ," + // 3: busName
                "\"STATION_ID\" TEXT NOT NULL ," + // 4: stationID
                "\"STATION_NAME\" TEXT NOT NULL ," + // 5: stationName
                "\"DIRECTION\" INTEGER NOT NULL ," + // 6: direction
                "\"START_STOP_DIRECTION0\" TEXT NOT NULL ," + // 7: startStopDirection0
                "\"END_STOP_DIRECTION0\" TEXT NOT NULL ," + // 8: endStopDirection0
                "\"START_END_TIME_DIRECTION0\" TEXT NOT NULL ," + // 9: startEndTimeDirection0
                "\"START_STOP_DIRECTION1\" TEXT NOT NULL ," + // 10: startStopDirection1
                "\"END_STOP_DIRECTION1\" TEXT NOT NULL ," + // 11: endStopDirection1
                "\"START_END_TIME_DIRECTION1\" TEXT NOT NULL );"); // 12: startEndTimeDirection1
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"BUS_BASE_INFO_DB\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, BusBaseInfoDB entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getCityID());
        stmt.bindString(3, entity.getLineId());
        stmt.bindString(4, entity.getBusName());
        stmt.bindString(5, entity.getStationID());
        stmt.bindString(6, entity.getStationName());
        stmt.bindLong(7, entity.getDirection());
        stmt.bindString(8, entity.getStartStopDirection0());
        stmt.bindString(9, entity.getEndStopDirection0());
        stmt.bindString(10, entity.getStartEndTimeDirection0());
        stmt.bindString(11, entity.getStartStopDirection1());
        stmt.bindString(12, entity.getEndStopDirection1());
        stmt.bindString(13, entity.getStartEndTimeDirection1());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, BusBaseInfoDB entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getCityID());
        stmt.bindString(3, entity.getLineId());
        stmt.bindString(4, entity.getBusName());
        stmt.bindString(5, entity.getStationID());
        stmt.bindString(6, entity.getStationName());
        stmt.bindLong(7, entity.getDirection());
        stmt.bindString(8, entity.getStartStopDirection0());
        stmt.bindString(9, entity.getEndStopDirection0());
        stmt.bindString(10, entity.getStartEndTimeDirection0());
        stmt.bindString(11, entity.getStartStopDirection1());
        stmt.bindString(12, entity.getEndStopDirection1());
        stmt.bindString(13, entity.getStartEndTimeDirection1());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public BusBaseInfoDB readEntity(Cursor cursor, int offset) {
        BusBaseInfoDB entity = new BusBaseInfoDB( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getString(offset + 1), // cityID
            cursor.getString(offset + 2), // lineId
            cursor.getString(offset + 3), // busName
            cursor.getString(offset + 4), // stationID
            cursor.getString(offset + 5), // stationName
            cursor.getInt(offset + 6), // direction
            cursor.getString(offset + 7), // startStopDirection0
            cursor.getString(offset + 8), // endStopDirection0
            cursor.getString(offset + 9), // startEndTimeDirection0
            cursor.getString(offset + 10), // startStopDirection1
            cursor.getString(offset + 11), // endStopDirection1
            cursor.getString(offset + 12) // startEndTimeDirection1
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, BusBaseInfoDB entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setCityID(cursor.getString(offset + 1));
        entity.setLineId(cursor.getString(offset + 2));
        entity.setBusName(cursor.getString(offset + 3));
        entity.setStationID(cursor.getString(offset + 4));
        entity.setStationName(cursor.getString(offset + 5));
        entity.setDirection(cursor.getInt(offset + 6));
        entity.setStartStopDirection0(cursor.getString(offset + 7));
        entity.setEndStopDirection0(cursor.getString(offset + 8));
        entity.setStartEndTimeDirection0(cursor.getString(offset + 9));
        entity.setStartStopDirection1(cursor.getString(offset + 10));
        entity.setEndStopDirection1(cursor.getString(offset + 11));
        entity.setStartEndTimeDirection1(cursor.getString(offset + 12));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(BusBaseInfoDB entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(BusBaseInfoDB entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(BusBaseInfoDB entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}