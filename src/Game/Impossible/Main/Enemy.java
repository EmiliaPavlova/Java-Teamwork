package Game.Impossible.Main;

import graphics.ImageLoader;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

public class Enemy {

    private static final int DIAMETER = 30;
    int x = 0;
    int y = 50;
    int velocityX = 2;
    int velocityY = 2;

    AffineTransform transform = new AffineTransform();

    private GameWindow game;
    private BufferedImage image;

    public Enemy(GameWindow game,int x,int y) {
        this.x = x;
        this.y = y;
        this.game = game;
        this.image = ImageLoader.loadImage("/../img/bug.png");
//        if (i < ENEMY_X_COORDINATES.length / 2) {
//            this.image = ImageLoader.loadImage("/../img/bug.png");
//        } else {
//            this.image = ImageLoader.loadImage("/../img/bugRight.png");
//        }
    }

    void setX(int x) {
        this.x = x;
    }

    void setY(int y) {
        this.y = y;
    }

    void moveBase(String direction) {
        switch (direction) {
            case "right":
                if (x + velocityX < 0) {
                    velocityX = 1;
                    this.image = ImageLoader.loadImage("/../img/bugRight.png");
                }
                if (x + velocityX > game.getWidth() - DIAMETER) {
                    velocityX = -1;
                    this.image = ImageLoader.loadImage("/../img/bugLeft.png");
                }
                if (collision()){
                    game.gameOver();
                }
                x = x + velocityX;
                break;
            case "left":
                if (x + velocityX < 0) {
                    velocityX = 2;
                    this.image = ImageLoader.loadImage("/../img/bugRight.png");
                    //AffineTransform.rotate(Math.toRadians(45), 0, 0);
                    //transform.rotate(Math.PI);
                }
                if (x + velocityX > game.getWidth() - DIAMETER) {
                    velocityX = -2;
                    this.image = ImageLoader.loadImage("/../img/bugLeft.png");
                    //g2.rotate(-Math.PI/2);
                    //transform.rotate(Math.PI);
                }
                if (collision()){
                    game.gameOver();
                }
                x = x + velocityX;
                break;
            case "up":
                if (y + velocityY < 0) {
                    velocityY = 2;
                    this.image = ImageLoader.loadImage("/../img/bugDown.png");
                }
                if (y + velocityY > game.getHeight() - DIAMETER) {
                    velocityY = -2;
                    this.image = ImageLoader.loadImage("/../img/bug.png");
                }
                if (collision()){
                    game.gameOver();
                }
                y = y + velocityY;
                break;
            case "down":
                if (y + velocityY < 0) {
                    velocityY = 1;
                    this.image = ImageLoader.loadImage("/../img/bugDown.png");
                }
                if (y + velocityY > game.getHeight() - DIAMETER) {
                    velocityY = -1;
                    this.image = ImageLoader.loadImage("/../img/bug.png");
                }
                if (collision()){
                    game.gameOver();
                }
                y = y + velocityY;
                break;
        }
    }

    private boolean collision() {
        return game.myPlayer.getBounds().intersects(getBounds());
    }

    public void paint(Graphics2D g2d) {
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.drawImage(image, this.x, this.y, 30, 30, null);
    }
    public Rectangle getBounds() {
        return new Rectangle(x, y, DIAMETER, DIAMETER);
    }
}