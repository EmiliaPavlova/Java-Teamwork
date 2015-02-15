package Game.Impossible.Main;

import Sound.Sound;
import graphics.ImageLoader;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Food {
    private static final int DIAMETER = 20;

    int x = 0;
    int y = 0;
    boolean supposedToBeHere = true;
    boolean eaten = false;

    private GameWindow game;

    public Food(GameWindow game,int x, int y){
        this.x = x;
        this.y = y;
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

    public  void paint(String img, Graphics2D g2d) {
        BufferedImage image = ImageLoader.loadImage(img);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        // 1 point score
        if (foodCollision()){
            if (eaten) {
                return;
            }
            supposedToBeHere = false;
            eaten = true;
        }
        if (supposedToBeHere){
            g2d.drawImage(image, this.x, this.y, 20, 20, null);
        }

        if(foodCollision()){
            Sound.TERMINATED.play();
           game.score++;
        }
    }
    public Rectangle getFoodBounds() {
        return new Rectangle(x, y, DIAMETER, DIAMETER);
    }
}

