package id.its.simplekeyboardevent;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.FontMetrics;
import java.awt.event.KeyEvent;

public class Key {
    
    private static final int RELEASED = 1;
    private static final int PRESSED = 2;

    private int x;
    private int y;
    private int state;
    private String symbol;
    private int loc;
    private int code;
    private int width;
    private int height;

    public Key(int x, int y, int code, int loc, String symbol, int width, int height) {
        this.x = x;
        this.y = y;
        this.code = code;
        this.loc = loc;
        this.symbol = symbol;
        this.state = RELEASED;
        this.width = width;
        this.height = height;
    }

    public void render(Graphics g) {
        if (this.state == RELEASED) g.setColor(Color.WHITE);
        else if (this.state == PRESSED) g.setColor(Color.GRAY);
        else g.setColor(Color.WHITE);
        
        g.fillRoundRect(this.x, this.y, this.width, this.height, 10, 10);

        g.setColor(Color.BLACK);
        g.drawRoundRect(this.x, this.y, this.width-1, this.height-1, 5, 5);
        
        FontMetrics metrics = g.getFontMetrics();
        int stringPosX = this.x + (this.width - metrics.stringWidth(symbol))/2;
        int stringPosY = this.y + (this.height - metrics.getHeight())/2 + metrics.getAscent();

        g.drawString(this.symbol, stringPosX, stringPosY);
    }

    public boolean isSymbolMatch(KeyEvent e) {
        return (this.code == e.getKeyCode() && this.loc == e.getKeyLocation());
    }

    public void setPressed() {
        this.state = PRESSED;
    }

    public void setReleased() {
        this.state = RELEASED;
    }

}
