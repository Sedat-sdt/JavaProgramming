package day21_ArraysUtility_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

        int[]nums={1,2,3,4,5};
        System.out.println(nums);//[1@48140564
        System.out.println(Arrays.toString(nums));//[1,2,3,4,5]

        System.out.println(nums[0]);//1 here we can write without tostring , because it is not array it is now an element
        /*String str ="Java";
        System.out.println(str);//Java
        System.out.println(str.toString());//Java*/

        System.out.println("-------------------------------------------------------------");

        int[]scores = {95,100,55,65,78};
        Arrays.sort(scores);//{55,65,78,95,100}
        System.out.println(Arrays.toString(scores));//[55, 65, 78, 95, 100]

        System.out.println("Min Score: "+scores[0]);//55
        System.out.println("Max Score: "+scores[scores.length-1]);//100

        String[]names ={"d","e","c","a","b"};
        System.out.println(Arrays.toString(names));//[d, e, c, a, b]
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));//[a, b, c, d, e]

        String[]words={"Anna","ANNA"};
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));//[ANNA, Anna]
        System.out.println("------------------------------------------------------------------");

        int[]arr1={1,3,2};
        int[]arr2={1,2,3};

        boolean r1= Arrays.equals(arr1,arr2);
        System.out.println(r1);//false

        Arrays.sort(arr1);//1,2,3
        Arrays.sort(arr2);//1,2,3
        boolean r2= Arrays.equals(arr1,arr2);
        System.out.println(r2);//true
        System.out.println("----------------------------------------------------------------------");

        char[]ch1={'a','c','b'};
        char[]ch2 = {'b','a','c'};//if they are ANAGRAM OR NOT
        Arrays.sort(ch1);//{a,b,c}
        Arrays.sort(ch2);//{a,b,c}

        boolean anagram= Arrays.equals(arr1,arr2);
        System.out.println(anagram);


    }
}
