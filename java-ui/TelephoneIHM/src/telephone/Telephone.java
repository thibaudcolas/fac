package telephone;

public class Telephone {
    public static void main(String s[]){
    	FenetrePrincipale fp = new FenetrePrincipale("Téléphone");
		//Ecrivez votre propre classe Contenu 
		Contenu c = new Contenu();
		
		fp.ajoute(c);
		fp.pack();
		fp.setVisible(true);
    }
}


