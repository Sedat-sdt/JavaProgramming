package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);//autoboxing
        numbers.add(20);//autoboxing
        numbers.add(30);//autoboxing
        numbers.add(40);//autoboxing
        numbers.add(50);//autoboxing

        numbers.add(2,25);  // index 2
        numbers.add(5,45);  // index 5

        System.out.println("numbers size: "+numbers.size());  //7

        int lastIndex= numbers.size()-1;
        System.out.println("lastIndex = " + lastIndex);  //6

        //Integer num = numbers.get(3);
        int num = numbers.get(3);// unboxing

        System.out.println("num = " + num);  //num = 30


        System.out.println("--------------------------------------------");


        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i)+" ");//10 20 25 30 40 45 50

        }
        System.out.println();

        System.out.println(numbers);//  [10]
                                    //  [10, 20, 30, 40, 50]
                                    //  [10, 20, 25, 30, 40, 50]
                                    //  [10, 20, 25, 30, 40, 45, 50]

        System.out.println("----------------------------------------------");

        ArrayList<String> list= new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");

        list.set(2,"JavaScript");//replace

        System.out.println(list);   //[Java, Python, Java, C#, Ruby]
                                    //[Java, Python, JavaScript, C#, Ruby]

        list.set(3,"C++");
        System.out.println(list); // [Java, Python, JavaScript, C++, Ruby]


    }
}
