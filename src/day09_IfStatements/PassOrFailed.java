package day09_IfStatements;

public class PassOrFailed {
    public static void main(String[] args) {

    int score = 75;

    //boolean passTheExam = score >= 60;

    //if(passTheExam) {
    if(score >= 60){
        System.out.println("Congrats, you passed");
    }
    else {
        System.out.println("Failed");
    }

int a =40;
int b= 30;
if(a>b){

    System.out.println(a+ " is the maximum number");
}else{

    System.out.println(b+ " is the maximum number");
}

        int x =40;
        int y= 30;
        if(x<y){

            System.out.println(x+ " is the minimum number");
        }else{

            System.out.println(y+ " is the minimum number");
        }

   String name = "Muhtar";
   int age =17;

        if(age>18){

            System.out.println(name + " is eligible to buy alcohol");
        }else{

            System.out.println(name + " is NOT eligible to buy alcohol");
        }

   String name1 = "Ali";
   int age1 = 20;
   String citizen = "USA";

   boolean isElligible = age1>=21 && citizen =="USA";

   if(isElligible){

       System.out.println(name1 + " is elligible to vote");
   }else{
       System.out.println(name1 + " is NOT elligible to vote");
   }



    }

}
