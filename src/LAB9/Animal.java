package LAB9;

import java.security.SecureRandom;

public abstract class Animal implements Flyable {
    abstract void setName(String name);
    int getRandomSpeed(int maxSpeed) {
        return new SecureRandom().nextInt(maxSpeed);
    }
    abstract String getName();
    abstract int getRandomSpeed();
}
