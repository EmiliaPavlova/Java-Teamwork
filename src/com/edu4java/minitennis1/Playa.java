package com.edu4java.minitennis1;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Playa {
    private static final int DIAMETER = 30;

    int x = 350;
    int y = 350;
    int xa = 0;
    int ya = 0;

    private GameWindow game;

    public Playa(GameWindow game) {
        this.game = game;
    }
         void move() {
             if (x + xa < 0)
                 xa = 1;
             if (x + xa > game.getWidth() - DIAMETER)
                 xa = -1;
             if (y + ya < 0)
                 ya = 1;
             if (y + ya > game.getHeight() - DIAMETER)
                 ya = -1;
             if(doorCollision() && game.speed > 1){
                 game.youWin();
             }
             x = x + xa;
             y = y + ya;
         }

    public void paint(Graphics2D g) {
        g.setColor(Color.GREEN);
        g.drawOval(x, y, DIAMETER, DIAMETER);
        g.fillOval(x, y, DIAMETER, DIAMETER);

    }

    public void keyReleased(KeyEvent e) {
        xa = 0;
        ya = 0;
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT)
            xa = -3;
        if (e.getKeyCode() == KeyEvent.VK_RIGHT)
            xa = 3;
        if (e.getKeyCode() == KeyEvent.VK_UP)
            ya = -3;
        if (e.getKeyCode() == KeyEvent.VK_DOWN)
            ya = 3;
    }

    private boolean doorCollision() {
        return game.door.getDoorBounds().intersects(getBounds());
    }
    public Rectangle getBounds() {
        return new Rectangle(x, y, DIAMETER, DIAMETER);
    }
}