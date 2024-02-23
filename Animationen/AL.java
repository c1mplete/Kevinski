package Animationen;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class AL extends KeyAdapter {

    Rechteck spieler;
    Oberflaeche oberflaeche;

    public AL(Rechteck spieler, Oberflaeche oberflaeche) {
        this.spieler = spieler;
        this.oberflaeche = oberflaeche;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        spieler.inputKontrolle(e, oberflaeche);
        oberflaeche.repaint();
    }
}
