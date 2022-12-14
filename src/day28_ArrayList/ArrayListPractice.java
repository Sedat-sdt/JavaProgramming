package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);    //[10, 20, 30, 40, 50]


        for (int i = 0; i < list.size(); i++) {    //i: index number
            list.set(i,list.get(i)*2);
        }

        System.out.println(list);    //[20, 40, 60, 80, 100]


        System.out.println("--------------------------------------");


        ArrayList<String> employees= new ArrayList<>();
        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Ali");
        employees.add("Hulya");
        employees.add("Kaloyan");

        System.out.println(employees);  //[Suat, Aygun, Olga, Neira, Ali, Hulya, Kaloyan]

        employees.remove(1);
        employees.remove(1);

        System.out.println(employees);  //[Suat, Olga, Neira, Ali, Hulya, Kaloyan]
                                        //[Suat, Neira, Ali, Hulya, Kaloyan]

        employees.remove(employees.size()-1);

        boolean r1= employees.remove("Ali");
        System.out.println("r1 = " + r1);   //r1 = true

    }
}
/*
{1,2,3,4,5,6}

{2,4,6,8,10,12}
 */