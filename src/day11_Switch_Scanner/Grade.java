package day11_Switch_Scanner;

public class Grade {
    public static void main(String[] args) {

    /*char ch='D';

        switch (ch){

            case 'A':
                System.out.println("excellent");
                break;
            case 'B':
                System.out.println("great job");
                break;
            case 'C':
                System.out.println("good");
                break;
            case 'D':
                System.out.println("passed");
                break;
            case 'F':
                System.out.println("failed");
                break;
            default:
                System.out.println("Invalid grade");

    }*/
        char ch='D';
        String result = "";
        switch (ch){

            case 'A':
                result = "excellent";
                break;
            case 'B':
                result ="great job";
                break;
            case 'C':
                result ="good";
                break;
            case 'D':
                result ="passed";
                break;
            case 'F':
                result ="failed";
                break;
            default:
                result ="Invalid grade";

        }System.out.println(result);


        /*

         Create a class called Grade, a char variable named grade is given.
        write a program to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            other wise: invalid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
         */
    }
}
