package day10_NestedIf;

public class NameOfMonth2 {
    public static void main(String[] args) {

        /*int monthNum=7;//1-12
        String month="";

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
        System.out.println("month = " + month);*/

        int n=5;
        //String name;

         String name = (n==1)? "Jan" :(n==2)? "Feb" :(n==3)? "Mar" :(n==4)? "Apr" :(n==5)?"May"
        :(n==6)? "Jun" :(n==7)? "Jul" :(n==8)? "Aug":(n==9)? "Sep" :(n==10)?"Oct"
        :(n==11)? "Nov" : "Dec";
        System.out.println(name);
    }
}
