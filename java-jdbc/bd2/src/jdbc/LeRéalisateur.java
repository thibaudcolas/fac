package JDBC;

import java.sql.*;
import java.util.*;
import java.io.*;

public class LeRéalisateur
{
	public static String saisieChaine() 
	{
		String valeur;
		try {		
			BufferedReader entree = new BufferedReader(new InputStreamReader(System.in));
			valeur = entree.readLine();
			return (valeur);
		}
		catch (IOException e) {
			System.out.println ("probleme de lecture");
			return (" ");
		}
	}

	public static int saisieValeur(){
		String valeur;
		try {
			BufferedReader entree = new BufferedReader(new InputStreamReader(System.in));
			valeur = entree.readLine();
			int choix = Integer.parseInt(valeur,10);
			return (choix);
		}
		catch (IOException e) {
			System.out.println ("probleme de lecture");
			return (0);
		}
	}
	
	public void openConnection (String url){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			co = DriverManager.getConnection(url);
		}
		catch (ClassNotFoundException e) {
			System.out.println("il manque le driver");
			System.exit(1);
		}
		
		catch (SQLException e) {
			System.out.println("Probleme d'execution de requete");
			System.out.println("hfhzihip999");
		}
	}
	public void execRequete() {
		String requete = "SELECT * FROM ens2004.Film WHERE rownum < 10";
		try {
			Statement st = co.createStatement();
			System.out.println("hfhzihipMMMMMM");
			ResultSet res = st.executeQuery(requete);
			System.out.println("requete" + requete + "excecutee");
			while (res.next()){
				for (int i=1; i<=3; i++)
					System.out.println(res.getString(i)+ "\t");
			}
		}
			catch (SQLException e) {
				System.out.println("Probleme d'execution de requete");
				
			}
		
		}
	public void CloseConnection(){
		try {
			co.close();}
		catch (SQLException e) {
			System.out.println("Probleme d'execution de requete");
			}
		}

	public static void main(String[]arg)
	{
		int numRéalisateur=0;
		while (numRéalisateur==0)
		{
			System.out.println("Entrez le réalisateur");
			numRéalisateur=saisieValeur();
		}
		String url="...";
		CallableStatement cst=null;
		// LeRéalisateur OutilsJDBC = new LeRéalisateur();
		Connection co=OutilsJDBC.openConnection(url);
		
		try 
		{
			cst=co.prepareCall("{?=call nbreFilms(?)}");
		}
		catch (SQLException e)
		{
			System.out.println("Erreur : " + e);
		}
		try
		{
			cst.registerOutParameter(1, java.Sql.Types Integer); 
			cst.setInt(2, numRealisateur);
		}
		catch (SQLException e)
		{
			System.out.println("Erreur : " + e);
		}
		// OutilsJDBC.closeConnection();
	}

}
