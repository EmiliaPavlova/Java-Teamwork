package com.edu4java.minitennis1;

<<<<<<< HEAD
import graphics.ImageLoader;
import java.awt.*;
import java.awt.image.BufferedImage;
=======
import java.awt.*;
>>>>>>> 82a471235842d3ddf38be8f98bc4a28e4d51d64c

public class Door {

    int width = 30;
    int height = 30;
    int x = 780;
    int y = 780;
<<<<<<< HEAD
    boolean supposedToBeHere = false;
=======
>>>>>>> 82a471235842d3ddf38be8f98bc4a28e4d51d64c

    private GameWindow game;

    public Door(GameWindow game) {
        this.game = game;
    }

<<<<<<< HEAD
    public void paint(String img, Graphics2D g2d){
        if(game.speed >= 20){
            supposedToBeHere = true;
        }
        if(supposedToBeHere){
          BufferedImage image = ImageLoader.loadImage(img);
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.drawImage(image, this.x - 30, this.y - 28, 50, 48, null);
        }
=======
    public void paint(Graphics2D g){
        g.setColor(Color.BLUE);
        g.drawRect(x, y, width, height);
        g.fillRect(x, y, width,height);
>>>>>>> 82a471235842d3ddf38be8f98bc4a28e4d51d64c
    }

    public Rectangle getDoorBounds() {
        return new Rectangle(x, y, width, height);
    }


}
