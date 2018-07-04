package telephone;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;


public class Contenu extends JPanel implements ActionListener {
	
	private static final long serialVersionUID = -7839043326433786473L;
	
	/**
	 * Taille des boutons.
	 */
	static private int dimBtnH = 30;
	static private int dimBtnL = 120;
	
	private boolean communication = false;
	
	private JPanel boxNord, boxCentre, boxSud;
	
	/**
	 * Nord : Barres de menu et d'outils.
	 */
	private JMenuBar menu;
	private JMenu fichier, edition, aide;
	private JToolBar outils;
	private JButton copier, couper, coller, aide2;
	
	/**
	 * Centre : Boutons.
	 */
	private JButton raccrocher, decrocher, details;
	private JComboBox combo;
	
	/** 
	 * Sud : Onglets et barre d'état.
	 */
	private JTabbedPane tabs;
	private DefaultListModel modele;
	private JList repertoire, messagerie, configuration;
	private JLabel etat;
	
	/**
	 * Nord : Barres de menu et d'outils.
	 */
	private JPanel nord() {
		// Barre de menu supérieure
		menu = new JMenuBar();
		fichier = new JMenu("Fichier");
		edition = new JMenu("Edition");
		aide = new JMenu("Aide");
		
		menu.add(fichier);
		menu.add(edition);
		menu.add(aide);
		
		// Barre d'outils : images des boutons
		outils = new JToolBar();
		outils.setFloatable(false);
		copier = new JButton(new ImageIcon("icones/Copy24.gif"));
		couper = new JButton(new ImageIcon("icones/Cut24.gif"));
		coller = new JButton(new ImageIcon("icones/Paste24.gif"));
		aide2 = new JButton(new ImageIcon("icones/Help24.gif"));
		
		//Infobulle des boutons
		copier.setToolTipText("copier");
		couper.setToolTipText("Couper");
		coller.setToolTipText("Coller");
		aide2.setToolTipText("Aide");
		
		outils.add(copier);
		outils.add(couper);
		outils.add(coller);
		outils.add(aide2);
		
		boxNord = new JPanel();
		boxNord.setLayout(new BorderLayout());
		boxNord.add(menu, BorderLayout.NORTH);
		boxNord.add(outils, BorderLayout.SOUTH);
		
		return boxNord;
	}
	
	/**
	 * Centre : Boutons.
	 */
	private JPanel centre() {
		
		raccrocher = new JButton("Raccrocher");
		decrocher = new JButton("Décrocher");
		details = new JButton("Détails +/-");
		
		// Changement de couleur, bordure, taille, action.
		raccrocher.setBackground(Color.lightGray);
		raccrocher.setBorder(new EtchedBorder());
		raccrocher.setPreferredSize(new Dimension(dimBtnL,dimBtnH));
		raccrocher.addActionListener(this);
		decrocher.setBackground(Color.lightGray);
		decrocher.setBorder(new EtchedBorder());
		decrocher.setPreferredSize(new Dimension(dimBtnL,dimBtnH));
		decrocher.addActionListener(this);
		details.setBackground(Color.lightGray);
		details.setBorder(new EtchedBorder());
		details.setPreferredSize(new Dimension(dimBtnL,dimBtnH));
		details.addActionListener(this);
		
		// Combobox de saisie du numéro.
		combo = new JComboBox();
		combo.setEditable(true);
		combo.addActionListener(this);
		combo.setBackground(Color.lightGray);
		combo.setBorder(new EtchedBorder());
		combo.setPreferredSize(new Dimension(dimBtnL,dimBtnH));
		
		combo.addItem("0123456789");
		combo.addItem("9876543210");
		
		boxCentre = new JPanel();
		boxCentre.setPreferredSize(new Dimension(500,dimBtnH*2));
		boxCentre.add(raccrocher);
		boxCentre.add(combo);
		boxCentre.add(decrocher);
		boxCentre.add(details);
		
		return boxCentre;
	}
	
	/** 
	 * Sud : Onglets et barre d'état.
	 */
	private JPanel sud() {
		// Ajout des informations dans la liste.
		modele = new DefaultListModel();
		modele.addElement("00000000" + " " + "Pierre");
		modele.addElement("11111111" + " " + "Jacques");
		modele.addElement("22222222" + " " + "Paul");
		
		repertoire = new JList(modele);
		messagerie = new JList();
		configuration = new JList();
		
		// Modification des onglets.
		tabs = new JTabbedPane();
		tabs.setPreferredSize(new Dimension(300,200));
		tabs.setBackground(Color.lightGray);
		tabs.addTab("Répertoire", repertoire);
		tabs.addTab("Messagerie vocale", messagerie);
		tabs.addTab("Configuration", configuration);
	
		etat = new JLabel("Etat : Hors communication");
		etat.setForeground(new Color(160,160,240));
		
		boxSud = new JPanel();
		boxSud.setLayout(new BorderLayout());
		boxSud.add(tabs, BorderLayout.NORTH);
		boxSud.add(etat, BorderLayout.SOUTH);
		
		return boxSud;
	}
	
	/**
	 * Constructeur.
	 */
	public Contenu() {
		setLayout(new BorderLayout());
		add(nord(), BorderLayout.NORTH);
		add(centre(), BorderLayout.CENTER);
		add(sud(), BorderLayout.SOUTH);
	}

	public void actionPerformed(ActionEvent ae) {
		Object source = ae.getSource();
		if (source == raccrocher) {
			communication = false;
			etat.setText("Etat : Hors communication");
			raccrocher.setEnabled(false);
			decrocher.setEnabled(true);
		}
		else if (source == decrocher) {
			communication = true;
			// TODO Affichage du numéro
			etat.setText("Etat : En communication avec " + "0000000");
			decrocher.setEnabled(false);
			raccrocher.setEnabled(true);
			// TODO Ajouter le transfert du numéro vers l'historique
		}
		else if (source == details) {
			tabs.setVisible(!tabs.isVisible());
			// TODO Faire disparaître le vide créé.
		}
		else if (source == combo) {
			combo.addItem(combo.getSelectedItem());
			
		}
	}
}
