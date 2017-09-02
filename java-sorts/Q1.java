
public class Q1 {

	//QUESTION 1
	
//**********************************************************************************************************************//
//*************************************************** FACTORIELLE ******************************************************//
//**********************************************************************************************************************//
			
	
	public static int factorielleIt(int val){
		int facto=1;
		
		for(int i=1; i<=val; i++){
			facto=facto*i;
		}
		return facto;
	}
	
	public static int factorielleR(int val){
		
		return val;
	}
	
//**********************************************************************************************************************//
//*************************************************** SOMME CHIFFRE ****************************************************//
//**********************************************************************************************************************//
			
	
	//----------------
	//--  ITERATIF  --
	//----------------
	
	public static int SommeIt(int n){
		int somme=0;
		while(n>0){
			int i=n%10;
			somme=somme+i;
			n=n/10;
		}
		return somme;
	}
	
	
	//----------------
	//--  RECURSIF  --
	//----------------
	
	public static int SommeR(int n){
		int somme;
		if(n>0){
			somme=(n%10)+SommeR(n/10);
		}
		else{
			somme=0;
		}
		
		return somme;
	}
	
//**********************************************************************************************************************//
//*************************************************** FIBONACCI ********************************************************//
//**********************************************************************************************************************//
		

	//----------------
	//--  ITERATIF  --
	//----------------
	
	public static int fiboIt(int n){
	
		int a=0,b=1,cpt=0,c=0;
			while (cpt <= n){
				if (cpt < 2){
					c = cpt;
				}
					else {
						c=a+b;
						a=b;
						b=c;
					}
			cpt+=1;
			}
			return c;
	}
	
	//----------------
	//--  RECURSIF  --
	//----------------
	
	public static int fiboR(int n){
		if(n<=1) return n;
		else return fiboR(n-1)+fiboR(n-2);
	}
	
//---------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------
	
	//QUESTION 2
	
	//---> ACKERMAN
	
	public static int ack(int m, int n){
		if(m==0){ 
			return n+1;
		}
		else if(n==0){
			return ack(m-1,1);
		}
		else{
			return ack(m-1,ack(m,n-1));
		}
		
	}
	
//---------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------

	//QUESTION 3
	
//**********************************************************************************************************************//
//*************************************************** TRI INSERTION ****************************************************//
//**********************************************************************************************************************//
			

	//----------------
	//--  RECURSIF  --
	//----------------
	
	public static void insertionR(int[] t, int n, int e) {
		   // n nombre d'éléments de t
		   // e élément à insérer
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
	//--  RECURSIF  --
	//----------------
	
	public static int max(int tab[], int taille)
	{
	    // on considère que le plus grand élément est le premier
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
	    // un tableau d'un seul élément ou moins n'a pas besoin d'être trié
	    if(taille <= 1)
	        return null;
	    
	    echanger(tab, taille-1, max(tab, taille)); // on échange le dernier élément avec le plus grand
	    
	    // on rappelle la fonction en diminuant la taille du tableau
	    // on peut faire cela car on est certain que le dernier élément
	    // est le plus grand (donc plus besoin de le déplacer)
	    return triSelectionR(tab, taille-1);
	}

//---------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------

	//QUESTION 5

//**********************************************************************************************************************//
//*************************************************** INVERSION ********************************************************//
//**********************************************************************************************************************//

	//----------------
	//--  RECURSIF  --
	//----------------
	
	public static void inversionR(int[]tab,int n, int p){
		int aux;
		if(n<p){
			aux=tab[n];
			tab[n]=tab[p];
			tab[p]=aux;
			inversionR(tab,n+1,p-1);
		}
			
	}
	
//---------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//QUESTION 1
		
		//System.out.println(factorielleIt(3));
		//System.out.println(factorielleR(3));
		//System.out.println(SommeIt(124));
		//System.out.println(SommeR(124));
		//System.out.println(fiboR(3));
		//System.out.println(fiboIt(4));
		
		
		//QUESTION 2
		
		//System.out.println(ack(1,5));
		
		
		//QUESTION 3
		
		
		int tab[]={5,2,4,3,1};
		for(int i=0;i<5;i++){
			System.out.println(tab[i] + " ");
		}
		System.out.println("");
		
		//tris insertion
		
		//triInsertionR(tab, 5);
		//for(int i=0;i<5;i++){
		//	System.out.println(tab[i] + " ");
		//}
		
		//tris selection
		
		//triSelectionR(tab, 5);
		//for(int i=0;i<5;i++){
		//	System.out.println(tab[i] + " ");
		//}
		
		
		
		//QUESTION 5
		
		
		
		//inversion Recursive
		int n=0;
		int p=4;
		inversionR(tab,n, p);
		for(int i=0;i<5;i++){
			System.out.println(tab[i] + " ");
		}
		
		
	}

}