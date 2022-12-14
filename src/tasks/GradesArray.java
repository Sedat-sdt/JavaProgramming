package tasks;

public class GradesArray {
    public static void main(String[] args) {
        String [] names = {"Anna", "Nancy", "Sarah"};
        int [] scores = {90, 75, 80};
        char [] grades = new char[names.length];
        String resultGrades="";

        for (int i = 0; i < scores.length; i++) {
            if(scores[i]>=90){
                grades[i]='A';
            }else if(scores[i]>=80){
                grades[i]='B';
            }else if(scores[i]>=70){
                grades[i]='C';
            }else if(scores[i]>=60){
                grades[i]='D';
            }else{
                grades[i]='F';
            }
        }
        for (int i = 0; i < names.length; i++) {
            resultGrades+=names[i]+"'s score is "+scores[i]+", and grade is "+grades[i]+"\n";
        }
        System.out.println(resultGrades);
        /* Returns:
Anna's score is 90, and grade is A
Nancy's score is 75, and grade is C
Sarah's score is 80, and grade is B
 */
        /*given the following arrays:
		     	String [] names = {"Anna", "Nancy", "Sarah"};
		        int [] scores = {90, 75, 80};
		        char [] grades = new char[names.length];

         1. write a program that can store the grades of the students in the array named grades
         2. print the grade report of each students in separate lines
         		Ex:
         			Anna's score is 90, and grade is A*/
    }
}
