package LAB6;

import java.security.SecureRandom;

public class Animal {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    String name;
    int maxSpeed;

    public Animal() {
    }


    protected int randomSpeed(int maxSpeed){
        return new SecureRandom().nextInt(maxSpeed);
    }

}
