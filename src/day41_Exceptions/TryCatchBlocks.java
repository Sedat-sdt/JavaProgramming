package day41_Exceptions;

public class TryCatchBlocks {
    public static void main(String[] args) {

        System.out.println("Test started");


        try {
            System.out.println(9/0);

            System.out.println("Try Block");

        }catch (ArithmeticException e){

            System.out.println("Catch Block");

            System.out.println("Arithmetic Exception was occured ");
        }


        System.out.println("Test Completed");


        System.out.println("------------------------------------------");


        System.out.println("Test2 started");

        int[] numbers={1,2,3,4,5};

        try {
            System.out.println(numbers[200]);

       // }catch (ArrayIndexOutOfBoundsException e){
        }catch (RuntimeException e){

            e.printStackTrace();//this method gives  us all details about exception

            //System.out.println(e.getMessage());
                                                /*
                                                Test2 started
                                                Index 200 out of bounds for length 5
                                                Test2 completed*/


        }


        System.out.println("Test2 completed");


        System.out.println("-------------------------------------------------");


        System.out.println("Test3 started");

        try {
            System.out.println("Cydeo".substring(2,0));
        }catch (RuntimeException e){
            e.printStackTrace();
        }










    }
}
