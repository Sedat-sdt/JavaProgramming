package day19_RecapLoopAndString;

public class IndexNumOfFirstDubCh {

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
            if(count==2){
                result+=ch;
                break;
            }
        }
        System.out.println(str.indexOf(result));
 /*
      Write a program that cna return the index number of the first duplicated character from a string
  */
    }
}
