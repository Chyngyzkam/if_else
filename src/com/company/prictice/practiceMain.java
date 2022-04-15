package com.company.prictice;

import java.util.Random;
import java.util.Scanner;

public class practiceMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] array = new int[10];
        int[] arrays = getArrays(array);
        int[] evenNumbersOfArray = getEvenNumbersOfArray(arrays);
        int[] sort = getSort(evenNumbersOfArray);
        for (int i : evenNumbersOfArray) {
            System.out.println(i);
        }
    }


    public static int[] getArrays(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(20);
        }
        return arr;
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

    public static int[] getEvenNumbersOfArray(int[] arr) {
        int[] evenNumsOfArray = new int[getQuantityOFEvenArray(arr)];
        int countOFEven = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                evenNumsOfArray[countOFEven] = num;
                countOFEven++;
            }
        }
        return evenNumsOfArray;
    }

    public static int getQuantityOFEvenArray(int[] arr) {
        int counter = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

}
