/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayAufgaben;
import java.util.Arrays;
/**
 *1) Klasse Sparbuch

Ein Array enthält diese Werte:
1000
1000
800
1300

private int[] einzahlungsliste = new int[4]

1a) Wie viele Elemente enthält dieses Array?

1b) Welchen index-Wert hat das erste Element?

1c) Welchen Index-Wert hat das vierte Element?

1d) Legen Sie ein double-Array einzahlungsliste als Attribut in der Klasse Sparbuch an und weisen Sie die Werte zu; testen Sie zwei verschiedene Möglichkeiten der Wertzuweisung:
- new … + Initialisierung im Konstruktor;
- direkte Initialisierung {…} bei der Deklarierung

HINWEIS: Stelle die Antworten auf die Aufgaben in der Konsle mit einer konkreten Ausgabe dar!
 * @author KevTom
 */
public class Sparbuch {
    
    double[] einzahlungsliste = new double[4];
    
    public void sparbuchEinzahlen(double double1, double double2, double double3, double double4){
        
        einzahlungsliste[0] = double1;
        einzahlungsliste[1] = double2;
        einzahlungsliste[2] = double3;
        einzahlungsliste[3] = double4;
        
    }
    
    public void anzahlElemente(){
            System.out.println(String.valueOf(einzahlungsliste.length));
    }
    
    public void getIndexOfElement(int n){
        for(int i = 0; i < einzahlungsliste.length; i++){
            if(einzahlungsliste[i] == n){
                System.out.println(i);
                break;
            }
            
        }
    }
    
        
        
        
     
    
}
