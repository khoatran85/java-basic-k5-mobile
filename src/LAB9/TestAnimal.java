package LAB9;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestAnimal {

    public static void main(String[] args) {
        startGame();
    }

    private static void findWinner() {
//        int dogMaxSpeed = 60;
//        int tigerMaxSpeed = 80;
//        int horseMaxSpeed = 70;
//        int falconMaxSpeed = 90;

        Dog dog = new Dog();
        Tiger tiger = new Tiger();
        Falcon falcon = new Falcon();
        Eagle eagle = new Eagle();

        List<Animal> allAnimals = new ArrayList<Animal>();
        allAnimals.add(dog);
        allAnimals.add(tiger);
        allAnimals.add(falcon);
        allAnimals.add(eagle);

        System.out.println(dog.getName() + ":" + dog.getSpeed());
        System.out.println(tiger.getName() + ":" + tiger.getSpeed());
        System.out.println(falcon.getName() + ":" + falcon.getSpeed());
        System.out.println(eagle.getName() + ":" + eagle.getSpeed());

        List<Animal> animalsWithWings = new ArrayList<Animal>();

        for (Animal animal : allAnimals) {
            if (animal.isFlyable() == true) {
                animalsWithWings.add(animal);
            }
        }

        int winnerSpeed = 0;
        String winnerName = "";

        for (int i = 0; i < animalsWithWings.size() - 1; i++) {
            winnerSpeed = animalsWithWings.get(i).getSpeed();
            if (animalsWithWings.get(i + 1).getSpeed() > winnerSpeed) {
                winnerSpeed = animalsWithWings.get(i + 1).getSpeed();
                System.out.println(winnerSpeed);
                winnerName = animalsWithWings.get(i + 1).getName();
                System.out.println(winnerName);
            } else {
                winnerSpeed = animalsWithWings.get(i).getSpeed();
                winnerName = animalsWithWings.get(i).getName();
            }
        }
        System.out.println("The winner is " + winnerName + " with speed = " + winnerSpeed);
        System.out.println("==============================================");


    }

    private static void startGame() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Hit Enter To Start Game");
//            scanner.nextLine();
            try {
                int read = System.in.read(new byte[2]);
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("==========ROUND " + (i + 1) + "===========");
            findWinner();
        }
    }


}



