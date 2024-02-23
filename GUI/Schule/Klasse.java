package GUI.Schule;

import java.util.ArrayList;
public class Klasse {
    private ArrayList<Klasse> klassen = new ArrayList<Klasse>();
    private ArrayList<Schueler> klasse = new ArrayList<Schueler>();
    private Lehrer klassenlehrer;
    private String klassenname;

    public Klasse(String klassenname, Lehrer klassenlehrer) {
        this.klassenname = klassenname;
        this.klassenlehrer = klassenlehrer;
        klassen.add(this);
    }

    public ArrayList<Klasse> getAllKlassen() {
        return klassen;
    }

    public void removeKlasse(Klasse klasseToRemove) {
        klassen.remove(klasseToRemove);
    }

    public ArrayList<String> getAllClassNames() {
        ArrayList<String> classNames = new ArrayList<>();
        for (Klasse klass : klassen) {
            classNames.add(klass.getName());
        }
        return classNames;
    }

    public void getClassFromString(String klassenname) {
        for (Klasse klass : klassen) {
            if (klass.getName().equals(klassenname)) {
                this.klassenname = klassenname;
                this.klassenlehrer = klass.getKlassenlehrer();
                this.klasse = klass.getKlasse();
            }
        }
    }

    public String getKlassenname(){
        return this.klassenname;
    }

    public void setKlassenname(String klassenname) {
        this.klassenname = klassenname;
    }

    public ArrayList<Schueler> getKlasse() {
        return klasse;
    }

    public void removeSchueler(Schueler schueler){
        this.klasse.remove(schueler);
    }

    public void addSchueler(Schueler schueler) {
        this.klasse.add(schueler);
    }

    public Lehrer getKlassenlehrer() {
        return this.klassenlehrer;
    }

    public void setKlassenlehrer(Lehrer klassenlehrer) {
        this.klassenlehrer = klassenlehrer;
    }

    public String getName() {
        return this.klassenname;
    }

}
