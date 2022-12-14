package day26_CustomMethodsPractice;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] result= reverseArray(arr);
        System.out.println(Arrays.toString(result));

        System.out.println("-------------------------");

        double[] arr1={1,2,3,4,5};
        double[] result1= reverseArray(arr1);
        System.out.println(Arrays.toString(result1));

        System.out.println("-----------------------------");

        char[] arr2={'A','B','C','D'};
        char[] result2= reverseArray(arr2);
        System.out.println(Arrays.toString(result2));

        System.out.println("-----------------------------");

        String[] arr3={"A","S","F","R","5"};
        String[] result3= reverseArray(arr3);
        System.out.println(Arrays.toString(result3));






    }

    public static int[] reverseArray(int[] array){
     int[] result = new int[array.length];
        for (int i = array.length - 1, j=0; i >= 0; i--,j++) {
            result[j]=array[i];
        }

return result;
    }
    public static double[] reverseArray(double[] array){
        double[] result = new double[array.length];
        for (int i = array.length - 1, j=0; i >= 0; i--,j++) {
            result[j]=array[i];
        }

        return result;
    }

    public static char[] reverseArray(char[] array){
        char[] result = new char[array.length];
        for (int i = array.length - 1, j=0; i >= 0; i--,j++) {
            result[j]=array[i];
        }

        return result;
    }
    public static String[] reverseArray(String[] array){
        String[] result = new String[array.length];
        for (int i = array.length - 1, j=0; i >= 0; i--,j++) {
            result[j]=array[i];
        }

        return result;
    }

}
