package day24_CustomMethod_Return;

public class Return_Vs_ExitMethod {
    public static void main(String[] args) {
nameOfTheMonths(20);
        System.out.println("Hello World");


    }

//Create a method that can display the name of the month based on the given number to the method

    public static void nameOfTheMonths(int numberOfMonth){
                if(numberOfMonth<1||numberOfMonth>12) {
            System.err.println("Invalid number!");
            //return;//exits nameOfMonths method,remaining code fragments of the method never gets executed,hello world is written with this
                    System.exit(0);//Invalid number! //terminated everything, hello world is not written with this
        }
                String nameOfMonth="";
        switch (numberOfMonth){
            case 1:
                nameOfMonth="January";
                break;
            case 2:
                nameOfMonth="February";
                break;
            case 3:
                nameOfMonth="March";
                break;
            case 4:
                nameOfMonth="April";
                break;
            case 5:
                nameOfMonth="May";
                break;
            case 6:
                nameOfMonth="June";
                break;
            case 7:
                nameOfMonth="July";
                break;
            case 8:
                nameOfMonth="August";
                break;
            case 9:
                nameOfMonth="September";
                break;
            case 10:
                nameOfMonth="October";
                break;
            case 11:
                nameOfMonth="Nowember";
                break;
            case 12:
                nameOfMonth="December";
                break;
//name =(number==1)?"Jan" :(number==2)?"Feb"......................................

        }
        System.out.println(nameOfMonth);


    }

}
