package com.mycompany.schule.OOPUEEINS;
import java.util.Scanner;

public class Auto {

        
    private String kennZeichen;
    private double kilometerStand;
    private double tankVolumen;
    private double krafstoffVerbrauch;
    private double kraftstoffMenge;
    private static int nummer=1;

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }
    
    
    
    public Auto(){
    this.nummer=nummer+1;
    }
    
    public Auto(String kennZeichen, double kilometerStand, double tankVolumen, double krafstoffVerbrauch, double kraftstoffMenge) {
        this.kennZeichen = kennZeichen;
        this.kilometerStand = kilometerStand;
        this.tankVolumen = tankVolumen;
        this.krafstoffVerbrauch = krafstoffVerbrauch;
        this.kraftstoffMenge = kraftstoffMenge;
        this.nummer=nummer+1;
    }
    
    public void tanken (double menge){
        if(this.kraftstoffMenge + menge <= this.tankVolumen){
            this.kraftstoffMenge = this.kraftstoffMenge + menge;
        }else{
            System.out.println("Too much Gas");
        }
        
    }
    
    public void fahren(double strecke){
        if(this.kraftstoffMenge / this.krafstoffVerbrauch >= strecke){
            this.kraftstoffMenge = this.kraftstoffMenge - (strecke * this.krafstoffVerbrauch);
            this.kilometerStand = this.kilometerStand + strecke;
            System.out.println("U still have " + this.kraftstoffMenge + " L of gas");
        }else{
            System.out.println("Not enough Gas");
        }
    }
    
    public String getKennzeichen() {
        return kennZeichen;
    }

    public void setKennzeichen(String kennzeichen) {
        this.kennZeichen = kennzeichen;
    }

    public double getKilometerstand() {
        return kilometerStand;
    }

    public void setKilometerstand(int kilometerstand) {
        this.kilometerStand = kilometerstand;
    }

    public double getTankvolumen() {
        return tankVolumen;
    }

    public void setTankvolumen(double tankvolumen) {
        this.tankVolumen = tankvolumen;
    }

    public double getKrafstoffverbrauch() {
        return krafstoffVerbrauch;
    }

    public void setKrafstoffverbrauch(double krafstoffverbrauch) {
        this.krafstoffVerbrauch = krafstoffverbrauch;
    }

    public double getKtaftstoffmenge() {
        return kraftstoffMenge;
    }

    public void setKtaftstoffmenge(double ktaftstoffmenge) {
        this.kraftstoffMenge = ktaftstoffmenge;
    }
    
    public void einlesenUndSpeichernDerDaten(Scanner sc){
        System.out.println("Enter Car's Plate:");
        this.kennZeichen = sc.nextLine();
        
        System.out.println("Enter Car's Kilometers (km) :");
        this.kilometerStand = sc.nextDouble();
        
        System.out.println("Enter Car's TankVolume (L) :");
        this.tankVolumen = sc.nextDouble();
        
        System.out.println("Enter Car's Consumption (L/km) :");
        this.krafstoffVerbrauch = sc.nextDouble();
        
        System.out.println("Enter Car's GasAmountInCar (L) :");
        this.kraftstoffMenge = sc.nextDouble();
    }
    
    public String toString(){
        
        return "Auto: " + getKennzeichen() + " " + getKilometerstand() + " " + getTankvolumen() + " " + getKrafstoffverbrauch() + " " + getKtaftstoffmenge();
        
    }
}
