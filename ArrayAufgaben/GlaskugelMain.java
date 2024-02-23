/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayAufgaben;

/**
 *3) Klasse SchluesselbrettVierer

3a) Erzeugen Sie ein Array namens schluesselliste, das Objekte der Klasse Schluessel aufnehmen kann.

3b) Sobald der Methode schluesselAnsBrettHaengen(…) via Parameter ein Schlüssel übergeben wird, soll dieses Objekt in das Array eingefügt werden.
Problem: Welchen Index-Wert benutzen wir jeweils? Seien Sie kreativ!

! Sie müssen nicht überprüfen, ob ein Schlüssel schon am Brett hängt. Notfalls kommt es zu Dopplungen.

3c) Zusatzaufgabe: Jeder Schlüssel soll nur genau einmal auf dem Brett hängen dürfen.
 * @author KevTom
 */
public class GlaskugelMain {
    public static void main(String[] args) {
        Glaskugel g1 = new Glaskugel();
        g1.lottozahlenErzeugen();
        g1.lottzahlenAusgeben();
    }
}
