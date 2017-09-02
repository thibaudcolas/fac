package controle;

public class Ctrl 
{
	static int max=100;
	
	static int cpt, cpt2;
	static double som, som2;
	
	public static void main(String[] args) 
	{
		System.out.println("\n----Question 1\n");
		
		// Le tableau qu'on va trier.
		int tab[] = new int[max];
		
		GenererTab(tab);
		
		// Affichage pré-tris.
		affichage(tab);
		
		System.out.println("\n----Question 2\n");
		System.out.println("\nTest de la fonction Partition : " + Partition(tab,0,99));
		
		
		
		System.out.println("\n----Question 3\n");
		
		TriRapide(tab, 0, 99);
		System.out.println("Nombre d'appels récursifs : " + cpt + "\n");
		
		// Affichage post-tris.
		affichage(tab);
		
		
		
		System.out.println("\n----Question 4\n");
		
		// On remet le tableau non trié.
		GenererTab(tab);
		
		// Affichage pré-tris.
		affichage(tab);
		
		TriRapide3(tab, 0, 99);
		System.out.println("\nNombre d'appels récursifs : " + cpt2 + "\n");
		
		// Affichage post-tris.
		affichage(tab);
		
		
		
		System.out.println("\n----Question 5\n");
		
		
		// Moyenne avec TriRapide.
		som=0;
		for(int i=0; i<100;i++)
		{
			GenererTab(tab);
			TriRapide(tab,0,99);
			
			som+=cpt;
			
			cpt=0;
		}
		System.out.println("Nb moy appels TriRapide : " + (som/100) + "\n");
		
		// Moyenne avec TriRapide3.
		som2=0;
		for(int i=0; i<100;i++)
		{
			GenererTab(tab);
			TriRapide3(tab,0,99);
			
			som2+=cpt2;
			
			cpt2=0;
		}
		System.out.println("Nb moy appels TriRapide3 : " + (som2/100) + "\n");
	}
	
	
	// Affichage du tableau.
	public static void affichage(int tab[])
	{
		for(int j=0; j<100; j++)
		{
			System.out.print((j+1) + " : " +tab[j] + ", ");
			if(j==10 || j==20 || j==30 || j==40 || j==50 || j==60 || j==70 || j==80 || j==90)
				System.out.println();
		}
		System.out.println();
	}
	
	
	
	// Question 1, un tableau de 100 entiers compris entre 0 et 1000.
	public static void GenererTab(int tab[])
	{	
		//Generation aléatoire des valeurs.
		for (int i=0; i<100; i++)
		{
			// Nombre aléatoire entre 0 et 1000.
			tab[i] = (int)(Math.random()*1000);
		}
	}

	
	
	// Permute deux valeurs d'un tableau.
	private static void permuter(int tab[],int i,int j)
    {
		// On permute les valeurs en utilisant une variable temporaire.
		int tmp=tab[i];
		tab[i]=tab[j];
		tab[j]=tmp;
    }
	
	
	// Question 2
	public static int Partition(int tab[], int deb, int fin)
	{
		int derPetit, pivot;
		
		pivot=tab[fin];
		derPetit=deb-1;
		
		for(int courant=deb; courant<fin; courant++)
		{
			
			if (tab[courant] <= pivot)
			{
				derPetit++;
				permuter(tab, derPetit, courant);
			}
			
		}
		permuter(tab, derPetit+1, fin);
		
		return derPetit+1;
	}
	
	// Question 3
	public static void TriRapide(int tab[], int deb,int fin)
	{
		cpt++;
		if (deb < fin)
		{
			int indPivot=Partition(tab,deb,fin);

			TriRapide(tab, deb, indPivot-1);
			TriRapide(tab, indPivot+1, fin);
		}
	}
	
	// Question 4
	public static void TriRapide3(int tab[], int deb,int fin)
	{
		cpt2++;
		
		int indPivot;
		while (deb<fin)
		{
			indPivot=Partition(tab,deb,fin);
			
			if ( (indPivot - deb) < (fin - indPivot) )
			{
				TriRapide3(tab, deb, indPivot-1);
				deb=indPivot+1;
			}
			else
			{
				TriRapide3(tab, indPivot+1, fin);
				fin=indPivot-1;
			}
			
		}
		
	}


	

}


