package Vererbung.NewFigur;

public class Kreis extends Figur implements Flaeche{

    private double r;
    private Punkt m;

    public Kreis(double x, double y, double r){
        super (x, y);
        this.r = r;
        m = new Punkt(x+r, y+r);
    }

    public double flaecheninhalt() {
        return 3.14 * r * r;
    }

    public boolean enthaelt(Punkt pPunkt){
        return (Math.sqrt( (pPunkt.getxKoord() - x)*(pPunkt.getxKoord()-x)+(pPunkt.getyKoord()-y)*(pPunkt.getyKoord()-y) )<= r);
    }

    public String toString(){
        return "Kreis mit Mittelpunkt " + m + " und Radius " + r;
    }

    public Punkt getMittelPunkt(){
        return m;
    }

}