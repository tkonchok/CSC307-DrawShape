package javiergs.gui.paint.gamma;

import javax.swing.*;

/**
 * StatusPanel creates a panel with two buttons: Undo and Erase.
 * This version includes an ActionListener.
 *
 * @author javiergs
 * @version 2.0
 */
public class StatusPanel extends JPanel {
	
	public StatusPanel() {
		JButton button1 = new JButton("Undo");
		JButton button2 = new JButton("Erase");
		add(button1);
		add(button2);
		ActionNanny actionNanny = new ActionNanny(); // new line compared to version 1.0
		button1.addActionListener(actionNanny); // new line compared to version 1.0
		button2.addActionListener(actionNanny); // new line compared to version 1.0
	}
	
}