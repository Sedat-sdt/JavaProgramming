package day25_CustomMethod_Overloading_Recap;

import utilities.ArraysUtility;

public class test2 {
    public static void main(String[] args) {


        int[] arr1={1,2,3,4,5};
        ArraysUtility.printEachElement(arr1);

        System.out.println("---------------------------------------");

        String[] arr2={"sed","Sude","Şule","Efe"};
        ArraysUtility.printEachElement(arr2);

        System.out.println("----------------------------------------");

        char[] arr3= {'A','B','C','D'};
        ArraysUtility.printEachElement(arr3);

        System.out.println("---------------------------------------------");

        int[] numbers={1,2,3,4,5};
        int maxNumber=ArraysUtility.maxNumOfArray(numbers);
        int minNumber=ArraysUtility.minNumOfArray(numbers);
        System.out.println("minNumber = " + minNumber);
        System.out.println("maxNumber = " + maxNumber);

        System.out.println("--------------------------------------------");

        double[] numbers1={1.2,2.3,3.4,4.5};
        double maxNumber1= ArraysUtility.maxNumOfArray(numbers1);
        double minNumber1= ArraysUtility.minNumOfArray(numbers1);
        System.out.println("minNumber1 = " + minNumber1);
        System.out.println("maxNumber1 = " + maxNumber1);

        System.out.println("--------------------------------------------");

        int[] numbers2= {1,2,3,4,5};
        boolean result= ArraysUtility.contains(numbers2,4);
        System.out.println("result = " + result);

        System.out.println("--------------------------------------------");

        double[] numbers3= {1.6,2.7,3.8,4.9,5.1};
        boolean result1= ArraysUtility.contains(numbers3,4.9);
        System.out.println("result1 = " + result1);

        System.out.println("---------------------------------------------");

        String[] arr={"sed","Sude","Şule","Efe"};
        boolean result2= ArraysUtility.contains(arr,"sude");
        System.out.println("result2 = " + result2);

        System.out.println("-----------------------------------------");

        char[] arr4={'A','B','C','D'};
        boolean result3= ArraysUtility.contains(arr4,'K');
        System.out.println("result3 = " + result3);

    }
}
