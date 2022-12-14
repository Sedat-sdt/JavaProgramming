package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter your full name");
        String FullName = scan.nextLine();

        System.out.println("enter your building number");
        String building = scan.next();

        scan.nextLine();

        System.out.println("enter your street name");
        String street = scan.nextLine();

        System.out.println("enter your city name");
        String city = scan.nextLine();

        System.out.println("enter your state name");
        String state = scan.next();

        System.out.println("enter your Zip Code");
        String zipCode = scan.next();

        scan.nextLine();

        //System.out.println("enter your country name");
       // String country = scan.nextLine();

        System.out.println(FullName + "\n"+building +" " + street + "\n" +city+ ", " +state +" "+ zipCode);


        scan.close();
        /*
enter your full name (nextline
enter your building number(next()
enter your street name(nextlime
enter your city name  nextline
enter state  nextLine()
enter zip code next()

Display the shipping address
John Smith
7925 Jones Branch Dr
McLean, VA 22012


  */

/*
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    //Enter your code here
Scanner scan = new Scanner(System.in);
System.out.println("Welcome to the patient portal!");
System.out.println("Please enter your personal information");
System.out.println("Enter your first name");
    String firstName = scan.nextLine();
System.out.println("Enter your last name");
    String lastName = scan.nextLine();



   // this part is already provided DO NOT CHANGE
        System.out.println("Enter your email");
        String email = scan.next();
        scan.nextLine();//to capture Enter key press
        System.out.println("Enter your street");
        String street = scan.nextLine();

     // continue for city
System.out.println("Enter your city");
    String city = scan.nextLine();
System.out.println("Enter your state");
    String state = scan.nextLine();
System.out.println("Enter your zip code");
     int zipCode = scan.nextInt();
System.out.println("Enter your work phone number");
     long workPhoneNumber = scan.nextLong();
System.out.println("Enter your personal phone number");
     long personalPhoneNumber = scan.nextLong();
System.out.println("Enter your age");
     int age = scan.nextInt();
System.out.println("Enter your height");
     double height = scan.nextDouble();
System.out.println("Enter your weight");
     double weight = scan.nextDouble();
System.out.println("Are you married?");
    boolean isMarried = scan.nextBoolean();

System.out.println("Patient personal information");
String fullName = firstName +" " + lastName ;
System.out.println("Full name: " + fullName);

String address = street+ ", " +city + ", " + state +" " +zipCode;
System.out.println("Address: " + address);

String contact = ("work phone number: " + workPhoneNumber +", " + "personal phone number: " + personalPhoneNumber+", " + "email: " +  email);
System.out.println("Contact: " + contact);
System.out.println("Age: " + age);
System.out.println("Height: " + height);
System.out.println("Weight: " + weight +" pounds");
System.out.println("Married: " + isMarried);

  }

 */
        /*

        /*
### This program will use Scanner to get many inputs about a patient and use that information to build a summary.

- Declare nine `String` variables: `firstName`, `lastName`, `email`, `street`, `state`, `city`

- Declare two `int` variables: `age`, `zipCode`

- Declare two `double` variables: `height`, `weight`

- Declare a `boolean` variable: `isMarried`

- Declare two `long` variables: `workPhoneNumber` ,`personalPhoneNumber`

- Create a `Scanner` object named `scan`


#### Your program flow should go like this:
#### Note: anything indented is an input value from the console

```
Welcome to the patient portal!
Please enter your personal information
Enter your first name
  James
Enter your last name
  May
Enter your email
  jamesmay@gmail.com
Enter your street
  7925 Jones Branch Dr
Enter your city
  McLean
Enter your state
  VA
Enter your zip code
  22102
Enter your work phone number
  7896542314
Enter your personal phone number
  2406542314
Enter your age
  35
Enter your height
  5.10
Enter your weight
  173.2
Are you married?
  true
```

#### Take all the inputs from the above flow and combine these sections together

- Declare and assign a `contact` variable using these inputs: *work phone, personal phone and email*. Use a comma and a space to separate each value

- Declare and assign a `fullName` variable using these inputs: *first name and last name* Use a space to seperate each value

- Declare and assign an `address` variable using these inputs: *street, city, state, zip code* Use a comma and a space to separate each value

#### Display all of the information together as below

#### The final output of your program should be:
  > The first part of the outcome are the questions which are asked from the Scanner portion

```
Welcome to the patient portal!
Please enter your personal information
Enter your first name
Enter your last name
Enter your email
Enter your street
Enter your city
Enter your state
Enter your zip code
Enter your work phone number
Enter your personal phone number
Enter your age
Enter your height
Enter your weight
Are you married?

Patient personal information
Full name: James May
Address: 7925 Jones Branch Dr, McLean, VA 22102
Contact: work phone number: 7896542314, personal phone number: 2406542314, email: jamesmay@gmail.com
Age: 35
Height: 5.1
Weight: 173.2 pounds
Married: true
```

Main topics: variables, primitive datatypes, String, Scanner, concatenation
         */
    }
}
