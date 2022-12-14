package day19_RecapLoopAndString;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
    while(true){
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your score: ");
        int score = scan.nextInt();
        if((score<0 || score>100)){
            System.err.println("Invalid Entry");
            System.exit(0);
        }
        String grade="";
        if(score>=90){
            grade= "A";
        } else if (score>=80){
            grade= "B";
        }else if (score>=70){
            grade= "C";
        }else if (score>=60){
            grade= "D";
        }else{
            grade= "F";
        }
        System.out.println("Your grade is: "+grade);
        System.out.println("Would you like to continue?");
        String answer = scan.next();
        while(!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){
            System.err.println("Invalid Entry");
            System.exit(0);
        }
        if(answer.equalsIgnoreCase("no")){
            System.out.println("Thank you for using Cydeo Grade Calculator APP");
            break;
        }
    }
        /*
        Write a program for grade calculator:
			1. Ask the user "Enter your score"
				If user enters invalid score, terminate the program after displaying the error message
				"Invalid Entry"
	        2. Display the grade of the student.
			 		90 ~ 100 ==> A
			 		80 ~ 89 ==> B
			 		70 ~ 79 ==> C
			 		60 ~ 69 ==> D
			 		0 ~ 59 ==> F
			2. Ask the user would you like to continue
				If "yes" --> repeat the previous steps
				If "no" --> print "Thank you for using Cydeo Grade Calculator APP"
				If user enters an invalid entry, terminate the program after displaying the error message
				"Invalid Entry"
         */
    }
}
