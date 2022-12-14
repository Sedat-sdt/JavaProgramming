package day09_IfStatements;

public class MedianNumber {

    public static void main(String[] args) {

    int a = 10;
    int b = 15;
    int c = 20;
/*
    boolean aIsMedianNum = !(a<b && a<c) && !(a>b && a>c);
    boolean bIsMedianNum = !(b<a && b<c) && !(b>a && b>c);
    boolean cIsMedianNum = !(c<b && c<a) && !(c>b && c>a);
*/
   boolean aIsMedianNum = (a>b && a<c) || (a>c && a<b);
   boolean bIsMedianNum = (b>a && b<c) || (b>c && b<a);
   //boolean cIsMedianNum = (c>b && c<a) || (c>a && c<b);
   boolean cIsMedianNum = !aIsMedianNum && !bIsMedianNum;


        if (aIsMedianNum) {
            System.out.println(a + " is the median number");
        }

        if (bIsMedianNum) {
            System.out.println(b + " is the median number");
        }
        if (cIsMedianNum) {
            System.out.println(c + " is the median number");
        }
    }
}
/*
Create a class called MedianNumber.
write a program that can find the median number
between three DIFFERENT given integers

			Ex:
				a = 10, b= 15, c = 20;

			Output:
				15 is the median number


			Posibility #1: a could be median number
			Posibility #2: b could be median number
			Posibility #3: c could be median number

 */