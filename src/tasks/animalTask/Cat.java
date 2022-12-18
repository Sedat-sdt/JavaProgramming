package tasks.animalTask;

public class Cat extends FrendlyAnimal {
    public Cat(String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super("Cat", breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }

    public void scratch(){
        System.out.println(" Cat is scratching");
    }

    public void meow(){
        System.out.println("Cat is meowing");
    }
}
/*
2. Cat:
					Extra methods:
						scratch()
						meow()

 */