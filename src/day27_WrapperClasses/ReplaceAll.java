package day27_WrapperClasses;

import java.util.Arrays;

public class ReplaceAll {
    public static void main(String[] args) {
int[] arr={1,2,3,3,4,5,3,6};
arr=replaceAll(arr,3,7);
        System.out.println(Arrays.toString(arr));

        System.out.println("---------------------------");

        double[] arr1={1.1,2.1,3.1,3.1,4.1,5.1,3.1,6.1};
        arr1=replaceAll(arr1,3.1,7.1);
        System.out.println(Arrays.toString(arr1));

        System.out.println("-------------------------------------");

        char[] arr2={'1','2','3','3','4','5','3','6'};
        arr2=replaceAll(arr2,'3','7');
        System.out.println(Arrays.toString(arr2));

        System.out.println("-------------------------------------");

        String[] arr3={"ghgf","aaa","ghfhfh","aaa","aaa","ghggg","ret","dfg"};
        arr3=replaceAll(arr3,"aaa","bbb");
        System.out.println(Arrays.toString(arr3));


    }
    //replaces all the matching old values of the array with the new value
    public static int[] replaceAll(int[] array, int oldElement, int  newElement) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldElement) {
                array[i] = newElement;
            }
        }
        return array;

    }
    //replaces all the matching old values of the array with the new value
    public static double[] replaceAll(double[] array, double oldElement, double  newElement) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldElement) {
                array[i] = newElement;
            }
        }
        return array;

    }
    //replaces all the matching old values of the array with the new value
    public static char[] replaceAll(char[] array, char oldElement, char  newElement) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldElement) {
                array[i] = newElement;
            }
        }
        return array;

    }
    //replaces all the matching old values of the array with the new value
    public static String[] replaceAll(String[] array, String oldElement, String  newElement) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(oldElement)) {
                array[i] = newElement;
            }
        }
        return array;

    }



/*
2. RecplaceAll Task:
		2.1 Create a method named replaceAll that passes three parameters:
		integer array, integer oldElement, integer newElement.
		The method replaces all the element of the array that matching with
		the given old element with the given new element,
		and returns the new array.
			Ex:
				arr = {10, 10, 20, 30, 40, 30, 30, 30};

				replaceAll(arr, 30, 300) ==> {10, 10, 20, 300, 40, 300, 300, 300}


		2.2 Create the same functions for double arrays, char arrays, and String arrays
 */









}
