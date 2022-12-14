package day37_Inheritance.scrumTask;

public class AmazonInc {
    public static void main(String[] args) {

    String company= "Amazon Inc";


    ProductOwner po= new ProductOwner("Şuayip",29,'M',1,160000,company);

    BusinessAnalyst ba= new BusinessAnalyst("Cihad",30,'M',2,150000,company);

    ScrumMaster sm= new ScrumMaster("Anna",26,'F',3,145000,company);

    Tester tester1= new Tester("Sedat",45,'M',"QA",125,125000,company);
    Tester tester2= new Tester("Sude",20,'F',"QA",8635,135000,company);
    Tester tester3= new Tester("Şule",30,'F',"QA",5585,145000,company);
    Tester tester4= new Tester("Doruk",20,'M',"QA",8763,115000,company);
    Tester[] testers= {tester1,tester2,tester3,tester4};

    Developer developer1= new Developer("Sedat",45,'M', "Java Developer",123,125000,company);



    ScrumTeam scrumTeam= new ScrumTeam(po,ba,sm);
    scrumTeam.addDeveloper(developer1);
    scrumTeam.addTesters(testers);

        System.out.println(scrumTeam);//ScrumTeam{PO=Şuayip, BA=Cihad, SM=Anna, number of testers=4, number of developers=1}

        System.out.println("------------------------------------------------------");


        for (Tester tester : scrumTeam.testers) {

            System.out.println(tester.name+" : "+tester.salary);
        }










    }
}
