package day28_ArrayList;

import java.util.ArrayList;

public class UniqueElements {
    public static void main(String[] args) {

        ArrayList<String> list= new ArrayList<>();

        list.add("Java");
        list.add("Java");
        list.add("Java");
        list.add("Python");
        list.add("C#");
        list.add("C#");
        list.add("C#");
        list.add("Ruby");
        list.add("C++");
        list.add("C++");


        System.out.println(list);//[Java, Java, Java, Python, C#, C#, C#, Ruby, C++, C++]

        ArrayList<String> uniques= new ArrayList<>();

                //String uniques="";
       /* for (int i = 0; i < list.size(); i++) {
            if(list.indexOf(list.get(i))==list.lastIndexOf(list.get(i))){
               //uniques+=list.get(i)+" ";
                uniques.add(list.get(i));

            }
        }*/
        for (String each : list) {
            if(list.indexOf(each)==list.lastIndexOf(each)){
                uniques.add(each) ;
            }
        }
        System.out.println("uniques = " + uniques);    //uniques = [Python, Ruby]


        //System.out.println("uniques = " + uniques);  //uniques = Python Ruby












    }
}
