package day44_Abstraction_Interface.carTask;

public class CarShop {
    public static void main(String[] args) {

        CydeoCar cydeoCar= new CydeoCar("Cydeo","WoodenSpoon",2010,120000,"Blue");

        cydeoCar.autopark();
        cydeoCar.fly();
        cydeoCar.selfDrive();
        cydeoCar.start();
        cydeoCar.drive();

        System.out.println("--------------------------------------");

        Tesla tesla= new Tesla("Tesla","model3",2020,110000,"Red");

        tesla.autopark();
        tesla.drive();
        tesla.selfDrive();
        tesla.start();
















    }
}
