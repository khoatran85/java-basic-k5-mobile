package LAB8;

import java.security.SecureRandom;

public class Dog extends Animal {
    int speed = getRandomSpeed(maxSpeed);

    public Dog(String name, int maxSpeed) {
        super(name, maxSpeed);
    }

    @Override
    protected int getSpeed() {
        return this.speed;
    }

}
