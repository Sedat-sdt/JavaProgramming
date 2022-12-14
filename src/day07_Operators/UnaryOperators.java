package day07_Operators;

public class UnaryOperators {

    public static void main(String[] args) {

    int num1 = +25;// give + is optional, not required
    int num2 = -25;// give - is mandatory

int a = 5;
++a;
        System.out.println(a);  //6 increase the value immediately

        --a;
        System.out.println(a);  //5 decrease the value immediately


        int b= 100;
        System.out.println(++b);//increase the value immediately

        int c = 100;
        System.out.println(c++);//post inc  100 ıt postpone the increasing
        System.out.println(c);//101


        int x= 200;
        System.out.println(--x);//  199 decrease the value immediately

        int y= 200;
        System.out.println(y--);//   200 post dec., ıt postpone the decreasing. first passes the current value, then decreases the value by 1
        System.out.println(y);// 199

        int z= 45;
        System.out.println(++z); //46, z= 46
        System.out.println(z++); //46, z=47
        System.out.println(z);// 47, z=47


    }
}
