package LAB9;

import java.security.SecureRandom;

public class Dog extends Animal {
    private String name = "Dog";
    private boolean isFlyable = false;
    private int maxSpeed = 60;
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
    int getRandomSpeed() {
        return randomSpeed;
    }

    @Override
    public boolean isFlyable() {
        return isFlyable;
    }
//
//    @Override
//    public int getRandomSpeed() {
//        randomSpeed =  new SecureRandom().nextInt(maxSpeed);
//        System.out.println("Dog class 1 = " +randomSpeed);
//        return randomSpeed;
//    }
}
