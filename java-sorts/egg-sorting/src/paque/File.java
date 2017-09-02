package paque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class File 
{
	// Une file d'oeufs a pour attributs un tableau d'oeufs, sa taille, et les indices de fin des zones d'oeufs
	private Oeuf tabOeuf[];
	private int nbOeufs;
	private int finBleu;
	private int finBlanc;
	private int finPioche;
	
	// Le constructeur initialise les variables
	public File(int taille) 
	{
		nbOeufs=taille;
		
		finBleu=-1;
		finBlanc=-1;
		finPioche=nbOeufs-1;
		
		tabOeuf = new Oeuf[nbOeufs];
		
		// On cr�� tous les oeufs apr�s avoir cr�� le tableau
		for(int i=0; i<nbOeufs;i++)
		{
			tabOeuf[i] = new Oeuf();
		}
		
	}

	public Oeuf unOeuf(int i)
	{
		return tabOeuf[i];
	}
	
	public int getNbOeufs()
	{
		return nbOeufs;
	}
	
	public int dernier()
	{
		return nbOeufs - 1;
	}
	
	// Fonction d'affichage d'une file
	public void affichage()
	{
		for(int i=0; i<nbOeufs; i++)
		{
			System.out.print(tabOeuf[i] + " | ");
			
			// On revient � la ligne tous les 10 oeufs
			if(i%10==0 && i!=0)
				System.out.println();
		}
		System.out.println("\n");
	}
	
	// Fonction de g�n�ration al�atoire d'un tableau d'oeufs prenant la taille en param�tre
	public void genererTab(int tailleTab)
	{	
		String coul;
		finBleu=-1;
		finBlanc=-1;
		finPioche=nbOeufs-1;
		
		// Pour chaque oeuf ...
		for (int i=0; i<tailleTab; i++)
		{
			tabOeuf[i].setNum(i);
			
			// On d�finit son num�ro, puis sa couleur gr�ce � Math.random()
			switch ( (int)(Math.random()*3) )
			{
				case 0 : coul="rouge"; break;
				case 1 : coul="blanc"; break;
				case 2 : coul="bleu"; break;
				default : coul="inconnue"; break;
			}
			tabOeuf[i].setCouleur(coul);
			
		}
	}
	
	// Fonction de tri it�ratif du tableau d'oeufs
	public int triIteratif()
	{
		// Compteur du nombre d'�critures
		int comp=0;
		
		// Tant qu'on a des oeufs � trier (finBlanc!=finPioche)
		while(finBlanc<finPioche)
		{
			// Si l'oeuf est bleu
			if(tabOeuf[finBlanc+1].getCouleur()=="bleu")
			{
				// On sauvegarde l'oeuf
				Oeuf tmp=tabOeuf[finBlanc+1];
				
				// On d�cale tous les oeufs blancs vers la droite
				for( int i=finBlanc; i>finBleu; i-- ) 
				{
					tabOeuf[i+1]=tabOeuf[i];
					comp++;
				}

				// On place l'oeuf � la fin des bleus
				tabOeuf[finBleu+1]=tmp;
				comp++;
				
				// On incr�mente les indices en cons�quence
				finBleu++;
				finBlanc++;
			}
			// Si l'oeuf est blanc
			else if (tabOeuf[finBlanc+1].getCouleur()=="blanc")
			{
				// On ne fait que d�caler l'indice de fin d'une case vers la droite
				finBlanc++;
			}
			// Si l'oeuf est rouge
			else if (tabOeuf[finBlanc+1].getCouleur()=="rouge")
			{
				// On sauvegarde l'oeuf
				Oeuf tmp=tabOeuf[finBlanc+1];
				
				// On d�cale tous les oeufs qui le suivent (non tri�s et rouges) vers la gauche
				for(int i=finBlanc+2; i<nbOeufs; i++)
				{
					tabOeuf[i-1]=tabOeuf[i];
					comp++;
				}
				
				// On le place � la fin du tableau
				tabOeuf[nbOeufs-1]=tmp;
				comp++;
				
				finPioche--;
			}
			
		}
		
		// On retourne le nombre d'�critures
		return comp;
	}
	
	// Fonction de tri r�cursif du tableau d'oeufs
	public void triRecursif()
	{
		
		// Tant qu'on a des oeufs � trier (finBlanc!=finPioche)
		if(finBlanc<finPioche)
		{
			// Si l'oeuf est bleu
			if(tabOeuf[finBlanc+1].getCouleur()=="bleu")
			{
				// On sauvegarde l'oeuf
				Oeuf tmp=tabOeuf[finBlanc+1];
				
				// On d�cale tous les oeufs blancs vers la droite
				for( int i=finBlanc; i>finBleu; i-- ) 
				{
					tabOeuf[i+1]=tabOeuf[i];
				}

				// On place l'oeuf � la fin des bleus
				tabOeuf[finBleu+1]=tmp;
				
				// On incr�mente les indices en cons�quence
				finBleu++;
				finBlanc++;
			}
			// Si l'oeuf est blanc
			else if (tabOeuf[finBlanc+1].getCouleur()=="blanc")
			{
				// On ne fait que d�caler l'indice de fin d'une case vers la droite
				finBlanc++;
			}
			// Si l'oeuf est rouge
			else if (tabOeuf[finBlanc+1].getCouleur()=="rouge")
			{
				// On sauvegarde l'oeuf
				Oeuf tmp=tabOeuf[finBlanc+1];
				
				// On d�cale tous les oeufs qui le suivent (non tri�s et rouges) vers la gauche
				for(int i=finBlanc+2; i<nbOeufs; i++)
				{
					tabOeuf[i-1]=tabOeuf[i];
				}
				
				// On le place � la fin du tableau
				tabOeuf[nbOeufs-1]=tmp;
				
				finPioche--;
			}
		
			triRecursif();
		}
	}
	
	// Voici la nouvelle version de notre tri utilisant un second tableau.
	public int triSuperCool(File cool)
	{
		int nbE=0;
		
		// V�rification de la taille du nouveau tableau
		if(nbOeufs==cool.nbOeufs)
		{
			int cpt=0;
			
			// Copie des bleus
			for(int i=0; i<nbOeufs;i++)
			{
				if(tabOeuf[i].getCouleur()=="bleu")
				{
					cool.tabOeuf[cpt]=tabOeuf[i];
					cpt++;
					nbE++;
				}
			}
			cool.finBleu=cpt-1;
			
			// Copie des blancs
			for(int i=0; i<nbOeufs;i++)
			{
				if(tabOeuf[i].getCouleur()=="blanc")
				{
					cool.tabOeuf[cpt]=tabOeuf[i];
					cpt++;
					nbE++;
				}
			}
			cool.finBlanc=cpt-1;
			
			// Copie des rouges
			for(int i=0; i<nbOeufs;i++)
			{
				if(tabOeuf[i].getCouleur()=="rouge")
				{
					cool.tabOeuf[cpt]=tabOeuf[i];
					cpt++;
					nbE++;
				}
			}
		
		}
		
		return nbE;
	}
	
	// Renvoie vrai si le tableau est tri�, faux s'il ne l'est pas
	public Boolean verifTri()
	{
		Boolean verif=true;
		int i=0;
		
		// Si la pioche est vide ...
		if(finPioche==finBlanc)
		{
			// Dans la cat�gorie bleue
			while(verif && i<finBleu-1)
			{
				// Rang� par couleur et par ordre croissant
				verif=(tabOeuf[i].getCouleur()=="bleu" && tabOeuf[i].getNum() < tabOeuf[i+1].getNum());
				i++;
				
			}
			if(finBleu!=-1) verif=(tabOeuf[finBleu].getCouleur()=="bleu");
			
			// Dans la cat�gorie blanc
			while(verif && i<finBlanc-1)
			{
				// Rang� par couleur et par ordre croissant
				verif=(tabOeuf[i].getCouleur()=="blanc" && tabOeuf[i].getNum() < tabOeuf[i+1].getNum());
				i++;
			}
			if(finBlanc!=-1) verif=(tabOeuf[finBlanc].getCouleur()=="blanc");
			
			// Dans la cat�gorie rouge
			while(verif && i<nbOeufs-1)
			{
				// Rang� par couleur et par ordre croissant
				verif=(tabOeuf[i].getCouleur()=="rouge" && tabOeuf[i].getNum() < tabOeuf[i+1].getNum());
				i++;
			}
			if(nbOeufs>0) verif=(tabOeuf[nbOeufs-1].getCouleur()=="rouge");
		}
		else verif=false;
		
		
		return verif;
	}
	
	// Cette fonction se charge de lancer le tri it�ratif tout en calculant le temps d'ex�cution.
	public long dureeIteratif()
	{
		long stop, top = System.nanoTime(); 
		int nbEcrit = triIteratif();
		stop = System.nanoTime();
		
		System.out.println("Complexit� " + nbEcrit + ".");
		
		return stop - top; 
	}
	
	// Cette fonction se charge de lancer le tri r�cursif tout en calculant le temps d'ex�cution.
	public long dureeRecursif()
	{
		long stop, top = System.nanoTime(); 
		triRecursif();
		stop = System.nanoTime();
		
		return stop - top; 
	}
	
	// Cette fonction se charge de lancer le tri Super Cool tout en calculant le temps d'ex�cution.
	public long dureeSuperCool(File Jacques)
	{
		long stop, top = System.nanoTime(); 
		int nbEcrit = triSuperCool(Jacques);
		stop = System.nanoTime();
		
		System.out.println("Complexit� " + nbEcrit + ".");
		
		return stop - top; 
	}
	
	
	public static void main(String[] args) 
	{	
		int choix=0;
		
		do
		{
				
			try 
			{
				do 
				{
					// Menu de choix
					System.out.println("**** Bienvenue ****\n Entrer un num�ro :\n" +
							"1 - Dur�e d'un tri it�ratif simple taille 20\n2 - Dur�e d'un tri r�cursif simple taille 20\n" +
							"3 - Dur�e d'un tri am�lior� simple taille 20\n4 - Complexit� moyenne d'un tri it�ratif 1000 fois taille choisie\n" +
							"5 - Quitter");
					
					// Saisie du choix
					BufferedReader entree = new BufferedReader(new InputStreamReader(System.in));
					String valeur = entree.readLine();
					choix = Integer.parseInt(valeur,10);
				}
				// Tant que le choix est incorrect on r�affiche le menu
				while (choix<1 || choix>5);
				
			}
			catch (IOException e) 
			{
				System.out.println ("Erreur de lecture");
			}
			
			// Suivant le choix, ...
			switch(choix)
			{
			case 1 : 
				{
					// On cr�� une file, on l'affiche puis on la trie it�rativement et on l'affiche tri�e.
					File Mounia = new File(20);
					Mounia.genererTab(20);
					Mounia.affichage();
					System.out.println("Dur�e : " + Mounia.dureeIteratif() + "ns.");
					Mounia.affichage();
					break;
				}
			case 2 : 
				{
					// On cr�� une file, on l'affiche puis on la trie r�cursivement et on l'affiche tri�e.
					File Mounia = new File(20);
					Mounia.genererTab(20);
					Mounia.affichage();
					System.out.println("Dur�e : " + Mounia.dureeRecursif() + "ns.");
					Mounia.affichage();
					break;
				}
			case 3 :
				{
					// On cr�� une file, on l'affiche puis on la trie avec le tri super cool et on l'affiche tri�e
					File Mounia = new File(20);
					File Jacques = new File(20);
					Mounia.genererTab(20);
					Mounia.affichage();
					System.out.println("Dur�e : " + Mounia.dureeSuperCool(Jacques) + "ns.");
					Jacques.affichage();
					break;
				}
			case 4 : 
				{
					try 
					{
						// L'utilisateur choisit une taille
						System.out.println("Quelle taille voulez-vous pour votre tableau ?");
						
						BufferedReader entree = new BufferedReader(new InputStreamReader(System.in));
						String valeur = entree.readLine();
						int taille = Integer.parseInt(valeur,10);
						
						File Rodrigo = new File(taille);
						int nbEx, moyEx=0;
						
						// On va cr�er 1000 files de la taille choisie et les trier pour calculer la complexit� de l'algorithme.
						for( int i=0; i < 1000 ; i++)
						{
							Rodrigo.genererTab(taille);
							nbEx=Rodrigo.triIteratif();
							
							// On fait la somme.
							moyEx+=nbEx;
							if(Rodrigo.verifTri())
								System.out.println((i+1) + " tri�.");
							else 
								System.out.println((i+1) + " non tri�.");
						}
						
							// On fait la moyenne.
							System.out.println("\nComplexit� moyenne " + moyEx/1000.0 + "\n");
					}
					catch (IOException e) 
					{
						System.out.println ("Erreur de lecture");
					}
					break;
				}
			}
			
		}
		// Si choix = 5, on quitte
		while(choix!=5);
		
		System.out.println("Fin du programme.");

	}
	
}
