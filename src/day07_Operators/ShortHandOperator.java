package day07_Operators;

public class ShortHandOperator {

    public static void main(String[] args) {

    //assignment: =
    int number =100;

        System.out.println("number = " + number);//100

        number =200;

        System.out.println("number = " + number);//200

        String word = "Java Programming";
        System.out.println("word = " + word);//java programming

        word ="Wooden Spoon";
        System.out.println("word = " + word); //wooden spoon

        //Additional assignment:

        int x=100;
        System.out.println("x = " + x);

        System.out.println(x+200);//300

        //x= x+200; // we have a short curt for this operation: (x += 200)
        x += 200;
        System.out.println("x = " + x);

        String str ="Wooden";
        str += "Spoon";
        System.out.println("str = " + str);

        double num1 = 2.5;
        num1 += 5.5;
        System.out.println("num1 = " + num1);

        double availableBalance =1000.50;
        //deposit:300
        availableBalance+=300;
        System.out.println("availableBalance = " + availableBalance);

        System.out.println("....................................");

        //withdrawing 500$
          availableBalance -= 500;
        System.out.println("availableBalance = " + availableBalance);
        //withdaring 200$, then depositing 400$

        availableBalance -=200;//substuction ass
        availableBalance +=400;//additional ass
        System.out.println("availableBalance = " + availableBalance);

        double salary =50000.50;
        salary *=2;  //multiplication assignment
        System.out.println("salary = " + salary);

        double num2 = 25000;
        num2 /= 2;// divisional assignment
        System.out.println("num2 = " + num2);
        double num3 = 100;
        num3%= 3;
        System.out.println("num3 = " + num3);

        int amount =127;//cents

        int quarters = amount / 25;
        int cents = amount % 25;

        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);

        int cents2 =127;
        cents2 %= 25;
        System.out.println("cents2 = " + cents2);

        int y =300;
        y %= 16;
        System.out.println("y = " + y);

        int balance =3500;
        //insurance fee: $153

        balance %= 153;
        System.out.println("balance = " + balance);




    }
}
