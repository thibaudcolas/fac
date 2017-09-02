
public class Q2 {


//**********************************************************************************************************************//
//*************************************************** TRI INSERTION ****************************************************//
//**********************************************************************************************************************//
	
	//----------------
	//--  ITERATIF  --
	//----------------
	
	int cherchePlace(int tab[],int oldPlace){
		int val,i;
		boolean depasse=false;
		
		val=tab[oldPlace];
		i=oldPlace-1;
		while(i>0 && !depasse){
			depasse=(tab[i]<=val);
			i=i-1;
		}
		if(depasse)
			return i+2;
		else return 0;			
	}
	
	void decaleEtPlace(int tab[],int newPlace, int oldPlace){
		int ind, deCote;
		
		if(newPlace<oldPlace){
			deCote=tab[oldPlace];
			for(ind=oldPlace-1;ind>=newPlace;ind--){
				tab[ind+1]=tab[ind];				
			}
			tab[newPlace]=deCote;
		}
	}
	
	void triInsertion(int tab[],int nbVal){
		int oldPlace,newPlace;

		for(oldPlace=1;oldPlace<nbVal;oldPlace++){
			newPlace = this.cherchePlace(tab,oldPlace);
			this.decaleEtPlace(tab,newPlace,oldPlace);
		}
	}
	
	
	//----------------
	//--  RECURSIF  --
	//----------------
	
	public static void insertionR(int[] t, int n, int e) {
		   // n nombre d'�l�ments de t
		   // e �l�ment � ins�rer
		   if ((n == 0) || (e >= t[n - 1]))
		      t[n] = e;
		   else {
		      t[n] = t[n - 1];
		      insertionR(t, n - 1, e);
		   }
		}
	
	public static void triInsertionR(int t[], int n) {
		   if (n > 1) {
		      triInsertionR(t, n - 1);
		      insertionR(t, n - 1, t[n - 1]);
		   }
		}
	
//**********************************************************************************************************************//
//*************************************************** TRI SELECTION *******************************************************//
//**********************************************************************************************************************//
	
	//----------------
	//--  ITERATIF  --
	//----------------
	
	private int selection(int tab[],int indDebut,int indFin){
		int indDuMin,ind;
		indDuMin=indDebut;
		for(ind=indDebut;ind<indFin;ind++){
			if(tab[indDuMin]>tab[ind]){
				indDuMin=ind;
			}
		}
		return indDuMin;
	}
	
	private void echange(int tab[],int courant, int indDuMin){
		int tmp=tab[courant];
		tab[courant]=tab[indDuMin];
		tab[indDuMin]=tmp;
	}
	
	public void triSelection(int tab[],int nbVal){
		int indDuMin, courant;
		for(courant=0;courant<nbVal;courant++){
			indDuMin=this.selection(tab,courant,nbVal);
			this.echange(tab,courant,indDuMin);
		}
	}
	
	//----------------
	//--  RECURSIF  --
	//----------------
	
	public static int max(int tab[], int taille)
	{
	    // on consid�re que le plus grand �l�ment est le premier
	    int i=0, indice_max=0;
	    
	    while(i < taille)
	    {
	        if(tab[i] > tab[indice_max])
	            indice_max = i;
	        i++;
	    }
	    
	    return indice_max;
	}

	public static void echanger(int tab[], int x, int y)
	{
	    int tmp;
	    
	    tmp = tab[x];
	    tab[x] = tab[y];
	    tab[y] = tmp;
	}

	public static Object triSelectionR(int tab[], int taille)
	{
	    // un tableau d'un seul �l�ment ou moins n'a pas besoin d'�tre tri�
	    if(taille <= 1)
	        return null;
	    
	    echanger(tab, taille-1, max(tab, taille)); // on �change le dernier �l�ment avec le plus grand
	    
	    // on rappelle la fonction en diminuant la taille du tableau
	    // on peut faire cela car on est certain que le dernier �l�ment
	    // est le plus grand (donc plus besoin de le d�placer)
	    return triSelectionR(tab, taille-1);
	}

	
//**********************************************************************************************************************//
//**************************************************** TRI A BULLES ****************************************************//
//**********************************************************************************************************************//
	
