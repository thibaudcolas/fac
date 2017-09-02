package forest;

/**
 * @author Mounia Nait Djoudi & Thibaud Colas
 * @lien http://prevert.upmf-grenoble.fr/Prog/Java/CoursJava/arbresBinaires.html
 */
public class ArbreBinaire 
{

	private int etiquette;
	private ArbreBinaire brancheGauche;
	private ArbreBinaire brancheDroite;
	
	
	/**
	 * @param etiq, gauche, droite
	 */
	public ArbreBinaire(int etiq, ArbreBinaire gauche, ArbreBinaire droite) 
	{    
        etiquette = etiq;
        brancheGauche = gauche;
        brancheDroite = droite;
        
	}
	
	public int getEtiquette()
	{
		return etiquette;
	}
	
	public ArbreBinaire getGauche()
	{
		return brancheGauche;
	}
	
	public ArbreBinaire getDroite()
	{
		return brancheGauche;
	}
	/*
	public String toString()
	{
		String s="";
		
		if(brancheGauche != null)
			s+="|";
		
		s+=etiquette;
		
		if(brancheDroite != null)
			s+="|";
		
		return s;
	}
	*/
	
	public String toString() 
	{
		return "Mounia";
	}
	
	public void affichageParenthese()
	{
		StringBuffer s = new StringBuffer();
		if (this!=null) 
		{
			s.append(etiquette); 
			if ((this.brancheGauche!=null) || (this.brancheDroite!=null)) 
			{
				s.append('(');
				if (this.brancheGauche!=null) s.append(brancheGauche.toString());
				s.append(',');
				if (this.brancheDroite!=null) s.append(brancheDroite.toString());
				s.append(')');
			}
		}
		
		System.out.println(new String(s));
	}
	
	public void affichagePrefixe()
	{	
		System.out.println(this);
		
	}
	
	public void affichageInfixe()
	{
		affichageInfixe(this);
	}

	public void affichageInfixe(ArbreBinaire AB)
	{
		if (AB!=null) 
		   {
		      affichageInfixe(AB.brancheGauche); 
		      System.out.print(AB.etiquette +" ");
		      affichageInfixe(AB.brancheDroite);
		   }
	}

		 
	public void affichagePostfixe()
	{
		
	}
	
	public int hauteurArbre()
	 {  
		if (this==null) return 0;
		else return Math.max(brancheGauche.hauteurArbre(), brancheDroite.hauteurArbre()) + 1;
	 }


	public static void main(String[] args) 
	{
		
		ArbreBinaire Six = new ArbreBinaire(6, null, null);
		ArbreBinaire Sept = new ArbreBinaire(7, null, null);
		ArbreBinaire Cinq = new ArbreBinaire(5, null, Six);
		ArbreBinaire Trois = new ArbreBinaire(3, Cinq, Sept);
		ArbreBinaire Quatre = new ArbreBinaire(4, null, null);
		ArbreBinaire Deux = new ArbreBinaire(2, Quatre, null);
		ArbreBinaire Un = new ArbreBinaire(1, Deux, Trois);
		
		Un.affichageInfixe();
		System.out.println("\n" + Un.hauteurArbre());
		
		
	}

}
