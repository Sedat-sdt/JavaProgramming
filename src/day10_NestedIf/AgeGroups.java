package day10_NestedIf;

public class AgeGroups {
    public static void main(String[] args) {

      int age = 12;
      String ageGroup = "";

      boolean isValidAge = age>=0 && age<=150;

      if (isValidAge){
          if (age>=55){
              ageGroup = "Senior";
          } else if (age>=21) {
              ageGroup = "Adult";
          }else {
              ageGroup = "Teenager";
          }

      }else{
          ageGroup = "Invalid Age";
      }
        System.out.println(ageGroup);


      /*
        Create a class called AgeGroups, write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( >= 55 )

             if age is negative or greater than 150, print invalid

             NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT

       */


    }
}
