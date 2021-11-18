package LAB6;

public class Tiger extends Animal{
    String name = "Tiger";
    static int tigerMaxSpeed = 60;

    protected int tigerSpeed() {
        return randomSpeed(tigerMaxSpeed);
    }
}
