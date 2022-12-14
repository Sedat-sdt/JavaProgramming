package day21_ArraysUtility_ForEachLoop;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "acdb",
                str2="dbca";

char[] chars = str1.toCharArray();
char[] chars2 = str2.toCharArray();
        //System.out.println(Arrays.toString(chars));
        //System.out.println(Arrays.toString(chars2));


        Arrays.sort(chars);
        Arrays.sort(chars2);

        //System.out.println(Arrays.toString(chars));
        //System.out.println(Arrays.toString(chars2));

      boolean anagram = Arrays.equals(chars,chars2);

if(anagram){
    System.out.println("chars and chars2 are anagram");
}
        System.out.println("---------------------------------------------------");







    }
}
