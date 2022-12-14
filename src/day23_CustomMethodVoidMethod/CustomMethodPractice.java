package day23_CustomMethodVoidMethod;

public class CustomMethodPractice {
    public static void main(String[] args) {
        printingHellWorld5Times(); //
        printingHelloCydeo5Times();
        evenNumbers();
    }
    //create a function that can print hello world 5 times

    public static void printingHellWorld5Times() {
        for (int i = 0; i < 5; i++) {
            System.out.println("hello world");
        }
    }

    //create a function that can print hello Cydeo 5 times

    public static void printingHelloCydeo5Times() {
        for (int i = 0; i < 5; i++) {
            System.out.println("hello Cydeo");
        }
    }

    //create a function that can print all the even numbers from 1 -10


    public static void evenNumbers(){
       /* for (int i = 1; i <= 10; i++) {
            String even="";
            if(i%2==0){
             even+= i+" ";
            }
            System.out.print(even);
        }*/
        for (int i = 2; i <11 ; i+=2) {
            System.out.print(i+" ");
        }
    }


}

