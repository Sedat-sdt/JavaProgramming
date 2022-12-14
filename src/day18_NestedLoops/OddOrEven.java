package day18_NestedLoops;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {


         Scanner scan= new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number: ");
            int num = scan.nextInt();

            /* while(num<=0){
                System.out.println("Invalid number please re-enter: ");
                num = scan.nextInt();
            }*/
            if (num % 2 == 0) {
                System.out.println(" Even Number");
            } else {
                System.out.println("Odd Number");
            }
            System.out.println("Would you like to enter another number?");
            String a = scan.next().toLowerCase();

            while (!(a.equalsIgnoreCase("yes") || a.equalsIgnoreCase("no"))){
                System.out.println("Incorrect answer please re-enter.Would you like to enter another number?");
                a = scan.next().toLowerCase();
               /* if (a.equalsIgnoreCase("yes")) {
                    System.out.println("Enter a number: ");
                    num = scan.nextInt();
                }*/
            }

            if(a.equalsIgnoreCase("no")){
                break;
            }
        }




        /* Write a program that asks user to enter a numnber , and check if the number is odd or even.
        if it's odd, print "Odd Number"
        if it's even, print "Even number"

        Ask the user "Would you like to enter another number"
                if user enters yes, repeat the previous steps
                if user enters no, print nothing

                If user enteres invalid answer, repeat the previous steps


         */
    }
}
