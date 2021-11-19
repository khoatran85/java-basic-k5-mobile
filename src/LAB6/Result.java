package LAB6;


import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;

public class Result {


    public static void main(String[] args) {
        Dog dog = new Dog();
        Horse horse = new Horse();
        Tiger tiger = new Tiger();

        //Set name for animal
        dog.setName(dog.name);
        horse.setName(horse.name);
        tiger.setName(tiger.name);


        //get random speed
        int dogSpeed = dog.dogSpeed();
        int horseSpeed = horse.horseSpeed();
        int tigerSpeed = tiger.tigerSpeed();

        System.out.println("Dog speed = " + dogSpeed);
        System.out.println("Horse speed = " + horseSpeed);
        System.out.println("Tiger speed = " + tigerSpeed);

        //Generate MAP with key = animal name, value = speed
        Map<String, Integer> resultList = new HashMap<>();
        resultList.put(dog.getName(), dogSpeed);
        resultList.put(horse.getName(), horseSpeed);
        resultList.put(tiger.getName(), tigerSpeed);

        // For loop in MAP to find out max value and get key name
        int winnerSpeed = 0;
        String winnerName = "";
        for (Map.Entry<String, Integer> entry : resultList.entrySet()) {
            if (entry.getValue() > winnerSpeed) {
                winnerSpeed = entry.getValue();
                winnerName = entry.getKey();
            }
        }
        System.out.println("Winner is " + winnerName + " with speed = " + winnerSpeed);

        switch (winnerName) {
            case "Dog":
                System.out.println(dog.getClassName());
                break;
            case "Horse":
                System.out.println(horse.getClassName());
                break;
            case "Tiger":
                System.out.println(tiger.getClassName());
                break;
        }
    }
}
