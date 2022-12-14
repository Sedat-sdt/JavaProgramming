package day32_ConstructorOverloading;

public class SalaryCalculator {

    public int hourlyRate, weeklyHours;
    public double stateTaxRate, federalTaxRate;
    double totalStateTax=salary()*stateTaxRate/100;
    double totalFederalTax=salary()*federalTaxRate/100;

    public SalaryCalculator(int hourlyRate, int weeklyHours, double stateTaxRate, double federalTaxRate) {
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
    }

    public double salary(){
        double salary =( hourlyRate * weeklyHours * 52);
        return salary;
    }
    public double stateTax(){
        double totalStateTax=salary()*stateTaxRate/100;
        return totalStateTax;
    }
    public double federalTax(){
        double totalFederalTax=salary()*federalTaxRate/100;
        return totalFederalTax;
    }
    public double salaryAfterTax(){
        double totalSalaryAfterTax= salary()-(totalFederalTax+totalStateTax);
        return totalSalaryAfterTax;
    }

    public String toString() {
        return "SalaryCalculator{" +
                "federalTaxRate=" + federalTaxRate +
                ", totalStateTax=" + totalStateTax +
                ", totalFederalTax=" + totalFederalTax +
                ", totalFederalTax=" + totalFederalTax +
                ", salary= $" + salary() +
                ", salary after Tax= $" + salaryAfterTax() +
                '}';
    }


    /*
    SalaryCalculator Task:
		1.1 Create a class named Salary calculator:
		        Attributes:
		            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

	            Add a constructor to set all the fields

		        Actions:
		            salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
		            stateTax(): calculates the totalStateTax
		            federalTax(): calculates the total federal tax
		            salaryAfterTax(): calculates the salary after tax
		            toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object

     */

   /*
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

    */







}
