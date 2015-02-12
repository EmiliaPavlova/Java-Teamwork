package Game.Impossible.Main;

import Sound.Sound;
import graphics.ImageLoader;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class GameWindow extends JPanel {
    private final Integer[] ENEMY_X_COORDINATES = new Integer[]{750, 200, 400, 300, 700, 100, 650, 600, 750, 670, 400, 300, 100, 30, 435, 300, 800, 450, 600, 750, 30, 680};
    private final Integer[] ENEMY_Y_COORDINATES = new Integer[]{600, 350, 40, 400, 400, 150, 15, 320, 450, 700, 550, 120, 200, 700, 400, 600, 700, 700, 750, 550, 770, 760};
    private final Integer[] FOOD_X_COORDINATES = new Integer[]{250, 200, 300, 350, 500, 100, 550, 400, 650, 650, 100, 650, 700, 500, 50, 750, 50, 600, 50, 650};
    private final Integer[] FOOD_Y_COORDINATES = new Integer[]{200, 700, 400, 600, 400, 200, 700, 700, 100, 650, 600, 50, 450, 50, 750, 450, 30, 300, 500, 700};

    ArrayList<Enemy> enemies = new ArrayList<Enemy>();
    ArrayList<Food> food = new ArrayList<Food>();

    private BufferedImage img;

    Door door = new Door(this);

    Playa myPlayer = new Playa(this);
    int score = 1;

    private int getScore() {
        return score - 1;
    }

    public GameWindow(){

        for (int i = 0; i < ENEMY_X_COORDINATES.length; i++) {
            enemies.add(new Enemy(this,ENEMY_X_COORDINATES[i],ENEMY_Y_COORDINATES[i]));
        }

        for (int j = 0; j <FOOD_X_COORDINATES.length; j++) {
            food.add(new Food(this,FOOD_X_COORDINATES[j],FOOD_Y_COORDINATES[j]));
        }

        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                myPlayer.keyReleased(e);
            }

            @Override
            public void keyPressed(KeyEvent e) {
                myPlayer.keyPressed(e);
            }
        });
        Sound.BACK.loop();
        setFocusable(true);
    }

    private void move(){
        for (int i = 0; i < 7; i++) {
            enemies.get(i).moveBase("left");
        }

        for (int i = 7; i < 12; i++) {
            enemies.get(i).moveBase("right");
        }

        for (int i = 12; i < 18; i++) {
            enemies.get(i).moveBase("up");
        }

        for (int i = 18; i <= 21; i++) {
            enemies.get(i).moveBase("down");
        }

        myPlayer.move();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        // background
        img = ImageLoader.loadImage("/../img/grass.jpeg");
        g2d.drawImage(img, 0, 0, 800, 800, null);

        for (Food flower : food) {
            flower.paint("/../img/flower.png", g2d);
        }
        for (Enemy enemy : enemies) {
            enemy.paint(g2d);
        }
        myPlayer.paint(g2d);
        door.paint("/../img/hive.png", g2d);

        g2d.setColor(Color.BLUE);
        g2d.setFont(new Font("Verdana", Font.BOLD, 30));
        g2d.drawString(String.valueOf(getScore()), 10, 30);
    }

    public void gameOver() {
        Sound.BACK.stop();
        Sound.GAMEOVER.play();
        JOptionPane.showMessageDialog(this, "Eaten by bugs. Mission failed! Points: " + getScore(),
                "Game Over", JOptionPane.YES_NO_OPTION);
        System.exit(ABORT);
    }

    public void youWin() {
        Sound.BACK.stop();
        Sound.GAMEOVER.play();
        if(getScore() >= 20){
        JOptionPane.showMessageDialog(this, "You are a wizard! Your score is: " + getScore(),
                "You Win", JOptionPane.YES_NO_OPTION);
        System.exit(ABORT);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Mission Impossible");
        GameWindow game = new GameWindow();
        frame.add(game);
        frame.setSize(800, 800);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         while (true) {
            game.move();
            game.repaint();
            Thread.sleep(5);
        }
    }
}