package day10_NestedIf;

public class TernariesWithNestedIf {
    public static void main(String[] args) {

        int score = 1000;

      /*  if (score >= 0 && score <= 100){// if the score is valid

            if (score >= 60) {// if student passed the exam
                System.out.println("Passed");
            }else {// if student failed
                System.out.println("Failed");
            }
        }else{//if the score is not valid
            System.out.println("Invalid score");

        }
*/
        String result = (score >= 0 && score <= 100)? (score >= 60)? "Passed" : "Failed" : "Invalid score";

        System.out.println(result);

    }
}
