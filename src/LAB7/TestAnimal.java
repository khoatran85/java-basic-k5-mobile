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

        Map<String, Integer> animalWithWings = new HashMap<>();
        Map<String, Integer> animalWithoutWings = new HashMap<>();
        Map<String, Integer> allAnimal = new HashMap<>();

        for (Animal a : animalList) {
            allAnimal.put(a.getName(), a.getRunSpeed());
            if (a.isWithWings() == true)
                animalWithWings.put(a.getName(), a.getRunSpeed());
            else
                animalWithoutWings.put(a.getName(), a.getRunSpeed());

        }

        System.out.println("===========Result For All Animals=============");
        allAnimalResult(allAnimal);

        System.out.println("===========Result For Animal With Wings=============");
        allAnimalResult(animalWithWings);

        System.out.println("===========Result For Animal Without Wings=============");
        allAnimalResult(animalWithoutWings);

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


