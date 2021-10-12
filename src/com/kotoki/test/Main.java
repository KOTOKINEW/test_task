package com.kotoki.test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //EX-1
        System.out.println("EX-1");
        System.out.print("Array: ");
        final int[] array = {3, 4, 5, 7, 9};
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.print("\n");

        System.out.println("Sum of array elements: " + ArrayHandler.getSumOfEntries(array));

        //EX-2
        System.out.println("\nEX-2");

        System.out.print("Enter the size of array: ");
        final int size = scanner.nextInt();

        System.out.print("Enter the target number: ");
        int target = scanner.nextInt();

        final int[] randomArray = new int[size];

        Arrays.setAll(randomArray, (i) -> random.nextInt() % 100 + 1);

        for (int i = 0; i < randomArray.length; i++) {
            System.out.println("[" + i + "]:" + randomArray[i]);
        }

        System.out.println("The closest number is on the position: " +
                ArrayHandler.getPositionOfClosest(randomArray, target));

        //EX-3
        System.out.println("\nEX-3");

        final int[] array1 = {-1, 3, 8, 2, 9, 5};
        final int[] array2 = {4, 1, 2, 10, 5, 20};
        target = 24;

        System.out.print("First array: ");
        for (int element : array1) {
            System.out.print(element + " ");
        }

        System.out.print("\n");

        System.out.print("Second array: ");
        for (int element : array2) {
            System.out.print(element + " ");
        }
        System.out.print("\n");
        System.out.println("Target number is: " + target);
        System.out.println("The closest pair of numbers is: " +
                ArrayHandler.getPairWithClosestSum(array1, array2, target));

    }
}
