package LAB9;

import java.util.ArrayList;
import java.util.List;

public class TestAnimal {

    public static void main(String[] args) {
//        int dogMaxSpeed = 60;
//        int tigerMaxSpeed = 80;
//        int horseMaxSpeed = 70;
//        int falconMaxSpeed = 90;

        Dog dog = new Dog();
        Tiger tiger = new Tiger();
        Falcon falcon = new Falcon();

        System.out.println(dog.randomSpeed);
        System.out.println(dog.randomSpeed);
//        System.out.println(tiger.randomSpeed);
//        System.out.println(falcon.randomSpeed);
//        System.out.println(dog.getRandomSpeed(dogMaxSpeed));
//        System.out.println(tiger.getName());
//        System.out.println(tiger.getRandomSpeed(tigerMaxSpeed));
//        System.out.println("Dog flyable = " + dog.isFlyable());

        List<Animal> animalsWithWings = new ArrayList<Animal>();
        List<Animal> allAnimals = new ArrayList<Animal>();
        allAnimals.add(dog);
        allAnimals.add(tiger);
        allAnimals.add(falcon);

        for (Animal animal : allAnimals) {
            if (animal.isFlyable() == false) {
                animalsWithWings.add(animal);
            }
        }
//        for (Animal animal : animalsWithWings) {
//            System.out.println(animal.getName() + ": " + animal.getRandomSpeed());
//        }
//
//        int winnerSpeed = 0;
//        for (int i = 0; i < animalsWithWings.size() -1 ; i++) {
//            winnerSpeed = animalsWithWings.get(i).getRandomSpeed();
//            if(animalsWithWings.get(i+1).getRandomSpeed() > winnerSpeed){
//                winnerSpeed = animalsWithWings.get(i+1).getRandomSpeed();
//            }
//        }
        for (Animal animal : allAnimals) {
            System.out.println(animal.getName() + ": " + animal.getRandomSpeed());
        }
        int winnerSpeed = 0;
        for (int i = 0; i < allAnimals.size() -1 ; i++) {
            winnerSpeed = allAnimals.get(i).getRandomSpeed();
            if(allAnimals.get(i+1).getRandomSpeed() > winnerSpeed){
                winnerSpeed = allAnimals.get(i+1).getRandomSpeed();
            }
        }

        System.out.println(winnerSpeed);
    }

}



