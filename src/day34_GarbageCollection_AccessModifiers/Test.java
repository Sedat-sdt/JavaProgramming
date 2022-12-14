package day34_GarbageCollection_AccessModifiers;

import  static day34_GarbageCollection_AccessModifiers.Circle.*;
import static utilities.MathUtility.*;

public class Test {

    public static void main(String[] args) {
        System.out.println(Circle.pi);
        System.out.println(Circle.name);
        System.out.println(Circle.numbers);
        System.out.println(Circle.pi);

        System.out.println(pi); //after importing it can be like this
        System.out.println(name); //after importing it can be like this
        System.out.println(numbers); //after importing it can be like this

        System.out.println("-----------------------------------------------");


        //find sum of 10, 20


        System.out.println(sumOfTwoNumbers(10,20));


        //find sum of 100, 200

        System.out.println(sumOfTwoNumbers(100,200));

        System.out.println(subsOfTwoNumbers(50,10));

        System.out.println(mulOfTwoNumbers(10,11));

    }
}
