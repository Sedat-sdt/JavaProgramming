package day10_NestedIf;

public class NameOfMonth {

    public static void main(String[] args) {

    int number = 10;// 1-12

    String month="";

    if (number >=1 && number<= 12){
        if(number==1){
            month="January";
        } else if (number==2) {
            month="February";
        } else if (number==3) {
            month="March" ;
        } else if (number==4) {
            month ="April";
        } else if (number==5) {
            month="May";
        } else if (number==6) {
            month= "June";
        } else if (number==7) {
            month="July";
        } else if (number==8) {
            month="August";
        } else if (number==9) {
            month="September";
        } else if (number==10) {
            month="October";
        } else if (number==11) {
            month="Nowember";
        }else{
            month="December";
        }
        }else {
            month = "Invalid Number";
    }
        System.out.println("month = " + month);
    }
}
/*
        int monthNum=7;//1-12

        String month;

        if(monthNum==1){
            month="January";
        } else if (monthNum==2) {
            month="February";
        } else if (monthNum==3) {
           month="March" ;
        } else if (monthNum==4) {
           month ="April";
        } else if (monthNum==5) {
            month="May";
        } else if (monthNum==6) {
            month= "June";
        } else if (monthNum==7) {
            month="July";
        } else if (monthNum==8) {
            month="August";
        } else if (monthNum==9) {
            month="September";
        } else if (monthNum==10) {
            month="October";
        } else if (monthNum==11) {
            month="Nowember";
        }else{
            month="December";
        }
        System.out.println("month = " + month);

 */