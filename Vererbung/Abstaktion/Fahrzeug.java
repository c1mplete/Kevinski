package Vererbung.Abstaktion;

import java.awt.*;

abstract class Fahrzeug {
    Point position = new Point(0,0);

    abstract void bewegeDich(int h, int v);

    Point getPosition(){
        return position;
    }
}
