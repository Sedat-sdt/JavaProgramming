package tasks;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {

        int[] numbers={10, 0, 5, 0, 1, 0};
        int[] reversed=new int[6];
        Arrays.sort(numbers);

        for (int i = 0, j=numbers.length-1; i <numbers.length ; i++,j--) {
            reversed[j]=numbers[i];
        }
        System.out.println(Arrays.toString(reversed));
        /*
        write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}
         */
    }
}
