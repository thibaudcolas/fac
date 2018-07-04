/**
 * 
 */
package bezier;

import java.awt.*;
import java.awt.geom.*;

/**
 * @author tcolas
 *
 */
public class Poignee extends Rectangle {

	public static int taille = 3;
	
	public Poignee(Point2D p) {
		this.setFrameFromCenter(p, new Point((int)p.getX() + taille, (int)p.getY() + taille));
	}
}
