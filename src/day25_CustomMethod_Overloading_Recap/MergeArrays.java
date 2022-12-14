package day25_CustomMethod_Overloading_Recap;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {

       int[] numbers={1,2,3,4,5};
       numbers=mergeArrays(numbers,6);
       System.out.println("numbers = " + Arrays.toString(numbers));
       
       double[] numbers1={1.2,2.2,3.3,4.4,5.5};
       numbers1=mergeArrays(numbers1,6.6);
       System.out.println("numbers1 = " + Arrays.toString(numbers1));

       char[] chars ={'a','b','c','d'};
       chars=mergeArrays(chars,'e');
       System.out.println("chars = " + Arrays.toString(chars));


       String[] names={"sedat","şule","sude","doruk"};
       names=mergeArrays(names,"harika dünya");
       System.out.println("names = " + Arrays.toString(names));


    }
public static int[] mergeArrays(int[] array, int element){
        int[] result=new int[array.length+1];
        
    int j=0;
    for (int i = 0; i < array.length; i++) {
       result[j++]=array[i];
       result[j]=element;
    }

return result;
}

public static double[] mergeArrays(double[] array,double element){
        double result[] = new double[array.length+1];
            
    int j=0;
    for (int i = 0; i < array.length; i++) {
        result[j++]=array[i];
        result[j]=element;
    }
    return result;
}


public static char[] mergeArrays(char[] array,char element){
        char result[]= new char[array.length+1];

    int j=0;
    for (int i = 0; i < array.length; i++) {
        result[j++]=array[i];
        result[j]=element;
    }
        return result;
}


public static String[] mergeArrays(String[] array, String element) {
    String result[]= new String[array.length+1];

    int j=0;
    for (int i = 0; i < array.length; i++) {
        result[j++]=array[i];
        result[j]=element;
    }
        return result;
}


  /*
    1. create a method that can merge two integer arrays.

	2. create a method that can merge two double arrays.

	3. create a method that can merge two char arrays.

	4. create a method that can merge two String arrays.
   */
}
