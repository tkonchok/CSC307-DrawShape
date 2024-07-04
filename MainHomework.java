package javiergs.gui.paint.gamma;

import javax.swing.*;
import java.awt.*;

/**
 * MainHomework creates a frame and adds three panels to it.
 * This version adds MouseListener to the DrawPanel.
 *
 * @author javiergs
 * @version 2.0
 */
public class MainHomework extends JFrame {

	public static void main(String[] args) {
		MainHomework app = new MainHomework();
		app.setSize(800, 600);
		app.setTitle("Shape Drawing");
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setResizable(false);
		app.setVisible(true);
	}

	public MainHomework() {
		JPanel drawPanel = new DrawPanel();
		MouseNanny mouseNanny = new MouseNanny(); // new line compared to version 1.0
		drawPanel.addMouseListener(mouseNanny); // new line compared to version 1.0
		drawPanel.addMouseMotionListener(mouseNanny);
		Officer.setDrawPanel(drawPanel); // new line compared to version 2.0
		setLayout(new BorderLayout());
		add(drawPanel, BorderLayout.CENTER);

		MenuBar menuBar = new MenuBar();
		setJMenuBar(menuBar);




	}

}
