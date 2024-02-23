package Vererbung.Abstaktion;

import java.awt.*;

abstract class Motorrad extends Fahrzeug {
    @Override
    void bewegeDich(int h, int v) {
        position = new Point(h,v);
    }
    void fahre(int h){
        bewegeDich(h,0);
    }
}
