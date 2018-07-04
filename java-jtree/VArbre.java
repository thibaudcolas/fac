/* 
   Squelette 1 pour commencer le TP toolkit et architecture
*/

import javax.swing.*;
import javax.swing.tree.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class VArbre extends JPanel
{
    public VArbre() 
    {
        JTree tree; 
        DefaultMutableTreeNode rootNode;
        DefaultMutableTreeNode parentNode;
        DefaultMutableTreeNode node;
        Font f;
        
        f = new Font("SanSerif",Font.PLAIN,14);
        setFont(f);

        setLayout(new BorderLayout());
        
        rootNode = new DefaultMutableTreeNode("A partir d'un arbre, faire");
        
        parentNode = new DefaultMutableTreeNode("1.Selection");
        
        node = new DefaultMutableTreeNode("Selection Simple",false);
        parentNode.add(node);
        
        node = new DefaultMutableTreeNode("Selection Multiple",false);
        parentNode.add(node);
        
        rootNode.add(parentNode);
        
        parentNode = new DefaultMutableTreeNode("2.Expansion");
        
        node = new DefaultMutableTreeNode("Ajouter un message à chaque expansion",false);
        parentNode.add(node);
        
        node = new DefaultMutableTreeNode("Ajouter un message à chaque réduction",false);
        parentNode.add(node);
        
        rootNode.add(parentNode);
        
        parentNode = new DefaultMutableTreeNode("3.Icones");
        node = new DefaultMutableTreeNode("Ajouter un icone pour le premier noeud",false);
        parentNode.add(node);
        
        rootNode.add(parentNode);

        parentNode = new DefaultMutableTreeNode("4.Vues Multiples");
        node = new DefaultMutableTreeNode("Ajouter une deuxième vue du même arbre",false);
        parentNode.add(node);
        
        rootNode.add(parentNode);

        tree = new JTree(new DefaultTreeModel(rootNode));
        tree.setFont(f);
        
        add(new JScrollPane(tree),"Center");
    }

    public Dimension getPreferredSize()
    {
        return new Dimension(500, 300);
    }
    
    public static void main(String s[])
    {
        JFrame frame = new JFrame("TD Swing");
        VArbre panel = new VArbre();
 	  try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
/* Pour les inconditionnels de motif/CDE
		UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
    		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
*/		SwingUtilities.updateComponentTreeUI(panel);
	  } catch (Exception exc2) {
		    exc2.printStackTrace();
		    System.err.println("Could not load LookAndFeel: ");
		    exc2.printStackTrace();
	 }

        
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setForeground(Color.black);
        frame.setBackground(Color.lightGray);
        frame.getContentPane().add(panel,"Center");
        
        frame.setSize(panel.getPreferredSize());
        frame.setVisible(true);
        frame.addWindowListener(new WindowCloser());
    }
}

class WindowCloser extends WindowAdapter
{
    public void windowClosing(WindowEvent e)
    {
        Window win = e.getWindow();
        win.setVisible(false);
        System.exit(0);
    }
}

