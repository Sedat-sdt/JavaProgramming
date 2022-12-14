package day24_CustomMethod_Return;

public class ReturnMethodPractice {
    public static void main(String[] args) {
     //find the max number between two numbers
        int result = findMaxNum(20,30);
        System.out.println(result);
     //multiply the max number by 2

       int multiplication= result*2;
        System.out.println(multiplication);

    }

public static int findMaxNum(int a,int b){
       int maxNum =0;
       if(a>b){
           maxNum=a;
       }else{
           maxNum=b;
       }
       return maxNum;
}


}
