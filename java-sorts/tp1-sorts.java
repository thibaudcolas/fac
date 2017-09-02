package tri;

import time.Bench;

public class Tris {

	static void echange(int tab[], int ind1, int ind2)
	{
		int temp;
		temp = tab[ind1];
		tab[ind1] = tab[ind2];
		tab[ind2] = temp;
	}
	/*
	static int selection(int tab[], int indD)
	{
		int indMin = indD;
		for (int i=indD+1; i<tab.length; i++)
		{
			if tab(indMin >)
		}
		return indM; 
	}
	*/
	// ----------------------------------------------
	// ----------------------------------------------

	/**
	 * Tri à bulles
	 */
	static void triABulles ( int tab[] )
	{
	    triABulles(tab, tab.length);
	}
	
	static void triABulles ( int tab[], int nbVal)
	{
	    boolean trouve = false;
	    for (int i = 0; i < nbVal-1; i++) {
	        if (tab[i] > tab[i+1]) {
	            int tmp = tab[i];
	            tab[i] = tab[i+1];
	            tab[i+1] = tmp;
	            trouve = true;
	        }
	    }
	    if (nbVal-1 > 0 && trouve)
	        triABulles(tab, --nbVal);
	}

	static void triABullesInverse ( int tab[], int cpt )
	{
		triABullesInverse(tab, cpt, tab.length);
	}
	
	static void triABullesInverse ( int tab[], int cpt, int nbVal )	{
	    boolean trouve = false;
	    for (int i = nbVal-1; i > cpt; i--) {
	        if (tab[i-1] < tab[i]) {
	            int tmp = tab[i];
	            tab[i] = tab[i-1];
	            tab[i-1] = tmp;
	            trouve = true;
	        }
	    }
	    cpt++;
	    if (nbVal-1 > cpt && trouve)
	        triABullesInverse(tab, nbVal, cpt);
	}

	/**
	 * Sélectionne la plus grande valeur du tableau
	 */
	static int selectGrand ( int tab[] )
	{
		return selectGrand(tab, tab.length);
	}
	
	static int selectGrand ( int tab[], int nbVal )
	{
	    int grand = 0;
	    for (int i = 0; i < nbVal; i++)
	        if (tab[i] > tab[grand])
	            grand = i;
	    return grand;
	}

	static void triSelection ( int tab[])
	{
		triSelection(tab, tab.length);
	}

	static void triSelection ( int tab[], int nbVal)
	{
	    // on selectionne la plus grande valeur
	    int i = selectGrand(tab, nbVal);
	    // on la met à la fin en inversant la dernière et la plus grande
	    int tmp = tab[nbVal-1];
	    tab[nbVal-1] = tab[i];
	    tab[i] = tmp;
	    // on refait jusqu'au bout
	    if (nbVal - 1 > 0)
	        triSelection ( tab, nbVal - 1);
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Bench.start();
		
		for (int j = 0; j < 10; j++) {
			
			int taille = 1000;
			int tab[] = new int[taille];
			
			for (int i = 0; i < taille; i++) {
				tab[i] =  (int)(Math.random()*taille);
			}
			
			for(int i=0;i<taille;i++) { System.out.print(tab[i] + ", "); }
			System.out.println();
			Tris.triSelection(tab);
			Bench.end();
			
			for(int i=0;i<taille;i++)
			{
				System.out.print(tab[i] + ", ");
			}
			
			Bench.print("t"+j);
		}
	}
	
	

}
