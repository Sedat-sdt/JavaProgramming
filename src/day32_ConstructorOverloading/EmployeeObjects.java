package day32_ConstructorOverloading;

public class EmployeeObjects {
    public static void main(String[] args) {

      Employee employee1= new Employee("Sedat");
      Employee employee2= new Employee("Sedat",'M');
      Employee employee3= new Employee("Ahmet",'M',"SDET");
      Employee employee4= new Employee("Ali",'M',"SM",120000);

        System.out.println(employee1);//Employee{name='Sedat', gender= , jobTitle='null', salary=0.0}
        System.out.println(employee2);//Employee{name='Sedat', gender=M, jobTitle='null', salary= $0.0}
        System.out.println(employee3);//Employee{name='Ahmet', gender=M, jobTitle='SDET', salary= $0.0}











    }
}
