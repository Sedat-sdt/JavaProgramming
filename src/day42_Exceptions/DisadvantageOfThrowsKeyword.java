package day42_Exceptions;

public class DisadvantageOfThrowsKeyword {

    public static void main(String[] args) {
        System.out.println("Hello");
        //sleep(2.5);// when we call sleep method , it gives exception again.
        // ıt is disadvantage of throws keyword
        System.out.println("Hello World");

        System.out.println("--------------------------");


        System.out.println("Hello");
        MorningWorkOut.sleep(2.5);// when we call the sleep method it doesn't give me exception,
        // because we used in this method try and catch block
        System.out.println("Hello World");

    }

        public static void sleep(double seconds) throws InterruptedException {

                Thread.sleep((long)(seconds*1000));

        }











    }

