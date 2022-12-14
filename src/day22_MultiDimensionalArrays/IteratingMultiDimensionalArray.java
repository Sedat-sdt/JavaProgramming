package day22_MultiDimensionalArrays;

public class IteratingMultiDimensionalArray {
    public static void main(String[] args) {

     //index of elements:0 1 2   0 1 2 3   0 1  2  3  4
        int[][]arr2d = {{1,2,3},{4,5,6,7},{8,9,10,11,12}};
       //index of arrays:  0        1           2
        //String result="";

        for (int[] each : arr2d) {
            for (int i : each) {
            //result+=i+" ";
                System.out.print(i+" ");//1 2 3 4 5 6 7 8 9 10 11 12 // it can be like this
            }
        }
        //System.out.print(result);//1 2 3 4 5 6 7 8 9 10 11 12 // or like this
        System.out.println();

        System.out.println("----------------------------------------");

        for (int i = 0; i < arr2d.length; i++) {//i: index of sing dim arr
            for (int j = 0; j < arr2d[i].length; j++) { // j: index of element
                System.out.print(arr2d[i][j]+" ");//1 2 3 4 5 6 7 8 9 10 11 12
            }
            
        }
        System.out.println("---------------------------------------------------");
        
        
        
    }
}
