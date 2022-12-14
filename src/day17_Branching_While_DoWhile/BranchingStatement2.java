package day17_Branching_While_DoWhile;

public class BranchingStatement2 {
    public static void main(String[] args) {

        /*for (char i = 'A'; i <= 'E'; i++) {
            if(i == 'C'){
                break;
            }
            System.out.println(i);// A B
        }*/

        for (char i = 'A'; i <= 'E'; i++) {
            if(i == 'C'){
                continue;
            }
            System.out.println(i);// A B D E
        }
        System.out.println("-----------------------------");
//print all even numbers 1 - 10(skip the odds)

        for (int j = 1; j <=10; j++) {
            if( j%2!=0){
                continue;
            }
            System.out.println(j);
        }

        System.out.println("-----------------------------");
//print all even numbers 1 - 10(skip the evens
        for (int k = 1; k <=10; k++) {
            if( k%2==0){
                continue;
            }
            System.out.println(k);
        }

    }
}
