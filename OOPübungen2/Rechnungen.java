package OOPübungen2;

import java.util.Scanner;

public class Rechnungen {
    public int rechenzeichenherrausfiden(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Plus(1) - Minus(2) - Mal(3) - Geteilt(4)");
        int grundRechenArt = sc.nextInt();
        return grundRechenArt;
    }
    public int numbersUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben sie eine Zahl ein");
        int zahl = sc.nextInt();
        return zahl;
    }
    public void addieren(){
        int zahl1 = numbersUserInput();
        int zahl2 = numbersUserInput();
        System.out.println(zahl1 + zahl2);
    }
    public void subtrahieren(){
        int zahl1 = numbersUserInput();
        int zahl2 = numbersUserInput();
        System.out.println(zahl1 - zahl2);
    }
    public void multiplizieren(){
        int zahl1 = numbersUserInput();
        int zahl2 = numbersUserInput();
        System.out.println(zahl1 * zahl2);
    }
    public void dividieren(){
        int zahl1 = numbersUserInput();
        int zahl2 = numbersUserInput();
        System.out.println(zahl1 / zahl2);
    }
    public void start(){
        switch(rechenzeichenherrausfiden()){
            case 1:
                addieren();
                break;
            case 2:
                subtrahieren();
                break;
            case 3:
                multiplizieren();
                break;
            case 4:
                dividieren();
                break;
        }
    }
}
