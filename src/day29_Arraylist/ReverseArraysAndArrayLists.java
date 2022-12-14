package day29_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArraysAndArrayLists {
    public static void main(String[] args) {

      int[] array= {1,2,3,4,5,6};
      int[] result=new int[array.length];
        int j=0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++]=array[i];
        }

        System.out.println(Arrays.toString(result));   //[6, 5, 4, 3, 2, 1]


        System.out.println("------------------------------------------");


        ArrayList<Integer> list =new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6));

        ArrayList<Integer> reverse =new ArrayList<>();

        int l=0;
        for (int k = list.size() - 1; k >= 0; k--,l++) {
            reverse.add(list.get(k));
        }

        System.out.println(reverse);   //[6, 5, 4, 3, 2, 1]









    }
}
