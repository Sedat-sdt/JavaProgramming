package day37_Inheritance.phoneTask;

public class PhoneShop {
    public static void main(String[] args) {

            Iphone iphone= new Iphone("Iphone 12","&.7 inches",1000,"Black");

            Samsung samsung = new Samsung("galaxy S19","6 inches",900,"White");

            Nokia nokia= new Nokia("Brick","4 inches", 50,"Gray");

        System.out.println("Iphone = " + iphone);
        System.out.println("Samsung = " + samsung);
        System.out.println("Nokia = " + nokia);

/*
iphone = Phone{brand='Apple', model='Iphone 12', size='&.7 inches', price= $1000.0, has battery='true'}
samsung = Phone{brand='Samsung', model='galaxy S19', size='6 inches', price= $900.0, has battery='true'}
nokia = Phone{brand='Nokia', model='Brick', size='4 inches', price= $50.0, has battery='true'}
 */

iphone.call(911);
iphone.text(123456778);
iphone.faceTime(12345667);
iphone.faceTime("yahoo@gmail.com");
/*
Apple Iphone 12 is calling911
Apple Iphone 12 is texting123456778
Apple Iphone 12  is having a Face Time with phoneNumber:
Apple Iphone 12  is having a Face Time with email:yahoogmail.com
 */

        System.out.println("-----------------------------------------------");

samsung.call(911);
samsung.text(12345678);
samsung.freeze();
/*
Samsung galaxy S19 is calling911
Samsung galaxy S19 is texting12345678
Samsung galaxy S19 is freezing
 */

nokia.call(911);
nokia.text(12345567);
nokia.selfDefense();

/*
Nokia Brick is calling911
Nokia Brick is texting12345567
You can use Nokia Brick as self defense tool
 */
        System.out.println("---------------------------------------");

     boolean r= Iphone.hasBattery;
        System.out.println(r);//true

        System.out.println(Samsung.hasBattery); //true

        System.out.println("nokia has battery= " + Nokia.hasBattery);//nokia has battery= true


    }
}
