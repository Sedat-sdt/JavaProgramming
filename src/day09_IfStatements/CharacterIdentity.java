package day09_IfStatements;

public class CharacterIdentity {

    public static void main(String[] args) {

        char Ch ='@';

        /*if (Ch>=48 && Ch<=57) {
            System.out.println("Digit");
        }else if ((Ch>=65 && Ch<=90) || (Ch>=97 && Ch<=122) ) {
            System.out.println("Alphabetic Character");
        }else {
            System.out.println("Special Character");
        }*/
        System.out.println("--------------------------");
        if (Ch>='0' && Ch<='9') {
            System.out.println("Digit");
        }else if ((Ch>='A' && Ch<='Z') || (Ch>='a' && Ch<='z') ) {
            System.out.println("Alphabetic Character");
        }else {
            System.out.println("Special Character");

        }
        
     /*
      Create a class called Character Identity, and write a program that can identify if the given
      character is a digit or Alphabetic Character(A~Z or a~Z) or a special character

      		Ex:
      			ch = '@'
        output:
       Special Character

    HINT:     You may      wanna check       out the     numbers of         the chracters       on ASCII
    table */
    }
}