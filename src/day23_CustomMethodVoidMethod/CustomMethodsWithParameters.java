package day23_CustomMethodVoidMethod;

public class CustomMethodsWithParameters {

    private static String fullName;

    public static void main(String[] args) {
      oddOrEven(10);//the methods demands additional info to complete its tas
       ageOfPerson(1977);
        printNumbers(10,20);
        initialsOfThePerson("sedat","Maden");
        domainOfTheEmail("sedat@gmail.com");
        nameOfTheMonths(13);
        nameOfTheDays(6);
        numberOfDaysOfMonts(2022,2);
        ageGroups(45);
    }





    //create a function that can check if a number is even or odd

    public static void oddOrEven(int number){
        if(number%2==0){
            System.out.println(number+" is even number");
        }else{
            System.out.println(number+" is odd number");
        }


    }



    // create a function that can display the age of person

    public static void ageOfPerson(int birthYear){
        int age= 2022-birthYear;
        System.out.println("Your age is: "+age);

    }

        //create a function that can print all the numbers between X and Y

    public static void  printNumbers(int X,int Y){
        String result="";
        for (int i = X; i <=Y ; i++) {
        result+=i+" ";
        }
        System.out.print(result);
        System.out.println();
    }


        //Create a method that can display the initials of the person

    public static void initialsOfThePerson(String firstName,String lastName){

        String initials= firstName.charAt(0)+"."+lastName.charAt(0);
        System.out.println(initials.toUpperCase());

    }

        //Create a method that can display the domain of the email

    public static void domainOfTheEmail(String email){
        String domain = email.substring(email.indexOf("@")+1,email.lastIndexOf(".")) ;
        System.out.println(domain);
    }

    //Create a method that can display the name of the month based on the given number to the method

public static void nameOfTheMonths(int numberOfMonth){
      String nameOfMonth="";
       if(numberOfMonth>=1&&numberOfMonth<=12){
           switch (numberOfMonth){
               case 1:
               nameOfMonth="January";
               break;
               case 2:
                   nameOfMonth="February";
                   break;
               case 3:
                   nameOfMonth="March";
                   break;
               case 4:
                   nameOfMonth="April";
                   break;
               case 5:
                   nameOfMonth="May";
                   break;
               case 6:
                   nameOfMonth="June";
                   break;
               case 7:
                   nameOfMonth="July";
                   break;
               case 8:
                   nameOfMonth="August";
                   break;
               case 9:
                   nameOfMonth="September";
                   break;
               case 10:
                   nameOfMonth="October";
                   break;
               case 11:
                   nameOfMonth="Nowember";
                   break;
               case 12:
                   nameOfMonth="December";
                   break;
//name =(number==1)?"Jan" :(number==2)?"Feb"......................................

           }
           System.out.println(nameOfMonth);

       }else{
           System.out.println("Invalid number");
       }

}


//Create a method that can print the name of the day based on the given number to the method
public static void nameOfTheDays(int numberOfDay){
    String nameOfDay="";
       if(numberOfDay>=0&&numberOfDay<=7){
        switch (numberOfDay){
            case 1:
                nameOfDay="Monday";
                break;
            case 2:
                nameOfDay="Tuesday";
                break;
            case 3:
                nameOfDay="Wednesday";
                break;
            case 4:
                nameOfDay="Thursday";
                break;
            case 5:
                nameOfDay="Friday";
                break;
            case 6:
                nameOfDay="Saturday";
                break;
            case 7:
                nameOfDay="Sunday";
                break;
        }System.out.println(nameOfDay);

    }else{
        System.out.println("Invalid number");
    }

}


//Create a method that can print how many days a month has

public static void numberOfDaysOfMonts(int year,int number){

       String result="";
        if(number>0&&number<=31){
            switch (number) {
                case 2:
                   /* if(year%4 ==0){
                        result="29";    //instead of these let's use ternary
                    }else{
                        result = "28";
                    }*/
                    result = (year%4==0)? "29" : "28"; //here the ternary
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    result = "30";
                    break;
                default:
                    result = "31";
            }
            System.out.println(result);



       }else{
           System.err.println("Invalid number");
       }

}


//Create a method called AgeGroups, and write a program that can define the age groups of a person
//
//	             age groups are:
//	                    infant (1 - 2)
//	                    Toddler (3 - 5),
//	                    Kid (6 - 9),
//	                    Pre-Teen (10 - 12),
//	                    Teenager (13 - 17),
//	                    Young Adult (18 - 20),
//	                    Adult (21 - 39),
//	                    Young Middle-Aged Adult (40 - 49),
//	                    Middle-Aged Adult (50 - 54),
//	                    Very Young Senior Citizen (55 - 64),
//	                    Young Senior Citizen (65 - 74),
//	                    Senior Citizen (75 - 84),
//	                    Old Senior Citizen (85+)

    public static void ageGroups(int ageNumber){
        String result="";
        if(ageNumber>=0&&ageNumber<120){
           if (ageNumber<=2){
               result="infant";
           } else if (ageNumber<=5) {
               result="Toddler ";
           }else if (ageNumber<=9) {
               result="Kid";
           }else if (ageNumber<=12) {
               result="Pre-Teen ";
           }else if (ageNumber<=17) {
               result="Teenager";
           }else if (ageNumber<=20) {
               result="Young Adult";
           }else if (ageNumber<=39) {
               result="Adult";
           }else if (ageNumber<=49) {
               result="Young Middle-Aged Adult";
           }else if (ageNumber<=54) {
               result="Middle-Aged Adult";
           }else if (ageNumber<=64) {
               result="Very Young Senior Citizen ";
           }else if (ageNumber<=74) {
               result="Young Senior Citizen ";
           }else if (ageNumber<=84) {
               result = "Senior Citizen";
           }else {
               result= "Old Senior Citizen";
           }


        }else {
            result= "İnvalid number for age!";
        }

        System.out.println(result);
    }









}
