package day14_String;

public class EmailDomainSubstring {

    public static void main(String[] args) {

      String email =  "Cydeo.School@gmail.com";

     String domain = email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
        System.out.println("domain = " + domain);

/*

Write a program that can gte the domain of the email.
( Assume that a valid email is given)

		Ex:
			email = Cydeo.School@gmail.com

		output:
			gmail


			email = "School.Cydeo@yahoo.com

		output:
			yahoo
 */
    }
}
