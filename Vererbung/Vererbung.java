package Vererbung;

public class Vererbung {


    public static void main(String[] args) {
        System.out.println("Helo World!");
        Person p1 = new Person("Max", "Mustermann");
        Mitarbeiter m1 = new Mitarbeiter("Felix", "Baumgartner", "123456");
        System.out.println(p1.ganzeName());
        System.out.println(m1.alleDatenMitarbeiter());

        System.out.println("Helo World!");
        Person p2 = new Person("Max2", "Mustermann", 30);
        Mitarbeiter m2 = new Mitarbeiter("Felix2", "Baumgartner", 50, "123456");
        System.out.println(p2.ganzeName());
        System.out.println(m2.alleDatenMitarbeiter());
    }
}
