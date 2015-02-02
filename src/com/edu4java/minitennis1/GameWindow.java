package com.edu4java.minitennis1;

<<<<<<< HEAD
import graphics.ImageLoader;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
=======

import graphics.ImageLoader;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import javax.swing.JOptionPane;

>>>>>>> 82a471235842d3ddf38be8f98bc4a28e4d51d64c

@SuppressWarnings("serial")
public class GameWindow extends JPanel {

<<<<<<< HEAD
    ArrayList<Enemy> enemies = new ArrayList<Enemy>();
    ArrayList<Food> food = new ArrayList<Food>();

    private BufferedImage img;
=======

    Enemy ball = new Enemy(this);
    Enemy secondBall = new Enemy(this);
    Enemy thirdBall = new Enemy(this);
    Enemy fourthBall = new Enemy(this);
    Enemy fifthBall = new Enemy(this);
    Enemy sixthBall = new Enemy(this);
    Enemy seventhBall = new Enemy(this);
    Enemy eightBall = new Enemy(this);
    Enemy ninthBall = new Enemy(this);
    Enemy tenthBall = new Enemy(this);
    Enemy eleventhBall = new Enemy(this);
    Enemy twelfthBall = new Enemy(this);


    SecondTypeEnemy enemy = new SecondTypeEnemy(this);
    SecondTypeEnemy enemy2 = new SecondTypeEnemy(this);
    SecondTypeEnemy enemy3 = new SecondTypeEnemy(this);
    SecondTypeEnemy enemy4 = new SecondTypeEnemy(this);
    SecondTypeEnemy enemy5 = new SecondTypeEnemy(this);
    SecondTypeEnemy enemy6 = new SecondTypeEnemy(this);
    SecondTypeEnemy enemy7 = new SecondTypeEnemy(this);
    SecondTypeEnemy enemy8 = new SecondTypeEnemy(this);
    SecondTypeEnemy enemy9 = new SecondTypeEnemy(this);
    SecondTypeEnemy enemy10 = new SecondTypeEnemy(this);
    SecondTypeEnemy enemy11 = new SecondTypeEnemy(this);
    SecondTypeEnemy enemy12 = new SecondTypeEnemy(this);

    Food a = new Food(this);
    Food b = new Food(this);
    Food c = new Food(this);
    Food d = new Food(this);
    Food e = new Food(this);
    Food f = new Food(this);
    Food g = new Food(this);
    Food h = new Food(this);
    Food i = new Food(this);
    Food j = new Food(this);
    Food k = new Food(this);
    Food l = new Food(this);
    Food m = new Food(this);
    Food n = new Food(this);
    Food o = new Food(this);
    Food p = new Food(this);
    Food q = new Food(this);
    Food r = new Food(this);
    Food s = new Food(this);
    Food t = new Food(this);
    Food u = new Food(this);
    Food v = new Food(this);


    //private BufferedImage img;
    //private Graphics g;

>>>>>>> 82a471235842d3ddf38be8f98bc4a28e4d51d64c

    Door door = new Door(this);

    Playa myPlayer = new Playa(this);
    int speed = 1;

    private int getScore() {
        return speed - 1;
    }

    public GameWindow(){
<<<<<<< HEAD

        for (int i = 0; i < 24; i++) {
            enemies.add(new Enemy(this));
        }

        for (int j = 0; j <20; j++) {
            food.add(new Food(this));
        }

=======
>>>>>>> 82a471235842d3ddf38be8f98bc4a28e4d51d64c
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
        setFocusable(true);
    }

<<<<<<< HEAD
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

=======
    private void move1(){
        seventhBall.move1();
        eightBall.move1();
        ninthBall.move1();
        tenthBall.move1();
        eleventhBall.move1();
        enemy5.move1();
        enemy6.move1();
        enemy7.move1();
        enemy8.move1();
        enemy9.move1();
        enemy10.move1();
    }

    private void move() {
        secondBall.move();
        thirdBall.move();
        fourthBall.move();
        fifthBall.move();
        sixthBall.move();
        twelfthBall.move();

        enemy2.move();
        enemy3.move();
        enemy4.move();
        enemy11.move();
        enemy12.move();

        ball.move();
        enemy.move();
>>>>>>> 82a471235842d3ddf38be8f98bc4a28e4d51d64c
        myPlayer.move();
    }

