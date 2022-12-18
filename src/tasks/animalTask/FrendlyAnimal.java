package tasks.animalTask;

public class FrendlyAnimal extends Animal {
    private boolean isWild,isFriendly,isPlayable;

    public boolean isWild() {
        return isWild;
    }

    public void setWild(boolean wild) {
        if(isWild){
            System.out.println(getName()+" is not a friendly animal");
            System.exit(1);
        }
        isWild = wild;
    }

    public boolean isFriendly() {
        return isFriendly;
    }

    public void setFriendly(boolean friendly) {
        if(!isFriendly){
            System.out.println(getName()+" is not a friendly animal");
            System.exit(1);
        }
        isFriendly = friendly;
    }

    public boolean isPlayable() {
        return isPlayable;
    }

    public void setPlayable(boolean playable) {
        if(!isPlayable){
            System.out.println(getName()+ " is not a friendly animal");
            System.exit(1);
        }
        isPlayable = playable;
    }

    public FrendlyAnimal(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color);
        setWild(isWild);
        setFriendly(isFriendly);
        setPlayable(isPlayable);
    }

    public void play(){
        System.out.println(getName()+" is playing");
    }

    public  void  pet(){
        System.out.println(getName()+" is being pet");
    }


    public String toString() {
        return "FrendlyAnimal{" +
                "name='" + getName() + '\'' +
                ", breed='" + getBreed() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", size='" + getSize() + '\'' +
                ", color='" + getColor() + '\'' +
                ", isWild=" + isWild +
                ", isFriendly=" + isFriendly +
                ", isPlayable=" + isPlayable +
                '}';
    }
}
/*
2. Create a subclass of Animal named FriendlyAnimal:
				Variable:
					isWild
					isFriendly
					isPlayable

				Extra methods:
					play()
					pet()
 */