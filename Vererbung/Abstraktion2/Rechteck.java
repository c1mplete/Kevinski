package Vererbung.Abstraktion2;

public class Rechteck extends GeometricheFigur{
    double hoehe;
    double breite;

    public double berechneFlaeche(){
        return hoehe*breite;
    }
}
