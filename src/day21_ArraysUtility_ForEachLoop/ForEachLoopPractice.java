package day21_ArraysUtility_ForEachLoop;

public class ForEachLoopPractice {
    public static void main(String[] args) {

        String[]words={"Java Programming","Cydeo School", "Wooden Spoon", "Early Birds", "Angry Birds"};//write a prog that give first and last ch of every single elements.

        for (String  each : words  ){
            System.out.println(each.charAt(0)+""+ each.charAt(each.length()-1));
        }





    }
}
