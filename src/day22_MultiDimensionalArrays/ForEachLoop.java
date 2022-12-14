package day22_MultiDimensionalArrays;

public class ForEachLoop {
    public static void main(String[] args) {

      //index of elements:0  1  2    0  1  2  3    0  1   2  3   4
        int[][] arr2d = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}};
        //index of arrays:  0               1              2

        for (int[] eachArr : arr2d) {
            for (int eachElement : eachArr) {
                System.out.print(eachElement);
            }
            System.out.println();
        }














    }
}
