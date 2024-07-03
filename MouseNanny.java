package javiergs.gui.paint.gamma;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * MouseNanny listens for mouse events.
 * Send information to Officer.
 *
 * @author javiergs
 * @version 2.0
 */
public class MouseNanny implements MouseListener {
	
	public void mouseClicked(MouseEvent e) {
	}
	
	public void mouseEntered(MouseEvent e) {
	}
	
	public void mouseExited(MouseEvent e) {
	}
	
	public void mousePressed(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		Officer.setX(x);
		Officer.setY(y);
	}
	
	public void mouseReleased(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		Officer.setWidth(x - Officer.getX());
		Officer.setHeight(y - Officer.getY());
		Officer.tellYourBoss();
	}
	
}