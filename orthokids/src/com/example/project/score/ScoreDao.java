package com.example.project.score;

import java.util.ArrayList;
import java.util.List;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.DaoConfig;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.SqlUtils;

public class ScoreDao extends AbstractDao<Score, Long> {

    public static final String TABLENAME = "SCORE";

    /**
     * Properties of entity Score.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Player = new Property(1, String.class, "player", false, "PLAYER");
        public final static Property Date = new Property(2, java.util.Date.class, "date", false, "DATE");
        public final static Property Value = new Property(3, int.class, "value", false, "VALUE");
        public final static Property Scoreowner = new Property(4, Long.class, "scoreowner", false, "SCOREOWNER");
    };

    private DaoSession daoSession;


    public ScoreDao(DaoConfig config) {
        super(config);
    }
    
    public ScoreDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'SCORE' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'PLAYER' TEXT NOT NULL ," + // 1: player
                "'DATE' INTEGER NOT NULL ," + // 2: date
                "'VALUE' INTEGER NOT NULL ," + // 3: value
                "'SCOREOWNER' INTEGER);"); // 4: scoreowner
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'SCORE'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Score entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getPlayer());
        stmt.bindLong(3, entity.getDate().getTime());
        stmt.bindLong(4, entity.getValue());
 
        Long scoreowner = entity.getScoreowner();
        if (scoreowner != null) {
            stmt.bindLong(5, scoreowner);
        }
    }

    @Override
    protected void attachEntity(Score entity) {
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
    public Score readEntity(Cursor cursor, int offset) {
        Score entity = new Score( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getString(offset + 1), // player
            new java.util.Date(cursor.getLong(offset + 2)), // date
            cursor.getInt(offset + 3), // value
            cursor.isNull(offset + 4) ? null : cursor.getLong(offset + 4) // scoreowner
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Score entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setPlayer(cursor.getString(offset + 1));
        entity.setDate(new java.util.Date(cursor.getLong(offset + 2)));
        entity.setValue(cursor.getInt(offset + 3));
        entity.setScoreowner(cursor.isNull(offset + 4) ? null : cursor.getLong(offset + 4));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Score entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Score entity) {
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
    
    private String selectDeep;

    protected String getSelectDeep() {
        if (selectDeep == null) {
            StringBuilder builder = new StringBuilder("SELECT ");
            SqlUtils.appendColumns(builder, "T", getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T0", daoSession.getProfileDao().getAllColumns());
            builder.append(" FROM SCORE T");
            builder.append(" LEFT JOIN PROFILE T0 ON T.'SCOREOWNER'=T0.'_id'");
            builder.append(' ');
            selectDeep = builder.toString();
        }
        return selectDeep;
    }
    
    protected Score loadCurrentDeep(Cursor cursor, boolean lock) {
        Score entity = loadCurrent(cursor, 0, lock);
        int offset = getAllColumns().length;

        Profile profile = loadCurrentOther(daoSession.getProfileDao(), cursor, offset);
        entity.setProfile(profile);

        return entity;    
    }

    public Score loadDeep(Long key) {
        assertSinglePk();
        if (key == null) {
            return null;
        }

        StringBuilder builder = new StringBuilder(getSelectDeep());
        builder.append("WHERE ");
        SqlUtils.appendColumnsEqValue(builder, "T", getPkColumns());
        String sql = builder.toString();
        
        String[] keyArray = new String[] { key.toString() };
        Cursor cursor = db.rawQuery(sql, keyArray);
        
        try {
            boolean available = cursor.moveToFirst();
            if (!available) {
                return null;
            } else if (!cursor.isLast()) {
                throw new IllegalStateException("Expected unique result, but count was " + cursor.getCount());
            }
            return loadCurrentDeep(cursor, true);
        } finally {
            cursor.close();
        }
    }
    
    /** Reads all available rows from the given cursor and returns a list of new ImageTO objects. */
    public List<Score> loadAllDeepFromCursor(Cursor cursor) {
        int count = cursor.getCount();
        List<Score> list = new ArrayList<Score>(count);
        
        if (cursor.moveToFirst()) {
            if (identityScope != null) {
                identityScope.lock();
                identityScope.reserveRoom(count);
            }
            try {
                do {
                    list.add(loadCurrentDeep(cursor, false));
                } while (cursor.moveToNext());
            } finally {
                if (identityScope != null) {
                    identityScope.unlock();
                }
            }
        }
        return list;
    }
    
    protected List<Score> loadDeepAllAndCloseCursor(Cursor cursor) {
        try {
            return loadAllDeepFromCursor(cursor);
        } finally {
            cursor.close();
        }
    }
    

    /** A raw-style query where you can pass any WHERE clause and arguments. */
    public List<Score> queryDeep(String where, String... selectionArg) {
        Cursor cursor = db.rawQuery(getSelectDeep() + where, selectionArg);
        return loadDeepAllAndCloseCursor(cursor);
    }
 
}
