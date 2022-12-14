package day35_OOP_Encapsulation.Encapsulation;

public class PersonObjects {

    public static void main(String[] args) {

        Person p1= new Person();
        //p1.name="Sedat";
        //p1.age=45;

        //p1.name="";// if public not able to control
        //p1.age=2000;// we can give codition in setter method

        p1.setName("Sedat");
       // p1.setAge(-2000);
        p1.setAge(45);

       // System.out.println(p1.name+" : "+p1.age);

        System.out.println(p1.getName()+" : "+p1.getAge());//Sedat : 45

        //invalid age: -2000
        //Sedat : 45










    }
}
