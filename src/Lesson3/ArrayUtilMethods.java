package Lesson3;

import java.util.Arrays;

public class ArrayUtilMethods {
    public static void main(String[] args) {
        int[] unsortedArr = {1, 9, 7, 3};
//        Arrays.sort(unsortedArr);
        int[] sortedArr = Arrays.stream(unsortedArr).sorted().toArray();
        int minNum = Arrays.stream(unsortedArr).min().getAsInt();
        int maxNum = Arrays.stream(unsortedArr).max().getAsInt();
        boolean is3InArr = Arrays.stream(unsortedArr).anyMatch(i -> i == 3);
        boolean is11InArr = Arrays.stream(unsortedArr).anyMatch(i -> i == 11);

        //4. get part from array


    }
}
