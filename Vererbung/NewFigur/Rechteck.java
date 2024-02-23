package Vererbung.NewFigur;

public class Rechteck extends Figur implements Flaeche{

    private double b;
    private double h;

    public Rechteck(double x, double y, double b, double h){
        super(x, y);
        this.b = b;
        this.h = h;
    }

    public double flaecheninhalt() {
        return b * h;
    }

    public boolean enthaelt(Punkt pPunkt){
        return (pPunkt.getxKoord() >= x &&
                pPunkt.getxKoord() <= b + x &&
                pPunkt.getyKoord() >= y &&
                pPunkt.getyKoord() <= h + y);
    }

    public String toString(){
        return "Rechteck mit Eckpunkt " + super.toString() + ", Breite " + b + " und " + h;
    }

}
