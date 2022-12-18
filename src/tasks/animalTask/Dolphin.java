package tasks.animalTask;

public class Dolphin extends FrendlyAnimal {

    public Dolphin( String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super("Dolphin", breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }

    public void swim(){
        System.out.println(" Dolphin is swimming");
    }
}
/*
3. Dolphin:
					Extra methods:
						swim()

 */
