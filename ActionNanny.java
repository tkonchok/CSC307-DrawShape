package javiergs.gui.paint.gamma;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * ActionNanny listens for action events.
 * Send information to Officer.
 *
 * @author javiergs
 * @version 2.0
 */
public class ActionNanny implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof JMenuItem) {
			String command = e.getActionCommand();
			if (command.equals("Black")) {
				Officer.setColor(Color.BLACK);
			} else if (command.equals("Red")) {
				Officer.setColor(Color.RED);
			} else if (command.equals("Blue")) {
				Officer.setColor(Color.BLUE);
			} else if (command.equals("Green")) {
				Officer.setColor(Color.GREEN);
			} else if (command.equals("Yellow")) {
				Officer.setColor(Color.YELLOW);
			} else if (command.equals("Orange")) {
				Officer.setColor(Color.ORANGE);
			} else if (command.equals("Pink")) {
				Officer.setColor(Color.PINK);
			} else {
				Officer.setShape(e.getActionCommand());
			}
		}
	}
}