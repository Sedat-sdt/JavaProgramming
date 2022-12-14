package day21_ArraysUtility_ForEachLoop;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

       String str="Java";
        char[]chars=str.toCharArray();
        System.out.println(Arrays.toString(chars));




       for(char each : str.toCharArray()){
            System.out.print(each);//[J, a, v, a]
        }

        System.out.println("-------------------------------------");

       String sentence = "Wooden Spoon";
       String[] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));//[Wooden, Spoon]

        System.out.println("-------------------------------------------");

        String email ="Wooden Spoon@cydeo.com";
        String[] arr = email.split("@");
        System.out.println(Arrays.toString(arr));//[Wooden Spoon, cydeo.com]

        System.out.println("-----------------------------------------------");

        String s ="Today is nice day. Today is Monday. Today we learn Java";

        String[] sentences=s.split("\\. ");// it is special for "." to split
        System.out.println(Arrays.toString(sentences));//[Today is nice day, Today is Monday, Today we learn Java]




    }
}
