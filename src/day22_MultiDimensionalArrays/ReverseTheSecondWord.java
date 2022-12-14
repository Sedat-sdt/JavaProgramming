package day22_MultiDimensionalArrays;

public class ReverseTheSecondWord {
    public static void main(String[] args) {


        String sentence = "I Love Java";
        String[] words = sentence.split(" ");

        //String sentence2 = "";
        String reversedWord = "";


        for (int i = words[1].length() - 1; i >= 0; i--) {
            reversedWord += words[1].charAt(i);

        }
        //sentence=sentence.replaceFirst(words[1],reversedWord); this is the first way

            words[1] = reversedWord;

        for (String word : words) {    // this is second way

            System.out.print(word+" ");
            //sentence2 += word+" ";

        }
        //System.out.println(sentence2);

/*
Write a program that can reverse the second word of the sentence
			Ex:
				sentence = "I Love Java";

			output:
				I evoL Java

 */

    }
}

