package Vererbung.Car;

public class Auto extends Fahrzeug{
    public Auto(double pos, int speed) {
        super(pos, speed);
        this.numOfWheels = 4;
        this.maxSpeed = 140;
    }

    @Override
    public String toString(){
        return "Fahrrad: " + "Position: " + pos + " Geschwindigkeit: " + speed + " Maximalgeschwindigkeit: " + maxSpeed + " Anzahl der Räder: " + numOfWheels;
    }
}
