package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {

       /*
        90--100: Excellent
        80--89:  Great
        70--79:  Good
        60--69:  Passed
        0--59:   failed
        */

        int score = 45;
        String result = ""; //temporary

    //SOLUTION 1 (nested if)

        if(score>= 0 && score<= 100){//if the score is valid
            // 5 possibilities= A,B;C,D,F
            if(score>= 90){
                result = "Excellent";
            }else if(score >= 80 ) {
                result = "Great";
            } else if (score>= 70) {
                result = "Good";
            } else if (score>= 60) {
                result = "Passed";
            }else {
                result = "Failed";
            }
        }else{// if the score is not valid
            result = "Invalid score";
        }
        System.out.println(result);

        System.out.println("---------------------------------------");

        // SOLUTION 2 (Ternaries)

        String result1 = (score>= 0 && score<= 100)? (score>= 90)? "Excellent"
                :(score >= 80 )? "Great" :(score>= 70)? "Good" : (score>= 60)? "Passed"
                : "Failed" : "Invalid score";
        System.out.println( result1);

        System.out.println("------------------------------------------------");

        //SOLUTION 3 (mixed nested if with ternaries)

            String result2 = ""; //temporary

       if(score>= 0 && score<= 100){
           result2 = (score>= 90)? "Excellent"
                   :(score >= 80 )? "Great" :(score>= 70)? "Good" : (score>= 60)? "Passed"
                   : "Failed";
       }else{
           result2 = "Invalid score";

       }System.out.println(result2);

        System.out.println("--------------------------------------------------");

        //SOLUTION 4

       /* int score = 45;
        if(score>= 0 && score<= 100){//if the score is valid
            // 5 possibilities= A,B;C,D,F
            if(score>= 90){
                System.out.println("Excellent");
            }else if(score >= 80 ) {
                System.out.println("Great");
            } else if (score>= 70) {
                System.out.println("Good");
            } else if (score>= 60) {
                System.out.println("Passed");
            }else {
                System.out.println("Failed");
            }
        }else{// if the score is not valid
            System.out.println("Invalid score");

        }*/

    }
}
