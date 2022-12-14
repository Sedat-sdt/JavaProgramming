package day22_MultiDimensionalArrays;

public class IteratingMultiDimensionalArray2 {
    public static void main(String[] args) {

        //index of elements:0 1 2   0 1 2 3   0 1  2  3  4
        int[][] arr2d = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}};
        //index of arrays:  0        1           2

        for (int i = arr2d.length - 1; i >= 0; i--) {
            for (int j = 0; j < arr2d[i].length; j++) {
                System.out.print(arr2d[i][j] + " "); // 8 9 10 11 12
                                                     // 4 5 6 7
                                                     // 1 2 3
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------");

        for (int i = 0; i < arr2d.length; i++) {
            for (int k = arr2d[i].length - 1; k >= 0; k--) {
                System.out.print(arr2d[i][k] + " ");//  3 2 1
                                                    //  7 6 5 4
                                                    //  12 11 10 9 8
                }
                System.out.println();
            }
            System.out.println("-----------------------------------------------");

            for (int[] eacharr : arr2d) {
                for (int k = eacharr.length - 1; k >= 0; k--) {
                    System.out.print(eacharr[k] + " ");     //  3 2 1
                                                            //  7 6 5 4
                                                            //  12 11 10 9 8
                }
                System.out.println();
            }
        System.out.println("---------------------------------------------------");


        for (int m = arr2d.length - 1; m >= 0; m--) {
            for (int l = arr2d[m].length - 1; l >= 0; l--) {
                System.out.print(arr2d[m][l]+" ");
            }
            System.out.println();
        }



        /*Task1:
        8 9 10 11 12
        4 5 6 7
        1 2 3

       Task2:
       3 2 1
       7 6 5 4
       12 11 10 9 8

        Task 3:
        12 11 10 9 8
        7 6 5 4
        3 2 1

       */


        }
    }
