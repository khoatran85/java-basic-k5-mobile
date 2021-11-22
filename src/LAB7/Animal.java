package LAB7;

import java.security.SecureRandom;

public class Animal {
    private int maxSpeed;
    private String name;
    private boolean withWings;
    private int runSpeed;

    public String getName() {
        return name;
    }

    public boolean isWithWings() {
        return withWings;
    }

    public void setRunSpeed(int runSpeed) {
        this.runSpeed = runSpeed;
    }

    public int getRunSpeed() {
        return runSpeed;
    }

    private Animal(Builder builder) {
        maxSpeed = builder.maxSpeed;
        name = builder.name;
        withWings = builder.withWings;
    }

    public int runSpeed(int maxSpeed) {
        return new SecureRandom().nextInt(maxSpeed);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "maxSpeed=" + maxSpeed +
                ", name='" + name + '\'' +
                ", withWings=" + withWings +
                ", runSpeed=" + runSpeed +
                '}';
    }

    public static class Builder {
        private int maxSpeed;
        private String name;
        private boolean withWings;

        public Builder animalName(String name) {
            this.name = name;
            return this;
        }

        public Builder animalMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Builder isWithWings(boolean withWings) {
            this.withWings = withWings;
            return this;
        }

        public Animal build() {
            return new Animal(this);
        }
    }
}
