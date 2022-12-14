package day06_PrimitiveTypeCasting;

public class Birthday {

    public static void main(String[] args) {

        String name = "John";
        int birthday = 25;
        String birthMonth = "April";
        int birthYear = 1995;

        System.out.println(name + " was born on " + birthMonth +"/" + birthday + "/" + birthYear + ".");

        // My favorite book is "bookName"
        String bookName = "Daddy";
        System.out.println("My favorite book is \" " + bookName + " \"");
        System.out.println("My favorite book is " + "\"" + bookName + "\"");
// all two ways for coding double coute are true.

  /*
  \n
  \t
  \"
  \\

   */

    }

}

//1. Create a class named BirthDay and create the following variable
//			 name, birthDay(int), birthMonth(String), birthYear(int)
//			 use concatenation to display the birthday of the person
//			 	if  name = "John"
//			 		birthDay = 25
//			 	    birthMonth = "April"
//			 	    birthYear = 1995;
//			 	output:
//			 		John was born on April/25/1995.