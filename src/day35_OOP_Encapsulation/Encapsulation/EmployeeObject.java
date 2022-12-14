package day35_OOP_Encapsulation.Encapsulation;

public class EmployeeObject {
    public static void main(String[] args) {

        Employee emp1= new Employee("Sedat",'M',45,100000);

        System.out.println(emp1);//Employee@48140564  need to create tostring method

        //After to string-->Employee{name='Sedat', gender= , age=45, salary=100000.0}

        emp1.setAge(44);


        System.out.println(emp1);
        //Employee{name='Sedat', gender=M, age=44, salary=100000.0}

        Employee employee2= new Employee("Doruk",'M',16,30000);
        employee2.setName("Sude");
        employee2.setAge(employee2.getAge()+3);
        employee2.setSalary(employee2.getSalary()+70000);

        System.out.println(employee2);//Employee{name='Doruk', gender=M, age=16, salary=100000.0}








    }
}
