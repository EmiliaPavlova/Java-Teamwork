package com.edu4java.minitennis1;


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


@SuppressWarnings("serial")
public class GameWindow extends JPanel {


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


    Door door = new Door(this);

    Playa myPlayer = new Playa(this);
    int speed = 1;

    private int getScore() {
        return speed - 1;
    }

    public GameWindow(){
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
        myPlayer.move();
    }

    private void setBallSizes(){

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
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

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
        GameWindow game = new GameWindow();
        frame.add(game);
        frame.setSize(800, 800);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.setBallSizes();
        //BufferedImage img = ImageLoader.loadImage("/textures/grass.jpeg");

        //g.drawImage = (ImageLoader.loadImage("/textures/grass.jpeg"), 0, 0, null);


        while (true) {
            game.move();
            game.move1();
            game.repaint();
            Thread.sleep(5);
        }
    }
}