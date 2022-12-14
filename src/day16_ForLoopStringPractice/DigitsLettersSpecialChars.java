package day16_ForLoopStringPractice;

public class DigitsLettersSpecialChars {
    public static void main(String[] args) {
    String str = "Cydeo12345School!@#$%WoodenSpoon";

        String digits="";//12345
        String letters = "";//CydeoWoodenSpoon
        String specialCharacters="";//!@#$%

        for (int i = 0; i < str.length(); i++) {//index numbers ofstr
            char ch = str.charAt(i);//ch: each characters that we have in str
            boolean isLetter= ch>='a' && ch<='z' || ch>='A' && ch<='Z';
            boolean isDigit= ch>='0' && ch<='9';
            boolean isSpecialCharacter=!isDigit && !isLetter;
            if(isDigit){
                digits += ch;
            } else if (isLetter) {
                letters += ch;
            }else {
                specialCharacters+= ch;
            }
        }
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialCharacters = " + specialCharacters);



    }
}


