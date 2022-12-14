package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    public static void main(String[] args) {

        Car car1= new Car();
        car1.setInfo("Mazda","SUV","White",2022,20000);
        //car1 = Car{brand='Lambordgini', model='Racecar', color='Orange', year=2022, price=90000}


        Car car2= new Car();
        car2.setInfo("Ferrari","SUV","Red",2020,80000);
        //car2 = Car{brand='Ferrari', model='SUV', color='Red', year=2020, price=80000}


        Car car3= new Car();
        car3.setInfo("Lambordgini","Racecar","Orange",2022,90000);
        //car3 = Car{brand='Lambordgini', model='Racecar', color='Orange', year=2022, price=90000}

        System.out.println("car1 = " + car1);
        System.out.println("car2 = " + car2);
        System.out.println("car3 = " + car3);

        car1.drive();//Driving Mazda SUV
        car2.start();//Ferrari SUV has started
        car3.stop();//Lambordgini Racecar has stopped

        //Car[] cars={car1, car2, car3};

        ArrayList<Car> carList= new ArrayList<>();
        carList.addAll(Arrays.asList(car1,car2,car3));

        for (Car each : carList) {
            System.out.println(each.brand+" : "+each.price);

        }

        System.out.println("--------------------------------");

        /*

        BMW: 2005~2008 elligible to recall
        Toyota: 1995~1997

         */

        carList.removeIf(p-> p.brand.equals("BMW")&& p.year>= 2005 && p.year<=2008);
        carList.removeIf(p-> p.brand.equals("Toyota")&& p.year>= 1995 && p.year<=1997);




    }
}
