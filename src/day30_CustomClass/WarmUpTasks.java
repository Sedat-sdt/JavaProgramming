package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class WarmUpTasks {
    public static void main(String[] args) {
        //write a prog that can swap the first and last elemnts of an arraylist

        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8));

        Collections.swap(numbers,0,numbers.size()-1);

        System.out.println(numbers);//[8, 2, 3, 4, 5, 6, 7, 1]

        System.out.println("-----------------------------------------------");

        // move all zeros to the last index of arraylist


        ArrayList<Integer> numbers2= new ArrayList<>();
        numbers2.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        System.out.println(numbers2);     //[1, 0, 2, 0, 3, 0, 4, 0]

       int size= numbers2.size();
       numbers2.removeAll(Arrays.asList(0));
        System.out.println(numbers2);//[1, 2, 3, 4]

        int newSize= numbers2.size();

        int totalNumberOfZeros= size-newSize;
        System.out.println("totalNumberOfZeros = " + totalNumberOfZeros);//4

        for (int i = 0; i < totalNumberOfZeros; i++) {
            numbers2.add(0);

        }

        System.out.println(numbers2);   //[1, 2, 3, 4, 0, 0, 0, 0]

        System.out.println("----------------------------------------------");


        ArrayList<Integer> list4= new ArrayList<>();
        list4.addAll(Arrays.asList(1,0,2,0,3,0,4,0));


        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list4) {
            if(each!=0){
                result.add(each);
            }

        }

        for (Integer each : list4) {
            if(each==0){
                result.add(each);
            }
        }

        System.out.println(result);   //[1, 2, 3, 4], // [1, 2, 3, 4, 0, 0, 0, 0]

        System.out.println("---------------------------------------------------");


        /*
        write a prog that can extract the special characters, digits and letters from a string and stores them into seperate arraylists

        ex:
        str="ABCD123$%#@&456EFG!"

        output:
        list1:{1,2,3,4,5,6}
        list2:{A,B,C,D,E,F,G}
        list3:{$,%,#,@,&,!}
                 */

        String str="ABCD123$%#@&456EFG!";

        ArrayList<Character> chars= new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            chars.add(str.charAt(i));
        }

        ArrayList<Character> letters= new ArrayList<>(chars);

        System.out.println("letters = " + letters);//letters = [A, B, C, D, 1, 2, 3, $, %, #, @, &, 4, 5, 6, E, F, G, !]

        letters.removeIf(p-> !Character.isLetter(p) );//lambda

        System.out.println("letters = " + letters);//letters = [A, B, C, D, E, F, G]


        ArrayList<Character> digits= new ArrayList<>(chars);// add all the caharacters

        digits.removeIf(p-> !Character.isDigit(p));

        System.out.println("digits = " + digits);//digits = [1, 2, 3, 4, 5, 6]


        ArrayList<Character> specialChar= new ArrayList<>(chars);

        //specialChar.removeIf(p-> Character.isDigit(p)||Character.isLetter(p));
        //specialChar.removeIf(p-> Character.isLetterOrDigit(p));
        specialChar.removeAll(digits);
        specialChar.removeAll(letters);

        System.out.println("specialChar = " + specialChar);//specialChar = [$, %, #, @, &, !]












    }
}
