package javiergs.gui.paint.gamma;

import javax.swing.*;

/**
 * StatusPanel creates a panel with two buttons: Undo and Redo.
 * This version includes an ActionListener.
 *
 * Author: javiergs
 * Version: 2.0
 */
public class StatusPanel extends JPanel {

    private JButton undoButton;
    private JButton redoButton;

    public StatusPanel() {
        undoButton = new JButton("Undo");
        redoButton = new JButton("Redo");
        add(undoButton);
        add(redoButton);

        ActionNanny actionNanny = new ActionNanny();
        undoButton.addActionListener(actionNanny);
        redoButton.addActionListener(actionNanny);
    }

    // Method to return the undo button
    public JButton getUndoButton() {
        return undoButton;
    }

    // Method to return the redo button
    public JButton getRedoButton() {
        return redoButton;
    }
}
