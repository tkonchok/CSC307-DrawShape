package javiergs.gui.paint.gamma;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * MouseNanny listens for mouse events to facilitate drawing operations.
 * Sends information to Officer for handling drawing actions.
 *
 * @author javiergs
 * @version 1.0
 */
public class MouseNanny implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		// Not used in this implementation
	}

	@Override
	public void mousePressed(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		Officer.setX(x);
		Officer.setY(y);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		Officer.setWidth(x - Officer.getX());
		Officer.setHeight(y - Officer.getY());
		Officer.performDrawAction(); // Perform drawing action on mouse release
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// Not used in this implementation
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// Not used in this implementation
	}
}
