package day35_OOP_Encapsulation;

public class CydeoStudents {

    public String name;
    public int age;
    public char gender;
    public int batchNumber;
    public int groupNumber;
    public  String fieldOfStudy;

    public  static String schoolName;
    public  static String programmingLanguage;
    public  static String secretCode;

    public CydeoStudents(String name, int age, char gender, int batchNumber, int groupNumber, String fieldOfStudy) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldOfStudy = fieldOfStudy;
    }

    static {
        schoolName="CYDEO";
        programmingLanguage="Java";
        secretCode="WoodenSpoon";
    }

    public static void schoolName(){
        System.out.println("School is: "+schoolName);
    }

    public static void secretCode(){
        System.out.println("code is: "+secretCode);
    }

    public void attendClass(String name){
        System.out.println(name+ " is attending class.");
    }

    public void study(String name){
        System.out.println(name+ " is studying");
    }




    public String toString() {
        return "CydeoStudents{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", school='" + schoolName + '\'' +
                ", programming language='" + programmingLanguage + '\'' +
                '}';
    }
}
/*
create a class named CybertekStudent
            Variables:
                name, gender, age, batchNumber, groupNumber, schoolName,
                fieldOfStudy, programmingLanguage, secretCode

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            methods:
                printSchoolName();
                printSecretCode();
                attendClass():
                study()
                toString()

 */