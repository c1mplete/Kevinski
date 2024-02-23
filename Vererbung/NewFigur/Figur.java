package Vererbung.NewFigur;

public abstract class Figur {

    protected double x;
    protected double y;

    public Figur(double x, double y){
        this.x = x;
        this.y = y;
    }

    abstract boolean enthaelt(Punkt pPunkt);
    public String toString(){
        return "|" + x +" ### "+ y + "|";
    }
    public double getxKoord() {
        return x;
    }
    public double getyKoord() {
        return y;
    }
}
