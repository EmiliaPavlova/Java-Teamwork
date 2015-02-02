package com.edu4java.minitennis1;

<<<<<<< HEAD
import graphics.ImageLoader;
import java.awt.*;
import java.awt.image.BufferedImage;
=======
import java.awt.*;
>>>>>>> 82a471235842d3ddf38be8f98bc4a28e4d51d64c

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

<<<<<<< HEAD
    public  void paint(String img, Graphics2D g2d) {
        BufferedImage image = ImageLoader.loadImage(img);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        // 1 point speed
        if (foodCollision()){
            if (eaten) {
                return;
            }
=======
    public  void paint(Graphics2D g) {
        if (foodCollision()){
>>>>>>> 82a471235842d3ddf38be8f98bc4a28e4d51d64c
            supposedToBeHere = false;
            eaten = true;
        }
        if (supposedToBeHere){
<<<<<<< HEAD
            g2d.drawImage(image, this.x, this.y, 20, 20, null);
        }

        if(foodCollision()){
           game.speed++;
        }
=======
        g.setColor(Color.YELLOW);
        g.drawOval(x, y, DIAMETER, DIAMETER);
        g.fillOval(x, y, DIAMETER, DIAMETER);
        }
       if(foodCollision()){
           game.speed++;
       }

>>>>>>> 82a471235842d3ddf38be8f98bc4a28e4d51d64c
    }
    public Rectangle getFoodBounds() {
        return new Rectangle(x, y, DIAMETER, DIAMETER);
    }
}

