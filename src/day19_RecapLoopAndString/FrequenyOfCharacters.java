package day19_RecapLoopAndString;

public class FrequenyOfCharacters {

    public static void main(String[] args) {
String str="aabcccd";

String result = "";


        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                char eachch= str.charAt(i);
                if(eachch==ch){
                    count++;
                }
            }
if(result.contains(""+ch)){
continue;
}
            result+=ch;
            result+=count;
        }



        System.out.println(result);
/*
Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1

 */

    }
}
