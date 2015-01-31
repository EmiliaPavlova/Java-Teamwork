package com.edu4java.minitennis1;

import java.awt.*;

public class Door {

    int width = 30;
    int height = 30;
    int x = 780;
    int y = 780;

    private GameWindow game;

    public Door(GameWindow game) {
        this.game = game;
    }

    public void paint(Graphics2D g){
        g.setColor(Color.BLUE);
        g.drawRect(x, y, width, height);
        g.fillRect(x, y, width,height);
    }

    public Rectangle getDoorBounds() {
        return new Rectangle(x, y, width, height);
    }


}
