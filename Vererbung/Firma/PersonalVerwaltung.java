package Vererbung.Firma;

import java.util.ArrayList;

public class PersonalVerwaltung{
    ArrayList<Mitarbeiter> mitarbeiterListe = new ArrayList<>();
    ArrayList<Abrechnung> abrechnungListe = new ArrayList<>();


    public void listMitarbeiter() {
        for (Mitarbeiter m : mitarbeiterListe) {
            System.out.println(m.toString());
        }
    }

    public void addMitarbeiter(Mitarbeiter m){
        mitarbeiterListe.add(m);
    }

    public void removeMitarbeiter(Mitarbeiter m){
        mitarbeiterListe.remove(m);
    }

    public void addAbrechnung(Abrechnung a){
        abrechnungListe.add(a);
    }

    public void removeAbrechnung(Abrechnung a){
        abrechnungListe.remove(a);
    }

    public void listAbrechnungen(int periode){
        for (Abrechnung a : abrechnungListe) {
            if(a.getPeriode() == periode){
                System.out.println(a.toString());
            }
        }
    }

    public void sortMitarbeiter(){
        for(int k = 0; k < mitarbeiterListe.size(); k++){
            for(int l = 0; l < mitarbeiterListe.size(); l++){
                if(mitarbeiterListe.get(k).compareTo(mitarbeiterListe.get(l)) < 0){
                    Mitarbeiter temp = mitarbeiterListe.get(k);
                    mitarbeiterListe.set(k, mitarbeiterListe.get(l));
                    mitarbeiterListe.set(l, temp);
                }
            }
        }
    }

}
