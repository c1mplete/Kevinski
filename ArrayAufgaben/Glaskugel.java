/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayAufgaben;

import java.util.Random;

/**
 *
 * @author KevTom
 */
public class Glaskugel {

    int[] lottoListe = new int[6];

    public void glaskugelErstellen() {

    }

    public void lottozahlenErzeugen() {
        Random rand = new Random();

        for (int i = 0; i < lottoListe.length; i++) {
            int zufallszahl;
            boolean bereitsVorhanden;
            do {
                bereitsVorhanden = false;
                zufallszahl = rand.nextInt(49) + 1;

                for (int j = 0; j < i; j++) {
                    if (lottoListe[j] == zufallszahl) {
                        bereitsVorhanden = true;
                        break;
                    }
                }
            } while (bereitsVorhanden);

            lottoListe[i] = zufallszahl;
        }
    }

    public void lottzahlenAusgeben() {
        for (int i = 0; i < lottoListe.length; i++) {
            if (i == lottoListe.length - 1) {
                System.out.println(lottoListe[i]);
            } else {
                System.out.print(lottoListe[i] + ", ");
            }
        }
    }

}
