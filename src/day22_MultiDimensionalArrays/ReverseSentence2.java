package day22_MultiDimensionalArrays;

import java.util.Scanner;

public class ReverseSentence2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

       String[] sent=sentence.split(" ");
        String reversed="";
        for (int i = sent.length - 1; i >= 0; i--) {
            reversed+=sent[i]+" ";

        }System.out.print(reversed);








        /*
        ### Given a `String` `sentence` print a version with the words reversed.
        The order of the words is changed, not the letters.

Hint: Think about what comes between each word in the sentence

Main topics: arrays, String, concatenation, index, primitive dataypes

Example:
```
Input:
  Java is fun

Output:
  fun is Java
```

Example:
```
Input:
  Hello! How are you?

Output:
  you? are How Hello!
```
         */
    }
}
