package LAB8;

import java.security.SecureRandom;

public abstract class Animal {
    protected String name;
    protected int maxSpeed;
    int speed;

    public Animal() {
    }

    public Animal(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }


    protected String getName(){return name;}

    protected int getRandomSpeed(int maxSpeed){
        return new SecureRandom().nextInt(maxSpeed);
    }

    protected abstract int getSpeed();

}
