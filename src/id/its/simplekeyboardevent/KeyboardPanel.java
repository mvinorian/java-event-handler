package id.its.simplekeyboardevent;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

public class KeyboardPanel extends JPanel implements KeyListener {
    
    private List<Key> keys;
    private int width;
    private int height;

    public KeyboardPanel(int width, int height) {
        this.width = width;
        this.height = height;
        this.setPreferredSize(new Dimension(this.width, this.height));

        this.keys = new ArrayList<Key>();

        this.keys.add(new Key(5, 5, KeyEvent.VK_ESCAPE, 1, "Esc", 40, 30));
        this.keys.add(new Key(55, 5, KeyEvent.VK_F1, 1, "F1", 40, 30));
        this.keys.add(new Key(105, 5, KeyEvent.VK_F2, 1, "F2", 40, 30));
        this.keys.add(new Key(155, 5, KeyEvent.VK_F3, 1, "F3", 40, 30));
        this.keys.add(new Key(205, 5, KeyEvent.VK_F4, 1, "F4", 40, 30));
        this.keys.add(new Key(255, 5, KeyEvent.VK_F5, 1, "F5", 40, 30));
        this.keys.add(new Key(305, 5, KeyEvent.VK_F6, 1, "F6", 40, 30));
        this.keys.add(new Key(355, 5, KeyEvent.VK_F7, 1, "F7", 40, 30));
        this.keys.add(new Key(405, 5, KeyEvent.VK_F8, 1, "F8", 40, 30));
        this.keys.add(new Key(455, 5, KeyEvent.VK_F9, 1, "F9", 40, 30));
        this.keys.add(new Key(505, 5, KeyEvent.VK_F10, 1, "F10", 40, 30));
        this.keys.add(new Key(555, 5, KeyEvent.VK_F11, 1, "F11", 40, 30));
        this.keys.add(new Key(605, 5, KeyEvent.VK_F12, 1, "F12", 40, 30));
        this.keys.add(new Key(655, 5, KeyEvent.VK_INSERT, 1, "Ins", 40, 30));
        this.keys.add(new Key(705, 5, KeyEvent.VK_DELETE, 1, "Del", 40, 30));

        this.keys.add(new Key(5, 45, KeyEvent.VK_BACK_QUOTE, 1, "`", 40, 40));
        this.keys.add(new Key(55, 45, KeyEvent.VK_1, 1, "1", 40, 40));
        this.keys.add(new Key(105, 45, KeyEvent.VK_2, 1, "2", 40, 40));
        this.keys.add(new Key(155, 45, KeyEvent.VK_3, 1, "3", 40, 40));
        this.keys.add(new Key(205, 45, KeyEvent.VK_4, 1, "4", 40, 40));
        this.keys.add(new Key(255, 45, KeyEvent.VK_5, 1, "5", 40, 40));
        this.keys.add(new Key(305, 45, KeyEvent.VK_6, 1, "6", 40, 40));
        this.keys.add(new Key(355, 45, KeyEvent.VK_7, 1, "7", 40, 40));
        this.keys.add(new Key(405, 45, KeyEvent.VK_8, 1, "8", 40, 40));
        this.keys.add(new Key(455, 45, KeyEvent.VK_9, 1, "9", 40, 40));
        this.keys.add(new Key(505, 45, KeyEvent.VK_0, 1, "0", 40, 40));
        this.keys.add(new Key(555, 45, KeyEvent.VK_MINUS, 1, "-", 40, 40));
        this.keys.add(new Key(605, 45, KeyEvent.VK_EQUALS, 1, "=", 40, 40));
        this.keys.add(new Key(655, 45, KeyEvent.VK_BACK_SPACE, 1, "Backspace", 90, 40));

        this.keys.add(new Key(5, 95, KeyEvent.VK_TAB, 1, "Tab", 60, 40));
        this.keys.add(new Key(75, 95, KeyEvent.VK_Q, 1, "Q", 40, 40));
        this.keys.add(new Key(125, 95, KeyEvent.VK_W, 1, "W", 40, 40));
        this.keys.add(new Key(175, 95, KeyEvent.VK_E, 1, "E", 40, 40));
        this.keys.add(new Key(225, 95, KeyEvent.VK_R, 1, "R", 40, 40));
        this.keys.add(new Key(275, 95, KeyEvent.VK_T, 1, "T", 40, 40));
        this.keys.add(new Key(325, 95, KeyEvent.VK_Y, 1, "Y", 40, 40));
        this.keys.add(new Key(375, 95, KeyEvent.VK_U, 1, "U", 40, 40));
        this.keys.add(new Key(425, 95, KeyEvent.VK_I, 1, "I", 40, 40));
        this.keys.add(new Key(475, 95, KeyEvent.VK_O, 1, "O", 40, 40));
        this.keys.add(new Key(525, 95, KeyEvent.VK_P, 1, "P", 40, 40));
        this.keys.add(new Key(575, 95, KeyEvent.VK_OPEN_BRACKET, 1, "[", 40, 40));
        this.keys.add(new Key(625, 95, KeyEvent.VK_CLOSE_BRACKET, 1, "]", 40, 40));
        this.keys.add(new Key(675, 95, KeyEvent.VK_BACK_SLASH, 1, "\\", 70, 40));

        this.keys.add(new Key(5, 145, KeyEvent.VK_CAPS_LOCK, 1, "Caps Lock", 70, 40));
        this.keys.add(new Key(85, 145, KeyEvent.VK_A, 1, "A", 40, 40));
        this.keys.add(new Key(135, 145, KeyEvent.VK_S, 1, "S", 40, 40));
        this.keys.add(new Key(185, 145, KeyEvent.VK_D, 1, "D", 40, 40));
        this.keys.add(new Key(235, 145, KeyEvent.VK_F, 1, "F", 40, 40));
        this.keys.add(new Key(285, 145, KeyEvent.VK_G, 1, "G", 40, 40));
        this.keys.add(new Key(335, 145, KeyEvent.VK_H, 1, "H", 40, 40));
        this.keys.add(new Key(385, 145, KeyEvent.VK_J, 1, "J", 40, 40));
        this.keys.add(new Key(435, 145, KeyEvent.VK_K, 1, "K", 40, 40));
        this.keys.add(new Key(485, 145, KeyEvent.VK_L, 1, "L", 40, 40));
        this.keys.add(new Key(535, 145, KeyEvent.VK_SEMICOLON, 1, ";", 40, 40));
        this.keys.add(new Key(585, 145, KeyEvent.VK_QUOTE, 1, "\"", 40, 40));
        this.keys.add(new Key(635, 145, KeyEvent.VK_ENTER, 1, "Enter", 110, 40));

        this.keys.add(new Key(5, 195, KeyEvent.VK_SHIFT, 2, "Shift", 90, 40));
        this.keys.add(new Key(105, 195, KeyEvent.VK_Z, 1, "Z", 40, 40));
        this.keys.add(new Key(155, 195, KeyEvent.VK_X, 1, "X", 40, 40));
        this.keys.add(new Key(205, 195, KeyEvent.VK_C, 1, "C", 40, 40));
        this.keys.add(new Key(255, 195, KeyEvent.VK_V, 1, "V", 40, 40));
        this.keys.add(new Key(305, 195, KeyEvent.VK_B, 1, "B", 40, 40));
        this.keys.add(new Key(355, 195, KeyEvent.VK_N, 1, "N", 40, 40));
        this.keys.add(new Key(405, 195, KeyEvent.VK_M, 1, "M", 40, 40));
        this.keys.add(new Key(455, 195, KeyEvent.VK_COMMA, 1, ",", 40, 40));
        this.keys.add(new Key(505, 195, KeyEvent.VK_PERIOD, 1, ".", 40, 40));
        this.keys.add(new Key(555, 195, KeyEvent.VK_SLASH, 1, "/", 40, 40));
        this.keys.add(new Key(605, 195, KeyEvent.VK_SHIFT, 3, "Shift", 140, 40));

        this.keys.add(new Key(5, 245, KeyEvent.VK_CONTROL, 2, "Ctrl", 90, 40));
        this.keys.add(new Key(105, 245, KeyEvent.VK_ALT, 2, "Alt", 90, 40));
        this.keys.add(new Key(205, 245, KeyEvent.VK_SPACE, 1, "", 270, 40));
        this.keys.add(new Key(485, 245, KeyEvent.VK_ALT, 3, "Alt", 50, 40));
        this.keys.add(new Key(545, 245, KeyEvent.VK_CONTROL, 3, "Ctrl", 50, 40));
        this.keys.add(new Key(605, 245, KeyEvent.VK_LEFT, 1, "left", 40, 40));
        this.keys.add(new Key(655, 245, KeyEvent.VK_UP, 1, "up", 40, 20));
        this.keys.add(new Key(655, 265, KeyEvent.VK_DOWN, 1, "down", 40, 20));
        this.keys.add(new Key(705, 245, KeyEvent.VK_RIGHT, 1, "right", 40, 40));

        this.addKeyListener(this);
        this.setFocusable(true);
        this.setFocusTraversalKeysEnabled(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0, 0, this.width, this.height);
        for (Key key : keys) key.render(g);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // do nothing
    }

    @Override
    public void keyPressed(KeyEvent e) { 
        System.out.println("Pressed: " + e.getKeyCode() + " " + e.getKeyLocation());
        for (Key k : this.keys) {
            if (k.isSymbolMatch(e)) {
                k.setPressed();
                this.repaint();
            }
        }
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Released: " + e.getKeyCode() + " " + e.getKeyLocation());
        for(Key k : this.keys) {
            if (k.isSymbolMatch(e)) {
                k.setReleased();
                this.repaint();
            }
        }
    }

}
