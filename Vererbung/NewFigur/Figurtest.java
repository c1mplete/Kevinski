package Vererbung.NewFigur;

public class Figurtest {

    public static void main(String[] args) {

        Rechteck meinRechteck = new Rechteck(100, 100, 40, 20);
        System.out.println(meinRechteck);
        System.out.println(meinRechteck.flaecheninhalt());
        System.out.println(meinRechteck.enthaelt(new Punkt(120,110)));
        System.out.println(meinRechteck.enthaelt(new Punkt(90,110)));

        Kreis meinKreis = new Kreis(400, 200, 10);
        System.out.println(meinKreis);
        System.out.println(meinKreis.flaecheninhalt());
        System.out.println(meinKreis.enthaelt(new Punkt(400,210)));

        Quadrat meinQuadrat = new Quadrat(400, 200, 20);
        System.out.println(meinQuadrat);
        System.out.println(meinQuadrat.flaecheninhalt());
        System.out.println(meinQuadrat.enthaelt(meinKreis.getMittelPunkt()));

    }

}
