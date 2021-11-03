package Lesson2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ForLoopExercise {

    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    public static void exercise1() {
        System.out.println("====================EXERCISES 1================");
        int[] array = {3, 5, 7, 1, 4, 8, 6};

        int count = 0;
        int countNum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your number: ");
        try {
            countNum = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Require Number!!!!");
            System.exit(9999);
        }
        System.out.println("Pair of element indexes: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[i] + array[j] == countNum) {

                    System.out.println("(" + i + ", " + j + ")");
                    count += j;
                }
            }
        }
        if (count == 0) {
            System.out.println("We don't have any pair");
        }
    }

    public static void exercise2() {
        System.out.println("\n\n====================EXERCISES 2================");

        for (String a = "*"; a.length() <= 10; a = a + "*") {

            System.out.println(a);
        }


        for (String b = "**********"; b.length() > 0; b = deleteLastCharacter(b)) {

            System.out.println(b);
        }

    }


    private static String deleteLastCharacter(String text) {
        return text.substring(0, text.length() - 1);
    }


}


//
// 1/
//tim index 2 số có tổng = 9
// int[] e =[3,5,7,1,4,8,6]


// 2/
//*
//**
//***
//****
//*****
//******
//*******