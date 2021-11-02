package Lesson2;

import java.util.Scanner;

public class ForLoopExercise {

    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    public static void exercise1() {
        int[] array = {3, 5, 7, 1, 4, 8, 6};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your number: ");
        int countNum = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[i] + array[j] == countNum) {
                    System.out.println(array[i] + " and " + array[j]);
                }
            }
        }
    }

    public static void exercise2() {
    }


}


//
// 1/
//tim tong 2 so = 9

// int[] e =[3,5,7,1,4,8,6]


// 2/
//*
//**
//***
//****
//*****
//******
//*******