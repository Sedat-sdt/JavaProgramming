package day17_Branching_While_DoWhile;

public class RemoveDublicates {

    public static void main(String[] args) {

     String str ="AABBCC";
     String result=""; //ABC

        for (int i = 0; i < str.length(); i++) {
            //String ch = ""+str.charAt(i);
            char ch = str.charAt(i);         //both of them can be used
            //if(result.contains(ch)){
            if(result.contains(""+ch)){
                continue;
            }
            result+=ch;
        }
        System.out.println(result);



    }
}
