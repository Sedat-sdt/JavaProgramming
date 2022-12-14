package day34_GarbageCollection_AccessModifiers;

public class Constructor_Vs_StaticBlock {

    static{
        System.out.println("Static Block");
    }

    public Constructor_Vs_StaticBlock(){

        System.out.println("Constructor");// it is not get executed. It depends on only objects. There must be an object calling cons.
    }                                       //in main method we must create objects with new keyword and calling cons.

    public static void main(String[] args) {

        System.out.println("Main Method");

        new Constructor_Vs_StaticBlock();
        new Constructor_Vs_StaticBlock();
        new Constructor_Vs_StaticBlock();
        new Constructor_Vs_StaticBlock();
        new Constructor_Vs_StaticBlock();
    }


}
