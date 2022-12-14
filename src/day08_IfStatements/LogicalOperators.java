package day08_IfStatements;

public class LogicalOperators {

    public static void main(String[] args) {

     String name = "Steven";
     int age = 19;
     String citizen = "Uk";

     boolean isEligibleToVote = age>=18 && citizen == "USA";

        System.out.println(name + " is eligible to vote: " + isEligibleToVote);


        String name2 = "Josh";
        int creditScore = 720;//at least 700
        int age2 =23;//at least 21
        int income = 40000;// 60000

        boolean isEligibleToLoan = creditScore >=700 && age2 >=21 && income >= 60000;

        System.out.println(name2 + " is eligible for loan: " + isEligibleToLoan);

        String name3 = "Shay";
        int age3 =21;
        char gender = 'F';

        boolean isEligible3 = age3 >= 18 && (gender =='M' || gender =='F');
        System.out.println(name3 + " is eligible to register: " + isEligible3);

        String name4 = "James";
        String countryOfBirth ="USA";
        boolean marriedToUSCitizen =false;
        boolean isEligible4 = countryOfBirth == "USA" || marriedToUSCitizen == true;

        System.out.println(name4 + " is eligible to apply: " + isEligible4);

    boolean result2 =true;
    boolean result3 = !result2;
        System.out.println("result3 = " + result3);

    int score = 85;
    boolean passed =score>= 60;
    boolean failed = !passed;
        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);


    }
}
