package day19_RecapLoopAndString;

public class IndexNumOfTheFirstUnCh {
    public static void main(String[] args) {

        String str = "aabccdeef";
        String result = "";

        for (int j = 0; j < str.length(); j++) {
            char ch=str.charAt(j);
            int count =0;

            for (int i = 0; i < str.length(); i++) {
                char eachch = str.charAt(i);
                if(ch==eachch){
                    count++;
                }
            }
                if(count==1){
                    result+=ch;
                    break;
            }
            }
                System.out.println(str.indexOf(result));
    }
}
/*
Write a program that can return the index number of the first unique character.
 */