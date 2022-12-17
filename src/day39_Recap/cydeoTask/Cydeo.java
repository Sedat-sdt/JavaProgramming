package day39_Recap.cydeoTask;

public class Cydeo {
    public static void main(String[] args) {

        Developer developer= new Developer("Sedat",45,'M',123,"Senior developer",120000);
        Tester tester=new Tester("Sedat",45,'M',456,"Qa",110000);
        Teacher teacher= new Teacher("Sude",28,'F',678,"Java teacher",130000);

        Student student=new Student("Doruk",23,'M',8,"SDET");

        System.out.println(developer);//Employee{name='Sedat', age=45, gender=M, employeeId=123, jobTitle='Senior developer', salary=120000.0}
        System.out.println(teacher);//Employee{name='Sude', age=28, gender=F, employeeId=678, jobTitle='Java teacher', salary=130000.0}
        System.out.println(tester);//Employee{name='Sedat', age=45, gender=M, employeeId=456, jobTitle='Qa', salary=110000.0}
        System.out.println(student);//Student{name='Doruk', age=23, gender=M, studentId=8, fieldOfStudy='SDET'}

        System.out.println("---------------------------------------------------------");

        developer.setName("Maden");
        System.out.println(developer.getName());//Maden

        System.out.println(developer);//Employee{name='Maden', age=45, gender=M, employeeId=123, jobTitle='Senior developer', salary=120000.0}

        System.out.println("---------------------------------------");

        tester.setAge(35);
        System.out.println(tester.getAge());//35

        System.out.println(tester);//Employee{name='Sedat', age=35, gender=M, employeeId=456, jobTitle='Qa', salary=110000.0}

        System.out.println("-------------------------------------------------------");

        developer.work();//Senior developer Maden is coding
        tester.work();//Qa Sedat is testing
        teacher.work();//Java teacher Sude is teaching
        //student.work();
        student.study();//Doruk is studying

        System.out.println("-----------------------------------------------");

        developer.eat();
        developer.drink();//Maden is drinking
        developer.sleep();

        developer.fixingBugs();//Senior developer Maden is fixing bugs

        System.out.println("---------------------------------------------");

        tester.eat();
        tester.drink();
        tester.sleep();

        tester.createTicket();
        //tester.fixingBugs();

        System.out.println("-------------------------------------------");

        teacher.eat();
        teacher.drink();
        teacher.sleep();

        //teacher.createTicket()

        System.out.println("-------------------------------------------");

        student.eat();//Doruk is eating
        student.drink();
        student.sleep();

        //student.fixingBugs();

        student.study();//Doruk is studying
    }
    /*
    7. Create a class named Cydeo:
            create objects of Tester, Developer,Teacher, Student

            test all the functions of each objects

            Analyze the relationships between the classes
 */

}
