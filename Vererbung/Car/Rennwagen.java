package Vererbung.Car;

public class Rennwagen extends Auto{

    public Rennwagen(double pos, int speed) {
        super(pos, speed);
        this.numOfWheels = 4;
        this.maxSpeed = 220;
    }

    @Override
    public String toString(){
        return "Rennwagen: " + "Position: " + pos + " Geschwindigkeit: " + speed + "KM/H Maximalgeschwindigkeit: " + maxSpeed + "KM/H Anzahl der Räder: " + numOfWheels;
    }
}
