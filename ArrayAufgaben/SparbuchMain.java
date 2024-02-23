/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayAufgaben;

/**
 *
 * @author KevTom
 */
public class SparbuchMain {

    public static void main(String[] args) {
        Sparbuch s1 = new Sparbuch();
        s1.sparbuchEinzahlen(1000, 1000, 800, 1300);
        s1.anzahlElemente();
        s1.getIndexOfElement(1000);
        s1.getIndexOfElement(1300);
    }
}
