package paque;

public class Oeuf 
{
	// Un oeuf a pour attributs son numéro et sa couleur
	private int num;
	private String couleur;
	
	public Oeuf() 
	{
		
	}
	
	public Oeuf(int n, String coul) 
	{
		num=n;
		couleur=coul;
	}
	
	public int getNum()
	{
		return num;
	}
	
	public void setNum(int i)
	{
		num=i;
	}
	
	public String getCouleur()
	{
		return couleur;
	}
	
	public void setCouleur(String txt)
	{
		couleur=txt;
	}
	
	// Fonction toString redéfinie pour faciliter l'affichage
	public String toString()
	{
		return num + " : " + couleur;
	}
}

