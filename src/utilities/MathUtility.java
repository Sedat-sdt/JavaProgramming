package utilities;

public class MathUtility {

    public static int sumOfTwoNumbers(int num1, int num2){
        int sum=num1+num2;
        return sum;
    }


    public static double sumOfTwoNumbers(double num1, double num2){
        double sum=num1+num2;
        return sum;
    }


    public static int subsOfTwoNumbers(int num1, int num2){
        int sum=num1-num2;
        return sum;
    }


    public static double subsOfTwoNumbers(double num1, double num2){
        double sum=num1-num2;
        return sum;
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
