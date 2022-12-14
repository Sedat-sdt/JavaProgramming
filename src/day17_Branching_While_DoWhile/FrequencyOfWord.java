package day17_Branching_While_DoWhile;

public class FrequencyOfWord {
    public static void main(String[] args) {


String str ="JavaJavaJavaJava";
String word ="Java";

int frequency = 0;
        for (int i = 0; i < str.length()-3; i++) {
           String subEachCh = str.substring(i,i+4);
            if(subEachCh.equals(word)){
                frequency++;
            }
        }
        System.out.println(frequency);

        /*
      write a program that can return the frequency
      of the a word Java from the sentence

        Ex:
            sentence = "JavaJavaJava";

            output: 3

         */
    }
}
