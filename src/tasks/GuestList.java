package tasks;

import java.util.Scanner;

public class GuestList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String  guestList = "";

        while (true){

            System.out.println("Please enter the guest's name: ");
            String name = scan.next();
            guestList+= name;

            System.out.println("Do you want to enter another guest's name?");
            String answer = scan.next();

            if(answer.equalsIgnoreCase("yes")) {
                guestList+= ", ";
            }
            if(answer.equalsIgnoreCase("no")) {
                break;
            }
        }
        System.out.println("Guests' list: " + guestList);





        /*
        ### Use a `loop` to create a guest list for the party. Ask the user to enter the name of the first guest,
        store the name into the guest list and ask if they want to enter another guest name.

> - If the user says `yes` then ask them for the next guest's name and repeat the process
> - If the user says `no` then stop asking for names and display the final guest list

Main topics: loops, Scanner, Strings, concatenation

Example Flows:
```
Please enter the guest's name:
  Nick
Do you want to enter another guest's name?
  yes
Please enter the guest's name:
  Linda
Do you want to enter another guest's name?
  no
Guests' list: Nick, Linda
```
         */
    }
}
