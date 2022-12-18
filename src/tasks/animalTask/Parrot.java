package tasks.animalTask;

public class Parrot extends FrendlyAnimal{
    public Parrot(String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super("Parrot", breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }

    public void fly(){
        System.out.println("Parrot is flying");
    }

    public void sing(){
        System.out.println("Parrot is singing");
    }

}
/*
4. Parrot:
					Extra methods:
						fly()
						sing()

 */
