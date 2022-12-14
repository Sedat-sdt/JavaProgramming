package day34_GarbageCollection_AccessModifiers;

public class StaticBlock {

    public static void main(String[] args) {
        System.out.println("Main method");
    }

static {
    System.out.println("Static Block");//Static Block      static block gets executed first everytime in class
                                        //Main method       and only runs one time
}

}
