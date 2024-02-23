package GUI.GUI;
import java.util.ArrayList;

public class MitarbeiterListe {
    ArrayList<Mitarbeiter> mitarbeiterListe = new ArrayList<GUI.GUI.Mitarbeiter>();

    public void addMitarbeiter(Mitarbeiter mitarbeiter) {
        mitarbeiterListe.add(mitarbeiter);
    }

    public void removeMitarbeiter(Mitarbeiter mitarbeiter) {
        mitarbeiterListe.remove(mitarbeiter);
    }

    public ArrayList<Mitarbeiter> getMitarbeiterListe() {
        return mitarbeiterListe;
    }

}
