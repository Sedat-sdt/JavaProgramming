package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

       //create a variable that is capable enough to contain 5 names
       String[] myGroup = new String[5];// lenth of array is 5
        //System.out.println(myGroup); // hashcode
        myGroup[0]="Gunay";
        myGroup[1]="Neeira";
        myGroup[2]="Suat";
        myGroup[3]="Hulya";
        myGroup[4]="Mikael";
        System.out.println(Arrays.toString(myGroup));
        System.out.println("--------------------------------------------");

        String[] days={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        System.out.println(Arrays.toString(days));

        int number=12;

        if(number<1 || number>7){
            System.out.println("Invalid Number");
            System.exit(0);

        }
        System.out.println(days[number]);




    }
}
