package com.autismindd.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.autismindd.dao.Star;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "STAR".
*/
public class StarDao extends AbstractDao<Star, Long> {

    public static final String TABLENAME = "STAR";

    /**
     * Properties of entity Star.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property UserId = new Property(1, long.class, "userId", false, "USER_ID");
        public final static Property FirstLayerTaskId = new Property(2, int.class, "firstLayerTaskId", false, "FIRST_LAYER_TASK_ID");
        public final static Property LevelTaskPackId = new Property(3, int.class, "levelTaskPackId", false, "LEVEL_TASK_PACK_ID");
        public final static Property LevelStar = new Property(4, int.class, "levelStar", false, "LEVEL_STAR");
        public final static Property LevelPoint = new Property(5, int.class, "levelPoint", false, "LEVEL_POINT");
        public final static Property LevelRT = new Property(6, long.class, "levelRT", false, "LEVEL_RT");
        public final static Property LevelDT = new Property(7, long.class, "levelDT", false, "LEVEL_DT");
        public final static Property LevelErrorPoint = new Property(8, long.class, "levelErrorPoint", false, "LEVEL_ERROR_POINT");
    };


    public StarDao(DaoConfig config) {
        super(config);
    }
    
    public StarDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"STAR\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"USER_ID\" INTEGER NOT NULL ," + // 1: userId
                "\"FIRST_LAYER_TASK_ID\" INTEGER NOT NULL ," + // 2: firstLayerTaskId
                "\"LEVEL_TASK_PACK_ID\" INTEGER NOT NULL ," + // 3: levelTaskPackId
                "\"LEVEL_STAR\" INTEGER NOT NULL ," + // 4: levelStar
                "\"LEVEL_POINT\" INTEGER NOT NULL ," + // 5: levelPoint
                "\"LEVEL_RT\" INTEGER NOT NULL ," + // 6: levelRT
                "\"LEVEL_DT\" INTEGER NOT NULL ," + // 7: levelDT
                "\"LEVEL_ERROR_POINT\" INTEGER NOT NULL );"); // 8: levelErrorPoint
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"STAR\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Star entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getUserId());
        stmt.bindLong(3, entity.getFirstLayerTaskId());
        stmt.bindLong(4, entity.getLevelTaskPackId());
        stmt.bindLong(5, entity.getLevelStar());
        stmt.bindLong(6, entity.getLevelPoint());
        stmt.bindLong(7, entity.getLevelRT());
        stmt.bindLong(8, entity.getLevelDT());
        stmt.bindLong(9, entity.getLevelErrorPoint());
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Star readEntity(Cursor cursor, int offset) {
        Star entity = new Star( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getLong(offset + 1), // userId
            cursor.getInt(offset + 2), // firstLayerTaskId
            cursor.getInt(offset + 3), // levelTaskPackId
            cursor.getInt(offset + 4), // levelStar
            cursor.getInt(offset + 5), // levelPoint
            cursor.getLong(offset + 6), // levelRT
            cursor.getLong(offset + 7), // levelDT
            cursor.getLong(offset + 8) // levelErrorPoint
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Star entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setUserId(cursor.getLong(offset + 1));
        entity.setFirstLayerTaskId(cursor.getInt(offset + 2));
        entity.setLevelTaskPackId(cursor.getInt(offset + 3));
        entity.setLevelStar(cursor.getInt(offset + 4));
        entity.setLevelPoint(cursor.getInt(offset + 5));
        entity.setLevelRT(cursor.getLong(offset + 6));
        entity.setLevelDT(cursor.getLong(offset + 7));
        entity.setLevelErrorPoint(cursor.getLong(offset + 8));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Star entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Star entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
