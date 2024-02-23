package GUI.Ball;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

class Program {

    public JFrame mainFrame;
    public DrawPanel drawPanel;
    public java.util.List<Ball> balls;

    public int windowWidth = 640;
    public int windowHeight = 480;
    public String windowLabel = "Bounce Program";

    void run() {

        balls = new ArrayList<>();

        /* Generate balls */
        for (int i = 0; i < 1000000; i++) {
            Ball ball = new Ball(
                    /* Random positions from 0 to windowWidth or windowHeight */
                    (int) Math.floor(Math.random() * windowWidth),
                    (int) Math.floor(Math.random() * windowHeight),
                    /* Random size from 10 to 30 */
                    (int) Math.floor(Math.random() * 20) + 10,
                    /* Random RGB colors*/
                    new Color(
                            (int) Math.floor((Math.random() * 256)),
                            (int) Math.floor((Math.random() * 256)),
                            (int) Math.floor((Math.random() * 256))
                    ),
                    /* Random velocities from -5 to 5 */
                    (int) Math.floor((Math.random() * 10) - 5),
                    (int) Math.floor((Math.random() * 10) - 5),
                    this
            );

            balls.add(ball);
        }

        /* Initialize program */
        mainFrame = new JFrame();
        drawPanel = new DrawPanel(balls);
        mainFrame.getContentPane().add(drawPanel);
        mainFrame.setTitle(windowLabel);
        mainFrame.setSize(windowWidth, windowHeight);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        while (true) {
            for (Ball b : balls) {
                b.update();
            }

            /* Give Swing 10 milliseconds to see the update! */
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            mainFrame.repaint();
        }
    }

    public JFrame getMainFrame() {
        return mainFrame;
    }

    public void setMainFrame(JFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    public DrawPanel getDrawPanel() {
        return drawPanel;
    }

    public void setDrawPanel(DrawPanel drawPanel) {
        this.drawPanel = drawPanel;
    }

    public List<Ball> getBalls() {
        return balls;
    }

    public void setBalls(List<Ball> balls) {
        this.balls = balls;
    }

    public int getWindowWidth() {
        return windowWidth;
    }

    public void setWindowWidth(int windowWidth) {
        this.windowWidth = windowWidth;
    }

    public int getWindowHeight() {
        return windowHeight;
    }

    public void setWindowHeight(int windowHeight) {
        this.windowHeight = windowHeight;
    }

    public String getWindowLabel() {
        return windowLabel;
    }

    public void setWindowLabel(String windowLabel) {
        this.windowLabel = windowLabel;
    }


}