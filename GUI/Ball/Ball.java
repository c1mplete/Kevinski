package GUI.Ball;

import java.awt.Color;
import java.awt.Graphics;

public class Ball {

    private int posX, posY, size;
    Program program;

    private Color color;

    private int vx = 5;
    private int vy = 5;

    public Ball(int posX, int posY, int size, Color color, int vx, int vy, Program program) {
        this.posX = posX;
        this.posY = posY;
        this.size = size;
        this.color = color;
        this.vx = vx;
        this.vy = vy;
        this.program = program;
    }

    void update() {

        if (posX > program.mainFrame.getWidth() || posX < 0) {
            vx *= -1;
        }

        if (posY > program.mainFrame.getHeight() || posY < 0) {
            vy *= -1;
        }

        if (posX > program.mainFrame.getWidth()) {
            posX = program.mainFrame.getWidth();
        }

        if (posX < 0) {
            posX = 0;
        }

        if (posY > program.mainFrame.getHeight()) {
            posY = program.mainFrame.getHeight();
        }

        if (posY < 0) {
            posY = 0;
        }

        this.posX += vx;
        this.posY += vy;

    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(posX, posY, size, size);
    }
}