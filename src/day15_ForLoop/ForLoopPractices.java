package day15_ForLoop;

public class ForLoopPractices {
    public static void main(String[] args) {

      for(int i= 15; i<=45; i++){
          System.out.print(i+" ");
      }
        System.out.println();//additional

       // 100 - 50; 100 99 98 97 96.......like this

        for(int i= 100; i>=50; i--) {
            System.out.print(i + " ");


        }
        System.out.println();

        System.out.println("-------------------------------");

        /*for(int i = 2; i<=54; i+=2) {
            System.out.print(i+ " ");
       }*/

        for(int i= 1; i<=55; i++){
            if(i%2==0){// even number
                System.out.print(i+" ");

            }

        }
        System.out.println();
        System.out.println("--------------------------------------");





        }


    }

