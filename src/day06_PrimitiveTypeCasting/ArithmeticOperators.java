package day06_PrimitiveTypeCasting;

public class ArithmeticOperators {

    public static void main(String[] args) {

        System.out.println("12" + 1);// 121 concatenation
        System.out.println(10 +20);// 30, Addition
        System.out.println(100-50);// 50, Sub
        System.out.println(10*6);//60, mult

        System.out.println(100/3);//33
        System.out.println(10.0/4);//2.5
        System.out.println(10/4.0);//2.5
        System.out.println(10d/4);//2.5

        int a = 100;
        double b =a/6;//16.0

       // double c = a/6.0; // 16.6666

        double c = (double)a/6;//16.666666





    }
}
/*
   +:Addition
   - Subtract
   *: Multiplication
   /: Division

              integer/integer=====>integer
              decimal/int=====>dec
              int/dec=====>dec
              dec/dec=====>dec


          in math
                10/4 = 2.5
                100/3: 33.333
           in java:
           10/4 = 2
           10.0/4 =2.5
           100/3= 33
   %:Remoinder
    */