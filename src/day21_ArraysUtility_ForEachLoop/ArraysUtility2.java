package day21_ArraysUtility_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {
    public static void main(String[] args) {

       String[] student={"a","b","c","d","e","f"};
       String[] earlybirds= Arrays.copyOf(student,8);//[a, b, c, d, e, f, null, null]

       System.out.println(Arrays.toString(earlybirds));//[a, b, c]

        int[] numbers={1,2,3,4,5,6,7,8,9,10};
        numbers=Arrays.copyOf(numbers,5);
        System.out.println(numbers);//[I@48140564
        System.out.println(Arrays.toString(numbers));//[1, 2, 3, 4, 5]

        System.out.println("---------------------------------------------------------------------");

        char[] ch1={'A','B','C','D','E','F','G','H','I'};
        char[] ch2=Arrays.copyOf(ch1,5);
        System.out.println(Arrays.toString(ch2));//[A, B, C, D, E]
        char[] ch3=Arrays.copyOfRange(ch1,2,5);
        System.out.println(Arrays.toString(ch3));//[C, D, E]

        int[]scores ={10,20,30,40,50,60,70,80,90,100};
        //index:       0  1  2  3  4  5  6  7  8   9
        int[] result=Arrays.copyOfRange(scores,2,6);
        System.out.println(Arrays.toString(result));//[30, 40, 50, 60]
        int[] result2=Arrays.copyOfRange(scores,scores.length-5,scores.length-1);
        System.out.println(Arrays.toString(result2));//[60, 70, 80, 90]


    }
}
