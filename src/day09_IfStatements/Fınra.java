package day09_IfStatements;

public class Fınra {
    public static void main(String[] args) {
      int number =25;

      boolean isMultiple3 = number%3 == 0;
      boolean isMultiple5 = number%5 == 0;

      if (isMultiple3 && isMultiple5) {
            System.out.println("FINRA");
      }else if(isMultiple3){
          System.out.println("FIN");
      } else if (isMultiple5) {
          System.out.println("RA");
      }  else {
          System.out.println("Number is not multiple of 3 and 5");
      }


        /*
        Create a class called FINRA, Write a function which prints out the number.
         but for number which is a multiple of 3, print "FIN" instead of the number
         and for number which is a multiple of 5, print "RA" instead of the number.
         and for number which is a multiple of both 3 and 5, print "FINRA" instead of the number.
            ex:
                number = 3
            output:
                      FIN

                number = 10
            output:
                RA

                number = 15
            output:
                FINRA

         */
    }
}
