package day08_IfStatements;

public class EligibleToVote {

    public static void main(String[] args) {

       String name = "Josh";
       int age = 38;
       String citizen = "USA";

       boolean isElligible = age>=21&& citizen =="USA";

       //Elligible
        if(isElligible){

            System.out.println(name + " is elligible to vote");

        }

        //Not Elligible
        if(!isElligible) {

            System.out.println(name + " is not elligible to vote");
        }
    }

}
