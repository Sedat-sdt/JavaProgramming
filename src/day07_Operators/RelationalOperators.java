package day07_Operators;

public class RelationalOperators {

    public static void main(String[] args) {

    // >,>= , <, <=

        boolean result1 =  20>40;//false
        System.out.println("result1 = " + result1);

        boolean result2 = 300>=150;//true
        System.out.println("result2 = " + result2);
        boolean result3= 100>= 100;//true
        System.out.println("result3 = " + result3);

        boolean result4 = 300>= 500;//false
        System.out.println("result4 = " + result4);

        //credit score of 720
        int creditScore =745;

        boolean isEligibleForLoan = creditScore > 720;

        System.out.println("isEligibleForLoan = " + isEligibleForLoan);

        int score =59;
        boolean hasFailed = score <= 59;
        System.out.println("hasFailed = " + hasFailed);

        int x=100;
        int y =200;
        boolean equal= x==y;
        System.out.println("equal = " + equal);



    }
}
