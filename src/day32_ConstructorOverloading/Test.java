package day32_ConstructorOverloading;

public class Test {
    public Test(){   //A

        System.out.println("A");
    }
    public Test(int a){   //A B
        this();
        System.out.println("B");
    }

    public Test(double a){    //A B C
        this(10);
        System.out.println("C");
    }


    public Test(String str){   // A B C D
        this(2.5);
        System.out.println("D");
    }

    public static void main(String[] args) {
        new Test();//A
        new Test(10); //A
                        //B
        new Test(2.5);//A
                        //B
                        //C
        new Test("Java");//A
                            //B
                            //C
                            //D

    }








}
