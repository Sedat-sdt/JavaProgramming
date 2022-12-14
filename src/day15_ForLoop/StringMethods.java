package day15_ForLoop;

public class StringMethods {
    public static void main(String[] args) {

String str= "  ";
boolean r = str.isEmpty();
        System.out.println(r);
boolean r1 = str.isBlank();
        System.out.println(r1);
String str2 = "Cydeo    ";
        System.out.println(str2.isBlank());

        System.out.println("------------------------------------");

        String s1 = "CYDEO";
        String s2="cydeo";

        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equalsIgnoreCase(s2));//true

        System.out.println("Yes".equals("yEs"));//false
        System.out.println("Yes".equalsIgnoreCase("yEs"));//true

        System.out.println("---------------------------------");

        String sentence ="My favourite programming language is Java";
        boolean hasCSharp = sentence.contains("C#");
        boolean hasJava = sentence.contains("Java");
        boolean hasJava2 = sentence.contains("java");//false
        boolean hasJava3 = sentence.toLowerCase().contains("java");//true
        boolean r3 = sentence.contains("Java") || sentence.contains("java");//true
        System.out.println(hasCSharp);
        System.out.println(hasJava);
        System.out.println(hasJava2);
        System.out.println(hasJava3);
        System.out.println(r3);

        System.out.println("----------------------------------------------");
        String input1="I love Java";
        String input2="Java";

        System.out.println(input1.equals(input2));//false
        System.out.println(input1.equalsIgnoreCase(input2));//false

        System.out.println(input1.contains(input2));//true
        System.out.println(input1.toLowerCase().contains("java"));//true
        System.out.println(input1.toUpperCase().contains("JAVA"));//true

        System.out.println("------------------------------------------------");

        String a= "Wooden Spoon";
        boolean x=a.startsWith("Woo");
        boolean y=a.endsWith("Spoon");
        boolean x1=a.startsWith("wooden");//returns false
        boolean y1=a.toLowerCase().startsWith("wooden");//returns true


        System.out.println(x);//true
        System.out.println(y);//true
        System.out.println(x1);//false
        System.out.println(y1);//true





    }
}
