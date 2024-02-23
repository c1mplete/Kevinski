package Vererbung.Car;

public class Fahrzeug {
    protected double pos;
    protected int speed;
    protected int maxSpeed = 0;
    protected int numOfWheels = 0;

    public Fahrzeug(double pos, int speed) {
        this.pos = pos;
        this.speed = speed;
    }

    public double drive(double min){
        if(speed > maxSpeed){
            System.out.print(" Du kannst nicht so schnell fahren");
            return pos;
        }else if(speed != 0) {
            pos += speed * min / 60;
            return pos;
        }else{
            return pos;
        }
    }

    public void setSpeed(int maxSpeed, int setSpeed) {
        if (setSpeed < maxSpeed) {
            this.speed = maxSpeed;
        }
    }


}
