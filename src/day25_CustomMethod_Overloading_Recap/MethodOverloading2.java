package day25_CustomMethod_Overloading_Recap;

import java.util.Arrays;

public class MethodOverloading2 {
    public static void main(String[] args) {
        int[] arr1= {1,2,3,4};
        arr1= addElements(arr1,5);

        double[] arr2={1.5,2.5,3.5,4.5,5.5};
        arr2=addElements(arr2,6.5);

        char[] arr3={'1','2','3','4'};
        arr3=addElements(arr3,'9');

        String[] arr4={"a","b","c","d"};
        arr4= addElements(arr4,"e");

        System.out.println("arr1 = " + Arrays.toString(arr1));
        System.out.println("arr2 = " + Arrays.toString(arr2));
        System.out.println("arr3 = " + Arrays.toString(arr3));
        System.out.println("arr4 = " + Arrays.toString(arr4));
    }

    public static int[] addElements(int[] array, int element){
        int[]result= new int[array.length+1];

        int i =0;
        for (int each : array) {
            result[i++]=each;
        }
        result[i]= element;
        return result;

    }
    public static double[] addElements(double[] array, double element){
        double[]result= new double[array.length+1];

        int i =0;
        for (double each : array) {
            result[i++]=each;
        }
        result[i]= element;
        return result;

    }
    public static char[] addElements(char[] array, char element){
        char[]result= new char[array.length+1];

        int i =0;
        for (char each : array) {
            result[i++]=each;
        }
        result[i]= element;
        return result;

    }
    public static String[] addElements(String[] array, String element){
        String[]result= new String[array.length+1];

        int i =0;
        for (String each : array) {
            result[i++]=each;
        }
        result[i]= element;
        return result;

    }
    
}
