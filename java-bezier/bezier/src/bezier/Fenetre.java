package bezier;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class GestionEvtFenetrePrinc extends WindowAdapter {
    public void windowClosing(WindowEvent e)
    {
        Window win = e.getWindow();
        win.setVisible(false);
        System.exit(0);
    }
}

public class Fenetre extends JFrame {
	private static final long serialVersionUID = 6805111091710660489L;

	public Fenetre(String nomFenetre){
 		super(nomFenetre);
 		setLocation(300,300);
		addWindowListener(new GestionEvtFenetrePrinc());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	public void ajoute(Component c) {
		getContentPane().add(c,BorderLayout.CENTER);
	}
}	