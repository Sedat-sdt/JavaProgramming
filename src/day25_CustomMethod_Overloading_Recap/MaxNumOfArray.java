package day25_CustomMethod_Overloading_Recap;

import java.util.Arrays;

public class MaxNumOfArray {
    public static void main(String[] args) {
      int[] numbers={1,2,3,4,5};
      int[] maxNumber=  maxNumOfArray(numbers);
        System.out.println("maxNumber = " + Arrays.toString(maxNumber));

    }

    public static int[] maxNumOfArray(int [] array){
        int max = 0;
        for (int each : array) {
            if(each>max){
                max=each;
            }

        }return new int[]{max};
    }




  /*
  1. create a method that can return the max number from an integer array

	2. create a method that can return the max number from double array

	3. create a method that can return the max number from long array

	4. create a method that can return the max number from short array

	5. create a method that can return the max number from float array

	6. create a method that can return the max number from byte array
   */
}
