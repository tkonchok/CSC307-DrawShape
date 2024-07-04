package javiergs.gui.paint.gamma;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * DrawPanel creates a panel where the drawing is done.
 * According to the data in Officer.
 *
 * Author: javiergs
 * Version: 3.0
 */
public class DrawPanel extends JPanel {

	public DrawPanel() {
		setBackground(new Color(176, 250, 192));
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		ArrayList<Officer.DrawAction> list = new ArrayList(Officer.undoStack);

		for (Officer.DrawAction action : list) {
			action.draw(g);
		}

		if (Officer.isDrawingOutline) {
			g.setColor(Color.BLACK); // Outline color
			switch (Officer.getShape()) {
				case "Rectangle":
					g.drawRect(Officer.outlineX, Officer.outlineY, Officer.outlineWidth, Officer.outlineHeight);
					break;
				case "Circle":
					g.drawOval(Officer.outlineX, Officer.outlineY, Officer.outlineWidth, Officer.outlineHeight);
					break;
				case "Arc":
					g.drawArc(Officer.outlineX, Officer.outlineY, Officer.outlineWidth, Officer.outlineHeight, 0, 180);
					break;
			}
		}
	}
}
