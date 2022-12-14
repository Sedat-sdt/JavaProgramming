package tasks;

import java.util.Scanner;

public class CalculateTwoNumbers {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        double result=0;

        while(true){

            System.out.println("Enter first number: ");
            int num1 = scan.nextInt();
            System.out.println("Enter operator: (+,-,/,*)");
            char op = scan.next().charAt(0);

        while(!( op == '+'|| op == '-' || op == '/' || op == '*' )){

            System.out.println("Invalid operator, please re-enter: ");
            op=scan.next().charAt(0);
        }
            System.out.println("Enter second number: ");
            int num2 =scan.nextInt();

        if(op=='+'){
            result= num1+num2;
        } else if (op=='-'){
            result= num1-num2;
        }else if (op=='*'){
            result= num1*num2;
        }else{
            result= num1/num2;
        }
            System.out.println("Result: "+result);
            System.out.println("Do you want to continue?");
            String ans = scan.next();

        while(!(ans.equalsIgnoreCase("yes") || ans.equalsIgnoreCase("no"))){
            System.out.println("Invalid answer please re-enter.Do you want to continue?(Yes/No)");
            ans=scan.next();
        }
        if(ans.equalsIgnoreCase("no")){
            break;
            }
       }
scan.close();
    }
}

        /*
        Write a program that can calculate two numbers.
1. Ask user to enter the first number
2. Ask user to enter a math operator (+,-
,/,*)
(if user enters any invalid operator,
repeat this step until user provides a valid operator)
3. Ask user to enter the second number
4. Display the result
5. Ask user if they want to continue?
(yes/no)
if yes ==> repeat the entire steps
if no ==> print "Thanks for using Cydeo
calculator!"
If user enters any invalid entry,  ask
the user to re-enter until user provides a valid entry
         */

