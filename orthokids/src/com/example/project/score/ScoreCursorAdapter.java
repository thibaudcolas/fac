package com.example.project.score;

import java.text.SimpleDateFormat;
import java.util.Date;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

import com.example.project.R;

/**
 * Un adapteur pour le curseur utilisé pour récupérer la table de scores.
 * @date 050113
 */
public class ScoreCursorAdapter extends CursorAdapter {
	
	private LayoutInflater inflater;
	// Les indexes des trois colonnes dans la base.
	private int playerIndex;
	private int valueIndex;
	private int dateIndex;

	public ScoreCursorAdapter(Context context, Cursor c) {
		super(context, c, 0);
		
		// On va utiliser l'inflater avec notre layout de score.
		inflater = LayoutInflater.from(context);
		
		playerIndex = c.getColumnIndex(ScoreDao.Properties.Player.columnName);
		valueIndex = c.getColumnIndex(ScoreDao.Properties.Value.columnName);
		dateIndex = c.getColumnIndex(ScoreDao.Properties.Date.columnName);
	}
	
	@Override
	public void bindView(View view, Context context, Cursor cursor) {
		TextView playerText = (TextView) view.findViewById(R.id.player);
		TextView valueText = (TextView) view.findViewById(R.id.value);
		TextView dateText = (TextView) view.findViewById(R.id.date);
		
		long milliseconds = Long.parseLong(cursor.getString(dateIndex));
		Date scoreDate = new Date(milliseconds);
		
		// On réutilise les indexes précédemment calculés.
		playerText.setText(cursor.getString(playerIndex));
		valueText.setText(cursor.getString(valueIndex));
		dateText.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm").format(scoreDate));
	}
	
		@Override
	public View newView(Context context, Cursor cursor, ViewGroup parent) {
			// Inflate de score_row.xml.
		return inflater.inflate(R.layout.score_row, parent, false);
	}
}
