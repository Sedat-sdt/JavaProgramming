package day41_Exceptions;

import day39_Recap.cydeoTask.Employee;

public class MultiCatchBlock {
    public static void main(String[] args) {

        Employee employee = null;

        try {
            System.out.println(employee.getSalary());

        }
        catch (IndexOutOfBoundsException e){
            System.out.println("First catch block");
           e.printStackTrace();

        }catch (ArithmeticException e){
            System.out.println("Second catch block");
            e.printStackTrace();

        }catch (NullPointerException e){
            System.out.println("Third catch block");
            e.printStackTrace();            /*Third catch block
                                            java.lang.NullPointerException
	                                        at day41_Exceptions.MultiCatchBlock.main(MultiCatchBlock.java:11)
                                            */


        }catch (RuntimeException e){
            System.out.println("Fourth block");
            e.printStackTrace();
        }


        System.out.println("Test completed");


        System.out.println("----------------------------------------------");

        try {
            System.out.println("Java".charAt(-1));
        }catch (RuntimeException e){
            e.printStackTrace();
        }




    }
}
