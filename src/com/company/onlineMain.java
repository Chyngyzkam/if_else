package com.company;

import java.util.Random;

public class onlineMain {

    public static void main(String[] args) {

        int[] array = new int[10];
        int[] arrays = getArrays(array);
        int[] sort = getSort(arrays);
        int[] evenNumber = getEvenNumber(sort);
        for (int i : evenNumber) {
            System.out.print(i + " ");
        }

    }

    public static int[] getArrays(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(20);
        }
        return arr;
    }

    public static int[] getEvenNumber(int[] arr) {
        int[] numOfEvent = new int[getRandomArrays(arr)];
        int counter = 0;
        for (int nums : arr) {
            if (nums % 2 == 0) {
                numOfEvent[counter] = nums;
                counter++;
            }

        }
        return numOfEvent;
    }

    public static int getRandomArrays(int[] arr) {
        int counter = 0;
        for (int sums : arr) {
            if (sums % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static int[] getSort(int[] arr) {
        int l = arr.length;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
