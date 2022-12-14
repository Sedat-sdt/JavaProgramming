package day21_ArraysUtility_ForEachLoop;

import java.util.Arrays;

public class ReverseArray {//ınterview
    public static void main(String[] args) {

    int[] numbers = {10,20,30,40};
    //                0  1  2  3
    int[] reversed = new int[numbers.length];// to make sure that the array has enough capacity to containall the elements of first array
        //System.out.println(Arrays.toString(numbers));//[10, 20, 30, 40, 50]
        //System.out.println(Arrays.toString(reversed));//[0, 0, 0, 0, 0]
/*
   reversed[0]  = numbers[numbers.length-1];
   reversed[1] = numbers[2];
   reversed[2] = numbers[1];
   reversed[3] = numbers[0];*/
        for (int i = numbers.length - 1, j=0 ; i >= 0; i--,j++) {
            reversed[j]+=numbers[i];
        }

        System.out.println(Arrays.toString(reversed));//[40, 30, 20, 10]







    }
}
