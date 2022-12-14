package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {

        String sentence= "Today is a good day to learn Java";

        String [] words= sentence.split(" ");
        String reverseSentence="";
        for (int i = words.length - 1; i >= 0; i--) {
            reverseSentence+=words[i]+" ";
        }
        System.out.println(reverseSentence);
    }
}
        /*Write a program that can reverse a sentence
        Ex:
        sentence = "Today is a good day to learn Java";

        output:
        Java learn to day good a is Today*/

