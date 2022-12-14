package day09_IfStatements;

public class SalaryAfterTax {
    public static void main(String[] args) {

        int salary = 75000;
        double taxRate = 0.25;
        boolean isMarried = true;


        if (salary>=130_000){
           taxRate = 0.35;
        } else if (salary>=100_000) {
            taxRate = 0.35;
        } else if (salary>=80_000) {
            taxRate = 0.35;
        } else{
            taxRate = 0.20;
        }

        if(isMarried) {
            taxRate -= 0.05;//%
        }
        double afterTaxSalary = salary - (salary*taxRate) ;

        System.out.println("Tax after salary = " + afterTaxSalary);


        /*
        Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                35% for salary of 130K or more
      			30% for salary of 100K to 130k (excluded)
      			25% for salary of 80K to 100K (excluded)
      			20% for salary less than 80K

                in addition, if the person is married, he/she will pay 5% less tax


         */
    }
}
