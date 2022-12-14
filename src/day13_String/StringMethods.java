package day13_String;

public class StringMethods {
    public static void main(String[] args) {

String word = "Cydeo";

char thirdChar = word.charAt(2);
        System.out.println("thirdChar = " + thirdChar);


        System.out.println("---------------------");

        String s1= "Batch EU 10 is the best batch";
        int totalChrNum=s1.length();
        System.out.println("totalChrNum = " + totalChrNum);
        char lastChar = s1.charAt(s1.length()-1);
        //char lastChar = s1.charAt(totalChrNum-1);
        System.out.println("lastChar = " + lastChar);

        System.out.println("--------------------");

        String str="wooden spoon";
        str = str.toUpperCase();//"WOODEN SPOON"
        System.out.println(str);//wooden spoon

    }
}
