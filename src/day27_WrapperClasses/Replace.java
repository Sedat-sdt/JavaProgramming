package day27_WrapperClasses;

import java.util.Arrays;

public class Replace {
    public static void main(String[] args) {

    int[] array= {1,23,45,67};
    array=replace(array,3,300);
        System.out.println(Arrays.toString(array));

        System.out.println("------------------------------------");

        double[] array1= {1.1,23.2,45.1,67.4};
        array1=replace(array1,3,300.5);
        System.out.println(Arrays.toString(array1));

        System.out.println("------------------------------------");
String[] arr2={"D","aadsad","hghghgfh","etyyu","llçömö"};
arr2=replace(arr2,2,"sedat");
        System.out.println(Arrays.toString(arr2));

        System.out.println("---------------------------");

        char[] arr3={'D','ı','h','e','l'};
        arr3=replace(arr3,2,'s');
        System.out.println(Arrays.toString(arr3));



    }
    // replace the elements of the array at given index with the new element
    public static int[] replace(int[] array, int index,int newElement){
        if(index<0 || index> array.length-1) {
            System.err.println("Invalid Index: "+index);
        }
        array[index]=newElement;
        return array;
    }
    // replace the elements of the array at given index with the new element
    public static double[] replace(double[] array, int index,double newElement){
        if(index<0 || index> array.length-1) {
            System.err.println("Invalid Index: "+index);
        }
        array[index]=newElement;
        return array;
    }
    // replace the elements of the array at given index with the new element
    public static char[] replace(char[] array, int index,char newElement){
        if(index<0 || index> array.length-1) {
            System.err.println("Invalid Index: "+index);
        }
        array[index]=newElement;
        return array;
    }
    // replace the elements of the array at given index with the new element
    public static String[] replace(String[] array, int index,String newElement){
        if(index<0 || index> array.length-1) {
            System.err.println("Invalid Index: "+index);
        }
        array[index]=newElement;
        return array;
    }


/*
1. Replace Task:
		1.1 Create a method named replace that passes three parameters: integer array, integer index, integer newElement.
		The method replaces the element of the array at given index with the new element, and returns the new array.
				Ex:
					arr = {1,2,3,4,5};

					replace(arr, 2, 30) ===> {1, 2, 30, 4, 5}


		1.2 Create the same functions for double arrays, char arrays, and String arrays
 */

}
