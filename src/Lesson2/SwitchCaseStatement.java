package Lesson2;

import java.util.Scanner;

public class SwitchCaseStatement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("in put your number");
        byte myNum = scanner.nextByte();
        switch (myNum) {
            case 1:
                System.out.println("giai 1");
//                break;
            case 2:
                System.out.println("giai 2");
                break;
            case 3:
                System.out.println("giai 3");
                break;
            default:
                System.out.println("chuc ban may man lan sau");
        }


        System.out.print("in put your date");
        byte date = scanner.nextByte();
        switch (date) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Weekdays!");
                break;
            case 7:
            case 8:
                System.out.println("Weekend!");
                break;
            default:
                System.out.println("Nhap sai roi...");
        }
    }


}
