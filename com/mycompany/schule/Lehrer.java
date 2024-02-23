package com.mycompany.schule;

public class Lehrer {
    String vorname;
    String nachname;
    String klasse;
    
    public Lehrer(){
        
    }
    
    public Lehrer(String vorname){
        this.vorname = vorname;
    }
    
    public Lehrer(String vorname, String nachname, String klasse){
        this.vorname = vorname;
        this.nachname = nachname;
        this.klasse = klasse;
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
    
    
}
