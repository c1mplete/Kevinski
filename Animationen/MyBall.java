package Animationen;

import Animationen.Ball;


import javax.swing.JPanel;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;
import java.util.ArrayList;

public class MyBall extends JPanel {
    private final int FIELD_WIDTH =  600;
    private final int FIELD_HEIGHT =  500;
    private static final int UPDATE_RATE =  30;

    private List<Ball> balls = new ArrayList<>();

    public MyBall() {
        this.setPreferredSize(new Dimension(FIELD_WIDTH, FIELD_HEIGHT));

        Thread ballThread = new Thread() {
            public void run() {
                while (true) {
                    try {
                        for (Ball ball : balls) {
                            ball.updatePosition(FIELD_WIDTH, FIELD_HEIGHT);
                        }
                        repaint();
                        Thread.sleep(1000 / UPDATE_RATE);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        ballThread.start();
    }

    public void addBall(Ball ball) {
        balls.add(ball);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Ball ball : balls) {
            ball.draw(g);
        }
    }
}


