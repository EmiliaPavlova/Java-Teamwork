package com.edu4java.minitennis1;

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

    ArrayList<Enemy> enemies = new ArrayList<Enemy>();
    ArrayList<Food> food = new ArrayList<Food>();

    private BufferedImage img;

    Door door = new Door(this);

    Playa myPlayer = new Playa(this);
    int speed = 1;

    private int getScore() {
        return speed - 1;
    }

    public GameWindow(){

        for (int i = 0; i < 24; i++) {
            enemies.add(new Enemy(this));
        }

        for (int j = 0; j <20; j++) {
            food.add(new Food(this));
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
        enemies.get(0).moveBase("right");
        enemies.get(7).moveBase("right");
        enemies.get(8).moveBase("right");
        enemies.get(9).moveBase("right");
        enemies.get(10).moveBase("right");
        enemies.get(11).moveBase("right");

        enemies.get(12).moveBase("up");
        enemies.get(13).moveBase("up");
        enemies.get(14).moveBase("up");
        enemies.get(15).moveBase("up");
        enemies.get(16).moveBase("up");
        enemies.get(17).moveBase("up");

        enemies.get(1).moveBase("left");
        enemies.get(2).moveBase("left");
        enemies.get(3).moveBase("left");
        enemies.get(4).moveBase("left");
        enemies.get(5).moveBase("left");
        enemies.get(6).moveBase("left");

        enemies.get(18).moveBase("down");
        enemies.get(19).moveBase("down");
        enemies.get(20).moveBase("down");
        enemies.get(21).moveBase("down");
        enemies.get(22).moveBase("down");
        enemies.get(23).moveBase("down");

        myPlayer.move();
    }

    private void setBallSizes(){
        enemies.get(0).setX(750);
        enemies.get(0).setY(600);
        enemies.get(1).setX(200);
        enemies.get(1).setY(350);
        enemies.get(2).setX(400);
        enemies.get(2).setY(40);
        enemies.get(3).setX(300);
        enemies.get(3).setY(400);
        enemies.get(4).setX(700);
        enemies.get(4).setY(400);
        enemies.get(5).setX(100);
        enemies.get(5).setY(150);
        enemies.get(6).setX(650);
        enemies.get(6).setY(15);
        enemies.get(7).setX(600);
        enemies.get(7).setY(320);
        enemies.get(8).setX(750);
        enemies.get(8).setY(450);
        enemies.get(9).setX(670);
        enemies.get(9).setY(700);
        enemies.get(10).setX(400);
        enemies.get(10).setY(550);
        enemies.get(11).setX(300);
        enemies.get(11).setY(120);
        enemies.get(12).setX(100);
        enemies.get(12).setY(200);
        enemies.get(13).setX(30);
        enemies.get(13).setY(700);
        enemies.get(14).setX(435);
        enemies.get(14).setY(400);
        enemies.get(15).setX(300);
        enemies.get(15).setY(600);
        enemies.get(16).setX(800);
        enemies.get(16).setY(700);
        enemies.get(17).setX(450);
        enemies.get(17).setY(700);
        enemies.get(18).setX(600);
        enemies.get(18).setY(750);
        enemies.get(19).setX(750);
        enemies.get(19).setY(550);
        enemies.get(20).setX(30);
        enemies.get(20).setY(770);
        enemies.get(21).setX(680);
        enemies.get(21).setY(760);

        food.get(0).setX(250);
        food.get(0).setY(200);
        food.get(1).setX(200);
        food.get(1).setY(700);
        food.get(2).setX(300);
        food.get(2).setY(400);
        food.get(3).setX(350);
        food.get(3).setY(600);
        food.get(4).setX(500);
        food.get(4).setY(400);
        food.get(5).setX(100);
        food.get(5).setY(200);
        food.get(6).setX(550);
        food.get(6).setY(700);
        food.get(7).setX(400);
        food.get(7).setY(700);
        food.get(8).setX(650);
        food.get(8).setY(100);
        food.get(9).setX(650);
        food.get(9).setY(650);
        food.get(10).setX(100);
        food.get(10).setY(600);
        food.get(11).setX(650);
        food.get(11).setY(50);
        food.get(12).setX(700);
        food.get(12).setY(450);
        food.get(13).setX(500);
        food.get(13).setY(50);
        food.get(14).setX(50);
        food.get(14).setY(750);
        food.get(15).setX(750);
        food.get(15).setY(450);
        food.get(16).setX(50);
        food.get(16).setY(30);
        food.get(17).setX(600);
        food.get(17).setY(300);
        food.get(18).setX(50);
        food.get(18).setY(500);
        food.get(19).setX(650);
        food.get(19).setY(700);
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
        game.setBallSizes();

         while (true) {
            game.move();
            game.repaint();
            Thread.sleep(5);
        }
    }
}