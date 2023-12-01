public class MotorBike {

    // default constructor
    public MotorBike() {
    }

    // properties or state of class
    private int speed;

    // getter method
    public int getSpeed() {
        return speed;
    }

    // setter method
    public void setSpeed(int speed) {
        if (speed > 0) {
            this.speed = speed;
        }
    }

    public void increaseSpeed(int howMuch) {
        setSpeed(this.speed + howMuch);
    }

    public void decreaseSpeed(int howMuch) {
        setSpeed(this.speed - howMuch);
    }
}
