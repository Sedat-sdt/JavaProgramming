package tasks;

import java.util.Scanner;

public class WriteWordInSeveralLines {
    public static void main(String[] args) {

                //DO NOT TOUCH FOLLOWING LINE/LINES
                Scanner input = new Scanner(System.in);
                String word = input.nextLine();

                //WRITE YOUR CODE BELOW
                String result="";
                char ch=' ';
                for (int i = 0; i < word.length(); i++) {
                   ch= word.charAt(i);
                   result += ch;
                   System.out.println(result);
                   result="";



                }


            }
        }
