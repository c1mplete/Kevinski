package Vererbung;

public class Person {
    private String vorname;
    private String nachname;
    private int alter;

    public Person(String vn, String nn, int al){
        this.vorname = vn;
        this.nachname = nn;
        this.alter = al;
    }
    public Person(String vn, String nn){
        this.vorname = vn;
        this.nachname = nn;
    }

    public String ganzeName(){
        if(alter > 0)
            return vorname + " " + nachname + " " + alter;
        else
            return vorname + " " + nachname;
    }
}
