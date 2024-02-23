package Animationen;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;

public class Oberflaeche extends JFrame {
    Rechteck spieler;
    Gegner gegner;
    Rechteck gegnerRechteck;
    boolean gameOver = false;

    public Oberflaeche() {
        spieler = new Rechteck(10,   10,   50,   50, Color.yellow);
        gegnerRechteck = new Rechteck(500,   500,   50,   50, Color.red);
        gegner = new Gegner(this, gegnerRechteck);

        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                spieler.inputKontrolle(e, Oberflaeche.this);
                repaint();
            }
        });

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,   600);
        this.setVisible(true);

        // Start the Gegner thread to make it move towards the player
        new Thread(gegner).start();
    }

    @Override
    public void paint(Graphics g) {
        super.paintComponents(g);
        if (!gameOver) {
            spieler.zeichne(g);
            gegnerRechteck.zeichne(g);
        }
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }
}
