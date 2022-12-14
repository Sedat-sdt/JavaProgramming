package day20_Arrays;

import java.util.Arrays;

public class
Alphabet {
    public static void main(String[] args) {

        char[] letters2 =new char[26];//[Z~A]


       char ch= 'Z';
        for (int i =0 ; i <letters2.length ; i++) {
            letters2[i]=ch;
            ch--;
        }

       /* for(char i=0, j='Z';i< letters2.length;i++,j--)
            letters2[i]=j;*/

        System.out.println(Arrays.toString(letters2));




       /* letters2[0]='Z';//90
        letters2[1]='Y';//89
        letters2[2]='X';//88

        //System.out.println(Arrays.toString(letters2));//print the whole arrayu
        //System.out.println(letters2[0]);//printing the element of array*/












    }
}
