package day09_IfStatements;

public class GradeReport {
    public static void main(String[] args) {
/* QUIZ Question that ı failed

int ivar = 100;
double dvar = 123;
        float fvar = 200;
        ivar=fvar;
        fvar=ivar;
        dvar=fvar;
        fvar=dvar;
        dvar= ivar;
        ivar= dvar;
        */

    int score = 65;

    String grade;

    if(score>=90 && score <= 100){
        grade ="A";
    }else if(score>=80 && score <= 89){
        grade="B";
    } else if (score >= 70 && score <=79) {
        grade="C";
    } else if (score >= 60 && score <=69) {
        grade="D";
    }else{
        grade="F";

    }
        System.out.println("grade = " + grade);



    }

}
//garde report ==> A, B, C, D, F