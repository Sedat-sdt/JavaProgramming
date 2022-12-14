package day30_CustomClass;

public class CapitalOne {
    public static void main(String[] args) {

    Employee employee1= new Employee();

    employee1.setInfo("Sedat",2345,'M',"Soldier",100000,true);


    Employee employee2= new Employee();

    employee2.setInfo("Sude",6521,'F',"Pharmacy",120000,false);

    Employee employee3= new Employee();

    employee3.setInfo("Şule",2157,'F',"Teacher",120000,true);


    Employee employee4= new Employee();

    employee4.setInfo("Doruk",2868,'M',"Basketball player",300000,false);

    Employee employee5= new Employee();

    employee5.setInfo("Efe",2965,'M',"IT Engineer",150000,true);


    Employee[] employees= {employee1,employee2,employee3,employee4,employee5};
        int fullTimeEmp=0;
        int partTimeEmp=0;
        double max=employees[0].salary;
        double min=employees[0].salary;

        for (Employee employee : employees) {
            if(employee.isFullTime){
                fullTimeEmp++;
            }else {
                partTimeEmp++;
            }

            if(employee.salary>max) {
                max=employee.salary;
            }

            if(employee.salary<min) {
                min=employee.salary;
            }


        }


        System.out.println("partTimeEmp = " + partTimeEmp);//partTimeEmp = 2
        System.out.println("fullTimeEmp = " + fullTimeEmp);//fullTimeEmp = 3
        System.out.println("max = " + max);//max = 300000.0
        System.out.println("min = " + min);//min = 100000.0






    }
}
