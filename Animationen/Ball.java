package Animationen;

import java.awt.*;

public class Ball {
    private int radius =  20;
    private int x = radius;
    private int y = radius;
    private int velocityX =  20;
    private int velocityY =  20;

    public Ball(int initialX, int initialY) {
        this.x = initialX;
        this.y = initialY;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getVelocityX() {
        return velocityX;
    }

    public void setVelocityX(int velocityX) {
        this.velocityX = velocityX;
    }

    public int getVelocityY() {
        return velocityY;
    }

    public void setVelocityY(int velocityY) {
        this.velocityY = velocityY;
    }

    public void updatePosition(int fieldWidth, int fieldHeight) {
        x += velocityX;
        y += velocityY;

        if (x - radius <=  0 || x + radius >= fieldWidth) {
            velocityX = -velocityX;
        }
        if (y - radius <=  0 || y + radius >= fieldHeight) {
            velocityY = -velocityY;
        }
    }

    public void draw(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillOval(x - radius, y - radius, radius *  2, radius *  2);
    }
}
