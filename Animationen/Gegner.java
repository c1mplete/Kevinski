package Animationen;

import java.awt.*;

public class Gegner extends Thread {
    Oberflaeche oberflaeche;
    Rechteck gegner;

    public Gegner(Oberflaeche oberflaeche, Rechteck gegner) {
        this.oberflaeche = oberflaeche;
        this.gegner = gegner;
    }

    @Override
    public void run() {
        while (!oberflaeche.isGameOver()) {
            // Calculate direction vector from enemy to player
            int diffX = oberflaeche.spieler.x - gegner.x;
            int diffY = oberflaeche.spieler.y - gegner.y;

            // Normalize direction vector
            double distance = Math.hypot(diffX, diffY);
            if (distance >  0) {
                diffX /= distance;
                diffY /= distance;
            }

            // Move the enemy in the direction of the player
            gegner.x += diffX * SPEED;
            gegner.y += diffY * SPEED;

            // Check for collision with boundaries and the player
            if (isCollisionWithBoundary() || isCollisionWithSpieler()) {
                oberflaeche.setGameOver(true); // Set game over
                System.out.println("Gameover");
                break; // Stop moving if hits boundary or the player
            }
            oberflaeche.repaint();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private boolean isCollisionWithBoundary() {
        Rectangle gameWindow = new Rectangle(0,  0, oberflaeche.getWidth(), oberflaeche.getHeight());
        return !gameWindow.contains(gegner);
    }

    private boolean isCollisionWithSpieler() {
        return oberflaeche.spieler.intersects(gegner);
    }
}
