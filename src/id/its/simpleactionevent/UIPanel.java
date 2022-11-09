package id.its.simpleactionevent;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class UIPanel extends JPanel implements ActionListener {
    
    public UIPanel(int width, int height) {
        this.setPreferredSize(new Dimension(width, height));

        JButton button = new JButton("Click Me!");
        this.add(button);
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        JOptionPane.showMessageDialog(this, "Anda telah mengaktifkan action event");
    }
}
