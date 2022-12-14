package day22_MultiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class SplitSentence {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String[] sntnc = sentence.split(" ");
        System.out.println(Arrays.toString(sntnc));
        for (String s : sntnc) {
            System.out.println(s);
        }


   /*
   ### Given a `String` `sentence` use the split() method to divide each word from the sentence and print them in separate lines

Hint: Think about what comes between each word in the sentence

Main topics: arrays, String

Example:
```
Input:
  Java is fun

Output:
  Java
  is
  fun
```
    */
    }
}
