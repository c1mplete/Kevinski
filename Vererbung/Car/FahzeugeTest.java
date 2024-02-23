package Vererbung.Car;

public class FahzeugeTest {
    public static void main(String[] args) {
        Rennwagen r1 = new Rennwagen(0, 300);
        System.out.println(r1.drive(120.0));
        System.out.println(r1.toString());

    }
}
