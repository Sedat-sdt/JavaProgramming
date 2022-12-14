package day22_MultiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class ShortestWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String [] words= str.split(" ");

        for (int i = 0; i < words.length-1; i++) {
           // words[i]=shortestWord;
            if(words[i+1].length()<=words[i].length()){
              //String[] shortestWord+=words[i+1];
            }
        //}System.out.println(Arrays.toString(new String[]{shortestWord}));








/*### Given a `String` `str`, find and print the shortest words.
The `String` will have multiple words separated by commas and spaces.
If there is words that have the same length, they should all be displayed at the end.
Print all the shortest words in the following format:

> Input: word1, word2, word3, word4, etc...

> Output: [short1, short2, short3, etc...]

        Hint: Think about what comes between each word in the sentence

        Main topics: arrays, String, loops, if statements, primitive datatypes, operators

        Example:
```
        Input:
        olive, fish, pursuit, old, warning, python, java, coffee, cat, ray

        Output:
  [old, cat, ray]
```*/





    }
}}
