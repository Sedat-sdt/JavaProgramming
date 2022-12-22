package day41_Exceptions;

import day39_Recap.cydeoTask.Student;

import java.io.FileInputStream;

public class Checked_vs_Unchecked {
    public static void main(String[] args) {

        //unchecked exceptions:

        int a=10;
        int b=0;
        //System.out.println(a/b);
/*
// Exception in thread "main" java.lang.ArithmeticException: / by zero
	at day41_Exceptions.Checked_vs_Unchecked.main(Checked_vs_Unchecked.java:10)

Process finished with exit code 1     //this exit code means, exit method got executed automatically.

 */
      //System.out.println("Wooden Spoon");// it is not compile as well. because previous exception was not handled

        char[] characters={'A','B','C'};

        //System.out.println(characters[99]);

        /*
        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 99 out of bounds for length 3
	at day41_Exceptions.Checked_vs_Unchecked.main(Checked_vs_Unchecked.java:22)

Process finished with exit code 1

         */


        Student student=null;
        //System.out.println(student.getName());
       // student.study();
/*
Exception in thread "main" java.lang.NullPointerException
	at day41_Exceptions.Checked_vs_Unchecked.main(Checked_vs_Unchecked.java:36)

Process finished with exit code 1

 */

        String str="Wooden Spoon";

        str=null;


//checked exceptions:


        System.out.println("Hello");

       // Thread.sleep(3000);

        System.out.println("Cydeo");


        //FileInputStream file= new FileInputStream("path");

       // System.out.println("java".charAt(20000));     unchecked



    }
}
