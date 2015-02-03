package com.edu4java.minitennis1;

import graphics.ImageLoader;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Door {

    int width = 50;
    int height = 48;
    int x = 750;
    int y = 752;
    boolean supposedToBeHere = false;

    private GameWindow game;

    public Door(GameWindow game) {
        this.game = game;
    }

    public void paint(String img, Graphics2D g2d){
        if(game.speed >= 20){
            supposedToBeHere = true;
        }
        if(supposedToBeHere){
          BufferedImage image = ImageLoader.loadImage(img);
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.drawImage(image, this.x, this.y, 50, 48, null);
        }
    }

    public Rectangle getDoorBounds() {
        return new Rectangle(x, y, width, height);
    }


}
