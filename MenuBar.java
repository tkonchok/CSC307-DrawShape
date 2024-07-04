package javiergs.gui.paint.gamma;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MenuBar extends JMenuBar {
    public MenuBar() {
        initializeMenus();
    }

    private void initializeMenus(){
        //Shape submenu
        ActionNanny actionNanny = new ActionNanny();
        JMenu shapeMenu = new JMenu("Shape");
        String[] shapes = {"Rectangle", "Circle", "Arc"};

        for (String shape : shapes) {
            JMenuItem shapeItem = new JMenuItem(shape);
            shapeItem.addActionListener(actionNanny);
            shapeMenu.add(shapeItem);
        }

        JMenu editMenu = new JMenu("Edit");
        JMenuItem undoItem = new JMenuItem("Undo");
        JMenuItem redoItem = new JMenuItem("Redo");

        // Add ActionListener to the undo button
        undoItem.addActionListener(e -> {
            Officer.undoDrawAction(); // Undo the last drawing action
            // Repaint DrawPanel after undo
        });

        // Add ActionListener to the redo button
        redoItem.addActionListener(e -> {
            Officer.redoDrawAction(); // Redo the last undone action
            // Repaint DrawPanel after redo
        });

        editMenu.add(undoItem);
        editMenu.add(redoItem);

        JMenu colorMenu = new JMenu("Color");
        String[] colors = {"Black", "Red", "Blue", "Green", "Yellow", "Orange", "Pink"};
        for (String color : colors) {
            JMenuItem colorItem = new JMenuItem(color);
            colorItem.addActionListener(actionNanny);
            colorMenu.add(colorItem);
        }

        add(shapeMenu);
        add(colorMenu);
        add(editMenu);
        //
        //
    }
}
