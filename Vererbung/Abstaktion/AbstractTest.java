package Vererbung.Abstaktion;

public class AbstractTest {
    public static void main(String[] args) {
        Ducati panigale = new Ducati();
        System.out.println("Ausgangspunkt: " + panigale.getPosition().x);
        panigale.fahre(100);
        System.out.println("Ausgangspunkt: " + panigale.getPosition().x);
        panigale.bewegeDich(20,40);
        System.out.println("Endpunkt: " + panigale.getPosition().x + " Höhe: " + panigale.getPosition().y);

        //Raumschiff enterprise = new Raumschiff(); //FEHLER
    }
}
