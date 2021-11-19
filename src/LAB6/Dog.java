package LAB6;

public class Dog extends Animal {
    String name = "Dog";
    static int dogMaxSpeed = 60;

     protected int dogSpeed() {
        return randomSpeed(dogMaxSpeed);
    }

    private void setName(){
        setName(name);
    }

}
