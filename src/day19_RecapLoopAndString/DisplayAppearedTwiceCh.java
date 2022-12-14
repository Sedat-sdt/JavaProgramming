package day19_RecapLoopAndString;

public class DisplayAppearedTwiceCh {
    public static void main(String[] args) {

        String str = "abbccdee";
        String result ="";

        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            int count=0;

            for (int j = 0; j < str.length(); j++) {
                char eachch = str.charAt(j);
                if(ch==eachch){
                    count++;
                }
            }
            if(result.contains(""+ch)){
                continue;
            }
            if(count==2){
                result+=ch;
            }
        }
            System.out.println(result);
    }
}
/*
 Write a program that can display all the characters that appeared twice in the string.
 */