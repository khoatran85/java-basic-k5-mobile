package Lession1;

import sun.security.mscapi.CPublicKey;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Exercise {
    public static int[] array = {1, 2, 4, 2, 7, 8, 4, 5, 9};

    public static void main(String[] args) {
        // 1.
        CountEvenOddNumber();

        // 2.
        FindMin();

        //3.
        AverageInArray();

        //4.
        SortArrayAscending();

        //5.
        Factorial();
    }
// =============================================================================
    // 1. Count how many even and odd number in integer array

    public static void CountEvenOddNumber() {
        int countOdd = 0;
        int countEven = 0;

        for (int number : array) {
            if (number % 2 != 0) {
                countOdd++;
            }
        }
        System.out.println("Odd Number = " + countOdd);

        for (int number : array) {
            if (number % 2 == 0) {
                countEven++;
            }
        }
        System.out.println("Even Number = " + countEven);
    }

// =============================================================================
    // 2. Find min

    public static void FindMin() {
        int min = 0;

        //find min
        min = array[0];
        for (int a : array) {
            if (a < min) {
                min = a;
            }
        }
        System.out.println("Min = " + min);
    }


    // =============================================================================
//         3. Average value
    public static void AverageInArray() {
        double sum = 0;

        for (int number : array) {
            sum += number;
        }
        double average = sum / array.length;
        System.out.println("SUM = " + sum);
        System.out.println("Average = " + average);
    }


// =============================================================================

    public static void SortArrayAscending() {
        ArrayList<Integer> newArray = new ArrayList<>();
        for (
                int num : array) {
            newArray.add(num);
        }

        Collections.sort(newArray);
        System.out.println(newArray);

    }


// =============================================================================
// 5. 3! = 1*2*3

    public static void Factorial() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i > 0; i++) {
            int inputNum;
            long result = 1;
            System.out.println("Input your number (<50):");
            inputNum = scanner.nextInt();
            if (inputNum > 50) {
                System.out.println("Do not input number > 50");
            } else {
                for (int j = 1; j < inputNum + 1; j++) {
                    result *= j;
                }
                System.out.println("Factorial of " + inputNum + " is " + result);
            }
        }
    }
}
