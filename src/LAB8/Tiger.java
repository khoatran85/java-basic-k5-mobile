package LAB8;

import java.security.SecureRandom;

public class Tiger extends Animal{
    int speed = getRandomSpeed(maxSpeed);

    public Tiger(String name, int maxSpeed) {
        super(name, maxSpeed);
    }

    @Override
    protected int getSpeed() {
        return this.speed;
    }

}
