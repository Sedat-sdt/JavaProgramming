package day34_GarbageCollection_AccessModifiers;

public class StaticMembers {  //outer class, public accessmodifier

   static class class1{   //inner class,  default accessmodifier

   }

   public static int num=100;


   public static void method(){   //method block

   }

    static {   //static block

    }

}
class A{  //outer class
    static class B{   //inner class,

        public static void method1(){

        }
    }
}
class C{
    public static void main(String[] args) {
        A.B.method1();
    }
}