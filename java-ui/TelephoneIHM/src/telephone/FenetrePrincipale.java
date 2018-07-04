package telephone;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/* 
Gestionnaire d'evenements
	-  Evt fermeture de la fenetre principale 
		-> Effacer la fenetre et sortir du programme  
*/

class GestionEvtFenetrePrinc extends WindowAdapter {
    public void windowClosing(WindowEvent e)
    {
        Window win = e.getWindow();
        win.setVisible(false);
        System.exit(0);
    }
}

public class FenetrePrincipale extends JFrame {
	private static final long serialVersionUID = 6805111091710660489L;

	public FenetrePrincipale(String nomFenetre){
 		super(nomFenetre);
		addWindowListener(new GestionEvtFenetrePrinc());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	public void ajoute(Component c) {
		getContentPane().add(c,BorderLayout.CENTER);
	}
}	