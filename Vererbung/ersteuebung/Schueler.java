package Vererbung.ersteuebung;

public class Schueler extends Person{
    private int stufe;
    private int abijahrgang;

    private Schueler (String name, int geburtsjahr, int stufe, int abijahrgang) {
        super(name, geburtsjahr);
        this.stufe = stufe;
        this.abijahrgang = abijahrgang;
    }

    public int getStufe() {
        return stufe;
    }

    public int getAbijahrgang() {
        return abijahrgang;
    }
}
