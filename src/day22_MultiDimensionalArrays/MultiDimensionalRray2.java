package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class MultiDimensionalRray2 {
    public static void main(String[] args) {

        int[] arr1={1,2,3};
        int[] arr2={4,5,6};
        int[] arr3={7,8,9};

        int[][] arr2d ={{1,2,3},{4,5,6},{7,8,9}};

//                             0       1        2           0          1           2
        int [][][] arr3d= {{{1,2,3},{4,5,6},{7,8,9}} , {{10,20,30},{40,50,60},{70,80,90}}};
//                                     0                               1



        System.out.println(Arrays.deepToString(arr3d));  //  [[[1, 2, 3], [4, 5, 6], [7, 8, 9]], [[10, 20, 30], [40, 50, 60], [70, 80, 90]]]

        System.out.println(Arrays.deepToString(arr3d[1]));   //[[10, 20, 30], [40, 50, 60], [70, 80, 90]]

        System.out.println(Arrays.toString(arr3d[1][1]));  // [40, 50, 60]

        System.out.println(arr3d[1][1][0]);// 40
        System.out.println("-----------------------------------------------------");
        for (int[][] each2d : arr3d) {
            for (int[] eacharr : each2d) {
                for (int element : eacharr) {
                    System.out.print(element+" ");
                }
                System.out.println();
            }
        }

        System.out.println("-------------------------------------------------------");


    int[][][][] arr4d={{{{1,2,3},{4,5,6},{7,8,9}} , {{10,20,30},{40,50,60},{70,80,90}}},
            {{{1,2,3},{4,5,6},{7,8,9}} , {{10,20,30},{40,50,60},{70,80,90}}}} ;

        System.out.println(Arrays.deepToString(arr4d));
//[[[[1, 2, 3], [4, 5, 6], [7, 8, 9]], [[10, 20, 30], [40, 50, 60], [70, 80, 90]]],
// [[[1, 2, 3], [4, 5, 6], [7, 8, 9]], [[10, 20, 30], [40, 50, 60], [70, 80, 90]]]]
        System.out.println(Arrays.deepToString(arr4d[1]));

        System.out.println("-----------------------------------------------------------");
        for (int[][][] each3d : arr4d) {
            for (int[][] each2d : each3d) {
                for (int[] each1d : each2d) {
                    for (int element : each1d) {
                        System.out.print(element);
                    }
                    System.out.println();
                }
            }
        }




    }
}
