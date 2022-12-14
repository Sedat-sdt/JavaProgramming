package day29_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7));

        System.out.println(list);    //[1, 2, 3, 4, 5, 6, 7]


        list.removeAll(Arrays.asList(1,3,5));   //these will be removed

        System.out.println(list);   //[2, 4, 6, 7]


        System.out.println("---------------------------------------------");

        ArrayList<Integer> numbers= new ArrayList<>();

        numbers.addAll(Arrays.asList(100,200,300,400,500,600,700,100,200,300,800,900));

        numbers.retainAll(Arrays.asList(100,200,300)); // remove all of the elements without these elements

        System.out.println(numbers);   //[100, 200, 300, 100, 200, 300]


        System.out.println("---------------------------------------");

        ArrayList<String> jobTitles= new ArrayList<>();

        jobTitles.addAll(Arrays.asList("QA","SDET","Developer","QA","SDET","Scrum Master","BA","BA"));

        jobTitles.retainAll(Arrays.asList("QA","SDET"));

        System.out.println(jobTitles);  //[QA, SDET, QA, SDET] removed all the element without "QA"and "SDET"

        System.out.println("------------------------------------------------");

        ArrayList<Integer> nums= new ArrayList<>();
         nums.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,8,9,10));

         boolean r1 = nums.contains(10);

         boolean r2 = nums.contains(2) && nums.contains(5) && nums.contains(10);

         boolean r3 = nums.containsAll(Arrays.asList(2,5,10));

         System.out.println("r1 = " + r1);  //true

         System.out.println("r2 = " + r2);  //true

         System.out.println("r3 = " + r3);   //r3 = true

        System.out.println("-----------------------------------------");


        String[] names ={"a", "b", "c", "d"};
       /*
        ArrayList<String> nameList = new ArrayList<>();

        nameList.addAll(Arrays.asList(names));
*/

        ArrayList<String> nameList = new ArrayList<>(Arrays.asList(names));


        System.out.println(nameList); //[a, b, c, d]


        System.out.println("------------------------------------");

       // int[] arr= {1,2,3,4,5,6,7,8,9,10};  it cant be with int[]
        Integer[] arr= {1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> list2= new ArrayList<>(Arrays.asList(arr));

        System.out.println(list2);  //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        System.out.println("-------------------------------------------");


        int[] arr1= {1,2,3,4,5};
        ArrayList<Integer> list3= new ArrayList<>(convertArrayToArrayList(arr1));

        System.out.println(list3);   //[1, 2, 3, 4, 5]

    }


    public static ArrayList<Integer> convertArrayToArrayList(int[] array){
        ArrayList<Integer> list = new ArrayList<>();

        for (int each : array) {
            list.add(each);
        }
        return list;
    }



}
