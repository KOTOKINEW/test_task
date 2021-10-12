package com.kotoki.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayHandler {

    /*
    EX-1
    Write a Java program to sum values of an array.
    */
    public static int getSumOfEntries(final int[] array) {
        return Arrays.stream(array).sum();
    }

    /*
    EX-2
    Write a java program to find in an array the position where the number closest to a
    given value is located.
    */
    public static int getPositionOfClosest(final int[] array, final int number) {
        int position = 0;
        int difference = Math.abs(array[position] - number);
        for (int i = 1; i < array.length; i++) {
            if (difference > Math.abs(array[i] - number)) {
                position = i;
                difference = Math.abs(array[position] - number);
            } else if (difference == 0) {
                return position;
            }
        }
        return position;
    }

    /*
    EX-3
    Given two arrays: [-1, 3, 8, 2, 9, 5] and [4, 1, 2, 10, 5, 20 ] and a target number 24,
    write a function that finds a pair of numbers (one in each array) which the sum is
    the closest to the target number.
     */
    public static List<Integer> getPairWithClosestSum(final int[] array1, final int[] array2, final int number) {
        int firstNumber = array1[0], secondNumber = array2[0];
        int difference = Math.abs(firstNumber + secondNumber - number);
        List<Integer> pair = new ArrayList<>(2);
        for (int i = 1; i < array1.length; i++) {
            for (int j = 1; j < array2.length; j++) {
                if (difference > Math.abs((array1[i] + array2[j]) - number)) {
                    firstNumber = array1[i];
                    secondNumber = array2[j];
                    difference = Math.abs(firstNumber + secondNumber - number);
                } else if (difference == 0) {
                    pair.add(firstNumber);
                    pair.add(secondNumber);
                    return pair;
                }
            }
        }
        pair.add(firstNumber);
        pair.add(secondNumber);
        return pair;
    }
}
