package day16_ForLoopStringPractice;

public class Reverse {
    public static void main(String[] args) {
String str="Wooden Spoon";
//  index:  01234567891011
String result="";//purpose:to contain the reversed version of str

/*
  //result += str.charAt(str.length()-1);//n
   result += str.charAt(11);//n
   result += str.charAt(10);//o
   result += str.charAt(9);//o
   result += str.charAt(8);//p
   result += str.charAt(7);//S
   result += str.charAt(6);//' '
   result += str.charAt(5);//n
   result += str.charAt(4);//e
   result += str.charAt(3);//d
   result += str.charAt(2);//o
   result += str.charAt(1);//o
   result += str.charAt(0);//W*/

        //for (int i = 11; i >=0 ; i--) {
        for (int i = str.length()-1; i >=0 ; i--) {
            result+=str.charAt(i);
        }  

        System.out.println(result);




    /*
     1. Write a program that can reverse a String
			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW
     */
    }
}
