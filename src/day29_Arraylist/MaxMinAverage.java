package day29_Arraylist;

import java.util.ArrayList;

public class MaxMinAverage {
    public static void main(String[] args) {

   //  Write a program that can find the maximum, minimum and average number from an arrayList of integers

        ArrayList<Integer> list=new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        int max = list.get(0);

        for (Integer each : list) {
            if(each>max){
                max=each;
            }
        }
        System.out.println("max = " + max);    //9
        int sum=0;
        int min = list.get(0);
        for (Integer each : list) {
            if(each<min){
                min=each;
            }
            sum+=each;
        }
        System.out.println("min = " + min);    //1

        double average=(double) sum/list.size();
        System.out.println("average = " + average);     //5












    }
}
