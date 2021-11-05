package Lesson3;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        final int[] myIntArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        final int MAX_GUESS_TIME = 3;

        int guessTime = 0;

        // lay random number trong array theo index : new SecureRandom().nextInt(myIntArr.length)

        int randomNum = myIntArr[new SecureRandom().nextInt(myIntArr.length)];
        System.out.println("Random Number = " + randomNum);

        // challenge allow user guess a number, maximum 3 times | Do...While

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input your number:");
            int userNum = scanner.nextInt();

            if(userNum == randomNum){
                System.out.println("Hooray!!!");
                break;
            }
            guessTime++;
            System.out.println("Incorrect!!!");
        } while (guessTime < MAX_GUESS_TIME);
        System.out.println("See you next time!");
    }



    /*
    * Vi du: dang nhap 3 lan -> khoa tai khoan
    *
    * */
}
