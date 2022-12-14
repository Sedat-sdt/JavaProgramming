package day18_NestedLoops;

import java.util.Scanner;

public class NestedLoopPractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

    while (true){
        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        while (!(age>=1 && age<=120)){
            System.out.println("Invalid Entry, Please re_enter your age");
            age=scan.nextInt();
        }
        System.out.println("Would you like to continue?");
        String ans = scan.next().toLowerCase();

        while (!(ans.equals("yes")  || ans.equals("no"))){
            System.out.println("Invalid Entry, Please re_enter your age.Would you like to continue?");
            ans = scan.next().toLowerCase();
        }

        if(ans.equals("no")){
           break;

        }


        }

scan.close();

    }
}
