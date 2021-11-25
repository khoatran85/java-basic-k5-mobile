package LAB7;

import Lesson5.RobotCat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestAnimal {

    public static void main(String[] args) {
        String dogName = "Dog";
        String horseName = "Horse";
        String tigerName = "Tiger";
        String falconName = "Falcon";
        String beeName = "Bee";

        int dogMaxSpeed = 60;
        int horseMaxSpeed = 75;
        int tigerMaxSpeed = 80;
        int falconMaxSpeed = 100;
        int beeMaxSpeed = 40;

        Animal.Builder animal = new Animal.Builder();

        //generate all animal
        Animal dog = animal.animalName(dogName).animalMaxSpeed(dogMaxSpeed).isWithWings(false).build();
        Animal horse = animal.animalName(horseName).animalMaxSpeed(horseMaxSpeed).isWithWings(false).build();
        Animal tiger = animal.animalName(tigerName).animalMaxSpeed(tigerMaxSpeed).isWithWings(false).build();
        Animal falcon = animal.animalName(falconName).animalMaxSpeed(falconMaxSpeed).isWithWings(true).build();
        Animal bee = animal.animalName(beeName).animalMaxSpeed(beeMaxSpeed).isWithWings(true).build();

        //get random speed
        int dogSpeed = dog.runSpeed(dogMaxSpeed);
        int horseSpeed = horse.runSpeed(horseMaxSpeed);
        int tigerSpeed = tiger.runSpeed(tigerMaxSpeed);
        int falconSpeed = falcon.runSpeed(falconMaxSpeed);
        int beeSpeed = bee.runSpeed(beeMaxSpeed);
        System.out.println(dogName + " speed = " + dogSpeed);
        System.out.println(horseName + " speed = " + horseSpeed);
        System.out.println(tigerName + " speed = " + tigerSpeed);
        System.out.println(falconName + " speed = " + falconSpeed);
        System.out.println(beeName + " speed = " + beeSpeed);

        dog.setRunSpeed(dogSpeed);
        horse.setRunSpeed(horseSpeed);
        tiger.setRunSpeed(tigerSpeed);
        falcon.setRunSpeed(falconSpeed);
        bee.setRunSpeed(beeSpeed);

        List<Animal> animalList = new ArrayList<>();
        animalList.add(dog);
        animalList.add(horse);
        animalList.add(tiger);
        animalList.add(falcon);
        animalList.add(bee);

        Map<String, Integer> animalsWithWings = new HashMap<>();
        Map<String, Integer> animalsWithoutWings = new HashMap<>();
        Map<String, Integer> allAnimals = new HashMap<>();

        for (Animal a : animalList) {
            allAnimals.put(a.getName(), a.getRunSpeed());
            if (a.isWithWings() == true)
                animalsWithWings.put(a.getName(), a.getRunSpeed());
            else
                animalsWithoutWings.put(a.getName(), a.getRunSpeed());
        }

        System.out.println("===========All Animals Result=============");
        allAnimalResult(allAnimals);

        System.out.println("===========Animals With Wings Result=============");
        allAnimalResult(animalsWithWings);

        System.out.println("===========Animals Without Wings Result=============");
        allAnimalResult(animalsWithoutWings);

    }


    private static void allAnimalResult(Map<String, Integer> list) {
        int winnerSpeed = 0;
        String winnerName = "";
        for (Map.Entry<String, Integer> entry : list.entrySet()) {
            if (entry.getValue() > winnerSpeed) {
                winnerSpeed = entry.getValue();
                winnerName = entry.getKey();
            }
        }
        System.out.println("Winner is " + winnerName + " with speed = " + winnerSpeed);
    }
}


