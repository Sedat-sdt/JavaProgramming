package day21_ArraysUtility_ForEachLoop;

public class UniqueElements {
    public static void main(String[] args) {

        String[]words={"Java","Java","C#","a","Python","Python"};
        for (String each : words) {
            int count=0;
            for (String element : words) {
                if(element.equals(each)){
                    count++;
                }
            }
if(count==1){
    System.out.println(each);
}
        }
        /*
        String[]words={"Java","Java","C#","a","Python","Python"};


        for (int j = 0; j < words.length; j++) {

            String element = words[j];//Java

            int frequency=0;
            for (int i = 0; i < words.length; i++) {
                if(words[i].equals(element)){
                    frequency++;
                }

            }
            if(frequency==1){

                System.out.println(element);
         */
    }
}
