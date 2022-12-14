package day30_CustomClass;

import java.util.ArrayList;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1= new Student();
        student1.setInfo("Sedat", 'M',45,2345, 'A');

        Student student2= new Student();
        student2.setInfo("Seda", 'F',35,4523, 'B');

        Student student3= new Student();
        student3.setInfo("Nida", 'F',35,1423, 'C');

        Student student4= new Student();
        student4.setInfo("Vida", 'M',30,4258, 'D');

        Student student5= new Student();
        student5.setInfo("Sude", 'F',15,6558, 'A');

        Student[] students={student1,student2,student3,student4,student5};

        for (Student each : students) {
            System.out.println(each);
        }
/*
        System.out.println(student1); //Student{name='Sedat', gender=M, age=45, ID=2345, grade=A}
        System.out.println(student2); //Student{name='Seda', gender=F, age=35, ID=4523, grade=B}
        System.out.println(student3); //Student{name='Nida', gender=F, age=35, ID=1423, grade=C}
        System.out.println(student4); //Student{name='Vida', gender=M, age=30, ID=4258, grade=D}
        System.out.println(student5); //Student{name='Sude', gender=F, age=15, ID=6558, grade=A}*/


        System.out.println("-----------------------------------------------------------------");

        ArrayList<Student> earlyBirds= new ArrayList<>();//grade:A
        ArrayList<Student> angryBirds= new ArrayList<>();//grade:B

        for (Student student : students) {
            if(student.grade=='A'){
                earlyBirds.add(student);
            }else {
                angryBirds.add(student);
            }
        }

        System.out.println(earlyBirds);
        System.out.println(angryBirds);






    }
}
