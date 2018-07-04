package question2;

import java.sql.*;
import java.io.*;

public class BD_Film2
{
	private Connection co;
	
	public void openConnecion(String url)
	{
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			co = DriverManager.getConnection(url);
		}
		catch (ClassNotFoundException e)
		{
			System.out.println("Il manque le driver.");
			System.exit(1);
		}
		catch (SQLException e)
		{
			System.out.println("Impossible de se connecter.");
			System.exit(1);
		}
		
	}
	
	
	public void execRequete(String requete, int col)
	{
		try 
		{
			Statement st = co.createStatement();
			ResultSet res = st.executeQuery(requete);
			
			System.out.println("Requête : \n" + requete + " exécute.");
			
			while (res.next())
			{
				for(int i=1;i<=col;i++)
				{
					System.out.print(res.getString(i)+"\t");
				}
				System.out.println();
			}
		}
		catch (SQLException e)
		{
			System.out.println("Problème de requête.");
		}
	}
	
	public void closeConnection()
	{
		try 
		{
			co.close();
		}
		catch (SQLException e)
		{
			System.out.println("Impossible de fermer la connexion.");
		}
	}
	
	public static void main(String []args)
	{
		String url="jdbc:oracle:thin:sebastien_godard/ngQPsw@bc-hs4.ens.iut-orsay.fr:1521:etudom";
		
		BD_Film2 f = new BD_Film2();
		
		try 
		{
		InputStreamReader lecteur = new InputStreamReader(System.in);
		BufferedReader entree = new BufferedReader(lecteur);
			
		String requete=null;
		
		f.openConnecion(url);
		
		System.out.println("Nom de l'acteur (en majuscules) : ");
		String nom = entree.readLine();
		
		requete="SELECT * FROM ens2004.INDIVIDU WHERE NomIndividu='" + nom +"'";
		f.execRequete(requete, 3);

		System.out.println("Numéro de l'acteur : ");
		String num = entree.readLine();
		
		requete="SELECT F.NumFilm, Titre FROM ens2004.ACTEUR A, ens2004.FILM F WHERE A.NumFilm=F.NumFilm AND NumIndividu='" + num +"'";
		f.execRequete(requete, 2);
		
		System.out.println("Code du titre : ");
		String code = entree.readLine();
		
		requete="SELECT NumExemplaire FROM ens2004.EXEMPLAIRE WHERE NumFilm='" + code +"'";
		f.execRequete(requete, 1);
		
		}
		catch(IOException e)
		{
			System.out.println("Erreur :" + e);
		}
		
		f.closeConnection();

		
		
	}
				
			
		
}

