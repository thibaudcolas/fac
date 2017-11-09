package com.example.project;

import android.app.ListActivity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;

import com.example.project.score.DaoMaster;
import com.example.project.score.DaoMaster.DevOpenHelper;
import com.example.project.score.DaoSession;
import com.example.project.score.ScoreCursorAdapter;
import com.example.project.score.ScoreDao;

/**
 * L'activité de gestion des highscores.
 * @date 100113
 *
 */
public class ScoreActivity extends ListActivity {

    private SQLiteDatabase db;

    private DaoMaster daoMaster;
    private DaoSession daoSession;
    private ScoreDao scoreDao;

    private Cursor cursor;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        Log.i("Orthokids", "Launched ScoreActivity");
        setContentView(R.layout.activity_score);

        DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "scores-db", null);
        db = helper.getWritableDatabase();
        daoMaster = new DaoMaster(db);
        daoSession = daoMaster.newSession();
        scoreDao = daoSession.getScoreDao();
        
        Log.i("Orthokids", "ScoreDAO setup, " + scoreDao.count() + " scores in DB.");
        
        String valueColumn = ScoreDao.Properties.Value.columnName;
        // OrderBy DESC value pour avoir les meilleurs scores au plus haut.
        String orderBy = valueColumn + " COLLATE LOCALIZED DESC";
        cursor = db.query(scoreDao.getTablename(), scoreDao.getAllColumns(), null, null, null, null, orderBy);

        // On utilise notre adapteur pour peupler la vue de l'activité.
        ScoreCursorAdapter adapter = new ScoreCursorAdapter(this, cursor);
        setListAdapter(adapter);
    }
}