package day38_Inheritance_MethodOverriding.carTask;

public class ParkingLot {
    public static void main(String[] args) {
        Toyota toyota= new Toyota("corolla",2020,30000,"blue",10000);


        Tesla tesla= new Tesla("Model S",2021,70000,"red",5000);


        BMW bmw= new BMW("X5",2022,60000,"yellow",3000);

        toyota.start();//before overriding://Toyota corolla is starting
        //after overriding://Twist the key to ignition to start Toyota Corolla
        tesla.start();//after overriding: //Say "start" Tesla Model S
        bmw.start();//after ovrrdng:call mechanic to jump start BMW X5



    }
}
