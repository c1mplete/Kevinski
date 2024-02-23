package Vererbung.Firma;

public abstract class Abrechnung {
    private int periode;
    private Mitarbeiter mitarbeiter;

    public Abrechnung(int periode, Mitarbeiter m){
        this.periode = periode;
        this.mitarbeiter = m;
    }
    public int getPeriode(){
        return periode;
    }
    public Mitarbeiter getMitarbeiter(){
        return mitarbeiter;
    }
    public abstract double getVerdienst();

    public void setPeriode(int periode) {
        this.periode = periode;
    }

    public void setMitarbeiter(Mitarbeiter mitarbeiter) {
        this.mitarbeiter = mitarbeiter;
    }
    @Override
    public String toString(){
        return "Periode: " + periode + " Mitarbeiter: " + getMitarbeiter() + " Verdienst: " + getVerdienst();
    }
}
