package day19_RecapLoopAndString;

import java.util.Scanner;

public class FindTheHighestFreqOfCh {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=scan.next();
        String result="";
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch= str.charAt(i);
            int counter=0;

            for (int j = 0; j < str.length(); j++) {
               char eachCh=str.charAt(j);
               if(ch==eachCh){
                   counter++;
               }
               if(counter> max){
                   result=ch+"";
                   max= counter;
               }
            }
            System.out.println(result);
        }






        /*
        Write a program that can find the character that has the highest frequency from a string
         */
    }
}
