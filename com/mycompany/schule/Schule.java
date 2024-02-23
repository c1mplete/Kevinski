/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.schule;

import java.util.Scanner;

/**
 *
 * @author KevTom
 */
public class Schule {

    public static void main(String[] args) {
        //Varible um die erste freie Position im Array zu speichern/manipulieren
        int ersteFreiePositionImarray = 0;

        Scanner sc = new Scanner(System.in);
        //Array immer vo 0 - n-1
        Schueler[] schuelerArray = new Schueler[10];

        Schueler s1 = new Schueler();

        schuelerArray[0] = new Schueler("Johann", "Senoner");
        System.out.println(schuelerArray[0].display());

        schuelerArray[1] = s1;
        schuelerArray[1].setVorname("Martin");
        schuelerArray[1].setNachname("Mair");
        System.out.println(schuelerArray[1].display());

        //finden aller initialisierten und nicht initialisierten positione im Array
        for (int i = 0; i <= schuelerArray.length - 1; i++) {
            if (schuelerArray[i] != null) {
                System.out.println(i + " Not null");
            } else {
                System.out.println(i + " null");
            }
        }
        //ersten freien Platz finden
        for (int i = 0; i < schuelerArray.length; i++) {
            if (schuelerArray[i] == null) {
                ersteFreiePositionImarray = i;
                System.out.println("Erste freie Position: " + ersteFreiePositionImarray);
                break;
            }
        }
        //Switch Auswahlsverfahren - menu
        boolean progLaeuft = true;
        while (progLaeuft) {
            System.out.println("1 - Schueleranzeigen \n2 - Schueler hinzufuegen \n3 - Programm beenden");
            int benutzerWahl = sc.nextInt();
            switch (benutzerWahl) {
                case 1:
                    System.out.println("Schuelerliste");
                    //Alle Schueler ausgeben
                    for (int i = 0; i < schuelerArray.length; i++) {
                        if (schuelerArray[i] != null) {
                            System.out.println(schuelerArray[i].toString());
                        }
                    }
                    break;
                case 2:
                    System.out.println("Vorname: ");
                    String vorname = sc.next();
                    sc.nextLine();
                    System.out.println("Nachname: ");
                    String nachname = sc.nextLine();
                    schuelerArray[ersteFreiePositionImarray] = new Schueler(vorname, nachname);
                    ersteFreiePositionImarray++;
                    break;
                case 3:
                    System.out.println("Programm beendet");
                    progLaeuft = false;
                    break;
                default:
                    System.out.println("Falsche eingabe");
                    break;
            }
        }

//        Schueler st = UserInput.createStudentFromUserInput();
//        System.out.println("Schüler wurde gemacht: " + st.getVorname() + " " + st.getNachname() + " \nMain teacher: " + st.getLehrer());
//
//        Lehrer lr = UserInput.createTeacherFromUserInput();
//        System.out.println("Lehrer wurde gemacht: " + lr.getVorname() + " " + lr.getNachname() + " \nKlassenraum: " + lr.getKlasse());
//        String nachname = "Priet";
//        
//        Schueler s1 = new Schueler();
//        s1.vorname = "Alex";
//        s1.nachname = "Martin";
//        s1.klasse = "INF3A";
//        System.out.println(s1.getData());
//        
//        Schueler s2 = new Schueler("Hannes", nachname, "INF3A");
//        
//        System.out.println(s1.getData());
//        System.out.println(s2.getData());
//        Schueler s1 = new Schueler("Sepp", "Laimer");
//        Lehrer l1 = new Lehrer("Alex", "Raffl", "INF22Z");
//        s1.setKlasse(l1);
//        System.out.println(s1.getKlasse());
//        
//        
//        Lehrer l2 = new Lehrer("Martin", "Rainer", "INF55L");
//        Schueler s2 = new Schueler("Franze", "Josef", l2);
//        s2.setKlasse();
//        System.out.println(s2.toString());
        //Mache einen scanner wo man die daten fuer den lehrer und den schueler eingeben kann.
    }
}
