package Vergleichen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class main {

    public static void main(String[] args) {
        ArrayList<Mitarbeiter> mitarbeiterListe = new ArrayList<>();
        mitarbeiterListe.add(new Mitarbeiter(1, "Alice", 20));
        mitarbeiterListe.add(new Mitarbeiter(2, "Peter", 30));
        mitarbeiterListe.add(new Mitarbeiter(3, "Klaus", 40));
        mitarbeiterListe.add(new Mitarbeiter(4, "Hans", 50));
        mitarbeiterListe.add(new Mitarbeiter(5, "Peter", 60));
        mitarbeiterListe.add(new Mitarbeiter(6, "Klaus", 70));
        mitarbeiterListe.add(new Mitarbeiter(7, "Hans", 80));

        System.out.println("unsortiert " + mitarbeiterListe);
        Collections.sort(mitarbeiterListe);
        System.out.println("sortiert " + mitarbeiterListe);
    }
}
