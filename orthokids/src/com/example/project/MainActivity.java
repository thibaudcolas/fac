package com.example.project;



import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import android.app.Activity;
import android.content.Intent;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.project.score.DaoMaster;
import com.example.project.score.DaoMaster.DevOpenHelper;
import com.example.project.score.DaoSession;
import com.example.project.score.Score;
import com.example.project.score.ScoreDao;

public class MainActivity extends Activity {
	private static int scoreFinal = 0;
	private static int nbQuestion = 0; 
	private ArrayList<Image>listImage = new ArrayList<Image>();
	private ArrayList<String>listMot = new ArrayList<String>();
	private static boolean populate = true;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		scoreFinal = 0;
		int eventType = 0;
		XmlResourceParser myxml = this.getResources().getXml(R.xml.pictures);
		//MyXml.xml is name of our xml in newly created xml folder, mContext is the current context
		try {
			//Get next parse event
			myxml.next();
		} catch (XmlPullParserException e) {
			Log.d("XML",e.toString());
		} catch (IOException e) {
			Log.d("XML",e.toString());
		}
		try {
			eventType = myxml.getEventType();
			//Get current xml event i.e., START_DOCUMENT etc.
		} catch (XmlPullParserException e) {
			Log.d("XML",e.toString());
		} 
		String NodeValue;
		while (eventType != XmlPullParser.END_DOCUMENT)  //Keep going until end of xml document
		{  				
			Image i= new Image();
			if(eventType == XmlPullParser.START_DOCUMENT)   
			{     
				//Start of XML, can check this with myxml.getName() in Log, see if your xml has read successfully
				//Toast.makeText(this, myxml.getName(), Toast.LENGTH_SHORT).show();
			}    
			else if(eventType == XmlPullParser.START_TAG)   
			{     
				NodeValue = myxml.getName();//Start of a Node
				if (NodeValue.equalsIgnoreCase("name_en"))
				{String s = null;
				try {
					s = myxml.nextText();
				} catch (XmlPullParserException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//if(s != null)i.setName_en(s);

				// use myxml.getAttributeValue(x); where x is the number
				// of the attribute whose data you want to use for this node

				}

				if (NodeValue.equalsIgnoreCase("name_fr"))
				{
					String s = null;
					try {
						s = myxml.nextText();
					} catch (XmlPullParserException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					//if(s != null)i.setName_fr(s);


					// use myxml.getAttributeValue(x); where x is the number
					// of the attribute whose data you want to use for this node

				} 
				if (NodeValue.equalsIgnoreCase("address"))
				{
					String s = null;
					try {
						s = myxml.nextText();
					} catch (XmlPullParserException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					//if(s != null)i.setPath(s);

					// use myxml.getAttributeValue(x); where x is the number
					// of the attribute whose data you want to use for this node

				} 
				//etc for each node name
			}   
			else if(eventType == XmlPullParser.END_TAG)   
			{     
				//End of document
			}    
			else if(eventType == XmlPullParser.TEXT)   
			{    
				//Any XML text
			}

			try {
				eventType = myxml.next();
			} catch (XmlPullParserException e) {
				Log.d("XML",e.toString());
				e.printStackTrace();
			} catch (IOException e) {
				Log.d("XML",e.toString());
				e.printStackTrace();
			} //Get next event from xml parser
		}
		Image i = new Image(R.drawable.elephant, "elephant","elephant");
		Image m = new Image(R.drawable.lion, "lion","lion");
		Image a= new Image(R.drawable.turtle, "turtle","tortue");
		Image g= new Image(R.drawable.elephant, "elephant","elephant");
		Image e = new Image(R.drawable.lion, "lion","lion");
		Image er = new Image(R.drawable.turtle, "turtle","tortue");
		Image et = new Image(R.drawable.elephant, "elephant","elephant");
		Image ez = new Image(R.drawable.lion, "lion","lion");
		Image ey = new Image(R.drawable.turtle, "turtle","tortue");
		Image eu = new Image(R.drawable.turtle, "turtle","tortue");
		
		listImage.add(i);listImage.add(m);listImage.add(a);listImage.add(g);listImage.add(e);
		listImage.add(er);listImage.add(et);listImage.add(ez);listImage.add(ey);listImage.add(eu);
		Collections.shuffle(listImage);

		/**Populate db*/
		if(populate){
			populateDb();
			populate= false;
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	/*RECUPERATION DES MENU CLIQUER*/

	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.add :
			openActivityAdd();
			return true;
		case R.id.menu_settings:
			openActivityAdd();
			return true;
		}
		return false;
	}


	private void openActivityAdd() {
		Intent addImageActivity = new Intent(MainActivity.this, AddImageActivity.class);
		startActivityForResult(addImageActivity, 10);
	}

	/*
	 * Click sur Exit
	 * Close on the task bar
	 */
	public void end(View v)
	{
		moveTaskToBack(true);
	}
	/*
	 * Click sur new Game
	 * Permet de passer a l'intent suivant la reponse en String
	 * ainsi que le path de l'image que l'on voudrait
	 * 
	 */
	public void newGame(View v)
	{
		//Other link to see 
		//https://groups.google.com/forum/?fromgroups=#!topic/android-developers/UFEp-U3gdac
		String reponse = listImage.get(nbQuestion).getName_fr();
		int path = listImage.get(nbQuestion).getPath();


		//int path = listAddress.get(1);
		/*if(listAddress.size() < this.nbQuestion){
			reponse = listRepFr.get(nbQuestion);
			path = listAddress.get(nbQuestion);
		}*/
		Intent gameActivity = new Intent(MainActivity.this, GameActivity.class);
		gameActivity.putExtra("reponse", reponse);
		gameActivity.putExtra("Filename", path);

		//startActivityForResult(i, REQUEST_CODE);  
		// Set the request code to any code you like, you can identify the
		// callback via this code
		startActivityForResult(gameActivity, 10);
	}

	//Recuperation des valeurs passer par l'intent
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		if (resultCode == RESULT_OK && requestCode == 10) {
			nbQuestion++;
			if (data.hasExtra("reponse") && data.hasExtra("score")) {
				scoreFinal+= data.getExtras().getInt("score");
				String s = "La reponse etait "+data.getExtras().getString("reponse")+"\n Votre score "+scoreFinal;
				Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
				listMot.add(data.getExtras().getString("reponse"));
				if(nbQuestion != 10)
				{
					newGame(getCurrentFocus());
				}
				else
					insertIntoDb("toto", data.getExtras().getInt("score"));
			}
		}
	}

	/*
	 * Click sur le bouton High Scores.
	 */
	public void viewScores(View v) {
		Log.i("Orthokids", "Clicked view scores button.");
		Intent scoreActivity = new Intent(MainActivity.this, ScoreActivity.class);
		startActivityForResult(scoreActivity, 10);
	}

	public void populateDb() {
		DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "scores-db", null);
		SQLiteDatabase db = helper.getWritableDatabase();
		DaoMaster daoMaster = new DaoMaster(db);
		DaoSession daoSession = daoMaster.newSession();
		ScoreDao scoreDao = daoSession.getScoreDao();

		int randomizer;
		for (int i = 0; i < 5; i++) {
			randomizer = 100 + (int)(Math.random() * ((100000 - 100) + 1));
			scoreDao.insert(new Score(null, "Antoni", new Date(), 500 + randomizer, null));
			randomizer = 100 + (int)(Math.random() * ((100000 - 100) + 1));
			scoreDao.insert(new Score(null, "Baptiste", new Date(), 500 + randomizer, null));
			randomizer = 100 + (int)(Math.random() * ((100000 - 100) + 1));
			scoreDao.insert(new Score(null, "Thibaud", new Date(), 500 + randomizer, null));
		}
		Log.i("Orthokids", "Inserted some scores into DB.");
	}

	public void insertIntoDb(String name, int score) {
		DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "scores-db", null);
		SQLiteDatabase db = helper.getWritableDatabase();
		DaoMaster daoMaster = new DaoMaster(db);
		DaoSession daoSession = daoMaster.newSession();
		ScoreDao scoreDao = daoSession.getScoreDao();
		scoreDao.insert(new Score(null, name, new Date(), score, null));
	}
}
