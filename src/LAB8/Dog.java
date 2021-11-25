package LAB8;

import java.security.SecureRandom;

public class Dog extends Animal {
    String dogName;
    int dogSpeed;

    @Override
    public void setName(String name) {
        dogName = "Dog";
    }

    @Override
    public int getRandomSpeed(int maxSpeed) {
    return new SecureRandom().nextInt(maxSpeed);
    }

}
