package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class ReverseArray2 {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5};
        int[] result= reverseArray(arr);
        System.out.println(Arrays.toString(result));

    }

   public static int[] reverseArray(int[] array){
        int[] result = {};

       for (int i = array.length - 1, j=0; i >= 0; i--,j++) {
           result = ArraysUtility.addElement(result,array[i]);

       }
            return result;
   }






}
