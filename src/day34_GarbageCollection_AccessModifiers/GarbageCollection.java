package day34_GarbageCollection_AccessModifiers;

import day31_Constructors.Student;
import day32_ConstructorOverloading.Car;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {


    public static void main(String[] args) {

    String str= "Wooden Spoon";//after line 13 this object will be elligible for garbage collection

    str=null;

    System.out.println(str);//null


        Car car1= new Car("Toyota");
        //car1=null;

        Car car2= new Car("Suzuki");
        car1=car2;

        System.out.println(car1);//suzuki, the first object is available for garbage collection

       String language= "Python";//elligible for garbage collection
        language      = "Java";


        System.out.println(language);

        System.out.println("---------------------------------------------");


        ArrayList<Integer> list1= new ArrayList<>();

        list1.add(100);

        ArrayList<Integer> list2= list1;

        list2.addAll(Arrays.asList(200,300,400));

        System.out.println(list1);//[100]  //[100, 200, 300, 400]
        System.out.println(list2);//[100]  //[100, 200, 300, 400]


        System.out.println(list2==list1);//true

        System.out.println("----------------------------------");


        Student student1= new Student("Sedat",45,'M','A',15);

        student1.grade='B';

        Student student2= student1;

        student2.name="Ahmet";//Student{name='Ahmet', age=45, gender=M, grade=B, id=15}

        System.out.println(student1);//Student{name='Sedat', age=45, gender=M, grade=B, id=15}
        System.out.println(student2);//Student{name='Sedat', age=45, gender=M, grade=B, id=15}

        System.out.println("-------------------------------------------");

        ArrayList<String> l1= new ArrayList<>();
        l1.add("Java");

        ArrayList<String> l2= l1;
        l2.add("Python");

        System.out.println("l1 = " + l1);//l1 = [Java, Python]
        System.out.println("l2 = " + l2);//l2 = [Java, Python]


    }





}
