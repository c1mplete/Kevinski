package com.mycompany.schule;

public class Schueler {
    
    private String vorname; 
    private String nachname;
    private String klasse;
    private Lehrer lehrer;
    //Schluesselwort static: keine bindung n en Objekt
    public static int objectZaehler = 0;
    
    //Defaultconstructor - StandardConstructor
    public Schueler(){
        objectZaehler++;
    }
    
    public Schueler(String vorname, String nachname, String klasse){
                objectZaehler++;
                this.vorname = vorname;
                this.nachname = nachname;
                this.klasse = klasse;

    }
    
    public Schueler(String vorname, String nachname, Lehrer lehrer){
        objectZaehler++;
        this.vorname = vorname;
        this.nachname = nachname;
        this.lehrer = lehrer;
    }
    
    public Schueler (String vorname, String nachname){
        objectZaehler++;
        this.vorname = vorname;
        this.nachname = nachname;
    }
    
    public Lehrer getLehrer(){
        return lehrer;
    }
    
    public void setLehrer(Lehrer lehrer){
        this.lehrer = lehrer;
    }
    
    
    public void setKlasse(){
        this.klasse = lehrer.getKlasse();
    }
    
    public void setKlasse(Lehrer lehrer){
        this.klasse = lehrer.getKlasse();
    }
    
    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getKlasse() {
        return klasse;
    }

    public void setKlasse(String klasse) {
        this.klasse = klasse;
    }

    @Override
    public String toString(){
        return this.vorname+ " " + this.nachname + " " + this.klasse;
    }
    
    public String display(){
        return vorname + " " + nachname + " " + objectZaehler;
    }
    
    

}
