package LAB9;

public class Eagle extends Animal{
    private String name = "Eagle";
    private boolean isFlyable = true;
    private int maxSpeed = 100;
    int randomSpeed = getRandomSpeed(maxSpeed);

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean isFlyable() {
        return isFlyable;
    }

    @Override
    int getRandomSpeed() {
        return randomSpeed;
    }

}
