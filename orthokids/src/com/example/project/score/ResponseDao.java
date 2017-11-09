package com.example.project.score;

import java.util.List;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.DaoConfig;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.Query;
import de.greenrobot.dao.QueryBuilder;

public class ResponseDao extends AbstractDao<Response, Long> {

    public static final String TABLENAME = "RESPONSE";

    /**
     * Properties of entity Response.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Lang = new Property(1, String.class, "lang", false, "LANG");
        public final static Property Value = new Property(2, String.class, "value", false, "VALUE");
        public final static Property ImageId = new Property(3, long.class, "imageId", false, "IMAGE_ID");
    };

    private Query<Response> image_ResponseListQuery;

    public ResponseDao(DaoConfig config) {
        super(config);
    }
    
    public ResponseDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'RESPONSE' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'LANG' TEXT NOT NULL ," + // 1: lang
                "'VALUE' TEXT NOT NULL ," + // 2: value
                "'IMAGE_ID' INTEGER NOT NULL );"); // 3: imageId
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'RESPONSE'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Response entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getLang());
        stmt.bindString(3, entity.getValue());
        stmt.bindLong(4, entity.getImageId());
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Response readEntity(Cursor cursor, int offset) {
        Response entity = new Response( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getString(offset + 1), // lang
            cursor.getString(offset + 2), // value
            cursor.getLong(offset + 3) // imageId
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Response entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setLang(cursor.getString(offset + 1));
        entity.setValue(cursor.getString(offset + 2));
        entity.setImageId(cursor.getLong(offset + 3));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Response entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Response entity) {
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
    
    /** Internal query to resolve the "responseList" to-many relationship of Image. */
    public synchronized List<Response> _queryImage_ResponseList(long imageId) {
        if (image_ResponseListQuery == null) {
            QueryBuilder<Response> queryBuilder = queryBuilder();
            queryBuilder.where(Properties.ImageId.eq(imageId));
            image_ResponseListQuery = queryBuilder.build();
        } else {
            image_ResponseListQuery.setParameter(0, imageId);
        }
        return image_ResponseListQuery.list();
    }

}
