package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your score");
        int score = scan.nextInt();
        String result ="";

        if(score>0 && score <=100){
           if (score>=90){
               result="A";
           } else if (score>=80) {
               result="B";
           } else if (score>=70) {
               result="C";
           } else if (score>=60) {
               result="D";
           }else {
               result="F";
           }


        }else{
            result="Invalid score";
        }
        System.out.println("result = " + result);
        scan.close();
/*
GradeReport:
 2.1 Ask the user to enter the his/her score
 2.2 Print the grade of the student (A, B, C, D, F)
 2.3 If user enter invalid score (negative or more than 100)
     print invalid score
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            90--100: Excellent
        80--89:  Great
        70--79:  Good
        60--69:  Passed
        0--59:   failed
 */

    }
}
