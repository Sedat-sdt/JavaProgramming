package day34_GarbageCollection_AccessModifiers;

public class CydeoStudent {

    public String studentName;
    public static String schoolName="Cydeo School";

    public CydeoStudent(String studentName) {
        this.studentName = studentName;
      //  schoolName= "Cydeo School";//it is not efficient way,
    }
}
class CydeoStudentObject{

    public static void main(String[] args) {

        CydeoStudent student1= new CydeoStudent("Sedat");
        CydeoStudent student2= new CydeoStudent("Şule");

        System.out.println(student1.schoolName);//Cydeo School
        System.out.println(student2.schoolName);//Cydeo School



    }
}