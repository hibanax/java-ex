package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = readIntegers(5);
        System.out.println("Numbers entered " + Arrays.toString(myIntegers));
        int[] finded = findMin(myIntegers);
        int first = finded[0];
        System.out.println("Minimum value is = " + first);

    }

    public static int[] readIntegers(int count) {
        System.out.println("Enter " + count + " numbers...\r");
        int[] values = new int[count];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static int[] findMin(int[] array) {
        int[] minArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            minArray[i] = array[i];
        }

        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < minArray.length - 1; i++) {
                if (minArray[i] > minArray[i + 1]) {
                    temp = minArray[i];
                    minArray[i] = minArray[i + 1];
                    minArray[i + 1] = temp;
                }

            }

        }
        return minArray;


    }
}
