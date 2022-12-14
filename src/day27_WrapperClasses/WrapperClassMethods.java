package day27_WrapperClasses;

public class WrapperClassMethods {
    public static void main(String[] args) {

     String str= "123";

     int num=Integer.parseInt(str);//int

        System.out.println(num+1);//124 because, String was converted to int. so it can be used in math after converting
        System.out.println(str+1);//1231 because it was not converted. So it is still String therefore concatanation is used here, not math.

        String str2="10.5";
        double num2=Double.parseDouble(str2);
        System.out.println(num2+1);//11.5

int max=Integer.MAX_VALUE;
int min=Integer.MIN_VALUE;
        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("------------------------------------------");

        String s2="123";
        Integer x = Integer.valueOf(s2);//Integer
       int y= Integer.valueOf(s2);
        System.out.println(x);//123
        System.out.println(y);//123


    String s= "ab1cde2efg3hi4";
    int sum = 0;

        for (char each : s.toCharArray()) {
            if(Character.isDigit(each)){
                sum+=Integer.parseInt(""+each);
            }
        }

        System.out.println("sum = " + sum);
    }
}
