package day21_ArraysUtility_ForEachLoop;

public class ReverseNames {
    public static void main(String[] args) {

        String[] classmates = {"Mert Güney","Ali Güneş","Veli Altın","Okan Sert","Mert Güney",
                "Mehmet Türk","Mert Güney","Mert Güney","Mert Güney","Mert Güney"};

        for (String each : classmates) {//each : every single names
            
        String reversed="";

            for (int i = each.length()-1; i >=0 ; i--) {
                reversed+=each.charAt(i);
            }

            System.out.println(reversed);
        }












    }
}
