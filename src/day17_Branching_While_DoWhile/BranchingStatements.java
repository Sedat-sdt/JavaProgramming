package day17_Branching_While_DoWhile;

import java.util.Scanner;

public class BranchingStatements {
    public static void main(String[] args) {

        for (char i = 'A'; i <= 'Z' ; i++) {
            if(i=='F'){ //for print the letters until F
                break;//Exits the loop
            }
            System.out.println(i+" ");
        }
        System.out.println("-------------------------------");


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num =scan.nextInt();
        num=1;
        while ( num>0 ){
            System.out.println(" Again enter a number");
                num= scan.nextInt();

            if(num<0) {
            System.out.println("Okey your number is: " + num);
            break;
        }
            }
        }



    }

