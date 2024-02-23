package Vererbung.Car;

import java.util.Calendar;

public class Krankenwagen extends Auto {

    private boolean blaulicht = false;
    public Krankenwagen(double pos, int speed) {
        super(pos, speed);
        this.numOfWheels = 4;
        this.maxSpeed = 140;
    }

    @Override
    public String toString(){
        return "Fahrrad: " + "Position: " + pos + " Geschwindigkeit: " + speed + " Maximalgeschwindigkeit: " + maxSpeed + " Anzahl der Räder: " + numOfWheels + " Blaulicht: " + blaulicht;
    }
    public void blaulichtSwitch(){
        if(blaulicht){
            blaulicht = false;
        }else{
            blaulicht = true;
        }
    }

}
