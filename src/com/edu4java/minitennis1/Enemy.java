package com.edu4java.minitennis1;

import java.awt.Graphics2D;
import java.awt.Rectangle;


public class Enemy {
    private static final int DIAMETER = 30;
    int x = 0;
    int y = 50;
    int xa = 1;
    int ya = 1;
    private GameWindow game;

    public Enemy(GameWindow game) {
        this.game = game;
    }

    void setX(int x) {
        this.x = x;
    }

    void setY(int y) {
        this.y = y;
    }

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
    }
    public Rectangle getBounds() {
        return new Rectangle(x, y, DIAMETER, DIAMETER);
    }
}