	public void triBulles(int tab[],int nbVal){
		int i,j,tmp;
		
		for(i=1;i<=nbVal-1;i++){
			for(j=1;j<=nbVal-i;j++){
				if(tab[j-1]>tab[j]){
					tmp=tab[j-1];
					tab[j-1]=tab[j];
					tab[j]=tmp;
				}
			}
		}	
	}	
	
	
//**********************************************************************************************************************//
//*************************************************** TRI PAR FUSION ***************************************************//
//**********************************************************************************************************************//
		
	//----------------
	//--  ITERATIF  --
	//----------------
	
	
	// =>>>> MARCHE PAS 
	
	private static void fusionInterneTab(int tab[],int nbVal,int debut,int inter,int fin){
		int i,j,k;
		int tmp[]=new int [8];
		
		i=debut;
		j=inter+1;
		k=1;
		while(i<=inter && j<=fin){
			if(tab[i]<tab[j]){
				tmp[k]=tab[i];
				i=j+1;				
			}
			else{
				tmp[k]=tab[j];
				j=j+1;
			}
		}
		k=k+1;
		if(i<=inter){
			for(j=i;j<=inter;j++){
				tmp[k]=tab[j];
				k=k+1;
			}
		}
		else{
			for(i=j;i<=fin;i++){
				tmp[k]=tab[i];
				k=k+1;
			}
		}
		for(k=1;k<=fin-debut+1;k++){
			tab[debut+k-1]=tmp[k];
		}
	}
	
	public static void triFusionIt(int tab[],int nbVal){
		int debut,fin,taille;
		
		taille=1;
		while(taille<nbVal){
			debut=1;
			while(debut+taille-1<nbVal){
				fin=debut+2*taille-1;
				if(fin>nbVal){
					fin=nbVal;
				}
				fusionInterneTab(tab,nbVal,debut,debut+taille-1,fin);
				debut=debut+2*taille;
			}
			taille=2*taille;		
		}
	}
	
	
	//----------------
	//--  RECURSIF  --
	//----------------
	
    /**
     *  On fusionne <strong>r�cursivement<strong> 2 par 2  des sous-tableaux adjacents pr�alablement tri�s.
     *  
     *  @param tableau correspond au talbeau qui devrat �tre tri�.
     */
	public static void triFusionRecursif(int tableau[]){
    	int longueur=tableau.length; // Correspond � la taille du tableau ( Max indice +1 ).
    	if (longueur>0) {
    		triFusion(tableau,0,longueur-1);
        }
    }
		
	/**
	 * On fusionne successivement 2 par 2 les sous-tableaux adjacents pr�alablement tri�s.
	 * 
	 * @param tableau Correspond au tableau qui doit �tre tri� r�cusivement.
	 * @param deb Correspond � l'indice de d�but.
	 * @param fin Correspond � l'indice de fin.
	 */
	private static void triFusion(int tableau[],int deb,int fin){
	    if (deb!=fin){
	        int milieu=(fin+deb)/2;
	        triFusion(tableau,deb,milieu);
	        triFusion(tableau,milieu+1,fin);
	        fusion(tableau,deb,milieu,fin);
	    } 
    }
	/**
     * Fusion de "deux tableaux" � trier.
     * 
     * @param tableau Correspond au tableau principal qui sera scind� en deux Sous tableaux. 
     * @param deb1 Correspond � l'indice de d�but du premier tableau.
     * @param fin1 Correspond � l'indice de fin du premier tableau.
     * @param fin2 Correspond � l'indice de fin du deuxieme tableau.
     */
	private static  void fusion(int tableau[], int deb1, int fin1,int fin2){
	    int deb2=fin1+1; // Initialisation de l'indice de d�but du deuxieme tableau.
	
	    int tab1[]= new int[fin1-deb1+1]; // On recopie les �l�ments du d�but du tableau.
	    
	    // On parcourt la contenu du premier sous tableau..
	    for(int i=deb1;i<=fin1;i++){
	        tab1[i-deb1] = tableau[i];
	    }
	    
	    int compt1=deb1;
	    int compt2=deb2;
	    
	    for(int i=deb1;i<=fin2;i++){        
	    	//c'est que tous les �l�ments du premier tableau ont �t� utilis�s
	    	if (compt1==deb2){
	            break; //tous les �l�ments ont donc �t� class�s    
	    	}
	    	//c'est que tous les �l�ments du second tableau ont �t� utilis�s
	        else if (compt2==(fin2+1)){
	            tableau[i]=tab1[compt1-deb1]; //on ajoute les �l�ments restants du premier tableau
	            compt1++;
	        }
	        else if (tab1[compt1-deb1]<tableau[compt2]){
	            tableau[i]=tab1[compt1-deb1]; //on ajoute un �l�ment du premier tableau
	            compt1++;
	        }
	        else{
	            tableau[i]=tableau[compt2]; //on ajoute un �l�ment du second tableau
	            compt2++;   
	        }	
	    }   
    }


//**********************************************************************************************************************//
//*************************************************** TRI RAPIDE *******************************************************//
//**********************************************************************************************************************//
		
