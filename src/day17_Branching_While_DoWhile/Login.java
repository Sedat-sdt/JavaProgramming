package day17_Branching_While_DoWhile;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your user name: ");
        String userName=scan.next();
        System.out.println("Enter your password: ");
        String passWord= scan.next();


           if(userName.equals("Cydeo") && passWord.equals("Cydeo123")){
               System.out.println("Logged in.");
           }else {
               int attempt = 3;

               while (!(userName.equals("Cydeo") && (passWord.equals("Cydeo123"))) && attempt>0) {
                    if(attempt==1){
                        System.err.println("THIS IS YOUR LAST CHANCE");
                    }
                   System.out.println("Incorrect username and password, please re-enter");
                   System.out.println("Enter your user name: ");
                   userName = scan.next();
                   System.out.println("Enter your password: ");
                   passWord = scan.next();
                   attempt--;

               }
                       if ((userName.equals("Cydeo")) && (passWord.equals("Cydeo123"))) {
                           System.out.println("Logged in.");

                       }else {
                           System.err.println("Your account is locked.");
                       }

                   }
               scan.close();



/*
You are writing a code for the log-in function of the Cybertek
Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched,
                your program should print "Logged in."
                If the credentials are not matched,
                the program should allow the user
                to have three attempts to enter
                correct credentials and if all three attempts are
                 failed, then print "Your account is locked."
for(int i = 1; i <= 3; i++){

    		if(valid){
    			sout("Loged In")
    			break;
    		}

    		if( i==3){
    			sout(Your account is locked)
    		}

    	}


 */

    }
}
