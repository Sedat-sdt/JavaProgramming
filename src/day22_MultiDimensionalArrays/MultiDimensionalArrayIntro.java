package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {
    public static void main(String[] args) {

        String[] group1={"a","b","c"};
        String[] group2={"d","e","f"};
        String[] group3={"x","y","z"};

        String[][] groups=new String[3][];
        groups[0]=group1;
        groups[1]=group2;
        groups[2]=group3;

        System.out.println(Arrays.deepToString(groups));//[[a, b, c], [d, e, f], [x, y, z]]4

        System.out.println("-----------------------------------------------------------");

     //index of elements:0 1 2   0 1 2 3   0 1  2  3  4
        int[][]arr2d = {{1,2,3},{4,5,6,7},{8,9,10,11,12}};
       //index of arrays:  0        1           2

        System.out.println(Arrays.deepToString(arr2d));//[[1, 2, 3], [4, 5, 6, 7], [8, 9, 10, 11, 12]]

        System.out.println(Arrays.toString(arr2d[1]));//[4, 5, 6, 7] This is how we get or retrew the one single dimensional array

        System.out.println(arr2d[1][3]);//7
    }
}
