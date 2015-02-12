package Game.Impossible.Main;

import graphics.ImageLoader;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

public class Playa {
    private static final int DIAMETER = 30;

    int x = 240;
    int y = 240;
    int velocityX = 0;
    int velocityY = 0;

    private GameWindow game;

    private BufferedImage image;

    public Playa(GameWindow game) {

        this.game = game;
        this.image = ImageLoader.loadImage("/../img/bee.png");

    }

    public void move() {
             if (x + velocityX < 0)
                 velocityX = 1;
             if (x + velocityX > game.getWidth() - DIAMETER)
                 velocityX = -1;
             if (y + velocityY < 0)
                 velocityY = 1;
             if (y + velocityY > game.getHeight() - DIAMETER)
                 velocityY = -1;
             if(doorCollision() && game.score > 1){
                 game.youWin();
             }
             x = x + velocityX;
             y = y + velocityY;
         }

    public void paint(Graphics2D g2d) {
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.drawImage(image, this.x, this.y, 40, 40, null);
    }

    public void keyReleased(KeyEvent e) {
        velocityX = 0;
        velocityY = 0;
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            velocityX = -3;
            image = ImageLoader.loadImage("/../img/beeLeft.png");
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            velocityX = 3;
            image = ImageLoader.loadImage("/../img/beeRight.png");
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            velocityY = -3;
            image = ImageLoader.loadImage("/../img/bee.png");
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            velocityY = 3;
            image = ImageLoader.loadImage("/../img/beeDown.png");
        }
    }

    private boolean doorCollision() {
        return game.door.getDoorBounds().intersects(getBounds());
    }
    public Rectangle getBounds() {
        return new Rectangle(x, y, DIAMETER, DIAMETER);
    }
}