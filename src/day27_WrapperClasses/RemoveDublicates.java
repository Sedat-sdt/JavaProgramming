package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDublicates {
    public static void main(String[] args) {
int[] arr={1,2,2,3,3,4,5};
arr=removeDublicates(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("---------------------------------");
        double[] arr2={1.1,2.1,2.1,3.1,3.1,4.1,5.1};
        arr2=removeDublicates(arr2);
        System.out.println(Arrays.toString(arr2));

        System.out.println("---------------------------------");
        char[] arr3={'A','S','A','B','B','C'};
        arr3=removeDublicates(arr3);
        System.out.println(Arrays.toString(arr3));

        System.out.println("---------------------------------");
        String[] arr4={"A","S","A","B","B","C"};
        arr4=removeDublicates(arr4);
        System.out.println(Arrays.toString(arr4));

    }
    //removes the dublicates from the given array, returns the new array
    public static int[] removeDublicates(int[] array) {
        int[] result = {};
        for (int each : array) {
              if(!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }
    //removes the dublicates from the given array, returns the new array
    public static double[] removeDublicates(double[] array) {
        double[] result = {};
        for (double each : array) {
            if(!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    //removes the dublicates from the given array, returns the new array
    public static char[] removeDublicates(char[] array) {
        char[] result = {};
        for (char each : array) {
            if(!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }
    //removes the dublicates from the given array, returns the new array
    public static String[] removeDublicates(String[] array) {
        String[] result = {};
        for (String each : array) {
            if(!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }


}
