package com.edu4java.minitennis1;

import java.awt.*;

public class SecondTypeEnemy {

    private static final int DIAMETER = 30;
    int x = 0;
    int y = 50;
    int xa = 1;
    int ya = 1;
    private GameWindow game;

    public SecondTypeEnemy(GameWindow game) {
        this.game = game;
    }

    void setX(int x) {
        this.x = x;
    }

    void setY(int y) {
        this.y = y;
    }

    void move() {
        if (y + ya < 0)
            ya = 2;
        if (y + ya > game.getHeight() - DIAMETER)
            ya = -2;
        if (collision()){
            game.gameOver();
        }
        y = y + ya;
    }

    void move1(){
        if (y + ya < 0)
            ya = 1;
        if (y + ya > game.getHeight() - DIAMETER)
            ya = -1;
        if (collision()){
            game.gameOver();
        }
        y = y + ya;
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

