package day25_CustomMethod_Overloading_Recap;

public class MethodOverloading {
    public static void main(String[] args) {
int[] intArray={1,2,3,4,5,6};

double[] doubleArray ={10.5,2.5,3.5,4.5};

char[] charArray ={'E','R','T','F','K','U'};

System.out.println("-------------------------------------------------------");

        sumOfNumbers(10,20,30,40);

       // sum of 10,20,30
        int sum=sumOfNumbers(20,20,30);

}



        public static int sumOfNumbers(int num1){
            return num1;
        }
        
        public static double sumOfNumbers(double num1, double num2){
            return num1+num2;
        }

        public static int sumOfNumbers(int num1, int num2,int num3){
            return num1+num2+num3;
        }
        public static int sumOfNumbers(int num1, int num2,int num3, int num4){
            //return num1+num2+num3+num4;
            return sumOfNumbers(num1+num2+num3)+num4;
        }











}
