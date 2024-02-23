package Vererbung.Abstraktion2;

import java.awt.*;

public class Kreis extends GeometricheFigur{
    private double radius;
    public double berechneFlaeche(){
        return 3.14*(radius*radius);
    }


    public static void main(String[] args) {
        new Kreis().setColor(Color.BLACK);
    }
}
