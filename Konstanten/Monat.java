package Konstanten;

public enum Monat {
    JANUAR(31, Jahreszeit.WINTER),
    FEBRUAR(28, Jahreszeit.WINTER),
    MAERZ(31, Jahreszeit.FRUEHLING),
    APRIL(30, Jahreszeit.FRUEHLING),
    MAI(31, Jahreszeit.FRUEHLING),
    JUNI(30, Jahreszeit.SOMMER),
    JULI(31, Jahreszeit.SOMMER),
    AUGUST(31, Jahreszeit.SOMMER),
    SEPTEMBER(30, Jahreszeit.HERBST),
    OKTOBER(31, Jahreszeit.HERBST),
    NOVEMBER(30, Jahreszeit.HERBST),
    DEZEMBER(31, Jahreszeit.WINTER);

    private int mtage;
    private Jahreszeit mjahreszeit;
    Monat(int tage, Jahreszeit jahreszeit) {
        mtage = tage;
        mjahreszeit = jahreszeit;
    }

    int getAnzahlTage() {
        return mtage;
    }

    boolean inJahreszeit(Jahreszeit jahreszeit) {
        return mjahreszeit == jahreszeit;
    }

    //make me a method that returns the number of days in a season
    int getDaysInSeason(Jahreszeit jahreszeit) {
        int days = 0;
        for (Monat m : Monat.values()) {
            if (m.inJahreszeit(jahreszeit)) {
                days += m.getAnzahlTage();
            }
        }
        return days;
    }

    String getSeason(Monat m){
        if (m.inJahreszeit(Jahreszeit.WINTER)) {
            return "Ja, " + m.name() + " ist im Winter";
        } else if (m.inJahreszeit(Jahreszeit.FRUEHLING)) {
            return "Ja, " + m.name() + " ist im Frühling";
        } else if (m.inJahreszeit(Jahreszeit.SOMMER)) {
            return "Ja, " + m.name() + " ist im Sommer";
        } else if (m.inJahreszeit(Jahreszeit.HERBST)) {
            return "Ja, " + m.name() + " ist im Herbst";
        }else{
            return "Nein, " + m.name() + " ist in keiner Jahreszeit";
        }
    }


}
