package day09_IfStatements;

public class NameOfTheMonth {
    public static void main(String[] args) {

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
    }
}
