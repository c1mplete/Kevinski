package Vererbung.NewFigur;

public class Punkt extends Figur {

    public Punkt(double x, double y){
        super(x, y);
    }

    double flaecheninhalt() {
        return 0;
    }

    public boolean enthaelt(Punkt pPunkt){
        return (x == pPunkt.getxKoord() && y == pPunkt.getyKoord());
    }

}