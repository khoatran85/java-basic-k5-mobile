package LAB9;

public class Dog extends Animal {
    private String name = "Dog";
    private boolean isFlyable = false;
    private int maxSpeed = 60;
    private int randomSpeed = getSpeed(maxSpeed);



    @Override
    void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    int getSpeed() {
        return randomSpeed;
    }

    @Override
    public boolean isFlyable() {
        return isFlyable;
    }
}
