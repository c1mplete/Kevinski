package GUI.Schule;

public class Person {

    public String vorname;
    public String nachname;
    public int matrikelnr;

    public Person(String vorname, String nachname, int matrikelnr) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.matrikelnr = matrikelnr;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public int getMatrikelnr() {
        return matrikelnr;
    }
}

