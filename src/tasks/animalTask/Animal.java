package tasks.animalTask;

public class Animal {
    
    private String name,breed;
    private char gender;
    private int age;
    private String size, color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null||name.equals("")||name.equals(" ")){
            System.out.println("Invalid name");
            System.exit(1);
        }
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if(breed==null||breed.equals("")||breed.equals(" ")){
            System.out.println("Invalid breed");
            System.exit(1);
        }
        this.breed = breed;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if( gender!='M'&& gender!='F'){
            System.out.println("Invalid gender");
            System.exit(1);
        }
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<=0){
            System.out.println("Invalid age");
            System.exit(1);
        }
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color==null||color.equals("")||color.equals(" ")){
            System.out.println("Invalid color");
            System.exit(1);
        }
        this.color = color;
    }

    public Animal(String name, String breed, char gender, int age, String size, String color) {
        setName(name);
        setBreed(breed);
        setGender(gender);
        setAge(age);
        setSize(size);
        setColor(color);
    }

    public void eat(){
        System.out.println(name+" is eating");
    }

    public void drink(){
        System.out.println(name+ " is drinking");
    }

    public void sleep(){
        System.out.println(name+ " is sleeping");
    }

    public void move(){
        System.out.println(name+ " is moving");
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
/*
Animal Task:
	1. Create a class named Animal:
			variables:
				name, breed, gender, age, size, color

			Encapsulate all the fields

			Add a constructor to set all the fields

	Conditions:
		1. name, breed and color can not be null (if obj == null means it's error)
		2. name, breed and color can not be empty or can not be blank
		3. gender should only be set to either 'M' or 'F'
		4. age can not be set to negative

			Methods:
				eat()
				drink()
				sleep()
				move()
				toString()







	4. Create the following sub classes of FriendlyAnimal 
	and Override the eat method
			1. Dog:
					Extra methods:
						bark()

			2. Cat:
					Extra methods:
						scratch()
						meow()

			3. Dolphin:
					Extra methods:
						swim()

			4. Parrot:
					Extra methods:
						fly()
						sing()


	5. Create the following sub classes of WildAnimal and 
	Override the hunt method, and add any extra methods that are needed:
				1. Lion
				2. Tiger
				3. Eagle
				4. Bear
				5. Python
				6. Crocodile


	6. Create a class named Zoo:
			Create the objects of each sub classes and 

			test all the functions of each objects

            Analyze the relationships between the classes 
 */