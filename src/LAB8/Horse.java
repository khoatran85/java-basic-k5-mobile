package LAB8;

import java.security.SecureRandom;

public class Horse extends Animal{
    int speed = getRandomSpeed(maxSpeed);
    public Horse(String name, int maxSpeed) {
        super(name, maxSpeed);
    }

    @Override
    protected int getSpeed() {
        return this.speed;
    }

}
