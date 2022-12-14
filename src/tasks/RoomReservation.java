package tasks;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            int king = 120,
                queen= 100,
                single=80,
                day=0,
                price=0;
            String ans="";
        while (true) {
            System.out.println("Which bedroom do you want to reserve: (King: 120$, Queen: 100$, Single: 80$)");
            String bedroom = scan.next();

            if(bedroom.equalsIgnoreCase("king")){
                price+=120;
            }
            if(bedroom.equalsIgnoreCase("queen")){
                price+=100;
            }
            if(bedroom.equalsIgnoreCase("single")){
                price+=80;
            }
            System.out.println("How many days do you want to stay?");
            day = scan.nextInt();

            System.out.println("Would you like to reserve another room?");
            ans = scan.next();

            while(!(ans.equalsIgnoreCase("yes") ||ans.equalsIgnoreCase("no"))){
                System.out.println("Invalid answer, please re-enter. Would you like to reserve another room?");
                ans= scan.next();
            }
            if(ans.equalsIgnoreCase("no")){
                break;
            }
        }
            System.out.println("Total Price: $"+ (price*day));





        /*
        Create a class called RoomReservation, write a program for the room
reservation:
King Bed ==> 120$
Queen Bed ==> 100$
single Bed ==> 80$
the program asks the user which bedroom does he/she wants to
reserve, and how many nights he/she is staying.
Then Ask the user "would you like to reserve another room?""
if yes ==> repeat the entire steps
if no ==> return the  total price
If user enters any invalid entry,  ask the user to re-
enter until user provides a valid entry
3. Write a program that can calculate two numbers.
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
    }
}
