package question1;

import java.sql.*;

public class BD_Film 
{
	private Connection co;
	
	public void openConnecion(String url)
	{
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			co = DriverManager.getConnection(url);
			// co = DriverManager.getConnection( url , "sebastien_godard" , "ngQPsw" );
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
	
	
	public void execRequete()
	{
		// String requete="SELECT * FROM ens2004.Film WHERE rownum < 10";
		String requete="SELECT * FROM CLIENT";		
		
		try 
		{
			Statement st = co.createStatement();
			ResultSet res = st.executeQuery(requete);
			
			System.out.println("Requête : \n" + requete + " exécute.");
			
			while (res.next())
			{
				for(int i=1;i<=3;i++)
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
		// String url="jdbc:oracle:thin:sebastien_godard/ngQPsw@srv1.ens.iut-orsay.fr:1521:etudom";
		String url="jdbc:oracle:thin:sebastien_godard/ngQPsw@bc-hs4.ens.iut-orsay.fr:1521:etudom";
		BD_Film f = new BD_Film();
		
		f.openConnecion(url);
		f.execRequete();
		f.closeConnection();
		
	}
				
			
		
}

