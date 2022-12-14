package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElement {
    public static void main(String[] args) {
        int []array={1,2,3,3,4,4,5,5,6};
        int[] arrayUnique=uniqueElements(array);
        System.out.println(Arrays.toString(arrayUnique));

        System.out.println("---------------------------------");
        double[]array1={1.1,2.2,2.2,3.3,3.3,4.4,4.4,5.5};
        double[] arrayUnique1=uniqueElements(array1);
        System.out.println(Arrays.toString(arrayUnique1));

        System.out.println("-----------------------------------");

        char[] array2={'A','A','B','C','D','D'};
        char[] arrayUnique2= uniqueElements(array2);
        System.out.println(Arrays.toString(arrayUnique2));

        System.out.println("-----------------------------");

        String[] array3={"a","b","c","c","d","d"};
        String[] arrayUnique3=uniqueElements(array3);
        System.out.println(Arrays.toString(arrayUnique3));


    }


    public static int[] uniqueElements(int[] array){
        int[] result={};//new int[0]
        for (int each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1) {//if frequency is 1 the element is unique
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    public static double[] uniqueElements(double[] array){
        double[] result={};//new double[0.0]
        for (double each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1) {//if frequency is 1 the element is unique
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    public static char[] uniqueElements(char[] array){
        char[] result={};//new char['0']
        for (char each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1) {//if frequency is 1 the element is unique
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }
    public static String[] uniqueElements(String[] array){
        String[] result={};//new char['0']
        for (String each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1) {//if frequency is 1 the element is unique
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }




}
