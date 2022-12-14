package day19_RecapLoopAndString;

public class ExitMethod {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {

            if( i == 3){
                //break;//terminates the loop
                //continue;//terminates the current iteration of loop
                System.exit(0);//terminates the program

            }
            System.out.println(i);
        }

        System.out.println("Wooden Spoon");

    }
}
