package day06_PrimitiveTypeCasting;

public class PrimitiveCastings {

    public static void main(String[] args) {

        byte a = 100;
        short b = a;
        //short b = (short)a;
        //          (short)a

        int c = b; // implicit casting
        //int c = (int)b

        long d = c;
        //      (long)c
        float e = d;
        double f = e;
        System.out.println("---------------------------");
        int x = 55;
        short y = (short)x;//explicit casting

        System.out.println(x + " : " + y);

        double d1 = 20.5;
        short s1 = (short) d1;

        float f1 = 30.5f;
        long l1 = (long) f1;

        System.out.println(f1 + " : " + l1);





    }
}
