package day15_ForLoop;

import java.util.Scanner;

public class StartsWithA {
    public static void main(String[] args) {

        //Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word:");
        //String word= scan.nextLine();
        String word = new Scanner(System.in).next();// it can be used only while getting one input
        // from the user
        if(word.charAt(0) == 'x'){

            //word.replaceFirst("x","a");// we must create new String objec here
            word = word.replaceFirst("x","a");//like this
        }
        System.out.println(word);
/*

Write a program that asks user to enter a word. If the work
starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
 */

    }

}
