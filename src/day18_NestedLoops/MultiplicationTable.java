package day18_NestedLoops;

public class MultiplicationTable {

    public static void main(String[] args) {

        for (int i = 1; i <=10 ; i++) {

            for (int j = 1; j <=10 ; j++) {
                int mult  =i * j;

                System.out.print(mult+"\t ");
            }
            System.out.println();
        }
      }
   }
