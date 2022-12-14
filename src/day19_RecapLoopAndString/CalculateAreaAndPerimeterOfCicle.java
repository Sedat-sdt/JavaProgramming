package day19_RecapLoopAndString;

import java.util.Scanner;

public class CalculateAreaAndPerimeterOfCicle {
    public static void main(String[] args) {
        while(true){
           Double pi = 3.14;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius(r) of the circle : ");
        Double radius=scan.nextDouble();

        if(radius==0 || radius<0){
            System.err.println("Invalid Entry for the radius of the circle");
            System.exit(0);
        }
        Double diameter = 2*radius;
        Double area = pi*(radius*radius);
        Double perimeter = 2*pi*radius;

        System.out.println("diameter is: "+diameter);
        System.out.println("area is "+area);
        System.out.println("perimeter is "+perimeter);
        System.out.println("Would you like to calculate another circle?");
        String answer = scan.next();

        while(!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){
            System.err.println("Invalid entry! Please re-enter!");
            answer= scan.next();
        }
        if(answer.equalsIgnoreCase("no")){
            System.out.println("Thank you for using Cydeo Circle Calculator APP");
            break;
        }
    }
        /*
         Write a program that can calculate the area and perimeter of a circle:
			1. Ask the user "Enter the radius of the circle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the radius of the circle"
			2. Display:
					1. Diameter of circle
					2. Area of circle
					3. Perimeter of circle
			3. Ask the user "Would you like to calculate another circle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"
				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry
         */
    }
}
