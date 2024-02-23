package Vererbung.Firma;

public class GehaltsAbrechnung extends Abrechnung{
    private double gehalt;

    public GehaltsAbrechnung(int periode, Mitarbeiter m, double gehalt){
        super(periode, m);
        this.gehalt = gehalt;
    }
    public double getVerdienst(){
        return gehalt;
    }

    public double getGehalt() {
        return gehalt;
    }

    public void setGehalt(double gehalt) {
        this.gehalt = gehalt;
    }

    public String toString(){
        return "Periode: " + getPeriode() + " Mitarbeiter: " + getMitarbeiter() + " Verdienst: " + getVerdienst() + " Gehalt: " + getGehalt();
    }
}
