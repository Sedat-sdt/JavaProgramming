package day18_NestedLoops;

import java.util.Scanner;

public class NestedLoopTasks {
    public static void main(String[] args) {

        for (int i = 1; i <=10; i++) {
           // System.out.println();
           // int count=0;
            for (int j = 1; j <=9 ; j++) {
                System.out.print("* ");
               // count++;
                //if(count==9)
                  //  break;
            }
            System.out.println();

        }





        /*
        * * * * * * * * *
        * * * * * * * * *
        * * * * * * * * *
        * * * * * * * * *
        * * * * * * * * *
        * * * * * * * * *
        * * * * * * * * *
        * * * * * * * * *
        * * * * * * * * *
        * * * * * * * * *
        * * * * * * * * *      write a program for this.

         Write a program that asks user to enter a numnber , and check if the number is odd or even.
        if it's odd, print "Odd Number"
        if it's even, print "Even number"

        Ask the user "Would you like to enter another number"
                if user enters yes, repeat the previous steps
                if user enters no, print nothing

                If user enteres invalid answer, repeat the previous steps

 */
        System.out.println("--------------------------------------------------------------");

        for (int i = 1; i <=10 ; i++) {

            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }










/*lunch:
Use a nested loop to print the following shape
        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        * * * * * * *
        * * * * * * * *
        * * * * * * * * *
        * * * * * * * * * *    */










    }
}
