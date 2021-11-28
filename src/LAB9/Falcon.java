package LAB9;

import java.security.SecureRandom;

public class Falcon extends Animal{
    private String name = "Dog";
    private boolean isFlyable = true;
    private int maxSpeed = 90;
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

//    @Override
//    public int getRandomSpeed() {
//        return new SecureRandom().nextInt(maxSpeed);
//    }
}
