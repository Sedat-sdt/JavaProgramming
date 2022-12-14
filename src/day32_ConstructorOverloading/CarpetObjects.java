package day32_ConstructorOverloading;

public class CarpetObjects {
    public static void main(String[] args) {

    Carpet carpet1= new Carpet(4.5,6.5,8,true);
    Carpet carpet2= new Carpet(10,20,10,false);


    System.out.println(carpet1);//Carpet{width=4.5, length=6.5, unitPrice= $8.0, isPersian=true, totalPrice= $434.0}
    System.out.println(carpet2);//Carpet{width=10.0, length=20.0, unitPrice= $10.0, isPersian=false, totalPrice= $2000.0}















    }
}
