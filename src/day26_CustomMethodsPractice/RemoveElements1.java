package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveElements1 {
    public static void main(String[] args) {
    int[] array={1,2,3,4,5};
    array =removeElement(array,3);
        System.out.println(Arrays.toString(array));

        System.out.println("--------------------------------");




    }
    //removes the index from array
    public static int[] removeElement(int[] array,int index){

        if(index<0 || index> array.length-1){
            System.err.println("Invalid index");
            System.exit(0);
        }
        int[] newArray=new int[array.length-1];
        int j=0;
        for (int i=0; i<array.length; i++) {
            if(i==index)//if the index of array is matching with the given index
                continue;//skip
            newArray[j++]=array[i];
        }

        return newArray;
    }

    //removes the index from array
    public static double[] removeElement(double[] array,int index){

        if(index<0 || index> array.length-1){
            System.err.println("Invalid index");
            System.exit(0);
        }
        double[] newArray=new double[array.length-1];
        int j=0;
        for (int i=0; i<array.length; i++) {
            if(i==index)//if the index of array is matching with the given index
                continue;//skip
            newArray[j++]=array[i];
        }

        return newArray;
    }

    //removes the index from array
    public static char[] removeElement(char[] array,int index){

        if(index<0 || index> array.length-1){
            System.err.println("Invalid index");
            System.exit(0);
        }
        char[] newArray=new char[array.length-1];
        int j=0;
        for (int i=0; i<array.length; i++) {
            if(i==index)//if the index of array is matching with the given index
                continue;//skip
            newArray[j++]=array[i];
        }

        return newArray;
    }


    //removes the index from array
    public static String[] removeElement(String[] array,int index){

        if(index<0 || index> array.length-1){
            System.err.println("Invalid index");
            System.exit(0);
        }
        String[] newArray=new String[array.length-1];
        int j=0;
        for (int i=0; i<array.length; i++) {
            if(i==index)//if the index of array is matching with the given index
                continue;//skip
            newArray[j++]=array[i];
        }

        return newArray;
    }






/*
Create a class named RemoveElements:
			2.1 Create a method that passes two parametetrs: an integer array and an integer index.
			the method removes the element at the given index of the array and returns the new array
					Ex:
						int[] arr = {10,20,30,40}
						removeElement(arr, 2) ==> {10, 20, 40}

			2.2 Create a method that passes two parametetrs: a double array and an integer index.
			the method removes the element at the given index of the array and returns the new array


			2.3 Create a method that passes two parametetrs: a char array and an integer index.
			the method removes the element at the given index of the array and returns the new array

			2.4 Create a method that passes two parametetrs: a String array and an integer index.
			the method removes the element at the given index of the array and returns the new array
 */










}
