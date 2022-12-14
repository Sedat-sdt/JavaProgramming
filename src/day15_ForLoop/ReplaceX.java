package day15_ForLoop;

import java.util.Scanner;

public class ReplaceX {
    public static void main(String[] args) {

// First of all, there is only one input . That's why we don't need to assign variable in here

        System.out.println("Enter a word:");
        String word = new Scanner(System.in).next();//xcodeX

        String result = word.replace("x","a").replace("X","a");
        System.out.println(result);
   /*
Write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea

    */

    }


}
