package utilities;

import day40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifiers_Test4 extends ProtectedAccessModifier {
    public static void main(String[] args) {

        //System.out.println(AccessModifiers_Test4.name1);//because it has default access modifiers.
        // not visible outside of the package
        System.out.println(AccessModifiers_Test4.name2);//Since being subclass it can call name2

        AccessModifiers_Test4.method2();
        //AccessModifiers_Test4.method1(); gives error because it has default acc mod

        ProtectedAccessModifier.method2();


    }
}
