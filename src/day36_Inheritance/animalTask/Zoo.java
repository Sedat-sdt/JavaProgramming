package day36_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog= new Dog();
        dog.setInfo("Max","Husky",'M',2,"Small","Black");

        dog.age=3;

        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();

        dog.bark();

        System.out.println(dog);

        Cat cat= new Cat();

        cat.setInfo("Tarçın","British",'M',2,"Small","White");

        cat.eat();
        cat.sleep();
        cat.drink();

        cat.meow();
        cat.scratch();
        //cat.roar();

        System.out.println(cat);


        Tiger tiger= new Tiger();
        tiger.setInfo("Khan","Bengal",'F',5,"Large","Orange");

        tiger.eat();
        tiger.drink();
        tiger.move();

        tiger.roar();
        tiger.hunt();
        //tiger.meow();

        System.out.println(tiger);
    }





}
