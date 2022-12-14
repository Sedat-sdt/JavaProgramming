package day29_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {
  /*
  arraylist of employees
  remove all except Ahmet and David
   */

        ArrayList<String> employees= new ArrayList<>();

        employees.addAll(Arrays.asList("Sedat","David","Ahmet","Şule","Doruk","Sude"));

        employees.retainAll(Arrays.asList("Ahmet","David"));

        System.out.println("employees = " + employees);    //employees = [David, Ahmet]


        System.out.println("-------------------------------------------------------");

        //remove all names starts with M
        String[] names={"Mary","Monica","Musti","Sumeyra","Hasan","Beril"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(names));

        list.removeIf(each -> each.startsWith("M"));
        //list.removeIf(each -> each.charAt(0) == 'M');

        System.out.println(list);   //[Sumeyra, Hasan, Beril]

        names=list.toArray(new String[0]);

        System.out.println(Arrays.toString(names));   //[Sumeyra, Hasan, Beril]



















    }
}
