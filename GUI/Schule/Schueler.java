package GUI.Schule;

import java.util.ArrayList;

public class Schueler extends Person {
    private static ArrayList<Schueler> schueler = new ArrayList<Schueler>();
    private int matrikelnr;
    private String vorname;
    private String nachname;

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public Schueler(String vorname, String nachname, int matrikelnr) {
        super(vorname, nachname, matrikelnr);
        this.vorname = vorname;
        this.nachname = nachname;
        this.matrikelnr = matrikelnr;
        schueler.add(this);
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public static ArrayList<Schueler> getAllSchueler() {
        return schueler;
    }

    public static Schueler getSchueler(int matrikelnr) {
        for (Schueler s : schueler) {
            if (s.getMatrikelnr() == matrikelnr) {
                return s;
            }
        }
        return null;
    }

    public static void deleteSchueler(int matrikelnr) {
        for (Schueler s : schueler) {
            if (s.getMatrikelnr() == matrikelnr) {
                schueler.remove(s);
                break;
            }
        }
    }

    public static void updateSchueler(int matrikelnr, String vorname, String nachname) {
        for (Schueler s : schueler) {
            if (s.getMatrikelnr() == matrikelnr) {
                s.setVorname(vorname);
                s.setNachname(nachname);
                break;
            }
        }
    }

    public int getMatrikelnr() {
        return matrikelnr;
    }

    public static Schueler getSchuelerByName(String name) {
        for (Schueler s : schueler) {
            if (s.getNachname().equals(name)) {
                return s;
            }
        }
        return null;
    }

    public String getNachname() {
        return nachname;
    }
}

