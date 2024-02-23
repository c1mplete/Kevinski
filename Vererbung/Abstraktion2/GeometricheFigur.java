package Vererbung.Abstraktion2;

import java.awt.*;

abstract class GeometricheFigur {
    private Color farbe;

    public Color getColor(){
        return farbe;
    }
    public void setColor(Color farbe){
        this.farbe = farbe;
    }
    abstract double berechneFlaeche();
}
