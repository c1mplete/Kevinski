package GUI.GUI;

public class Mitarbeiter extends MitarbeiterListe {

    private String vorname;
    private String nachname;

    public Mitarbeiter() {}

    public Mitarbeiter(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
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

    @Override
    public String toString() {
        if (vorname != null && nachname != null) {
            return vorname + " " + nachname;
        } else {
            return ""; // Return an empty string for null elements
        }
    }
}