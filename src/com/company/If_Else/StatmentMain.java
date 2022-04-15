
package com.company.If_Else;

import java.util.Random;
import java.util.Scanner;

public class StatmentMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
      int number = random.nextInt(1,99999909 );
      int counter =0;
      while (number>0){
          counter++;
          number/=10;
          System.err.print(counter+" ");

      }
        System.out.println("\n totalOfNums: "+counter);
    }

//        byte a = 100;
//        System.out.println(++a);//жообу 101
//        System.out.println(a++);//жообу 101
//        System.out.println(++a);//жообу 102 неге мындай болуп атат 103 чыгыш керек эле да менин ойумча
//        int num = 00123;
//        int count = 0;
//
//        while (num != 0) {
//            // num = num/10
//            num /= 10;
//            count++;
//        }
//
//        System.out.println("Number of digits: " + count);


//        int length = 0;
//        if (number >= 1) {
//            length += 1;
//        }
//        if (number >= 12) {
//            length += 2;
//        }
//        if (number >= 123) {
//            length += 4;
//        }
//        if (number >= 10000) {
//            length += 5;
//
//        }
//        System.out.println(length);
//       int length = String.valueOf(number).length();
//        int length = (int) (Math.log10(number) + 1);
//        System.out.println(length);
//        int length = 1;
//        if (number >= 100000000) {
//            length += 8;
//            number /= 100000000;
//        }
//        if (number >= 10000) {
//            length += 4;
//            number /= 10000;
//        }
//        if (number >= 100) {
//            length += 2;
//            number /= 100;
//        }
//        if (number >= 10) {
//            length += 1;
//        }
//        if (number >= 1) {
//            length += 1;
//        }
//        if (length>=3333){
//            length+=3;
//        }
//        System.out.println(length);
}



