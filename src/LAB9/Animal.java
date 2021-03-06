package LAB9;

import java.security.SecureRandom;

public abstract class Animal implements Flyable {
    abstract void setName(String name);
    abstract String getName();
    abstract int getSpeed();
    int getSpeed(int maxSpeed) {
        return new SecureRandom().nextInt(maxSpeed);
    }
}
