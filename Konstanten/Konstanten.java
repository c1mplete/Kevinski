package Konstanten;

public class Konstanten {

    public static void main(String[] args) {
        Kleidung hose = new Kleidung(Groessen.KLEIN);
        hose.bestelleKleidung();

        //selbstgeschriebene Methode
        System.out.println(Groessen.GROSS.getGroessen());
        //Position
        System.out.println("Position " + Groessen.GROSS.ordinal());
        //Vergleich
        System.out.println("Vergleich " + Groessen.GROSS.compareTo(Groessen.KLEIN));

        Monat m = Monat.FEBRUAR;
        System.out.println(m.name() + " hat " + m.getAnzahlTage() + " Tage");
        System.out.println(m.getSeason(m));

        System.out.println("Der Winter hat " + m.getDaysInSeason(Jahreszeit.WINTER) + " Tage");
    }
}
