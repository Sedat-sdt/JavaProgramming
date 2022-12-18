package tasks.animalTask;

public class WildAnimal extends Animal{

    private boolean isWild, isFriendly, isPlayable;

    public WildAnimal(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color);
        setWild(isWild);
        setFriendly(isFriendly);
        setPlayable(isPlayable);
    }

    public boolean isWild() {
        return isWild;
    }

    public void setWild(boolean wild) {
        if(!isWild){
            System.out.println(getName()+" is not a wild animal");
            System.exit(1);
        }
        isWild = wild;
    }

    public boolean isFriendly() {
        return isFriendly;
    }

    public void setFriendly(boolean friendly) {
        if(isFriendly){
            System.out.println(getName()+" is not a wild animal");
            System.exit(1);
        }
        isFriendly = friendly;
    }

    public boolean isPlayable() {
        return isPlayable;
    }

    public void setPlayable(boolean playable) {
        if(isPlayable){
            System.out.println(getName()+ " is not a wild animal");
            System.exit(1);
        }
        isPlayable = playable;
    }

    public void hunt(){
        System.out.println(getName()+" is hunting");
    }
}
/*
3. Create a subclass of Animal named WildAnimal:
				Variable:
						isWild, isFriendly, isPlayable

				Extra Methods:
					hunt()
 */