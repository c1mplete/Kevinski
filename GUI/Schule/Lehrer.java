package GUI.Schule;

public class Lehrer extends Person {
    private String fach;

    public Lehrer(String vorname, String nachname, int matrikelnr, String fach) {
        super(vorname, nachname, matrikelnr);
        this.fach = fach;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public int getMatrikelnummer() {
        return matrikelnr;
    }

    public void setMatrikelnummer(int matrikelnummer) {
        this.matrikelnr = matrikelnummer;
    }

    public String getFach() {
        return fach;
    }

    public void setFach(String fach) {
        this.fach = fach;
    }
}
