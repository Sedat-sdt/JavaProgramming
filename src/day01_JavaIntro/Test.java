package day01_JavaIntro;

import day24_CustomMethod_Return.ReturnMrthodPractice4;
import utilities.StringUtility;

public class Test {
    public static void main(String[] args) {
        String str="Wooden Spoon";

        StringUtility.printEachChar(str);

        ReturnMrthodPractice4.removeDublicates(str);



       /* String a="123";
        String b="";
        for (int i = a.length()-1; i <=0 ; i--) {
            b+=a.charAt(i);
        }
        System.out.println(b);*/

       /* String str="cybertek";
        for (int i = 0; i <= str.length(); i+=2) {
            System.out.println(str.charAt(i));


        }*/



    }
}
