package Vererbung.ersteuebung;

public class Lehrer extends Person{

    private String ersesFach;
    private String zweitesFach;

    public Lehrer(String name, int geburtsjahr, String erstesFach, String zweitesFach) {
        super(name, geburtsjahr);
        this.ersesFach = erstesFach;
        this.zweitesFach = zweitesFach;
    }

    public String getErstesFach() {
        return ersesFach;
    }

    public String getZweitesFach() {
        return zweitesFach;
    }
}
