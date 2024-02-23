package GUI.Ball;

import javax.swing.JPanel;
import java.awt.*;

class DrawPanel extends JPanel {

    public java.util.List<Ball> balls;

    public DrawPanel(java.util.List<Ball> balls) {
        this.balls = balls;
    }

    @Override
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);

        for (Ball b : balls) {
            b.draw(graphics);
        }

    }
}