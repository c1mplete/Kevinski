package Vererbung.Abstaktion;

import java.awt.*;

abstract class Raumschiff extends Fahrzeug{
    @Override
    void bewegeDich(int h, int v) {
        throw new UnsupportedOperationException("not supported");
    }
    Point fliege(int h, int v){
        return new Point(getPosition().x + h, getPosition().y + v);
    }
}
