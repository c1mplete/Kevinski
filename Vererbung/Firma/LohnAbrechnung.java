package Vererbung.Firma;

public class LohnAbrechnung extends Abrechnung{
    private double stundenLohn;
    private double anzahlStunden;

    public LohnAbrechnung(int periode, Mitarbeiter m, double stundenlohn, int stunden) {
        super(periode, m);
        this.stundenLohn = stundenlohn;
        this.anzahlStunden = stunden;

    }
    public double getVerdienst() {
        return stundenLohn * anzahlStunden;
    }

    public double getStundenLohn() {
        return stundenLohn;
    }

    public void setStundenLohn(double stundenLohn) {
        this.stundenLohn = stundenLohn;
    }

    public double getAnzahlStunden() {
        return anzahlStunden;
    }

    public void setAnzahlStunden(double anzahlStunden) {
        this.anzahlStunden = anzahlStunden;
    }

    public String toString(){
        return "Periode: " + getPeriode() + " Mitarbeiter: " + getMitarbeiter() + " Verdienst: " + getVerdienst() + " Stundenlohn: " + getStundenLohn() + " Anzahl Stunden: " + getAnzahlStunden();
    }
}
