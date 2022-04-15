package com.company.prictice;
import java.util.Scanner;

public class testStatments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int san = scanner.nextInt();

        int a = san / 3;
        int b = a % 10;
        int c = a / 10 % 10;

        System.out.println(b + c);

//
//
//        int sum = scanner.nextInt();
//        while (sum>10){
//            sum/=10;
//
//        System.out.println(sum);
////        }



    }
}

