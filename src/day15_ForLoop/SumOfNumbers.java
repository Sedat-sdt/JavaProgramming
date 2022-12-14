package day15_ForLoop;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i < 101  ; i++) {
        sum+=i;

        }
        System.out.println(sum);
   /*

      Write a program that can calculate the sum of all integers between 1 to 100
    */

        System.out.println("--------------------------------------------");

    int total=0;
        Scanner scan = new Scanner(System.in);


        for (int i = 1; i < 6 ; i++) {
            System.out.println("Enter a number:");
            total+=scan.nextInt();
        }


        System.out.println("total = " + total);



    }
}
