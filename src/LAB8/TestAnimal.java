package LAB8;

import java.util.ArrayList;
import java.util.List;

public class TestAnimal {

    private static Dog dog;
    private static int speed;

    public static void main(String[] args) {

        Dog dog = new Dog("Dog", 60);
        Horse horse = new Horse("Horse", 80);
        Tiger tiger = new Tiger("Tiger", 100);

        List<Animal> allAnimals = new ArrayList<>();
        allAnimals.add(dog);
        allAnimals.add(tiger);
        allAnimals.add(horse);

        System.out.println(dog.getName() + ":" + dog.getSpeed());
        System.out.println(horse.getName() + ":" + horse.getSpeed());
        System.out.println(tiger.getName() + ":" + tiger.getSpeed());

        int winnerSpeed = 0;
        String winnerName = "";

        for (Animal animal : allAnimals) {
            if (animal.getSpeed() > winnerSpeed) {
                winnerSpeed = animal.getSpeed();
                winnerName = animal.getName();
            }
        }

        System.out.println("The winner is " + winnerName + " with speed = " + winnerSpeed);
        System.out.println("==============================================");

    }
}