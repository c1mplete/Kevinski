package OOPübungen2;

import java.util.Scanner;

public class RechnungenAdvanced {
    //!Variabeln hier damit sie nur 1 mal Deklariert werden müssen
    private Integer zahl1, zahl2, zahl, grundRechenArt, zwischenstand, userPick;
    private int nummerZahl = 1;
    Scanner sc = new Scanner(System.in);

    //!Nachfrage ob der endbenutzer noch eine Zahl eingeben will
    public void abfrageFürNochEineRechnung(){
        System.out.println("Noch eine Zahl anlegen? Ja[1] Nein[2]");
        userPick = sc.nextInt();
        if(userPick == 1){
            start();
        }else{
            System.out.println("Danke!");
        }

    }
    //!Methode die herrausfindet welches rechenzeichen der bentzer will
    //!(wird auch nach der abfrage für eine neue Zahl wieder angezeigt)

    public int rechenzeichenherrausfiden(){
        System.out.println("Plus(1) - Minus(2) - Mal(3) - Geteilt(4)");
        grundRechenArt = sc.nextInt();
        return grundRechenArt;
    }
    //!Methode die die nummer des users speichert
    public int numbersUserInput(){
        //!nummerzahl wird nach jeder neuen benuzer eingegebenen zahl um 1 erhöht
        System.out.println("Geben sie die " + nummerZahl + ". Zahl ein");
        nummerZahl++;
        zahl = sc.nextInt();
        //!Nutzt die davor deklarierte Variabel zahl und speichert den wert dort ab
        return zahl;
    }
    //!Methode die für vermeidung von Redundanz sorgt bei den 4 verschiedenen Rechenzeichen
    public void getUserNumbers(){
        this.zahl1 = numbersUserInput();
        this.zahl2 = numbersUserInput();
    }
    public int addieren(){
        //!Kontrolliert ob die Aktuelle Rechnung die erste ist oder
        //!ob der Benutzer eine Zahl in dem Zwischenstand schon hat.
        //*nicht kontrollieren ob zwischenstand "0" ist sondern immer ob er "null" ist.
        if(zwischenstand == null) {
            getUserNumbers();
            zwischenstand = zahl1 + zahl2;
            //!Zwischenstand ist wieder eine davor deklarierte variabel,
            //!die wir für das spechern unserer Rechenlösungen nutzen
            return zwischenstand;
        }else{
            zahl1 = zwischenstand;
            zahl2 = numbersUserInput();
            zwischenstand = zahl1 + zahl2;
            return zwischenstand;
        }
    }
    public int subtrahieren(){
        if(zwischenstand == null) {
            getUserNumbers();
            zwischenstand = zahl1 - zahl2;
            return zwischenstand;
        }else{
            zahl1 = zwischenstand;
            zahl2 = numbersUserInput();
            zwischenstand = zahl1 - zahl2;
            return zwischenstand;
        }
    }
    public int multiplizieren(){
        if(zwischenstand == null) {
            getUserNumbers();
            zwischenstand = zahl1 * zahl2;
            return zwischenstand;
        }else{
            zahl1 = zwischenstand;
            zahl2 = numbersUserInput();
            zwischenstand = zahl1 * zahl2;
            return zwischenstand;
        }
    }
    public int dividieren(){
        if(zwischenstand == null) {
            getUserNumbers();
            zwischenstand = zahl1 / zahl2;
            return zwischenstand;
        }else{
            zahl1 = zwischenstand;
            zahl2 = numbersUserInput();
            zwischenstand = zahl1 / zahl2;
            return zwischenstand;
        }
    }
    //!Die Methode die die Logik aller Methode Zussamenpackt und eine Logische verbindung zwischen ihnen herstellt
    public void start(){
        switch(rechenzeichenherrausfiden()){
            case 1:
                System.out.println(addieren());
                break;
            case 2:
                System.out.println(subtrahieren());
                break;
            case 3:
                System.out.println(multiplizieren());
                break;
            case 4:
                System.out.println(dividieren());
                break;
        }
        abfrageFürNochEineRechnung();
    }
}
