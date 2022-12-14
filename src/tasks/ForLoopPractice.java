package tasks;

import java.util.Scanner;

public class ForLoopPractice {
    public static void main(String[] args) {
        int sumeven=0;
        for (int i = 1; i <= 100 ; i++) {
          if(i%2==0){
              sumeven +=i;
          }

        }
        System.out.println(sumeven);
        System.out.println("--------------------------------------------");

        int sumOdd = 0;
        for (int j = 0; j <= 100 ; j++) {
           if(j%2==1) {
               sumOdd+=j;
           }
        }
        System.out.println(sumOdd);



String evenNum="";
String oddNum="";
for(int i=1 ; i<=20 ; i++){
  if(i%2==0){
   evenNum+=" "+i;
  }

    }
  for(int i=1 ; i<=20 ; i++){
    if(i%2==1){
   oddNum+=" "+i;
  }

}
System.out.println(evenNum+"\n"+oddNum);


        System.out.println("--------------------------------------------");

       Scanner scan = new Scanner(System.in);
        /* System.out.println("Enter a number: ");
        int num = scan.nextInt();
        int sumNum =0;
        for (int i = 1; i <= num ; i++) {
            sumNum+=i;
        }
        System.out.println(sumNum);*/
        System.out.println("----------------------------------------------");

       /* System.out.println("Enter a number: ");
        int num1=scan.nextInt();
        int facNum=1;
        for (int i = num1; i >0 ; i--) {
           facNum *= i;
        }
        System.out.println(facNum);*/
        System.out.println("------------------------------------------------");

       /* String str = "mn@#123Ab!";
        String letters ="";
        String digits ="";
        String specialch = "";
        for (int k = 0; k <str.length() ; k++) {
            char ch =str.charAt(k);

            if((ch >='a' && ch<='z') ||(ch >='A' && ch<='Z')){
                letters+=ch;
            }else if(ch >='0' && ch<='9'){
                digits+=ch;
            }else {
                specialch+=ch;
            }
        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialch = " + specialch);*/
        System.out.println("--------------------------------------------------");


        String str1= "A1B2C3";
        int sumDigits=0;
        for (int l = 0; l <= str1.length()-1 ; l++) {
          int ch1 =str1.charAt(l);
          if(ch1>='0' && ch1<='9'){
              sumDigits+=ch1-48;
          }


        }
        System.out.println("sumDigits = " + sumDigits);





    }
}
/*
 Write a program that can return the sum of even numbers between 1 to 100

	2. Write a program that can return the sum of odd numbers between 1 to 100

	3. write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275


	4. Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )


    5. write a program that can retive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!


    6. Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1
						             	   		...


	7. Write a program that can reverse any given string

			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW


	8. Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level

				output:
					true


				input:
					Anna

				output:
					true


 */