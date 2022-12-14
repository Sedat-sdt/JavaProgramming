package day19_RecapLoopAndString;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
    while(true){
        Scanner scan = new Scanner(System.in);
            System.out.println("How much do you make an hour?");
            int hourlyRate= scan.nextInt();
        if(hourlyRate==0 || hourlyRate<0){
            System.err.println("Invalid Entry for Hourly Rate");
            System.exit(0);
        }
            System.out.println("How many hours do you work per week?");
            int weeklyHour = scan.nextInt();
        if(weeklyHour<1 || weeklyHour>144){
            System.err.println("Invalid Entry for Weekly Hours");
            System.exit(0);
        }
            System.out.println("Enter your state tax rate");
            int stateTaxRate = scan.nextInt();
            if(stateTaxRate<1 || stateTaxRate> 10){
            System.err.println("Invalid Entry for state tax Rate");
            System.exit(0);
            }
        int grossSalary= hourlyRate*weeklyHour*52;
        System.out.println("Gross Salary: "+grossSalary);
        System.out.println("Federal Tax: "+(grossSalary*0.26));
        System.out.println("State Tax: "+(grossSalary*0.02));
        System.out.println("Total Tax: "+((grossSalary*0.26)+(grossSalary*0.02)));
        System.out.println("Net Income: "+ (grossSalary-((grossSalary*0.26)+(grossSalary*0.02))));
        System.out.println("Would you like to continue?");
        String answer = scan.next();
        while(!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){
            System.err.println("Invalid Entry");
            System.exit(0);
        }
        if(answer.equalsIgnoreCase("no")){
            System.err.println("Thank you for using Cydeo Salary Calculator APP");
            break;
        }
    }
        /*
        Write a program for the salary calculator
			1. Ask the user "How much you make an hour?"
					If user entered hourlyRate is 0 or negative, terminate the program after
					displaying the error message "Invalid Entry for Hourly Rate"
			2. Ask the user  "How many hours do you work per week?"
					if user entered weeklyHour is less than 1 or greater than 144, terminate
					the program after displaying the error message "Invalid Entry for Weekly Hours"
			3. Ask the user  "Enter your state tax rate"
					if the state tax rate is less than 0% or greater than 10%, terminate the
					program after displaying the error message "Invalid Entry for state tax Rate"
	        4. Display:
					1. Gross Salary
					2. Federal Tax (assume that federal tax rate is 26%)
					3. State Tax
					4. Total Tax
					5. Net Income
			5. Ask the user "Would you like to continue?"
				If "yes" --> repeat all the previous steps
				If "no" --> print "Thank you for using Cydeo Salary Calculator APP"
				If user enters an invalid entry, terminate the program after displaying
				the error message "Invalid Entry"
         */
    }
}
