package com.edu4java.minitennis1;

import java.awt.*;

public class Food {
    private static final int DIAMETER = 20;

    int x = 0;
    int y = 0;
    boolean supposedToBeHere = true;
    boolean eaten = false;

    private GameWindow game;

    public Food(GameWindow game){
        this.game = game;
    }

    void setX(int x) {
        this.x = x;
    }

    void setY(int y) {
        this.y = y;
    }

    private boolean foodCollision() {
        return  game.myPlayer.getBounds().intersects(getFoodBounds());
    }

    public  void paint(Graphics2D g) {
        if (foodCollision()){
            supposedToBeHere = false;
            eaten = true;
        }
        if (supposedToBeHere){
        g.setColor(Color.YELLOW);
        g.drawOval(x, y, DIAMETER, DIAMETER);
        g.fillOval(x, y, DIAMETER, DIAMETER);
        }
       if(foodCollision()){
           game.speed++;
       }

    }
    public Rectangle getFoodBounds() {
        return new Rectangle(x, y, DIAMETER, DIAMETER);
    }
}

