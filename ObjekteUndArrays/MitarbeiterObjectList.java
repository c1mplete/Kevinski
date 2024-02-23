package ObjekteUndArrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MitarbeiterObjectList {
    ArrayList<Mitarbeiter> mitarbeiterListe = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    //add() erlaubt es Elemente dr Liste hinzuzufügen
    public void addMitarbeiter(Mitarbeiter m){
        mitarbeiterListe.add(m);
    }

    public void printMitarbeiter(){
        for (Mitarbeiter n : mitarbeiterListe) {
            System.out.println(n);
        }
    }

    public void mitarbeiterEingeben() {

        while (true) {
            System.out.println("Vorname: ");
            String vorname = sc.nextLine();
            if (vorname.isEmpty()) {
                break;
            }
            System.out.println("Nachname: ");
            String nachname = sc.nextLine();
            if (nachname.isEmpty()) {
                break;
            }
            Mitarbeiter m = new Mitarbeiter(vorname, nachname);
            mitarbeiterListe.add(m);
        }
    }

    public void getAnzahlElemente(){
        System.out.println(mitarbeiterListe.size());
    }

    public void mitarbeiterEingebenAlsGesamtString(){
        while(true) {
            System.out.println("Bitte Mitarbeiter eingeben: ");
            String mitarbeiter = sc.nextLine();
            if(mitarbeiter.isEmpty()){
                break;
            }
            String[] mitarbeiterArray = mitarbeiter.split(",");
            Mitarbeiter m = new Mitarbeiter(mitarbeiterArray[0], mitarbeiterArray[1]);
            mitarbeiterListe.add(m);
        }
    }

    //Mitarbeiter an einer bestimmten stelle einfuegen
    public void mitarbeiterAnBestimmterPositionEingeben(int p, Mitarbeiter m){
        mitarbeiterListe.add(p, m);
    }

    public void mitarbeiterAnBestimmterPositionUpdaten(int p, Mitarbeiter m){
        mitarbeiterListe.set(p, m);
    }

    //Methode zum Suchen nach einem bestimmten Nachnamen, ausgabe des Objekts
    public void mitarbeiterSuchen(String nachname){
        for (Mitarbeiter m : mitarbeiterListe) {
            if(m.getNachname().equals(nachname)){
                //now get the index of the user
                int index = mitarbeiterListe.indexOf(m);
                System.out.println(m + " ist auf index " + index + " gespeichert.");
            }
        }
    }

    public void mitarbeiterLoeschen(String nachname){
        Iterator<Mitarbeiter> iterator = mitarbeiterListe.iterator();
        while(iterator.hasNext()){
            Mitarbeiter m = iterator.next();
            if(m.getNachname().equals(nachname)){
                System.out.println(m + " wurde gelöscht.");
                iterator.remove();
                System.out.println("Done Deleting");
            }
        }
    }


}
