package tp5;
import java.sql.*;
public class BD_FILM {
	Connection co;

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

public static void main(String[]arg){
	String url = "jdbc:oracle:thin:sebastien_godard/ngQPsw@orasrv1.ens.iut-orsay.fr:1521:etudom";
	BD_FILM f = new BD_FILM();
	System.out.println("hfhzihip000");
	f.openConnection(url);
	System.out.println("hfhzihip1111");
	f.execRequete();
	System.out.println("hfhzihip2222");
	f.CloseConnection();
	}

		
}
	


