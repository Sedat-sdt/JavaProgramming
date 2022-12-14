import java.util.ArrayList;
import java.util.Arrays;

public class Dog {
    public String name;
    public String breed;
    public int age;
    public char gender;
    public String size;
    public String color;

    public void setInfo(String dogName, String dogBreed, int dogAge, char dogGender, String dogSize, String dogColor){
        name  = dogName;
        breed = dogBreed;
        age   = dogAge;
        gender= dogGender;
        size  = dogSize;
        color = dogColor;
    }

    public void eat(){

        System.out.println(name+" is eating");
    }
    public void bark(){
        System.out.println(name+" is barking");

    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }


}

class dogObjects{
    public static void main(String[] args) {

        day30_CustomClass.Dog dog1 = new day30_CustomClass.Dog();
        dog1.name="Lucy";
        dog1.breed="Husky";
        dog1.age=5;
        dog1.gender='F';
        dog1.size="Small";
        dog1.color="White";

        //System.out.println(dog1);//Name: Lucy   //Dog{name='Lucy', breed='Husky', age=5, gender=F, size='Small', color='White'}


        day30_CustomClass.Dog dog2 = new day30_CustomClass.Dog();
        //System.out.println(dog2);//Dog{name='null', breed='null', age=0, gender= , size='null', color='null'}

        dog2.name="ACE";
        dog2.breed="Husky";
        dog2.age=5;
        dog2.gender='M';
        dog2.size="Large";
        dog2.color="White & Black";

        day30_CustomClass.Dog dog3= new day30_CustomClass.Dog();

        dog3.setInfo("Joe","Husky",4,'F',"Small","Brown");


        System.out.println("dog1 = " + dog1);//dog1 = Dog{name='Lucy', breed='Husky', age=5, gender=F, size='Small', color='White'}
        System.out.println("dog2 = " + dog2);//dog2 = Dog{name='ACE', breed='Husky', age=5, gender=M, size='Large', color='White & Black'}
        System.out.println("dog3 = " + dog3);//dog3 = Dog{name='Joe', breed='Husky', age=4, gender=F, size='Small', color='Brown'}


        dog1.eat();//Lucy is eating
        dog2.bark();//ACE is barking


        day30_CustomClass.Dog dog4= new day30_CustomClass.Dog();
        dog4.setInfo("Bullet","Labrador",3,'M',"Extra Large","Yellow");

        day30_CustomClass.Dog dog5= new day30_CustomClass.Dog();
        dog5.setInfo("Sully", "Pitbull",6,'M',"Large","Black");

        System.out.println("----------------------------------------");

        day30_CustomClass.Dog[] dogs={dog1,dog2,dog3,dog4,dog5};

        ArrayList<day30_CustomClass.Dog> femaleDogs= new ArrayList<>();
        femaleDogs.addAll(Arrays.asList(dog1,dog2,dog3,dog4,dog5));

        femaleDogs.removeIf(p-> p.gender==('M'));

       /* ArrayList<Dog> maleDogs= new ArrayList<>();
        maleDogs.addAll(Arrays.asList(dog1,dog2,dog3,dog4,dog5));

        for (Dog each : maleDogs) {
            if(each.gender=='F'){
               maleDogs.remove(each) ;
            }
        }*/
        //System.out.println("maleDogs = " + maleDogs);
        System.out.println("femaleDogs = " + femaleDogs);











        // System.out.println(dog1);//day30_CustomClass.Dog@58ceff1
        // we must create toString method in custom class like that:
        /*
        public String toString(){
        return "Name: "+name;
    }
         */






    }

}