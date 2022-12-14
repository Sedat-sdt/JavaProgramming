package day36_Inheritance.encapsulation;

public class StudentObject {
    public static void main(String[] args) {

        Student   student1= new Student("Sedat",45,'M','A',"Atatürk");

        student1.study();//Sedat is studying
        student1.setAge(46);
        System.out.println(student1);//Students{name='Sedat', age=45, gender=M, grade=A, schoolName='Atatürk'}
                        //Students{name='Sedat', age=46, gender=M, grade=A, schoolName='Atatürk'}







    }
}
