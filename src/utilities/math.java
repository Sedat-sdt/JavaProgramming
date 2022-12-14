package utilities;

public class math {
    public static void main(String[] args) {
        int sum=sumOfTwoNumbers(20,34);
        System.out.println(sum);

        System.out.println("-------------------");

        double sum1=sumOfTwoNumbers(20.5,34.5);
        System.out.println(sum1);

        System.out.println("------------------------");

        int subs=subsOfTwoNumbers(50,34);
        System.out.println(subs);

        System.out.println("-------------------");

        double subs1=subsOfTwoNumbers(40.5,34.5);
        System.out.println(subs1);

        System.out.println("------------------------");

        int mult=mulOfTwoNumbers(5,34);
        System.out.println(mult);

        System.out.println("-------------------");

        double mult1=mulOfTwoNumbers(4.5,3.5);
        System.out.println(mult1);

        System.out.println("------------------------");

        double div=divOfTwoNumbers(4.5,3.5);
        System.out.println(div);

        System.out.println("------------------------");

        boolean result= isEvenNumber(33);
        System.out.println(result);

        System.out.println("--------------------------------");

        boolean result1= isOddNumber(33);
        System.out.println(result1);

        System.out.println("-----------------------------");

        double maxNum= maxNumber(23.4,34.4);
        System.out.println("maxNum = " + maxNum);

        System.out.println("------------------------------");

        double minNum= minNumber(23.4,34.4);
        System.out.println("minNum = " + minNum);

        System.out.println("-----------------------");

        int squareNum= square(12);
        System.out.println("squareNum = " + squareNum);

        System.out.println("-----------------------------");

        double squareNum1= square(12.5);
        System.out.println("squareNum1 = " + squareNum1);

        System.out.println("---------------------------");
        int cubeOfNum= cube(12);
        System.out.println("cubeOfNum = " + cubeOfNum);

        System.out.println("------------------------------");

        double cubeOfNum1= cube(12.5);
        System.out.println("cubeOfNum1 = " + cubeOfNum1);


    }

    public static int sumOfTwoNumbers(int num1, int num2){
        int sum=num1+num2;
        return sum;
}

    public static double sumOfTwoNumbers(double num1, double num2){
        double sum=num1+num2;
        return sum;
    }
    public static int subsOfTwoNumbers(int num1, int num2){
        int sub=num1-num2;
        return sub;
    }

    public static double subsOfTwoNumbers(double num1, double num2){
        double sub=num1-num2;
        return sub;
    }

    public static int mulOfTwoNumbers(int num1, int num2){
        int mult=num1*num2;
        return mult;
    }

    public static double mulOfTwoNumbers(double num1, double num2){
        double mult=num1*num2;
        return mult;
    }

    public static double divOfTwoNumbers(double num1, double num2){
        double div=num1/num2;
        return div;
    }


    public static boolean isEvenNumber(int num) {
        boolean result = false;
        if (num % 2 == 0)
            result = true;
        return result;
    }
    public static boolean isOddNumber(int num) {
            boolean result = false;
            if (num % 2 != 0)
                result = true;
            return result;
        }


    public static int maxNumber(int num1, int num2) {
        int maxNum=0;
        if(num1>num2){
            maxNum=num1;
        }else {
            maxNum=num2;
        }
        return maxNum;
    }
    public static double maxNumber(double num1, double num2) {
        double maxNum=0.0;
        if(num1>num2){
            maxNum=num1;
        }else {
            maxNum=num2;
        }
        return maxNum;
    }
    public static int minNumber(int num1, int num2) {
        int minNum=0;
        if(num1<num2){
            minNum=num1;
        }else {
            minNum=num2;
        }
        return minNum;
    }
    public static double minNumber(double num1, double num2) {
        double minNum=0;
        if(num1<num2){
            minNum=num1;
        }else {
            minNum=num2;
        }
        return minNum;
    }

    public static int square(int num){
        int squareNum=num*num;
        return squareNum;
    }
    public static double square(double num){
        double squareNum=num*num;
        return squareNum;
    }

    public static int cube(int num){
       int cubeOfNum= num*num*num;
       return cubeOfNum;
    }
    public static double cube(double num){
        double cubeOfNum= num*num*num;
        return cubeOfNum;
    }

    }





/*
            2.1 Create a method that can return the sum of two integers
			2.2 Create a method that can return the sum of two decimal numbers

			2.3 Create a method that can return the subtraction of two integers
			2.4 Create a method that can return the subtraction of two decimals

			2.5 Creata a method that can return the multiplication of two integers

			2.6 Creata a method that can return the multiplication of two decimals

			2.7 Create a method that passes two double parameters and return the division reslt

			2.8 Create a method that can check if an integer is even number
			2.9 Create a method that can check if an integer is odd number

			2.10 Create a method that can return the maximum number between two integers
			2.11 Create a method that can return the maximum number between two decimal numbers

			2.12 Create a method that can return the minimum number between two integers
			2.13 Create a method that can return the minimum number between two decimal numbers

			2.14 Create a method that can return the square of an integer
					Ex: square(2) ==> 4
			2.15 Create a method that can return the square of a double

			2.16 Create a method that can return the cube of an integer
			2.17 Create a method that can return the cube of a double



 */



