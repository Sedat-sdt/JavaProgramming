package tasks;

import java.util.Scanner;

public class catAndDog {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println();
        String str= input.nextLine();

        int countCat = 0;
        int countDog = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.contains("cat")) {
                countCat++;
                str = str.replaceFirst("cat", "");
            }
            if (str.contains("dog")) {
                countDog++;
                str = str.replaceFirst("dog", "");
            }
        }
        if(countCat==countDog){
            System.out.println("true");
        }else{
            System.out.println("false");
        }



        /*
        ### Use a `loop` to count how many times the characters `cat` and `dog` are found in the given String `str`.
        Output `true` if `cat` and `dog` appear the same number of times, otherwise output `false`
Main topics: loops, primitive datatypes, operators, Scanner, String, if statements

```
Ex:
  Input:
    catdog

  Output:
    true
```
```
Ex:
  Input:
    catcat

  Output:
    false
```
```
Ex:
  Input:
    cat-cheetah-dog-cat

  Output:
    false
```
         */
    }
}
