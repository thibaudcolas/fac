package bezier;

public class Courbe {
    public static void main(String s[]){
    	Fenetre f = new Fenetre("Courbe de bézier");
    	
		DessinBezier db = new DessinBezier();
		
		f.ajoute(db);
		f.pack();
		f.setVisible(true);
    }
}

