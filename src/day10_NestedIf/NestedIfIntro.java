package day10_NestedIf;

public class NestedIfIntro {
    public static void main(String[] args) {

       int score = 95;
       if (score >= 0 && score <= 100){// if the score is valid

           if (score >= 60) {// if student passed the exam
               System.out.println("Passed");
           }else {// if student failed
               System.out.println("Failed");
           }
       }else{//if the score is not valid
           System.out.println("Invalid score");

       }
        System.out.println("-----------------------");

       int age = 21;
       boolean hasId = true;

       if (hasId) {

           if (age >= 21) {
           System.out.println("Elligible to buy alcohol");
       }else {
           System.out.println("Not elligible to buy alcohol");
       }
       }else{
           System.out.println("You mus have ID to buy alcohol");
       }
        System.out.println("-----------------------------");



    }

}



