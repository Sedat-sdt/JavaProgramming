package tasks;

import java.util.Scanner;

public class PrintEachVowel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scan.next();
        for (int i = 0; i < word.length(); i++) {
            char ch=word.charAt(i);
            String result="";
            if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
                result+=ch;
                System.out.print(result);
            }
        }
    }
}
