package LAB8;

import java.security.SecureRandom;

public abstract class Animal {

    protected String name;
    private int speed;

    public abstract void setName(String name);

    public String getName() {
        return name;
    }

    public abstract int getRandomSpeed(int maxSpeed);

    public int getSpeed() {
        return speed;
    }



}
