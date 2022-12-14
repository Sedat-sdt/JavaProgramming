package day14_String;

public class StringMethods1 {

    public static void main(String[] args) {

        String str1="  batch 10   ";
        //str1.trim(); //(   batch 10      )
        str1=str1.trim();// (batch 10)
        System.out.println(str1);


        String str2="Cydeo School";

        int n1 =str2.indexOf("h");
        System.out.println("n1 = " + n1);
        int n2 =str2.indexOf("o");
        System.out.println("n2 = " + n2);
        int n3 =str2.indexOf("ool");
        System.out.println("n3 = " + n3);// returns index num of first o


    }
}
