package LAB6;

public class Horse extends Animal{
    String name = "Horse";
    static int horseMaxSpeed = 75;

    protected  int horseSpeed() {
        return randomSpeed(horseMaxSpeed);
    }
}