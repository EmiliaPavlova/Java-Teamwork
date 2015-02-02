package com.edu4java.minitennis1;

<<<<<<< HEAD
import graphics.ImageLoader;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

public class Enemy {

    private static final int DIAMETER = 30;
    int x = 0;
    int y = 50;
    int xa = 2;
    int ya = 2;

    AffineTransform transform = new AffineTransform();

    private GameWindow game;
    //private BufferedImage img;
=======
import java.awt.Graphics2D;
import java.awt.Rectangle;


public class Enemy {
    private static final int DIAMETER = 30;
    int x = 0;
    int y = 50;
    int xa = 1;
    int ya = 1;
    private GameWindow game;
>>>>>>> 82a471235842d3ddf38be8f98bc4a28e4d51d64c

    public Enemy(GameWindow game) {
        this.game = game;
    }

    void setX(int x) {
        this.x = x;
    }

    void setY(int y) {
        this.y = y;
    }

<<<<<<< HEAD
    void moveBase(String direction) {
        switch (direction) {
            case "right":
                if (x + xa < 0) {
                    xa = 1;
                }
                if (x + xa > game.getWidth() - DIAMETER) {
                    xa = -1;
                }
                if (collision()){
                    game.gameOver();
                }
                x = x + xa;
                break;
            case "left":
                if (x + xa < 0) {
                    xa = 2;
                    //AffineTransform.rotate(Math.toRadians(45), 0, 0);
                    //transform.rotate(Math.PI);
                }
                if (x + xa > game.getWidth() - DIAMETER) {
                    xa = -2;
                    //g2.rotate(-Math.PI/2);
                    //transform.rotate(Math.PI);
                }
                if (collision()){
                    game.gameOver();
                }
                x = x + xa;
                break;
            case "up":
                if (y + ya < 0) {
                    ya = 2;
                }
                if (y + ya > game.getHeight() - DIAMETER) {
                    ya = -2;
                }
                if (collision()){
                    game.gameOver();
                }
                y = y + ya;
                break;
            case "down":
                if (y + ya < 0) {
                    ya = 1;
                }
                if (y + ya > game.getHeight() - DIAMETER) {
                    ya = -1;
                }
                if (collision()){
                    game.gameOver();
                }
                y = y + ya;
                break;
        }
    }

    private boolean collision() {
        return game.myPlayer.getBounds().intersects(getBounds());
    }
    public void paint(String img, Graphics2D g2d) {
        BufferedImage image = ImageLoader.loadImage(img);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.drawImage(image, this.x, this.y, 30, 30, null);
        //g.drawImage(img, transform, null);
=======
    void move() {
        if (x + xa < 0)
            xa = 1;
        if (x + xa > game.getWidth() - DIAMETER)
            xa = -1;
        if (collision()){
            game.gameOver();
        }
        x = x + xa;
    }

    void move1() {

        if (x + xa < 0)
            xa = 2;
        if (x + xa > game.getWidth() - DIAMETER)
            xa = -2;
        if (collision()){
            game.gameOver();
        }
        x = x + xa;
    }


    private boolean collision() {
        return game.myPlayer.getBounds().intersects(getBounds());
    }
    public void paint(Graphics2D g) {
        g.drawOval(x, y, DIAMETER, DIAMETER);
        g.fillOval(x, y, DIAMETER, DIAMETER);
>>>>>>> 82a471235842d3ddf38be8f98bc4a28e4d51d64c
    }
    public Rectangle getBounds() {
        return new Rectangle(x, y, DIAMETER, DIAMETER);
    }
}