package day21_ArraysUtility_ForEachLoop;//interview

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {

     int[] arr1 = {1,2,3,4};
     int[] arr2 = {5,6};

     int[] arr3 = new int[arr1.length+ arr2.length];
     /*for (int i = 0,j = 0; i < arr1.length; i++,j++) {
            arr3[j]+=arr1[i];
        }
        for (int i = 0,j = arr3.length-2; i < arr2.length; i++,j++) {
            arr3[j]+=arr2[i];
        }*/
        int k=0;
        for (int each : arr1) {
            arr3[k]=each;
            k++;
        }
        for (int each : arr2) {
            arr3[k]=each;
            k++;
        }

        System.out.println(Arrays.toString(arr3));

        System.out.println("------------------------------------------------------");

       /* String[]group1 = {"Ali","Layan","Ayşenur"};
        String[]group2 = {"Maria","Aygün","Duygu","Suat","Valeriy"};

        String[] merged = new String[group1.length+group2.length];

        for (int i = 0, j=0; i < group1.length; i++,j++) {
            merged[j]+= group1[i];
        }
        for (int i = 0, j= merged.length- group2.length; i < group2.length; i++,j++) {
            merged[j]+= group2[i];
        }
        System.out.println(Arrays.toString(merged));*/

        System.out.println("----------------------------------------------------------");

        String[]group1 = {"Ali","Layan","Ayşenur"};
        String[]group2 = {"Maria","Aygün","Duygu","Suat","Valeriy"};

        String[] merged = new String[group1.length+group2.length];

        int i =0;
        for (String each : group1) {
            merged[i++]=each;
        }
        for (String each : group2) {
            merged[i++]=each;
        }
        System.out.println(Arrays.toString(merged));//[Ali, Layan, Ayşenur, Maria, Aygün, Duygu, Suat, Valeriy]

        System.out.println("-------------------------------------------------------------------------");

        char[] ch1={'A','B','C'};
        char[] ch2 = {'D','E','F','G','H'};

        char[] chsum = new char[ch1.length+ ch2.length];

        int j = 0;
        for (char each : ch1) {
            //chsum[j++]=each;
            chsum[j]=each;
            j++;
        }
        for (char each : ch2) {
            //chsum[j++]=each;// both of them can be used
            chsum[j]=each;// both of them can be used
            j++;
        }
        System.out.println(Arrays.toString(chsum));//[A, B, C, D, E, F, G, H]

    }
}
