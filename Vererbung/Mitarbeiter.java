package Vererbung;

public class Mitarbeiter extends Person{
    private String martikeNummer;

    public Mitarbeiter(String vn, String nn, int al, String martikeNummer) {
        super(vn, nn, al);
        this.martikeNummer = martikeNummer;
    }

    public Mitarbeiter(String vn, String nn, String martikeNummer) {
        super(vn, nn);
        this.martikeNummer = martikeNummer;
    }

    public String alleDatenMitarbeiter(){
        return ganzeName() + " " + martikeNummer;
    }


}
