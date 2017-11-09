package com.example.project;


import java.io.*;
import org.jdom2.*;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.*;

import android.util.Log;

public class JDOM2
{
	//Nous allons commencer notre arborescence en cr�ant la racine XML
	//qui sera ici "personnes".
	static Element racine = new Element("scores");

	//On cr�e un nouveau Document JDOM bas� sur la racine que l'on vient de cr�er
	static org.jdom2.Document document = new Document(racine);

	public JDOM2()
	{
		Log.d("JDOM 2","qdsgfhgjgdsf");
		//On cr�e un nouvel Element etudiant et on l'ajoute
		//en tant qu'Element de racine
		Element score = new Element("score");
		racine.addContent(score);

		//On cr�e un nouvel Attribut classe et on l'ajoute � etudiant
		//gr�ce � la m�thode setAttribute
		Attribute classe = new Attribute("classe","P2");
		score.setAttribute(classe);

		//On cr�e un nouvel Element nom, on lui assigne du texte
		//et on l'ajoute en tant qu'Element de etudiant
		Element nom = new Element("nom");
		nom.setText("CynO");
		score.addContent(nom);
		System.out.println("azertyu");
		//Les deux m�thodes qui suivent seront d�finies plus loin dans l'article
		affiche();
		enregistre("scores2.xml");
	}

	static void affiche()
	{
		try
		{
			//On utilise ici un affichage classique avec getPrettyFormat()
			XMLOutputter sortie = new XMLOutputter(Format.getPrettyFormat());
			sortie.output(document, System.out);
		}
		catch (java.io.IOException e){}
	}

	static void enregistre(String fichier)
	{
		SAXBuilder sxb = new SAXBuilder();
		try
		{
			//On cr�e un nouveau document JDOM avec en argument le fichier XML
			//Le parsing est termin� ;)
			document = sxb.build(new File("Exercice2.xml"));
		}
		catch(Exception e){}

		//On initialise un nouvel �l�ment racine avec l'�l�ment racine du document.
		racine = document.getRootElement();

	}
}