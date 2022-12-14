package day17_Branching_While_DoWhile;

public class FrequencyOfWord2 {


    public static void main(String[] args) {
        String str ="Cat Cat Dog Dog";
        String wordCat ="Cat";
        String wordDog ="Dog";

        int frequencyOfCat = 0;
        int frequencyOfDog = 0;

        for (int i = 0; i < str.length()-2; i++) {
            String subEach = str.substring(i,i+3);
            if(subEach.equals(wordCat)){
                frequencyOfCat++;
            }
            if(subEach.equals(wordDog)){
                frequencyOfDog++;
            }
        }
        System.out.println("frequencyOfCat = " + frequencyOfCat);
        System.out.println("frequencyOfDog = " + frequencyOfDog);

    }
}
