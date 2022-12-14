package tasks;

public class FindTheBalanceItemIndex {

    public static void main(String[] args) {

        int[] arr={4,9,1,3,6,4};
        int a=0;
        int b=0;
        String numbers="";

        for (int i = 0; i < arr.length; i++) {
            numbers+=arr[i];
        }
        int j=numbers.length();
        for (int i = 0; i <= numbers.length()-1; i++,j--) {
            a+=numbers.charAt(i);
            b+=numbers.charAt(j);
            if(a==b) {
                System.out.println(i + 1);
            }
        }

        }
    }



