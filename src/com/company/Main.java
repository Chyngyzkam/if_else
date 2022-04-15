
package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        double x = 28;
//        double y = 4;

        // return the maximum of two numbers
//        System.out.println("Maximum number of x and y is: " +Math.max(x, y));

//        // return the square root of y
//        System.out.println("Square root of y is: " + Math.sqrt(y));
//
//        //returns 28 power of 4 i.e. 28*28*28*28
//        System.out.println("Power of x and y is: " + Math.pow(x,y));
////
//        // return the logarithm of given value
//        System.out.println("Logarithm of x is: " + Math.log(x));
//        System.out.println("Logarithm of y is: " + Math.log(y));
//
//        // return the logarithm of given value when base is 10
//        System.out.println("log10 of x is: " + Math.log10(x));
//        System.out.println("log10 of y is: " + Math.log10(y));
//
//        // return the log of x + 1
//        System.out.println("log1p of x is: " +Math.log1p(x));
//
//        // return a power of 2
//        System.out.println("exp of a is: " +Math.exp(x));
//
//        // return (a power of 2)-1
//        System.out.println("expm1 of a is: " +Math.expm1(x));


//        Random random= new Random();
//        int max=40,min=20;
//        int r = random.nextInt(50-20)+20;
//        int r = random.nextInt(20-10+1)+10;
//        System.out.println(r);


//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Atynyzdy jazynyz");;
//        String name = scanner.nextLine();
//
//        System.out.println("jazynyzdy jazynyz");
//        int age = scanner.nextInt();

        Scanner scanner = new Scanner(System.in);
//        for (int i = 1; i < 5; i++) {
//            for (int j = 1; j <=i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (int i = 1; i <=5; i++) {
//            for (int j = i; j <=5 ; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        int i, j;
//        for( i = 1 ; i <= 5 ; ++i) {          //outer loop
//            System.out.println();
//            for( j = 1 ; j <= i ; ++j)  //inner loop
//                System.out.print( "* " );
//        }
//        System.out.println();

//        char ch = 'A' ;
//        do
//        {
//            System.out.println( ch + " " );
//            ch++;
//        } while(ch <= 'Z');
//      Random random = new Random();
//      int result = (int) (Math.random()*((30-10)+1)+10);
//        System.out.println(result);

//        double result = scanner.nextDouble();
//        double sum = result - Math.floor(result);
//        System.out.println(sum);


//        System.out.print("Введите час: ");
//        int chas = scanner.nextInt();
//        System.out.print("Введите минуту: ");
//        int minuta = scanner.nextInt();
//        System.out.print("Введите секунду: ");
//        int sekunda = scanner.nextInt();
//        chas = (chas * 60) * 60;
//        minuta = minuta * 60;
//        int result = chas + minuta + sekunda;
//        System.out.println("Результат в секундах: " + result);


//        int digits = scanner.nextInt();
//        int a = digits/100;
//        int b = digits/10%10;
//        int c = digits%10;
//        System.out.println(a+","+b+","+c);

        Scanner begai = new Scanner (System.in);
        System.out.println("uch orunduu san beriniz");
        int san = begai.nextInt();
        int a = san % 10;
        int b = san / 10 % 10;

        int c = san / 10 / 10;
        System.out.println(a+","+b+","+c);

    }

    //methods
    public static void printStars(int amount) {
        int i = 0;

        while (i < amount) {
            System.out.print("*");
            i++;
        }

        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        int i = 0;

        while (i < amount) {
            System.out.print(" ");
            i++;
        }
    }

    public static void xmasTree(int height) {
        int i = 1; // Stars incrementer

        while (i <= height) {
            int s = (height - i) / 2;
            printWhitespaces(s);
            printStars(i);

            i++;
        }
    }

}
