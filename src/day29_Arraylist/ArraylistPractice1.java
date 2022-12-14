package day29_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistPractice1 {

    public static void main(String[] args) {
/*
create an array of string called countries

write a program that can remove all the country names that have length of 10 or greater
 */
String[] countries ={"Japan","Korea","United States","Turkey","United Kingdom","Canada"};

        //converting array to arrayList
        ArrayList<String> list= new ArrayList<>(Arrays.asList(countries));

        list.removeIf( each -> each.length()>=10);

        //converting arraylist back to array

        countries= list.toArray(new String[0]);//we can do with loop

        System.out.println(Arrays.toString(countries));//[Japan, Korea, Turkey, Canada]











    }
}
