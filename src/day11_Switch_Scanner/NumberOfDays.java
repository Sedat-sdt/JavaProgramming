package day11_Switch_Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        int year = 2001;
        int number = 2;
        String result = "";

        if (number>=1 && number<=12) {

            switch (number) {
                case 2:
                   /* if(year%4 ==0){
                        result="29";    //instead of these let's use ternary
                    }else{
                        result = "28";
                    }*/
                    result = (year%4==0)? "29" : "28"; //here the ternary
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    result = "30";
                    break;
                default:
                    result = "31";
            }
        }else {
            result= "Invalid number";

        }System.out.println(result);
     /*
     NumberOfDays
			28 Days: 2
			30 days: 4, 6, 9, 11
			31 days: 1, 3, 5, 7, 8, 10, 12

			If(1~12){


			}else{
				Invalid
			}

      */

    }
}
