package day25_CustomMethod_Overloading_Recap;

import java.util.Arrays;

public class AddElementsToArray {
    public static void main(String[] args) {
//1. create a return method called addInteger that can add an Inteeger  after the  last index of an integer array
        int[] arr= {1,2,3,4};
        arr= addElement(arr,5);
        System.out.println(Arrays.toString(arr));
//2. create a return method called addDouble that can add a double after the last index of a double array
        double[] arr1={1.2,1.3,1.4,1.5};
        arr1=addElement(arr1,0.9);
        System.out.println(Arrays.toString(arr1));
// 4. create a return method called addChar that can add a char after last index of a char array
        char[] arr2= {'1', '2','3','4'};
        arr2= addElement(arr2,'5');
        System.out.println(Arrays.toString(arr2));
//3. create a return method called addString that can add a String after the last index of a String array
        String[] arr3= { "ali","veli","deli","seli"};
        arr3= addElement(arr3,"ahmet");
        System.out.println(Arrays.toString(arr3));

    }

public static int[] addElement(int[] array, int element){
        int[]result= new int[array.length+1];

        int i =0;
    for (int each : array) {
        result[i++]=each;
    }
    result[i]= element;
    return result;

}

public static double[] addElement(double[]array, double element){
    double[] result = new double[array.length+1];
        int i=0;
        for (double each : array) {
        result[i++]=each;
    }
        result[i]=element;
        return result;
}


public static char[] addElement(char[]array, char element){
        char[] result = new char[array.length+1];
int i=0;
    for (char each : array) {
        result[i++]=each;
       // result[result.length-1]=each;
    }
    result[i]= element;
    return  result;
}

public static String[] addElement(String[]array, String element){
        String[] result = new String[array.length+1];
        int i=0;
        for (String each : array) {
             result[i++]=each;
            //result[result.length-1]=each;
        }
        result[i]= element;
        return  result;
    }




    /*


					{1,2,3,4}, 5
					new array ==> {1,2,3,4,5}






     */
}
