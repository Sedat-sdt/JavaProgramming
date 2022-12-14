package day31_Constructors;

public class CapitalOne {
    public static void main(String[] args) {

     BankAccount account1= new BankAccount();

     account1.setInfo("Ahmet OZKOK", 123456789);

        System.out.println(account1);

        account1.deposit(1000);
        account1.checkBalance();//Your available balance is: 1000.0

        account1.withdraw(900);

        account1.checkBalance();//100
        System.out.println("------------------------------------------");


        BankAccount account2= new BankAccount();
        account2.setInfo("Aygun",987654321);
        account2.deposit(10000);
        account2.checkBalance();//Your available balance is: 10000.0
        account2.withdraw(1200);
        account2.checkBalance();//Your available balance is: 8800.0














    }
}
