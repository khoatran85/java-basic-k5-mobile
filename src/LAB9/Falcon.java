package LAB9;

public class Falcon extends Animal{
    private String name = "Falcon";
    private boolean isFlyable = true;
    private int maxSpeed = 90;
    int randomSpeed = getSpeed(maxSpeed);

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
    int getSpeed() {
        return randomSpeed;
    }

//    @Override
//    public int getRandomSpeed() {
//        return new SecureRandom().nextInt(maxSpeed);
//    }
}
