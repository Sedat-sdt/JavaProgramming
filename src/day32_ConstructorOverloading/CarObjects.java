package day32_ConstructorOverloading;

public class CarObjects {
    public static void main(String[] args) {

        Car car1= new Car("Toyota") ;
        Car car2= new Car("Honda","Accord");
        Car car3= new Car("Lexus","RX350",2021);
        Car car4= new Car("BMV","X6",2020,50000);
        Car car5= new Car("Tesla","Model 3",2019,70000,"Red");

        System.out.println(car1);//Car{brand='Toyota', model='null', year=0, price= $0.0, color='null'}
        System.out.println(car2);//Car{brand='Honda', model='Accord', year=0, price= $0.0, color='null'}
        System.out.println(car3);//Car{brand='Lexus', model='RX350', year=2021, price= $0.0, color='null'}
        System.out.println(car4);//Car{brand='BMV', model='X6', year=2020, price= $50000.0, color='null'}
        System.out.println(car5);//Car{brand='Tesla', model='Model 3', year=2019, price= $70000.0, color='Red'}















    }
}
