package day21_ArraysUtility_ForEachLoop;

public class Initials {
    public static void main(String[] args) {

        String[] classmates = {"Mert Güney","Ali Güneş","Veli Altın","Okan Sert","Mert Güney",
                "Mehmet Türk","Mert Güney","Mert Güney","Mert Güney","Mert Güney"};


        for (String eachClassmate : classmates) {
            String initial= eachClassmate.charAt(0)+"."+eachClassmate.charAt(  eachClassmate.indexOf(" ")+1  );
            System.out.println(initial);
        }









    }
}
