package day19_RecapLoopAndString;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
while(true) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = scan.nextInt();

    if (num % 2 == 0) {
        System.out.println(num + " is an even number");
    } else {
        System.out.println(num + " is an odd number");
    }

    System.out.println("Would you like to enter another number?(yes/no)");
    String ans = scan.next();

    if(!(ans.equalsIgnoreCase("yes") || ans.equalsIgnoreCase("no"))){
        System.err.println("Invalid entry");
        System.exit(0);
    }

    if(ans.equalsIgnoreCase("no")){
        System.out.println("Thank you!");
       break;
    }

    }

    }
}
