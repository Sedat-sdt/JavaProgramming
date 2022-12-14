package day10_NestedIf;

public class GradeLevel {
    public static void main(String[] args) {
      byte numberGradeLevel = 19;
      String schoolType = "";

      if (numberGradeLevel>=0 && numberGradeLevel<=18){

          if(numberGradeLevel<=5){
              schoolType = "Elementary school";
          } else if (numberGradeLevel<=8) {
              schoolType = "Middle school";
          }else if (numberGradeLevel<=12) {
              schoolType = "High school";
          } else if (numberGradeLevel<=16) {
              schoolType = "College";
          } else {
              schoolType = "Grad School";
          }
      }else{
              schoolType = "Invalid grade level";
      }
        System.out.println(schoolType);





    /*
    Create a class called GradeLevel,
    Given a number(byte) grade level determine and print
    which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT

     */
    }
}
