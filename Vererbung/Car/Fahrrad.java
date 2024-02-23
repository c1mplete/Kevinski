package Vererbung.Car;

public class Fahrrad extends Fahrzeug{


    public Fahrrad(double pos, int speed) {
        super(pos, speed);
        this.numOfWheels = 2;
        this.maxSpeed = 30;
    }

    @Override
    public String toString(){
        return "Fahrrad: " + "Position: " + pos + " Geschwindigkeit: " + speed + " Maximalgeschwindigkeit: " + maxSpeed + " Anzahl der Räder: " + numOfWheels;
    }


}
