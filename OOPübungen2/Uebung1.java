package OOPübungen2;

import java.util.Scanner;

public class Uebung1 {

   
    
    public static void GeradeOderUngeraeErkennen() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben sie eine Zhl für wochentag ein");
        int zhl = sc.nextInt();

        switch (zhl % 2) {
            case 0:
                System.out.println("Gerade");
            case 1:
                System.out.println("Ungerade");
        }
    }

    public static void ErstenBuchstabenerkennen() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben sie ein Wort ein");
        char wort = sc.next().charAt(0);

        switch (wort) {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                System.out.println("Selbslaut");
                break;
            default:
                System.out.println("Konsonant");
        }
    }

    public static void WochentagAusgeben() {
        String[] wochentage = {"Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben sie eine Zhl für wochentag ein");
        int day = sc.nextInt();

        if (day <= 7) {
            switch (day) {
                case 1:
                    System.out.println(wochentage[day - 1]);
                    break;
                case 2:
                    System.out.println(wochentage[day - 1]);
                    break;
                case 3:
                    System.out.println(wochentage[day - 1]);
                    break;
                case 4:
                    System.out.println(wochentage[day - 1]);
                    break;
                case 5:
                    System.out.println(wochentage[day - 1]);
                    break;
                case 6:
                    System.out.println(wochentage[day - 1]);
                    break;
                case 7:
                    System.out.println(wochentage[day - 1]);
                    break;
            }
        } else {
            System.out.println("Die Wochentage gehen von 1 bis 7");
        }
    }

    public static void main(String[] args) {
        //WochentagAusgeben();
        ErstenBuchstabenerkennen();
    }
}
