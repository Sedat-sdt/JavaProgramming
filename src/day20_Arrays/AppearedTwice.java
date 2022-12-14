package day20_Arrays;

public class AppearedTwice {
    public static void main(String[] args) {

       /*String[]words={"Java","Java","C#","a","Python","Python","b"};

        for (int j = 0; j < words.length; j++) {
            int frequency=0;

            String element= words[j];

            for (int i = 0; i < words.length; i++) {
                if(words[i].equals(element)){
                    frequency++;
                }
        }
        if(frequency==2){
            System.out.println(element);
        }
        }*/
        char[] chars ={'A','A','B','B','C','D','F'};
        for (int j = 0; j < chars.length; j++) {

            char ch=chars[j];
            int frequency=0;

            for (int i = 0; i < chars.length; i++) {

                if(chars[i]==ch){
                    frequency++;
                }
            }
            if(frequency==2){
                System.out.println(ch);
            }
        }






    }
}
