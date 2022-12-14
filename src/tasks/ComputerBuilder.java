package tasks;

import java.util.Scanner;

public class ComputerBuilder {
    public static void main(String[] args) {

                Scanner scan = new  Scanner(System.in);

                System.out.println("Select screen size: ");//13.3, 15.0, 17.3
                double screenSize = scan.nextDouble();
                int totalPrice=0;
                int screenPrice=0;
                if(screenSize == 13.3){
                    screenPrice =200;
                }else if(screenSize == 15.0){
                    screenPrice=300;
                }else{
                    screenPrice=400;
                }
                totalPrice += screenPrice;

                scan.nextLine();
                System.out.println("Select CPU type: ");//i3, i5, i7
                String cpuType = scan.nextLine();
                int cpuPrice=0;
                if(cpuType.equals("i3")){
                    cpuPrice=150;
                }else if(cpuType.equals("i5")){
                    cpuPrice=250;
                }else {
                    cpuPrice=350;
                }
                totalPrice +=cpuPrice;

                System.out.println("Select RAM size: ");//must be divisible by (4)
                int ram = scan.nextInt();
                int division = ram/4;
                totalPrice+= (division*50);

                System.out.println("Select storage type: ");//HDD, SSD
                String storageType = scan.next();

                System.out.println("Select storage size: ");
                int storageSize=scan.nextInt();

                if(storageType.equals("HDD")){
                    totalPrice += (storageSize/500)*50;
                }
                if(storageType.equals("SSD")){
                    totalPrice += (storageSize/500)*100;
                }

                System.out.println("Select screen resolution: ");//FULLHD, 4K
                String scrResolution = scan.next();
                if(scrResolution.equals("FULLHD")){
                    totalPrice += 100;
                }
                if(scrResolution.equals("4K")){
                    totalPrice += 200;
                }
                double finalPrice = totalPrice;

                System.out.println("Final Price is: $"+finalPrice);
    }
}
