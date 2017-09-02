/**
 * 
 */
package time;

/**
 * 
 */
public class Bench {
	
	static private long debut;
	
	static private long fin;
	
	static public void start()
	{
		Bench.debut = System.currentTimeMillis();
	}
	
	static public void end()
	{
		Bench.fin = System.currentTimeMillis() - Bench.debut;
	}
	
	static public void print(String nom)
	{
		System.out.println("\nTemps " + nom + " : " + Bench.fin + "\n");
	}
	
	static public void print()
	{
		print("");
	}
}
