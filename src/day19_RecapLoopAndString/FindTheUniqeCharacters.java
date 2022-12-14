package day19_RecapLoopAndString;

public class FindTheUniqeCharacters {
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

           /* if(count==1){
                result+=ch;
            }*/
            if(count!=1){
                continue;
            }
                result+=ch;
        }
        System.out.println(result);




        /*
        Write a program that can find the unique characters from a string without using indexOf() and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf
         */
    }
}
