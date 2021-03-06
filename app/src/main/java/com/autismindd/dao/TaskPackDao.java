package com.autismindd.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.autismindd.dao.TaskPack;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "TASK_PACK".
*/
public class TaskPackDao extends AbstractDao<TaskPack, Long> {

    public static final String TABLENAME = "TASK_PACK";

    /**
     * Properties of entity TaskPack.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Name = new Property(1, String.class, "name", false, "NAME");
        public final static Property Level = new Property(2, int.class, "level", false, "LEVEL");
        public final static Property FirstLayerTaskID = new Property(3, int.class, "firstLayerTaskID", false, "FIRST_LAYER_TASK_ID");
        public final static Property TouchAnimation = new Property(4, int.class, "touchAnimation", false, "TOUCH_ANIMATION");
        public final static Property ItemOfAnimation = new Property(5, int.class, "itemOfAnimation", false, "ITEM_OF_ANIMATION");
        public final static Property CreatedAt = new Property(6, java.util.Date.class, "createdAt", false, "CREATED_AT");
    };

    private DaoSession daoSession;


    public TaskPackDao(DaoConfig config) {
        super(config);
    }
    
    public TaskPackDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"TASK_PACK\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"NAME\" TEXT," + // 1: name
                "\"LEVEL\" INTEGER NOT NULL ," + // 2: level
                "\"FIRST_LAYER_TASK_ID\" INTEGER NOT NULL ," + // 3: firstLayerTaskID
                "\"TOUCH_ANIMATION\" INTEGER NOT NULL ," + // 4: touchAnimation
                "\"ITEM_OF_ANIMATION\" INTEGER NOT NULL ," + // 5: itemOfAnimation
                "\"CREATED_AT\" INTEGER);"); // 6: createdAt
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"TASK_PACK\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, TaskPack entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
        stmt.bindLong(3, entity.getLevel());
        stmt.bindLong(4, entity.getFirstLayerTaskID());
        stmt.bindLong(5, entity.getTouchAnimation());
        stmt.bindLong(6, entity.getItemOfAnimation());
 
        java.util.Date createdAt = entity.getCreatedAt();
        if (createdAt != null) {
            stmt.bindLong(7, createdAt.getTime());
        }
    }

    @Override
    protected void attachEntity(TaskPack entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public TaskPack readEntity(Cursor cursor, int offset) {
        TaskPack entity = new TaskPack( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // name
            cursor.getInt(offset + 2), // level
            cursor.getInt(offset + 3), // firstLayerTaskID
            cursor.getInt(offset + 4), // touchAnimation
            cursor.getInt(offset + 5), // itemOfAnimation
            cursor.isNull(offset + 6) ? null : new java.util.Date(cursor.getLong(offset + 6)) // createdAt
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, TaskPack entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setLevel(cursor.getInt(offset + 2));
        entity.setFirstLayerTaskID(cursor.getInt(offset + 3));
        entity.setTouchAnimation(cursor.getInt(offset + 4));
        entity.setItemOfAnimation(cursor.getInt(offset + 5));
        entity.setCreatedAt(cursor.isNull(offset + 6) ? null : new java.util.Date(cursor.getLong(offset + 6)));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(TaskPack entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(TaskPack entity) {
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
