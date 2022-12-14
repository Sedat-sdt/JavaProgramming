package day33_Statics;

import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {

    Student student1= new Student("Sedat");
    Student student2= new Student("Sedat",'M');
    Student student3= new Student("Sedat",123);
    Student student4= new Student("Sedat",123,'A');
    Student student5= new Student("Sedat",'M',45);
    Student student6= new Student("Sedat",'M',45,23);
    Student student7= new Student("Sedat",'M',45,23,'A');
/*
        System.out.println(student1);//Student{name='Sedat', gender= , age=0, studentID=0, grade= }
        System.out.println(student2);//Student{name='Sedat', gender=M, age=0, studentID=0, grade= }
        System.out.println(student3);//Student{name='Sedat', gender= , age=0, studentID=123, grade= }
        System.out.println(student4);//Student{name='Sedat', gender= , age=0, studentID=123, grade=A}
        System.out.println(student5);//Student{name='Sedat', gender=M, age=45, studentID=0, grade= }
        System.out.println(student6);//Student{name='Sedat', gender=M, age=45, studentID=23, grade= }
        System.out.println(student7);//Student{name='Sedat', gender=M, age=45, studentID=23, grade=A}*/

    Student[] students={student1, student2,student3,student4,student5,student6,student7};

        System.out.println(Arrays.toString(students));













    }
}
