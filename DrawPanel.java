package javiergs.gui.paint.gamma;

import javax.swing.*;
import java.awt.*;

/**
 * DrawPanel creates a panel where the drawing is done.
 * According to the data in Officer.
 *
 * @author javiergs
 * @version 3.0
 */
public class DrawPanel extends JPanel {
	
	public DrawPanel() {
		setBackground(new Color(176, 250, 192));
	}
	
	@Override
	public void paintComponent(Graphics g) {
		System.out.println("Tell your boss to repaint. DOING!");
		
		super.paintComponents(g);
		g.setColor(new Color(176, 250, 192));
		g.fillRect(0, 0, getWidth(), getHeight());
		g.setColor(Officer.getColor());
		if (Officer.getShape().equals("Rectangle")) {
			g.fillRect(Officer.getX(), Officer.getY(), Officer.getWidth(), Officer.getHeight());
		} else if (Officer.getShape().equals("Circle")) {
			g.fillOval(Officer.getX(), Officer.getY(), Officer.getWidth(), Officer.getHeight());
		} else {
			g.fillArc(Officer.getX(), Officer.getY(), Officer.getWidth(), Officer.getHeight(), 0, 180);
		}
	}
	
}