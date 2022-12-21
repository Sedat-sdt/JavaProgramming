package day40_FinalKeyword;

public class FinalVariables {

        //final char gender; it will be unchangeable after final keyword
        //final String birthDay;it will be unchangeable after final keyword
        //therefore intellij does not allow to use final keyword for instance variables.
        final String birthDay;
        final static String name;//inorder to get rid off the comp error w emust create ststic block
        // and initialize the static variable
        static {
            name="Batch EU10";// with this compl error gone
        }



    public FinalVariables(String birthDay) {
        this.birthDay = birthDay;
    }// with this constructor instance variable could be used with final keyword


    public static void main(String[] args) {

       final double pi=3.14;//local variable, not instance

       // pi=4.14; before applying final, it did'nt give error we could re assign the pi


        final String name;
        name="Java";
        //name="Wooden Spoon"; final keyword does not allow us to reassign the name
        System.out.println(name);

        System.out.println("-----------------------------------");

        FinalVariables obj= new FinalVariables("May/01");

        //obj.birthDay="June/11";    gives compile error because it can not be reassigned

        System.out.println(obj.birthDay);//May/01

        System.out.println("------------------------------");

        System.out.println(name);//Java

        System.out.println(FinalVariables.name);//Batch EU10

        //FinalVariables.name="Python";  cannot be changed








    }
}
