package Game.Impossible.Main;

import graphics.ImageLoader;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Door {

    int width = 30;
    int height = 30;
    int x = 780;
    int y = 780;
    boolean supposedToBeHere = false;

    private GameWindow game;

    public Door(GameWindow game) {
        this.game = game;
    }

    public void paint(String img, Graphics2D g2d){
        if(game.score >= 20){
            supposedToBeHere = true;
        }
        if(supposedToBeHere){
          BufferedImage image = ImageLoader.loadImage(img);
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.drawImage(image, this.x - 30, this.y - 28, 50, 48, null);
        }
    }

    public Rectangle getDoorBounds() {
        return new Rectangle(x, y, width, height);
    }


}
