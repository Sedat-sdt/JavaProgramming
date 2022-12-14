package day16_ForLoopStringPractice;

public class RemoveTheDublicates {
    public static void main(String[] args) {

    String str = "aabbaacc";

    String result="";//abc

        //for (int i = 0; i <=str.length()-1 ; i++) {
        //i<=7 == i<8 so we can use like this
        for (int i = 0; i < str.length() ; i++) {
            //char ch = str.charAt(i);
            String ch = ""+str.charAt(i);
            if(!result.contains(ch)) {//if the ch is not contained
                result += ch;
            }
        }
        System.out.println(result);//abc


     /*

      Write a program that can remove the duplicated characters
      from a String
			Ex:
				input:
					AABBCCBC

				Output:
					ABC

			Hint: You can add each characters of the string
			into another String
				  Condition: the character is not contained in
				  the other String yet before you are adding
      */
    }
}
