package day08_IfStatements;

public class SalaryCalculator {

    public static void main(String[] args) {

    int hourlyRate = 50,
        weeklyHours =45;

    double stateTaxRate =6.5,
           federalTaxRate = 26.2;

    int salaryBeforeTax = hourlyRate * weeklyHours *52;
    double stateTax = salaryBeforeTax * stateTaxRate / 100;
    double federalTax = salaryBeforeTax * federalTaxRate / 100;
    double totalTax = stateTax + federalTax;
    double salaryAfterTotalTax = salaryBeforeTax - totalTax;

        System.out.println("Gross pay is: $" + salaryBeforeTax);
        System.out.println("StateTax = $" + stateTax);
        System.out.println("FederalTax = $" + federalTax);
        System.out.println("TotalTax = $" + totalTax);
        System.out.println("Net income = $" + salaryAfterTotalTax);






    }


}
