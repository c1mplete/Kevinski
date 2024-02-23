package Konstanten;

public class Kleidung {
    Groessen kleiderGroessen;

    public Kleidung(Groessen g){
        kleiderGroessen = g;
    }

    public void bestelleKleidung(){
        switch(kleiderGroessen){
            case KLEIN:
                System.out.println("Kleidung in der Größe klein wurde bestellt");
                break;
            case MITTEL:
                System.out.println("Kleidung in der Größe mittel wurde bestellt");
                break;
            case GROSS:
                System.out.println("Kleidung in der Größe groß wurde bestellt");
                break;
            case EXTRAGROSS:
                System.out.println("Kleidung in der Größe extra groß wurde bestellt");
                break;
            default:
                System.out.println("Fehlerhafte Bestellung");
                break;
        }
    }
}
