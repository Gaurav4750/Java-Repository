import MotorBike.*;
import java.lang.*;
import java.util.*;

public class BikeRunner {
    public static void main(String[] args) {
        MotorBike Honda = new MotorBike();
        MotorBike Ducati = new MotorBike();

        Honda.setSpeed(60);
        Ducati.setSpeed(100);

        Honda.increaseSpeed(57);
        Ducati.increaseSpeed(100);

        Ducati.decreaseSpeed(46);
        Honda.decreaseSpeed(30);

        System.out.println("Honda final Speed: " + Honda.getSpeed());
        System.out.println("Ducati final Speed:" + Ducati.getSpeed());
    }
}