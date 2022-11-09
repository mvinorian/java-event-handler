package com.event.keyboard;

import java.awt.Color;
import java.awt.Graphics;

public class Key {
    
    private static final int WIDTH = 100;
    private static final int HEIGHT = 100;
    private static final int RELEASED = 1;
    private static final int PRESSED = 2;

    private int x;
    private int y;
    private char symbol;
    private int state;

    public Key(int x, int y, char symbol) {
        this.x = x;
        this.y = y;
        this.symbol = symbol;
        this.state = RELEASED;
    }

    public void render(Graphics g) {
        if (this.state == RELEASED) g.setColor(Color.BLUE);
        else if (this.state == PRESSED) g.setColor(Color.RED);
        else g.setColor(Color.WHITE);
        
        g.fillRect(this.x, this.y, WIDTH, HEIGHT);

        int stringPosX = this.x + (WIDTH / 3);
        int stringPosY = this.y + (HEIGHT / 2);
        g.setColor(Color.BLACK);
        g.drawString(String.valueOf(this.symbol), stringPosX, stringPosY);
    }

    public boolean isSymbolMatch(char symbol) {
        return (this.symbol == symbol);
    }

    public void setPressed() {
        this.state = PRESSED;
    }

    public void setReleased() {
        this.state = RELEASED;
    }

}
