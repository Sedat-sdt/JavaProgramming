package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args) {


        // age: 38 years old

        byte age = 38;

        // weight : 160
        // byte weight = 160; 160 is out of Byte range
        // byte weight = -129;
        short weight = 160; //160 is within the range of short;

        // salary 100000 $
        //short salary = 100000; //100000 is out of short'range
        int salary = 100_000; //100000 is within int' range
        // Int is the most prefered data type for integer

        long asset = 3_333_333_333L;

        //WE should say compailer this is not int this is long with 'L'
        //This is the only scenerio long is used
        // tax: 8.26

        float tax = 8.26F;
        double PI = 3.14;

        char ch1 = '#';
        System.out.println("ch1 = " + ch1);

        char ch2 = 35;
        System.out.println("ch2 = " + ch2);

        char ch3 = 35000;
        System.out.println("ch3 = " + ch3);

        char gender = 'F';
        char yesNo = 'Y';
        char grade = 'D';

        boolean isEmployed = true;
        boolean isMarried = false;
        boolean result = 100 > 300;

        System.out.println("isEmployed = " + isEmployed);
        System.out.println("isMarried = " + isMarried);
        System.out.println("result = " + result);

        String name = "Wooden Spoon";
        String city = "Istanbul";
        String state = "Virginia";
        String country = "Turkey";

        System.out.println("name = " + name);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("country = " + country);




    }



}
