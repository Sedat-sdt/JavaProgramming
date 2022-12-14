package tasks;

public class ClassmatesArray {
    public static void main(String[] args) {

     /* String[] classmates = {"Mert Güney","Ali Güneş","Veli Altın","Okan Sert","Mert Güney",
                             "Mehmet Türk","Mert Güney","Mert Güney","Mert Güney","Mert Güney"};
      String initial="";
      String result="";
        for (int i = 0; i < classmates.length; i++) {
         initial= classmates[i].toUpperCase().substring(0,1)
                 +classmates[i].toUpperCase().substring(classmates[i].indexOf(" ")+1,classmates[i].indexOf(" ")+2);
         result+=initial+"\n";
        }
        System.out.println(result);*/
        String[] classmates = {"Mert Güney","Ali Güneş","Veli Altın","Okan Sert","Mert Güney",
                "Mehmet Türk","Mert Güney","Mert Güney","Mert Güney","Mert Güney"};

        String initials="";

        for (int i = 0; i < classmates.length; i++) {
            initials= classmates[i].charAt(0)+"."+classmates[i].charAt(classmates[i].indexOf(" ")+1);
            System.out.println(initials);
        }

        /*
        create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines
         */
    }
}
