package tasks;

import java.util.Scanner;

public class Items {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String[] items = new String[5];
        double[] prices = new double[5];
        String result ="";
        double totalPrice=0.0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter item: ");
            items[i]= scan.next();

            System.out.println("Enter price: ");
            prices[i] = scan.nextDouble();
            result+=items[i]+"--"+prices[i]+"\n";
            totalPrice+=prices[i];
        }
        System.out.println(result);
        System.out.println("Total Price: "+totalPrice);







        /*
        Items
			1. Create an array named items with the length of 5
			2. Create an array named prices with the length of 5
			3. Ask user to enter item name and price 5 times and store them into the items and prices arrays
			4. calculate the total price of the arrays
			5. display each item name and price in separate lines

						ItemName -- Price

         */
    }
}
