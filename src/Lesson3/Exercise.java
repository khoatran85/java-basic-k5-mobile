package Lesson3;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        System.out.println("=========EXERCISE 1============");
        System.out.println("Total minutes = " + calculateTotalMinutes("2hrs and 5 minutes"));

        System.out.println("=========EXERCISE 2============");
        inputPasswords("password123");

        System.out.println("=========EXERCISE 3============");
        getDigitFromString("100 minutes");

        System.out.println("=========EXERCISE 4============");
        getURLInfo("https://www.google.com");
    }


    private static int calculateTotalMinutes(String stringTime) {
        String[] splitString = stringTime.split(" and ");
        int hour = Integer.parseInt(splitString[0].replace("hrs", "").trim());
        int minute = Integer.parseInt(splitString[1].replace("minutes", "").trim());
        int totalMinute = hour * 60 + minute;
        return totalMinute;
    }

    private static void inputPasswords(String password) {
        int countInput = 0;
        String inputPasswords = "";
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input your password: ");
            inputPasswords = scanner.nextLine();
            if (inputPasswords.equals(password)) {
                System.out.println("You Logged In Successfully!");
                break;
            }
            countInput++;
            System.out.println("Incorrect Password!");
        } while (countInput < 3);
        if (countInput == 3 && !inputPasswords.equals(password)) {
            System.out.println("Your account is locked!");
        }
    }

    private static void getDigitFromString(String text) {
        String digits = "";
        char[] myCharacters = text.toCharArray();
        for (char myCharacter : myCharacters) {
            if (Character.isDigit(myCharacter)) {
                digits = digits + myCharacter;
            }
        }
        if (digits.isEmpty()) {
            System.out.println("No number found");
        }else {
            System.out.println(digits);
        }

    }


    private static void getURLInfo(String url) {
        String[] urlArray = url.toLowerCase().replace("www.", "").split("://|\\.");
        System.out.println("PROTOCOL = " + urlArray[0]);
        System.out.println("DOMAIN NAME = " + urlArray[1]);
        System.out.println("TOP-LEVEL DOMAIN = " + urlArray[2]);
    }
}

/*
 * Exercise 1:
 * Give input string: "2hrs and 5 minutes"
 * Please calculate how many minute in total
 */

/*
 * Exercise 2:
 * String myPassword = "password123"
 * Allow user to input maximum 3 times
 */

/*
 * Exercise 3:
 * String myStr = "100 minutes"
 * Not use Regex, extract digit character from that String
 * Expected output : "100"
 * Ex: "12345n678" -> "12345678"
 */

/*
 * Exercise 4:
 * String url = "https://google.com";
 * Check http or https; domain name, .com or .net
 */