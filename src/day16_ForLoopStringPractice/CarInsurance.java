package day16_ForLoopStringPractice;

import java.util.Scanner;

public class CarInsurance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double premiumCost=0;
        System.out.println("Welcome to the Cydeo car insurance!");
        System.out.println("Enter your full name: ");
        String name= scan.nextLine();
        System.out.println("Do you have a US driver license?");
        String hasLicense = scan.next();
            if (hasLicense.equals("no")){
            System.out.println("You must have a license to get insurance!");
            System.exit(0);
        }
            System.out.println("Enter your zip code: ");
        int zipCode = scan.nextInt();
            if(zipCode == 20910 || zipCode ==20740){
                premiumCost+=60;
            } else if (zipCode == 22102 || zipCode ==22103) {
                premiumCost+=30;
            } else {
                premiumCost+=50;
            }
        System.out.println("Is this vehicle owned, financed, or leased?");
            String vehicle =scan.next();
            if(vehicle.equals("owned")){
                premiumCost+=10;
            }if(vehicle.equals("financed")){
            premiumCost+=15;
            }if(vehicle.equals("leased")){
            premiumCost+=20;
            }
        System.out.println("How is this vehicle primarily used?");
            String carUsedFor = scan.next();
            if(carUsedFor.equals("business")){
                premiumCost+=50;
            }if(carUsedFor.equals("pleasure")){
            premiumCost+=10;
            }if(carUsedFor.equals("commuting")){
            premiumCost+=20;

            System.out.println("How many days do you commute?");
            int dayOfDrive = scan.nextInt();
            premiumCost+= dayOfDrive*5;
        }


        System.out.println("How old are you?");
            int age = scan.nextInt();
        if(age<16){
            System.out.println("You can't be driving");
            //System.exit(0);
        }
        if(age>=16 && age < 20){
            premiumCost *=10;
        }if(age>=20 && age < 25){
            premiumCost *=6;
        }if(age>=25){
            premiumCost *=2;
        }
        System.out.println("Have you had any accidents in the last 5 years?");
        String ifHasAccident = scan.next();
        if(ifHasAccident.equalsIgnoreCase("yes")){
            System.out.println("How many?");
            int accident = scan.nextInt();
            premiumCost+=accident*10;
        }
        scan.nextLine();
        System.out.println("What is the highest level of education you have completed?");
            String education = scan.nextLine();
            if(education.equals("Bachelors") || education.equals("Masters")){
                premiumCost-=premiumCost*0.05;
            }
            if(education.equals("PHD") ){
                premiumCost-=premiumCost*0.10;
            }
            if(education.equals("High School") ) {
                premiumCost += premiumCost * 0.05;
            }
            education= education.substring(0,education.indexOf(" "))+education.substring(education.indexOf(" ")+1);
            name= name.substring(0,1).toUpperCase()+name.substring(1,name.indexOf(" ")).toLowerCase()
                    +name.substring(name.indexOf(" ")+1,name.indexOf(" ")+2).toUpperCase()
                    +name.substring(name.indexOf(" ")+2).toLowerCase();
            String referenceNumber=  name.substring(0,2)+age+name.substring(name.length()-3)+zipCode
                    +education;
            referenceNumber=referenceNumber.toUpperCase();
            System.out.println(name+", here's your quote!"
                +"\n"+"This is your start premium cost: $"+premiumCost
                +"\n"+"This is your reference number: " + referenceNumber);




        //concatenate the first 2 letters of customer's first name,
        // their age, the last 3 letters of the customer's last name,
        // their zip code, and their level of education all without spaces.
        // the reference number should be in all uppercase


    /*


        /*
        ### Write a program that will calculate the car insurance premium. Use everything you have learned to make the
        program and follow each section below:

- The only given code in the main method is a welcome message. Create everything else from this point

- Create a `Scanner` object and `double` variable (to keep track of the premium cost)

- First ask the user for their name with the message: `Enter your full name`

- Then ask the user about their driver license with the message: `Do you have a US driver license?`
> If the user doesn't have a US driver license, display the warning message: `You must have a license to get insurance!`
and stop the program. Use this code: `System.exit(0)` to stop the program.

- Then ask the user for their zip code with the message: `Enter your zip code`
> - If the zip code equals to `20910` or `20740`, add `$60` to the premium
> - If the zip code equals to `22102` or `22103`, add `$30` to the premium
> - If the zip code is anything else, add `$50` to the premium

- Then ask the user about ownership of the car with the message: `Is this vehicle owned, financed, or leased?`
> - If the car is `owned`, add `$10` to the premium
> - If the car is `financed`, add `$15` to the premium
> - If the car is `leased`, add `$20` to the premium

- Then ask the user about the car usage with the message: `How is this vehicle primarily used?`
> - If the car is used for `business`, add `$50` to the premium
> - If the car is used for `pleasure`, add `$10` to the premium
> - If the car is used for `commuting`, add `$20` to the premium and ask the user how many days they drive with the message:
 `How many days do you commute?`, and add `$5` to the premium for every day

- Then ask the user about their age with the message: `How old are you?`
> - If the age is `less than 16`, print: `You can't be driving` and stop the program with the code: `System.exit(0)`
> - If the age is `between 16 and 20 (exclusive)`, multiply the premium by `10`
> - If the age is `between 20 (inclusive) and 25 (exclusive)`, multiply the premium by `6`
> - If the age is `25 and above`(inclusive), multiply the premium by `2`

- Then ask the user about car accidents with the message: `Have you had any accidents in the last 5 years?`
> - If the answer is `Yes` or `YES`, ask the user how many accidents with the message: `How many?`.
Then add `$10` to the premium for every accident

- Then ask the user about their education level with the message:
`What is the highest level of education you have completed?`
> - If the education is `Bachelors` or `Masters`, reduce the premium by `5%`
> - If the education is ``, reduce the premium by `10%`
> - If the education is `High School` increase the premium by `5%`

- In the end build and print a report:
```
$customer name, here's your quote!
  -> The customer name should have proper capitalization - First letter uppercase and the rest lowercase for both first and last name
This is your start premium cost: $premium cost
This is your reference number: $reference number".
  -> To build a reference number do the following: concatenate the first 2 letters of customer's first name, their age, the last 3 letters of the customer's last name, their zip code, and their level of education all without spaces. Finally the reference number should be in all uppercase
```

Main topics: String manipulation, Scanner, methods, primitive datatypes, concatenation, if statements, operators

Example Flows:

```
Welcome to the Cydeo car insurance!
Enter your full name
  james bond
Do you have a US driver license?
  yes
Enter your zip code
  20740
Is this vehicle owned, financed, or leased?
  owned
How is this vehicle primarily used?
  pleasure
How old are you?
  40
Have you had any accidents in the last 5 years?
  yes
How many?
  2
What is the highest level of education you have completed?

James Bond, here's your quote!
This is your start premium cost: $162.0
This is your reference number: JA40OND20740PHD

```

```
Welcome to the Cydeo car insurance!
Enter your full name
  joe cally
Do you have a US driver license?
  no
You must have a license to get insurance!

```

```
Welcome to the Cydeo car insurance!
Enter your full name
  jamie fox
Do you have a US driver license?
  yes
Enter your zip code
  22103
Is this vehicle owned, financed, or leased?
  financed
How is this vehicle primarily used?
  commuting
How many days do you commute?
  5
How old are you?
  19
Have you had any accidents in the last 5 years?
  no
What is the highest level of education you have completed?
  High School

Jamie Fox, here's your quote!
This is your start premium cost: $855.0
This is your reference number: JA19FOX22103HIGHSCHOOL

```

```
Welcome to the Cydeo car insurance!
Enter your full name
  helga kisov
Do you have a US driver license?
  yes
Enter your zip code
  52267
Is this vehicle owned, financed, or leased?
  financed
How is this vehicle primarily used?
  business
How old are you?
  15
You can't be driving

```
    */
        //WRITE YOUR CODE BELOW



    }
}
