package com.edu4java.minitennis1;

import graphics.ImageLoader;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.sql.BatchUpdateException;

public class Playa {
    private static final int DIAMETER = 30;

    int x = 240;
    int y = 240;
    int xa = 0;
    int ya = 0;

    private GameWindow game;

    private BufferedImage image;

    public Playa(GameWindow game) {

        this.game = game;
        this.image = ImageLoader.loadImage("/../img/bee.png");

    }

    public void move() {
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

    public void paint(Graphics2D g2d) {
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.drawImage(image, this.x, this.y, 40, 40, null);
    }

    public void keyReleased(KeyEvent e) {
        xa = 0;
        ya = 0;
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            xa = -3;
            image = ImageLoader.loadImage("/../img/beeL.png");
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            xa = 3;
            image = ImageLoader.loadImage("/../img/beeR.png");
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            ya = -3;
            image = ImageLoader.loadImage("/../img/bee.png");
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            ya = 3;
            image = ImageLoader.loadImage("/../img/beeD.png");
        }
    }

    private boolean doorCollision() {
        return game.door.getDoorBounds().intersects(getBounds());
    }
    public Rectangle getBounds() {
        return new Rectangle(x, y, DIAMETER, DIAMETER);
    }
}