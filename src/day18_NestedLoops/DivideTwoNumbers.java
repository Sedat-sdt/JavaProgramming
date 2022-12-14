package day18_NestedLoops;

import java.util.Scanner;

public class DivideTwoNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter a number: ");
        int num2 = scan.nextInt();
        int counter=0;
        if(num1>num2) {

            while (num1 >= num2) {
                num1 -= num2;
                counter++;
            }
        }else{
            System.err.println("first number should be the bigger");
        }
        System.out.println(counter+" with a remainder of "+num1);



   /*
    Write a program that can divide two positive numbers without using / (division) and * (multiplication) and % operators

                        20 / 6 ==> 3 with the reaminder of 2


                        a = 20
                        b = 6;


                        a -= b;  // a = 14
                        a -= b;  // a = 8
                        a -= b;  // a = 2


                        x = 100;
                        y = 8;

                        while(a >= b){
                                a -= b;
                                count++;
                        }
    */


    }
}
