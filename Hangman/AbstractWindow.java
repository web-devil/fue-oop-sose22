import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public abstract class AbstractWindow extends JFrame {
    protected void renderView(Component element1, Component element2) {
        Container pane = this.getContentPane();
        BoxLayout box = new BoxLayout(pane, BoxLayout.Y_AXIS);
        pane.setLayout(box);
        pane.add(element1);
        pane.add(Box.createRigidArea(new Dimension(0, 30)));
        pane.add(element2);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setSize(250,200);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }


    protected void renderView(Component element1, Component element2, Component element3) {
        Container pane = this.getContentPane();
        BoxLayout box = new BoxLayout(pane, BoxLayout.Y_AXIS);
        pane.setLayout(box);
        pane.add(element1);
        pane.add(Box.createRigidArea(new Dimension(0, 30)));
        pane.add(element2);
        pane.add(Box.createRigidArea(new Dimension(0, 20)));
        pane.add(element3);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setSize(250,200);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
