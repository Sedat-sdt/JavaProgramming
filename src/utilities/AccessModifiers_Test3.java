package utilities;

import day40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifiers_Test3 extends ProtectedAccessModifier {
    public static void main(String[] args) {

       // System.out.println(ProtectedAccessModifier.name1);// default not visible outside the package

        System.out.println(ProtectedAccessModifier.name2);// protected is not always visible outside the package
        System.out.println(AccessModifiers_Test3.name2);// protected is not always visible outside the package
        // without being in a subclass
        //we made this class sub of ProtectedAccessModifier class in day 40 package,then compile error was fixed



    }

}
