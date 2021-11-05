package Lesson2;

import java.util.Scanner;

public class IfStatement {
    static boolean isHeOntime;  // defalt value = false

    public static void main(String[] args) {
        System.out.println("1. dat xe ra\n");
        System.out.println("2. Khoi dong xe\n");
        System.out.println("3. Chay toi quan\n");


//        if (isHeOntime) {
//            System.out.println("Let's talk");
//        } else {
//            writeALetter("See you later");
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input arrived time:");
        int arriveTime = scanner.nextInt();
        isHeOntime = arriveTime <= 7 ? returnTrue() : returnFalse();

    }

    private static void writeALetter(String msg) {
        System.out.println(msg);
    }

    private static boolean returnTrue() {
        return true;
    }

    private static boolean returnFalse() {
        return false;
    }

}