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
		
		// On créé tous les oeufs après avoir créé le tableau
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
			
			// On revient à la ligne tous les 10 oeufs
			if(i%10==0 && i!=0)
				System.out.println();
		}
		System.out.println("\n");
	}
	
	// Fonction de génération aléatoire d'un tableau d'oeufs prenant la taille en paramètre
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
			
			// On définit son numéro, puis sa couleur grâce à Math.random()
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
	
	// Fonction de tri itératif du tableau d'oeufs
	public int triIteratif()
	{
		// Compteur du nombre d'écritures
		int comp=0;
		
		// Tant qu'on a des oeufs à trier (finBlanc!=finPioche)
		while(finBlanc<finPioche)
		{
			// Si l'oeuf est bleu
			if(tabOeuf[finBlanc+1].getCouleur()=="bleu")
			{
				// On sauvegarde l'oeuf
				Oeuf tmp=tabOeuf[finBlanc+1];
				
				// On décale tous les oeufs blancs vers la droite
				for( int i=finBlanc; i>finBleu; i-- ) 
				{
					tabOeuf[i+1]=tabOeuf[i];
					comp++;
				}

				// On place l'oeuf à la fin des bleus
				tabOeuf[finBleu+1]=tmp;
				comp++;
				
				// On incrémente les indices en conséquence
				finBleu++;
				finBlanc++;
			}
			// Si l'oeuf est blanc
			else if (tabOeuf[finBlanc+1].getCouleur()=="blanc")
			{
				// On ne fait que décaler l'indice de fin d'une case vers la droite
				finBlanc++;
			}
			// Si l'oeuf est rouge
			else if (tabOeuf[finBlanc+1].getCouleur()=="rouge")
			{
				// On sauvegarde l'oeuf
				Oeuf tmp=tabOeuf[finBlanc+1];
				
				// On décale tous les oeufs qui le suivent (non triés et rouges) vers la gauche
				for(int i=finBlanc+2; i<nbOeufs; i++)
				{
					tabOeuf[i-1]=tabOeuf[i];
					comp++;
				}
				
				// On le place à la fin du tableau
				tabOeuf[nbOeufs-1]=tmp;
				comp++;
				
				finPioche--;
			}
			
		}
		
		// On retourne le nombre d'écritures
		return comp;
	}
	
	// Fonction de tri récursif du tableau d'oeufs
	public void triRecursif()
	{
		
		// Tant qu'on a des oeufs à trier (finBlanc!=finPioche)
		if(finBlanc<finPioche)
		{
			// Si l'oeuf est bleu
			if(tabOeuf[finBlanc+1].getCouleur()=="bleu")
			{
				// On sauvegarde l'oeuf
				Oeuf tmp=tabOeuf[finBlanc+1];
				
				// On décale tous les oeufs blancs vers la droite
				for( int i=finBlanc; i>finBleu; i-- ) 
				{
					tabOeuf[i+1]=tabOeuf[i];
				}

				// On place l'oeuf à la fin des bleus
				tabOeuf[finBleu+1]=tmp;
				
				// On incrémente les indices en conséquence
				finBleu++;
				finBlanc++;
			}
			// Si l'oeuf est blanc
			else if (tabOeuf[finBlanc+1].getCouleur()=="blanc")
			{
				// On ne fait que décaler l'indice de fin d'une case vers la droite
				finBlanc++;
			}
			// Si l'oeuf est rouge
			else if (tabOeuf[finBlanc+1].getCouleur()=="rouge")
			{
				// On sauvegarde l'oeuf
				Oeuf tmp=tabOeuf[finBlanc+1];
				
				// On décale tous les oeufs qui le suivent (non triés et rouges) vers la gauche
				for(int i=finBlanc+2; i<nbOeufs; i++)
				{
					tabOeuf[i-1]=tabOeuf[i];
				}
				
				// On le place à la fin du tableau
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
		
		// Vérification de la taille du nouveau tableau
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
	
	// Renvoie vrai si le tableau est trié, faux s'il ne l'est pas
	public Boolean verifTri()
	{
		Boolean verif=true;
		int i=0;
		
		// Si la pioche est vide ...
		if(finPioche==finBlanc)
		{
			// Dans la catégorie bleue
			while(verif && i<finBleu-1)
			{
				// Rangé par couleur et par ordre croissant
				verif=(tabOeuf[i].getCouleur()=="bleu" && tabOeuf[i].getNum() < tabOeuf[i+1].getNum());
				i++;
				
			}
			if(finBleu!=-1) verif=(tabOeuf[finBleu].getCouleur()=="bleu");
			
			// Dans la catégorie blanc
			while(verif && i<finBlanc-1)
			{
				// Rangé par couleur et par ordre croissant
				verif=(tabOeuf[i].getCouleur()=="blanc" && tabOeuf[i].getNum() < tabOeuf[i+1].getNum());
				i++;
			}
			if(finBlanc!=-1) verif=(tabOeuf[finBlanc].getCouleur()=="blanc");
			
			// Dans la catégorie rouge
			while(verif && i<nbOeufs-1)
			{
				// Rangé par couleur et par ordre croissant
				verif=(tabOeuf[i].getCouleur()=="rouge" && tabOeuf[i].getNum() < tabOeuf[i+1].getNum());
				i++;
			}
			if(nbOeufs>0) verif=(tabOeuf[nbOeufs-1].getCouleur()=="rouge");
		}
		else verif=false;
		
		
		return verif;
	}
	
	// Cette fonction se charge de lancer le tri itératif tout en calculant le temps d'exécution.
	public long dureeIteratif()
	{
		long stop, top = System.nanoTime(); 
		int nbEcrit = triIteratif();
		stop = System.nanoTime();
		
		System.out.println("Complexité " + nbEcrit + ".");
		
		return stop - top; 
	}
	
	// Cette fonction se charge de lancer le tri récursif tout en calculant le temps d'exécution.
	public long dureeRecursif()
	{
		long stop, top = System.nanoTime(); 
		triRecursif();
		stop = System.nanoTime();
		
		return stop - top; 
	}
	
	// Cette fonction se charge de lancer le tri Super Cool tout en calculant le temps d'exécution.
	public long dureeSuperCool(File Jacques)
	{
		long stop, top = System.nanoTime(); 
		int nbEcrit = triSuperCool(Jacques);
		stop = System.nanoTime();
		
		System.out.println("Complexité " + nbEcrit + ".");
		
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
					System.out.println("**** Bienvenue ****\n Entrer un numéro :\n" +
							"1 - Durée d'un tri itératif simple taille 20\n2 - Durée d'un tri récursif simple taille 20\n" +
							"3 - Durée d'un tri amélioré simple taille 20\n4 - Complexité moyenne d'un tri itératif 1000 fois taille choisie\n" +
							"5 - Quitter");
					
					// Saisie du choix
					BufferedReader entree = new BufferedReader(new InputStreamReader(System.in));
					String valeur = entree.readLine();
					choix = Integer.parseInt(valeur,10);
				}
				// Tant que le choix est incorrect on réaffiche le menu
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
					// On créé une file, on l'affiche puis on la trie itérativement et on l'affiche triée.
					File Mounia = new File(20);
					Mounia.genererTab(20);
					Mounia.affichage();
					System.out.println("Durée : " + Mounia.dureeIteratif() + "ns.");
					Mounia.affichage();
					break;
				}
			case 2 : 
				{
					// On créé une file, on l'affiche puis on la trie récursivement et on l'affiche triée.
					File Mounia = new File(20);
					Mounia.genererTab(20);
					Mounia.affichage();
					System.out.println("Durée : " + Mounia.dureeRecursif() + "ns.");
					Mounia.affichage();
					break;
				}
			case 3 :
				{
					// On créé une file, on l'affiche puis on la trie avec le tri super cool et on l'affiche triée
					File Mounia = new File(20);
					File Jacques = new File(20);
					Mounia.genererTab(20);
					Mounia.affichage();
					System.out.println("Durée : " + Mounia.dureeSuperCool(Jacques) + "ns.");
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
						
						// On va créer 1000 files de la taille choisie et les trier pour calculer la complexité de l'algorithme.
						for( int i=0; i < 1000 ; i++)
						{
							Rodrigo.genererTab(taille);
							nbEx=Rodrigo.triIteratif();
							
							// On fait la somme.
							moyEx+=nbEx;
							if(Rodrigo.verifTri())
								System.out.println((i+1) + " trié.");
							else 
								System.out.println((i+1) + " non trié.");
						}
						
							// On fait la moyenne.
							System.out.println("\nComplexité moyenne " + moyEx/1000.0 + "\n");
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