	//----------------
	//--  ITERATIF  --
	//----------------
	
		 /*public static void quicksort(int []t, int l,int r){

		        if (r<=l)return;

		        int p=partition(t,l,r);

		        quicksort(t,l,p-1);

		        quicksort(t,p+1,r);

		 }

		 public static void echange(int[]t,int i,int j){

		        int tmp=t[i];

		        t[i]=t[j];

		        t[j]=tmp;

		 }

		    // partition de t[l,r]

		    // prendre t[r] comme pivot

		    // mettre tous les �l�ments <= t[r] dans t[l,x]

		    // mettre tous les �l�ments >= � t[r] dans t[x+1,r]

		    // retourner x

		    public static int partition(int []t,int l, int r){

		        int i=l-1;

		        int j=r;

		        int p=t[r];

		        while(true){

		            while (t[++i]<p);

		            // i indice du premier � droite >= p

		            while (p < t[--j])if (j==l) break;

		            // j indice du premier � gauche <= p

		            if (i>=j)break;

		            // �changer ces �l�ments

		            echange(t,i,j);

		            // tous les t[l,i] sont inf�rieurs ou �gaux � p

		            // tous les t[j,r] sont sup�rieurs ou �gaux � p

		        }

		        // tous les t[l,i[ sont inf�rieurs � p

		        // tous les t]j,r-1] sont sup�rieurs � p

		        // (i=j) ou (j==l)

		        echange(t,i,r);

		        // tous les t[1,i] sont inf�rieurs ou �gaux � p

		        // tous les t[i+1,j] sont sup�rieurs ou �gaux � p

		        return i;

		    }*/
	
	
	//----------------
	//--  RECURSIF  --
	//----------------
	
	public static void quicksort(int [] tableau, int d�but, int fin) {
	    if (d�but < fin) {
	        int indicePivot = partition(tableau, d�but, fin);
	        quicksort(tableau, d�but, indicePivot-1);
	        quicksort(tableau, indicePivot+1, fin);
	    }
	}
	 
	public static int partition (int [] t, int d�but, int fin) {
	    int valeurPivot = t[d�but];
	    int d = d�but+1;
	    int f = fin;
	    while (d < f) {
	        while(d < f && t[f] >= valeurPivot) f--;
	        while(d < f && t[d] <= valeurPivot) d++;
	        int temp = t[d];
	        t[d]= t[f];
	        t[f] = temp;
	    }
	    if (t[d] > valeurPivot) d--;
	    t[d�but] = t[d];
	    t[d] = valeurPivot;
	    return d;
	}


	
	
	
	
	
	
//---------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tab[]={5,2,4,3,1};
		for(int i=0;i<5;i++){
			System.out.println(tab[i] + " ");
		}
		System.out.println("");
		
		//tris fusion
		
		//triFusionRecursif(tab);
		//triFusionIt(tab, 4);
		//for(int i=0;i<5;i++){
		//	System.out.println(tab[i] + " ");
		//}
		
		int d�but =0, fin =4;
		quicksort(tab, d�but, fin);
		for(int i=0;i<5;i++){
			System.out.println(tab[i] + " ");
		}
		
		
		
		
		
		
		/*
		 int main(void)
		{ POUR QUICKSORT
			    int tab[5] = {5, 3, 4, 1, 2};
			    int i;
			
			    quickSort(tab, 0, 4);
			    
			    for(i = 0; i < 5; i++)
			    {
				printf("%d ", tab[i]);
			    }
			    putchar('\n');
			    
			    return 0;
		}

		 
		 */
		 
	}
	
}

//System.nanoTime();

//developpez
//codesource

