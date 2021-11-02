package Lesson2;

import java.util.Scanner;

public class MultipleIfElse {

    public static void main(String[] args) {
        /*
         * <18t : khong ban
         * >=18 <50: unlimited
         * >=50: 2 chai
         * */

        //--------doSthHere----------|------------doAnotherThere----------|---------SthElse----------
        Scanner scanner = new Scanner(System.in);
        System.out.println("input your age");
        Short cusAge = scanner.nextShort();

        if (cusAge < 18) {
            if (cusAge < 16) {
                emergencyCall("Lost children!");
            } else {
                System.out.println("khong ban!");
            }
        } else if (cusAge < 50) {
            System.out.println("unlimited");
        } else {
            System.out.println("2chai");
        }
    }

    private static void emergencyCall(String message) {
        System.out.println("call 911...");
        System.out.println(message);
    }
}