    private void setBallSizes(){
<<<<<<< HEAD
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
=======

        thirdBall.setX(300);
        thirdBall.setY(120);

        fourthBall.setX(100);
        fourthBall.setY(200);

        fifthBall.setX(15);
        fifthBall.setY(700);

        sixthBall.setX(435);
        sixthBall.setY(400);

        seventhBall.setX(15);
        seventhBall.setY(400);

        eightBall.setX(300);
        eightBall.setY(600);

        ninthBall.setX(800);
        ninthBall.setY(700);

        tenthBall.setX(450);
        tenthBall.setY(700);

        eleventhBall.setX(600);
        eleventhBall.setY(750);

        twelfthBall.setX(750);
        twelfthBall.setY(550);

        enemy2.setX(400);
        enemy2.setY(15);

        enemy3.setX(300);
        enemy3.setY(400);

        enemy4.setX(700);
        enemy4.setY(400);

        enemy5.setX(100);
        enemy5.setY(15);

        enemy6.setX(650);
        enemy6.setY(15);

        enemy7.setX(600);
        enemy7.setY(335);

        enemy8.setX(600);
        enemy8.setY(335);

        enemy9.setX(750);
        enemy9.setY(450);

        enemy10.setX(670);
        enemy10.setY(700);

        enemy11.setX(400);
        enemy11.setY(550);

        enemy12.setY(750);
        enemy12.setX(600);

        enemy.setX(200);
        enemy.setY(350);

        a.setX(250);//
        a.setY(200);

        b.setX(200);
        b.setY(700);

        c.setX(300);
        c.setY(400);

        d.setX(350);
        d.setY(600);

        e.setX(500);
        e.setY(400);

        f.setX(100);
        f.setY(200);

        h.setX(200);
        h.setY(700);

        i.setX(400);
        i.setY(200);

        j.setX(650);
        j.setY(100);

        k.setX(650);
        k.setY(650);

        l.setX(300);
        l.setY(500);

        m.setX(600);
        m.setY(50);

        n.setX(700);
        n.setY(350);

        o.setX(500);
        o.setY(750);

        p.setX(50);
        p.setY(750);

        q.setX(750);
        q.setY(450);

        r.setX(50);
        r.setY(30);

        s.setX(600);
        s.setY(300);

        t.setX(50);
        t.setY(500);

        u.setX(650);
        u.setY(700);

        v.setX(400);
        v.setY(40);
>>>>>>> 82a471235842d3ddf38be8f98bc4a28e4d51d64c
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

<<<<<<< HEAD
        // background
        img = ImageLoader.loadImage("/../img/grass.jpeg");
        g2d.drawImage(img, 0, 0, 800, 800, null);

        for (Food flower : food) {
            flower.paint("/../img/flower.png", g2d);
        }
        for (Enemy enemy : enemies) {
            enemy.paint("/../img/bug.png", g2d);
        }
        myPlayer.paint("/../img/bee.png", g2d);
        door.paint("/../img/hive.png", g2d);
    }

    public void gameOver() {
        JOptionPane.showMessageDialog(this, "Eaten by bugs. Mission failed! Points: " + getScore(),
                "Game Over", JOptionPane.YES_NO_OPTION);
        System.exit(ABORT);
    }

    public void youWin() {
        if(getScore() >= 20){
        JOptionPane.showMessageDialog(this, "You are a wizard! Your score is: " + getScore(),
                "You Win", JOptionPane.YES_NO_OPTION);
        System.exit(ABORT);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Mission Impossible");
=======
        a.paint(g2d);
        b.paint((g2d));
        c.paint((g2d));
        d.paint((g2d));
        e.paint((g2d));
        f.paint((g2d));
        h.paint((g2d));
        i.paint((g2d));
        j.paint((g2d));
        k.paint((g2d));
        l.paint((g2d));
        m.paint((g2d));
        n.paint((g2d));
        o.paint((g2d));
        p.paint((g2d));
        q.paint((g2d));
        r.paint((g2d));
        s.paint((g2d));
        t.paint((g2d));
        u.paint((g2d));
        v.paint((g2d));
        door.paint(g2d);
        myPlayer.paint(g2d);

        g2d.setColor(Color.DARK_GRAY);
        g2d.setFont(new Font("Verdana", Font.BOLD, 30));
        g2d.drawString(String.valueOf(getScore()), 10, 30);
        ball.paint(g2d);
        thirdBall.paint(g2d);
        fourthBall.paint(g2d);
        fifthBall.paint(g2d);
        sixthBall.paint(g2d);
        seventhBall.paint(g2d);
        eightBall.paint(g2d);
        ninthBall.paint(g2d);
        tenthBall.paint(g2d);

        enemy.paint(g2d);
        enemy2.paint(g2d);
        enemy3.paint(g2d);
        enemy4.paint(g2d);
        enemy5.paint(g2d);
        enemy6.paint(g2d);
        enemy7.paint(g2d);
        enemy8.paint(g2d);
        enemy9.paint(g2d);
        enemy10.paint(g2d);
        enemy11.paint(g2d);
        enemy12.paint(g2d);

        secondBall.paint(g2d);
        enemy.paint(g2d);



    }

    public void gameOver() {
        JOptionPane.showMessageDialog(this, "your score is: " + getScore(),
                "Game Over", JOptionPane.YES_NO_OPTION);
        System.exit(ABORT);

    }

    public void youWin() {
        JOptionPane.showMessageDialog(this, "your score is: " + getScore(),
                "You Win", JOptionPane.YES_NO_OPTION);
        System.exit(ABORT);
    }

    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Mission Imposible");
>>>>>>> 82a471235842d3ddf38be8f98bc4a28e4d51d64c
        GameWindow game = new GameWindow();
        frame.add(game);
        frame.setSize(800, 800);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.setBallSizes();
<<<<<<< HEAD

         while (true) {
            game.move();
=======
        //BufferedImage img = ImageLoader.loadImage("/textures/grass.jpeg");

        //g.drawImage = (ImageLoader.loadImage("/textures/grass.jpeg"), 0, 0, null);


        while (true) {
            game.move();
            game.move1();
>>>>>>> 82a471235842d3ddf38be8f98bc4a28e4d51d64c
            game.repaint();
            Thread.sleep(5);
        }
    }
}