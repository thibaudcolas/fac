package bezier;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.*;
import java.util.*;

import javax.sound.sampled.Line;
import javax.swing.*;

/**
 * @author tcolas
 * @date 20/10/11
 *
 */
public class DessinBezier extends JPanel {

	private static final long serialVersionUID = 1L;
	
	ArrayList<Poignee> poignees;
	
	private Point2D ori;
	private Point2D fin;
	private Point2D ctl1;
	private Point2D ctl2;
	private CubicCurve2D.Double courbeBezier;
	
	private Line2D.Double l1;
	private Line2D.Double l2;

	public DessinBezier() {
		
		poignees = new ArrayList<Poignee>();
		
		ori = new Point(51,51);
		fin = new Point(450,375);
		ctl1 = new Point(230,180);
		ctl2 = new Point(25,300);
		
		poignees.add(new Poignee(ori));
		poignees.add(new Poignee(fin));
		poignees.add(new Poignee(ctl1));
		poignees.add(new Poignee(ctl2));
		
		l1 = new Line2D.Double(ori.getX(), ori.getY(), ctl1.getX(), ctl1.getY());
		l2 = new Line2D.Double(ctl2.getX(), ctl2.getY(), fin.getX(), fin.getY());
		
		courbeBezier = new CubicCurve2D.Double(ori.getX(), ori.getY(), ctl1.getX(), ctl1.getY(), ctl2.getX(), ctl2.getY(), fin.getX(), fin.getY());		
		setPreferredSize(new Dimension(500,500));
	}
	
	public void paint(Graphics g)
	{
		Graphics2D g2D = (Graphics2D)g;
		
		g2D.setPaint(Color.blue);
		g2D.draw(courbeBezier);
		
		g2D.setPaint(Color.pink);
		g2D.draw(l1);
		g2D.draw(l2);
		
		g2D.setPaint(Color.red);
		for(Poignee p : poignees) {
			g2D.draw(p);
			g2D.fill(p);
		}
	}

	public Component pick(int x, int y) {
		return getComponentAt(x, y);
	}
}
