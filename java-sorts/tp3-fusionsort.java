/**
 * 
 */
package pack;

/**
 * @author ny-rova.ratinarivelo
 *
 */
public class Tri {

//-------------------------------------------------TRI FUSION-----------------------------------------------------
	
	public static void triFusion(int tableau[])
    {
    int longueur=tableau.length;
    if (longueur>0)
        {
        triFusion(tableau,0,longueur-1);
        }
    }

private static void triFusion(int tableau[],int deb,int fin)
    {
    if (deb!=fin)
        {
        int milieu=(fin+deb)/2;
        triFusion(tableau,deb,milieu);
        triFusion(tableau,milieu+1,fin);
        fusion(tableau,deb,milieu,fin);
        }
    }

private static void fusion(int tableau[],int deb1,int fin1,int fin2)
    {
    int deb2=fin1+1;

    //on recopie les éléments du début du tableau
    int table1[]=new int[fin1-deb1+1];
    for(int i=deb1;i<=fin1;i++)
        {
        table1[i-deb1]=tableau[i];
        }
    
    int compt1=deb1;
    int compt2=deb2;
    
    for(int i=deb1;i<=fin2;i++)
        {        
        if (compt1==deb2) //c'est que tous les éléments du premier tableau ont été utilisés
            {
            break; //tous les éléments ont donc été classés
            }
        else if (compt2==(fin2+1)) //c'est que tous les éléments du second tableau ont été utilisés
            {
            tableau[i]=table1[compt1-deb1]; //on ajoute les éléments restants du premier tableau
            compt1++;
            }
        else if (table1[compt1-deb1]<tableau[compt2])
            {
            tableau[i]=table1[compt1-deb1]; //on ajoute un élément du premier tableau
            compt1++;
            }
        else
            {
            tableau[i]=tableau[compt2]; //on ajoute un élément du second tableau
            compt2++;
            }
        }
    }
//----------------------------------------------------------------------------------------------------------------

//----------------------------------------------TRI RAPIDE - Quick Short -----------------------------------------

public static void triRapide(int tableau[])
{
int longueur=tableau.length;
triRapide(tableau,0,longueur-1);
}
public static void echanger(int T[], int i, int j)
{
    int m;
    m=T[i];
    T[i]=T[j];
    T[j]=m;
}

private static int partition(int tableau[],int deb,int fin)
{
int compt=deb;
int pivot=tableau[deb];

for(int i=deb+1;i<=fin;i++)
    {
    if (tableau[i]<pivot)
        {
        compt++;
        echanger(tableau,compt,i);
        }
    }
echanger(tableau,deb,compt);
return(compt);
}

private static void triRapide(int tableau[],int deb,int fin)
{
if(deb<fin)
    {
    int positionPivot=partition(tableau,deb,fin);
    triRapide(tableau,deb,positionPivot-1);
    triRapide(tableau,positionPivot+1,fin);
    }
}

//----------------------------------------------------------------------------------------------------------------

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		int tabFusion[]={5,4,1,2,6,3};
		int tabQuickShort[]={6,3,4,2,5,1};
		n=tabFusion.length;
		
// Programme principal TRI FUSION
		
		System.out.println ("----------------TRI FUSION------------------");
		System.out.println ("Voici le tableau non trié :");
		
		for (int i=0; i<n; i++)
			System.out.print (tabFusion[i]+"\t");
		
		triFusion(tabFusion);
		
		System.out.println ("\n\nVoici le tableau trié utilisant l'algorithme de tri fusion :");
		
		for (int i=0; i<n; i++)
			System.out.print (tabFusion[i]+"\t");
		
// Programme principal TRI RAPIDE (QUICK SHORT)
		System.out.println ("\n\n----------------TRI RAPIDE------------------");
		System.out.println ("Voici un autre tableau non trié :");
		
		for (int i=0; i<n; i++)
			System.out.print (tabQuickShort[i]+"\t");
		
		triRapide(tabQuickShort);
		
		System.out.println ("\n\nVoici le tableau trié utilisant l'algorithme de tri rapide :");
		
		for (int i=0; i<n; i++)
			System.out.print (tabQuickShort[i]+"\t");
	}

}

