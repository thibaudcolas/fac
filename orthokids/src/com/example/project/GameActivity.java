package com.example.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;


public class GameActivity extends Activity implements OnClickListener{

	//Pour ajouter l'image dynamiquement
	private ImageView imageToChange;
	//Pour afficher la reponse au fur et a mesure
	private LinearLayout reponseZone;
	//Vaariable contenant la reponse + eclatement pour instancier lettre
	private String reponse;
	private char[] reponseChar;
	//Liste sous forme de String de la reponse eclater
	private ArrayList<String>reponse_List = new ArrayList<String>();
	//Liste des boutons definit statiquement
	private ArrayList<Button>buttonList = new ArrayList<Button>();
	//Liste de lettre choisit par l'utilisateur pour definir la reponse
	private ArrayList<String>motEnCours = new ArrayList<String>();
	//Pour lettre correctement place
	private int bonneReponse = 0;
	//Pour liste Boutton reponse pour annulation et autre
	private ArrayList<Button>buttonReponseList = new ArrayList<Button>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_game);

		/*Recuperation de la reponse et création du tableau de char*/
		Bundle b = getIntent().getExtras();
		reponse = b.getString("reponse");
		reponseChar = reponse.toCharArray();
		/*I- Recuperation de l'image + Set de l'image si image dans drawable
		
		*imageToChange = (ImageView)findViewById(R.id.imageToChange);
		*imageToChange.setImageResource(R.drawable.elephant);
		*/
		/*II- Modification via une URI
		 * R.id.imageToChange est l'id de ImageView dans notre layout layout. 
		 * fileName est un String contenant le nom du fichier que l'on utilisera dans l'appel de openFileOutput.
		 * 
		 *Fonctionne a priori a tester
		 *
		 */
		imageToChange = (ImageView)findViewById(R.id.imageToChange);
		int fileName = b.getInt("Filename");;
		//Toast.makeText(this, ""+fileName+"", Toast.LENGTH_SHORT).show();
		imageToChange.setImageResource(fileName);
		
		
		/*
		 * 	int fileName = R.drawable.elephant;
		imageToChange.setImageResource(fileName);
		 */
		reponseZone = (LinearLayout)findViewById(R.id.Reponse);
		for(int i=0;i<reponseChar.length;i++)
			reponse_List.add(Character.toString(reponseChar[i]));
		setButton();
	}

	private void setButton() {
		buttonList.add((Button)findViewById(R.id.Button01));
		buttonList.add((Button)findViewById(R.id.Button02));
		buttonList.add((Button)findViewById(R.id.Button03));
		buttonList.add((Button)findViewById(R.id.Button04));
		buttonList.add((Button)findViewById(R.id.Button05));
		buttonList.add((Button)findViewById(R.id.Button06));
		buttonList.add((Button)findViewById(R.id.Button07));
		buttonList.add((Button)findViewById(R.id.Button08));
		buttonList.add((Button)findViewById(R.id.Button09));
		buttonList.add((Button)findViewById(R.id.Button10));
		buttonList.add((Button)findViewById(R.id.Button11));
		buttonList.add((Button)findViewById(R.id.Button12));
		buttonList.add((Button)findViewById(R.id.Button13));
		buttonList.add((Button)findViewById(R.id.Button14));

		//Liste de lettre a rajouter pour completer les boutons
		ArrayList<String>lettreEnPlus = new ArrayList<String>();
		lettreEnPlus.addAll(Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"));
		//Liste de valeur a donner au boutons
		ArrayList<String>tmp = new ArrayList<String>();
		//Pour garder la reponse_List pour les comparaisons de reponse
		tmp.addAll(reponse_List);
		int index = 0;
		int i = tmp.size();
		//On rajoute des valeurs au fond de la liste des possibilité (14 Bouttons)
		while(i < buttonList.size())
		{
			index = (int) (Math.random()*lettreEnPlus.size());
			tmp.add(lettreEnPlus.get(index));
			i++;
		}
		//On melange
		Collections.shuffle(tmp);
		//Puis on affecte a chaque bouton une nouvelle lettre ainsi qu'un evenement
		for ( i = 0; i < buttonList.size();i++)
		{
			buttonList.get(i).setText(tmp.get(i));
			buttonList.get(i).setOnClickListener(this);
		}
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_game, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		//On recherche le boutton cliquer dans la liste
		if(buttonList.contains(v))
		{
			for(int i =0; i < buttonList.size();i++)
			{
				if(buttonList.get(i).equals(v))
				{
					//On le rend invisible et on crée un nouveau boutton qui sera ajouter dans la zoneReponse
					buttonList.get(i).setVisibility(View.INVISIBLE);
					Button b = new Button(this);
					//Calcul pour taille
					float density = this.getResources().getDisplayMetrics().density;
					float px = 35 * density;
					b.setWidth((int) px);b.setHeight((int) px);

					b.setText(buttonList.get(i).getText());
					b.setOnClickListener(this);
					//Si la lettre choisit appartient bien au mot reponse
					if(reponse_List.contains(buttonList.get(i).getText()))
					{	
						//Verification de la presence du bouton
						if(buttonList.get(i).getVisibility() == View.GONE)
							break;
						//Presence d'une lettre en double ou plus pour valider quand même la position
						int doublon = 0;
						for (int j=0 ; j < reponse_List.size();j++)
						{
							if(reponse_List.get(j).equals(buttonList.get(i).getText()))
								doublon++;
						}
						//Si la lettre en cours correspond a la lettre attendu
						if(buttonList.get(i).getText().equals(reponse_List.get(motEnCours.size())))
							bonneReponse++;
						//Si la lettre est bonne mais qu'il existe une lettre en double dans le tableau
						else if(doublon > 1 && reponse_List.get(motEnCours.size()).equals(buttonList.get(i).getText()))
							bonneReponse++;
						else //Sinon ok on affiche normalement et on rajoute +1 au compteur pour l'affichage
							b.setTextColor(Color.BLUE);
					}
					else   //Lettre en rouge si n'appartient pas a la reponse	
						b.setTextColor(Color.RED);

					//Ajout au tableau de lettre en cours et au layout
					reponseZone.addView(b);
					motEnCours.add((String) b.getText());
					buttonReponseList.add(b);
					//Pour verifier si l'utilisateur a pas fini de saisir
					if(motEnCours.size() == reponse_List.size())
					{
						//Aucune erreur
						if(bonneReponse == reponse_List.size()) //Reussite on passe au suivant
							finish(true, bonneReponse);
						else //Echec on passe au suivant avec message erreur + nombre erreur
						{
							finish(false,(reponse_List.size() - bonneReponse));
						}
					}
				}
			}
		}
		else if(buttonReponseList.contains(v))
		{	
			int doublon  = 0;
			//Recherche boutton dans liste
			for(int i =0; i < buttonReponseList.size();i++)
			{
				if(buttonReponseList.get(i).equals(v))
				{
					//Recherche boutton correspondant dans la liste des bouttons en bas
					for(int j=0; j < buttonList.size(); j++)
					{
						if(buttonList.get(j).getText().equals(buttonReponseList.get(i).getText()) && doublon == 0)
						{
							//Disparition de la liste du haut et apparition en bas
							buttonReponseList.get(i).setVisibility(View.GONE);
							buttonList.get(j).setVisibility(View.VISIBLE);
							//if((buttonReponseList.size()-1) > 0) buttonReponseList.remove(i);
							//buttonReponseList = new ArrayList<Button>();
							toPrintToast("Taille buttonReponseListe " + buttonReponseList.size());
							doublon++;
						}
					}
				}
			}
		}
	}
	public void finish(boolean b, int score) {
		Intent data = new Intent();
		if(b)
			toPrintToast("BONNE REPONSE, "+score+"points");
		else
		{
			score = reponse.length() - score;
			toPrintToast("Mauvaise reponse il y a " + score + " erreur(s)\n "+score	+" points");
		}	
		data.putExtra("reponse", this.reponse);
		data.putExtra("score", score);
		// Activity finished ok, return the data
		setResult(RESULT_OK, data);
		super.finish();
	} 


	public void toPrintToast(String s)
	{
		Toast.makeText(this, s, Toast.LENGTH_SHORT).show();

	}
}