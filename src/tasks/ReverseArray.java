package tasks;

public class ReverseArray {
    public static void main(String[] args) {

        String[] classmates = {"Mert Güney", "Ali Güneş", "Veli Altın", "Okan Sert", "Mert Güney",
                "Mehmet Türk", "Kenan Parlak", "Mert Güney", "Ahmet Temiz", "Mert Güney"};

    /*    for (int j = 0; j < classmates.length; j++) {
            String reverse="";
            for (int i =classmates[j].length()-1 ; i >= 0 ; i--) {
                reverse+=classmates[j].charAt(i);
            }
            System.out.println(reverse+"\n");*/


        for (int i = 0; i < classmates.length; i++) {
            for (int j = classmates[i].length()-1; j >= 0; j--) {
                String reverse = "";
                reverse += classmates[i].charAt(j);
                    System.out.print(reverse);

                }
            System.out.println();
            }

        }

    }

        /*create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c         */
