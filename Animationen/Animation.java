/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Animationen;

import javax.swing.*;

public class Animation {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Bouncing Balls");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);

        MyBall myBallPanel = new MyBall();
        Ball ball1 = new Ball(50, 50);
        Ball ball2 = new Ball(100, 100);
        Ball ball3 = new Ball(150, 150);
        Ball ball4 = new Ball(200, 200);
        Ball ball5 = new Ball(250, 250);
        Ball ball6 = new Ball(300, 300);
        myBallPanel.addBall(ball1);
        myBallPanel.addBall(ball2);
        myBallPanel.addBall(ball3);
        myBallPanel.addBall(ball4);
        myBallPanel.addBall(ball5);
        myBallPanel.addBall(ball6);

        frame.add(myBallPanel);
        frame.setVisible(true);
    }
}
