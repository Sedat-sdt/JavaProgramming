package utilities;

import java.util.Arrays;

public class ArraysUtility {

    //prints each integer array in sepereate lines

    public static void printEachElement(int[] array) {
        for (int each : array) {
            System.out.println(each);
        }

    }


    //prints each double array in sepereate lines
    public static void printEachElement(double[] array) {
        for (double each : array) {
            System.out.println(each);
        }

    }


    //prints each char array in sepereate lines
    public static void printEachElement(char[] array) {
        for (char each : array) {
            System.out.println(each);
        }

    }


    //prints each String array in sepereate lines
    public static void printEachElement(String[] array) {
        for (String each : array) {
            System.out.println(each);
        }

    }

    //returns the maximum number from integer array
    public static int maxNumOfArray(int[] array) {
        /*int max=0;
        for (int each : array) {
            if(each>max)
                max=each;
        }*/
        Arrays.sort(array);
        return array[array.length - 1];
    }

    public static double maxNumOfArray(double[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }

    public static double minNumOfArray(double[] array) {
        Arrays.sort(array);
        return array[0];
    }

    public static int minNumOfArray(int[] array) {
        Arrays.sort(array);
        return array[0];
    }


    //checks if the given integer is contained in the given array. returns boolean.
    public static boolean contains(int[] array, int element) {
        boolean result = false;
        for (int each : array) {
            if (each == element)
                result = true;
        }
        return result;
    }


    //checks if the given double is contained in the given array. returns boolean.
    public static boolean contains(double[] array, double element) {
        boolean result = false;
        for (double each : array) {
            if (each == element)
                result = true;
        }
        return result;
    }


    //checks if the given String is contained in the given array. returns boolean.
    public static boolean contains(String[] array, String element) {
        boolean result = false;
        for (String each : array) {
            if (each.equalsIgnoreCase(element))
                result = true;
        }
        return result;
    }


    //checks if the given String is contained in the given array. returns boolean.
    public static boolean contains(char[] array, char element) {
        boolean result = false;
        for (char each : array) {
            if (each == element)
                result = true;
        }
        return result;
    }


    //adds the given integer element to array,returns a new array
    public static int[] addElement(int[] array, int element) {
        int[] result = new int[array.length + 1];

        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;

    }


    //adds the given double element to array,returns a new array
    public static double[] addElement(double[] array, double element) {
        double[] result = new double[array.length + 1];
        int i = 0;
        for (double each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }


    //adds the given char element to array,returns a new array
    public static char[] addElement(char[] array, char element) {
        char[] result = new char[array.length + 1];
        int i = 0;
        for (char each : array) {
            result[i++] = each;
            // result[result.length-1]=each;
        }
        result[i] = element;
        return result;
    }


    //adds the given String element to array,returns a new array
    public static String[] addElement(String[] array, String element) {
        String[] result = new String[array.length + 1];
        int i = 0;
        for (String each : array) {
            result[i++] = each;
            //result[result.length-1]=each;
        }
        result[i] = element;
        return result;
    }


    // returns the frequency of the given element from the given array
    //                                     [1,1,1,2,3,3,4,5]      1
    public static int frequencyOfElement(int[] array, int element) {
        int count = 0;
        for (int each : array) {
            if (each == element)
                count++;
        }
        return count;
    }


    // returns the frequency of the given element from the given array
    public static int frequencyOfElement(double[] array, double element) {
        int count = 0;
        for (double each : array) {
            if (each == element)
                count++;
        }
        return count;
    }


    // returns the frequency of the given element from the given array
    public static int frequencyOfElement(char[] array, char element) {
        int count = 0;
        for (char each : array) {
            if (each == element)
                count++;
        }
        return count;
    }


    // returns the frequency of the given element from the given array
    public static int frequencyOfElement(String[] array, String element) {
        int count = 0;
        for (String each : array) {
            if (each.equals(element))
                count++;
        }
        return count;
    }


    public static int[] uniqueElements(int[] array) {
        int[] result = {};//new int[0]
        for (int each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {//if frequency is 1 the element is unique
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }


    public static double[] uniqueElements(double[] array) {
        double[] result = {};//new double[0.0]
        for (double each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {//if frequency is 1 the element is unique
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }


    public static char[] uniqueElements(char[] array) {
        char[] result = {};//new char['0']
        for (char each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {//if frequency is 1 the element is unique
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }


    public static String[] uniqueElements(String[] array) {
        String[] result = {};//new char['0']
        for (String each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {//if frequency is 1 the element is unique
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    //removes the index from array
    public static int[] removeElement(int[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index");
            System.exit(0);
        }
        int[] newArray = new int[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index)//if the index of array is matching with the given index
                continue;//skip
            newArray[j++] = array[i];
        }

        return newArray;
    }

    //removes the index from array
    public static double[] removeElement(double[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index");
            System.exit(0);
        }
        double[] newArray = new double[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index)//if the index of array is matching with the given index
                continue;//skip
            newArray[j++] = array[i];
        }

        return newArray;
    }

    //removes the index from array
    public static char[] removeElement(char[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index");
            System.exit(0);
        }
        char[] newArray = new char[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index)//if the index of array is matching with the given index
                continue;//skip
            newArray[j++] = array[i];
        }

        return newArray;
    }

    //removes the index from array
    public static String[] removeElement(String[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index");
            System.exit(0);
        }
        String[] newArray = new String[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index)//if the index of array is matching with the given index
                continue;//skip
            newArray[j++] = array[i];
        }

        return newArray;
    }

    //merge the given two arrays and returns the new array
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

    //merge the given two arrays and returns the new array
    public static double[] mergeArrays(double[] arr1, double[] arr2) {
        double[] result = {};
        for (double each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
        for (double each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }

    //merge the given two arrays and returns the new array
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

    //merge the given two arrays and returns the new array
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

    //reverse the array, returns a new array
    public static int[] reverseArray(int[] array) {
        int[] result = new int[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }

        return result;
    }

    //reverse the array, returns a new array
    public static double[] reverseArray(double[] array) {
        double[] result = new double[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }

        return result;
    }

    //reverse the array, returns a new array
    public static char[] reverseArray(char[] array) {
        char[] result = new char[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }

        return result;
    }

    //reverse the array, returns a new array
    public static String[] reverseArray(String[] array) {
        String[] result = new String[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }

        return result;
    }

    // replace the elements of the array at given index with the new element
    public static int[] replace(int[] array, int index, int newElement) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
        }
        array[index] = newElement;
        return array;
    }

    // replace the elements of the array at given index with the new element
    public static double[] replace(double[] array, int index, double newElement) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
        }
        array[index] = newElement;
        return array;
    }

    // replace the elements of the array at given index with the new element
    public static char[] replace(char[] array, int index, char newElement) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
        }
        array[index] = newElement;
        return array;
    }

    // replace the elements of the array at given index with the new element
    public static String[] replace(String[] array, int index, String newElement) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
        }
        array[index] = newElement;
        return array;
    }

    //replaces all the matching old values of the array with the new value
    public static int[] replaceAll(int[] array, int oldElement, int newElement) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldElement) {
                array[i] = newElement;
            }
        }
        return array;

    }


    //replaces all the matching old values of the array with the new value
    public static double[] replaceAll(double[] array, double oldElement, double newElement) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldElement) {
                array[i] = newElement;
            }
        }
        return array;

    }


    //replaces all the matching old values of the array with the new value
    public static char[] replaceAll(char[] array, char oldElement, char newElement) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldElement) {
                array[i] = newElement;
            }
        }
        return array;

    }


    //replaces all the matching old values of the array with the new value
    public static String[] replaceAll(String[] array, String oldElement, String newElement) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(oldElement)) {
                array[i] = newElement;
            }
        }
        return array;

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