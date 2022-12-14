package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class MergeArrays2 {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4};
        int[] arr2={5,6,7,8};
        int[] arr3=mergeArrays(arr1,arr2);
        System.out.println(Arrays.toString(arr3));

        System.out.println("---------------------");

        double[] arr11={1.1,2.1,3.1,4.1};
        double[] arr22={5.1,6.1,7.1,8.1};
        double[] arr33=mergeArrays(arr11,arr22);
        System.out.println(Arrays.toString(arr33));

        System.out.println("---------------------");

        char[] arr111={'A','B'};
        char[] arr222={'C','D'};
        char[] arr333=mergeArrays(arr111,arr222);
        System.out.println(Arrays.toString(arr333));

        System.out.println("---------------------");

        String[] array1={"A","B"};
        String[] array2={"C","D"};
        String[] array3=mergeArrays(array1,array2);
        System.out.println(Arrays.toString(array3));

    }
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] result = {};
        for (int each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
        for (int each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }

    public static double[] mergeArrays(double[] arr1, double[] arr2) {
        double[] result = {};
        for (double each : arr1) {
            result = ArraysUtility.addElement(result,each);
        }
        for (double each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }

    public static char[] mergeArrays(char[] arr1, char[] arr2) {
        char[] result = {};
        for (char each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
        for (char each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }

    public static String[] mergeArrays(String[] arr1, String[] arr2) {
        String[] result = {};
        for (String each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
        for (String each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }






}