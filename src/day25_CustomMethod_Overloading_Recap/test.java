package day25_CustomMethod_Overloading_Recap;

import utilities.ArraysUtility;
import utilities.StringUtility;

public class test {

    public static void main(String[] args) {

        String str= "Java Programming Language";

        StringUtility.printEachChar(str);

        System.out.println("---------------------------------");

        String s1="Wooden Spoon";
        String reverse = StringUtility.reverse(s1);
        System.out.println(reverse);

        System.out.println("----------------------------------");

        String word="Civic";
        Boolean palindrome = StringUtility.isPalindrome(word);
        System.out.println(word+" is palindrome: "+palindrome);

        System.out.println("------------------------------------");

        String[] names ={"Anna", "Java", "Python", "racecar", "Mom", "Cydeo"};
        int count=0;

        for (String name : names) {

            if(StringUtility.isPalindrome(name)){
               count++;
            }
        }
        System.out.println(count);

        System.out.println("------------------------------------");

        String  str1 = "aaaabbbcccc";
        str1=StringUtility.removeDublicates(str1);
        System.out.println(str1);
    }



}
