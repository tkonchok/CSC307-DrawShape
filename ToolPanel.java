package javiergs.gui.paint.gamma;

import javax.swing.*;
import java.awt.*;

/**
 * ToolPanel creates a panel with a color menu and three radio buttons.
 * This version adds an ActionListener to the color menu and the radio buttons.
 *
 * @author javiergs
 * @version 2.0
 */
public class ToolPanel extends JPanel {
	
	public ToolPanel() {
		String[] colors = {
			"Black", "Red", "Blue", "Green", "Yellow", "Orange", "Pink"
		};
		JComboBox colorMenu = new JComboBox(colors);
		JRadioButton rectangleRadio = new JRadioButton("Rectangle");
		JRadioButton circleRadio = new JRadioButton("Circle");
		JRadioButton arcRadio = new JRadioButton("Arc");
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(rectangleRadio);
		buttonGroup.add(circleRadio);
		buttonGroup.add(arcRadio);
		rectangleRadio.setSelected(true); // new line compared to version 1.0
		setLayout(new GridLayout(7, 1));
		add(colorMenu);
		add(rectangleRadio);
		add(circleRadio);
		add(arcRadio);
		ActionNanny actionNanny = new ActionNanny(); // new line compared to version 1.0
		rectangleRadio.addActionListener(actionNanny); // new line compared to version 1.0
		circleRadio.addActionListener(actionNanny); // new line compared to version 1.0
		arcRadio.addActionListener(actionNanny); // new line compared to version 1.0
		colorMenu.addActionListener(actionNanny); // new line compared to version 1.0
	}
	
}