package tasks.animalTask;

public class Dog extends FrendlyAnimal{

    public Dog(String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super("Dog", breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }

    public void bark(){
        System.out.println("Dog is barking");

}

    @Override
    public void eat() {
        System.out.println("Dog is eating bone and meat");
    }
}
/*
4. Create the following subclasses of FriendlyAnimal
	and Override the eat method
			1. Dog:
					Extra methods:
						bark()
 */