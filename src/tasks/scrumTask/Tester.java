package tasks.scrumTask;

public class Tester {

  public String name,jobTitle;
  public int employeeID;
  public double salary;


    public Tester(String name, String jobTitle, int employeeID, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public void smokeTesting(){
        System.out.println(jobTitle+" "+name+" is smoke testing");
    }

    public void creatingTicket(){
        System.out.println(jobTitle+" "+name+" is creating Ticket" );
    }

    public void dailyStandUp(){
        System.out.println(jobTitle+" "+name+ "is in daily Standup  meeting.");
    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", employeeID=" + employeeID +
                ", salary= $" + salary +
                '}';
    }
}
/*
create a class called Tester

	        Attributes:
	            name, employeeID, JobTitle, Salary

	        Add A constructor that can set all the fileds

	        Actions:
	           smokeTesting(),  creatingTicket(), dailyStandUp(), toString()


	create a class called Developer

	          Attributes:
	            name, employeeID, JobTitle, Salary

	          Add A constructor that can set all the fileds

	          Actions:
	            coding(), unitTesting(), fixingBug(), toString()


	create a class called ScrumTeam

	           Attributes:
	                String PO, BA, SM;
	                ArrayList<Tester> testersList = new ArrayList<>();
	                ArrayList<Developer> devopsList = new ArrayList<>();
	                int daysOfSprint;

	               Add A constructor that can set the fileds PO, BA, and SM

	             Actions:
	                  addTester(Tester tester): adds the given tester to the testers ArrayList

	                  addTesters(Tester[] testers): adds the given testers to the testers ArrayList

	                  addDeveloper(Developer developer): adds the given developer to the developers ArrayList

	                  addDevelopers(Developer[] developers): adds the given developers to the developers ArrayList

	                  removeTester(long employeeID): removes the given tester from the testers ArrayList

	                  removeDeveloper(long employeeID): removes the developer from the developers ArrayList

	                  toString(): prints number of tester,& developers,  PO name, SM name, BA name


	create a class called MyScrumTeam:

	                    1. create an array of Testers and add the testers from your group
	                    2. create an array of developers add the developers from your group
	                    3. create an object of ScrumTeam and store the testers & developers above to the scrum team

 */