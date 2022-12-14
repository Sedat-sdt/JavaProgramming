package day14_String;

public class StringMethods3Substring {
    public static void main(String[] args) {

        String word = "Cydeo School";

        //String brand =word.substring(0,4);
        //System.out.println(brand);//Cyde
        String brand =word.substring(0,4+1);
        System.out.println(brand);//Cydeo
        //String brand
        String str1 =word.substring(6);// it goes to the end automatically
        System.out.println(str1);//School


    }
}
