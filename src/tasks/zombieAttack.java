package tasks;

import java.util.Scanner;

public class zombieAttack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter population:");
        int population = scan.nextInt();
        int inhabitants= population/2;
        String result=""+population;
        int day =0;
       /* int day=0;
        for (int j = 1; j <inhabitants ; j++) {
            day+=j;

        }*/
        /*for (int i = population; i >0 ; i--) {
            population-=inhabitants;
            day++;
            result+="\n"+population;

            if(population==0){
                break;
            }
            System.out.println(result);


        }*/

        while(population>0){
            population-=inhabitants;
            day++;
            result+="\n"+population;
            if(population==0){
                break;
            }
            System.out.println(day+result);

        }
    /*
### There is a zombie disease pandemic wiping out populations.
Use a `loop` to keep track of the city's population.
The starting population is given as the `inhabitants` value.
Each day the city is losing half of its population.
Write the program that will show the population day by day,
until the city gets to zero.

#### Note: Case sensitivity should be considered.
We are looking for the lowercase character versions of both Strings

Main topics: loops, primitive datatypes, operators, Scanner, concatenation

```
Ex:
  Input:
    6

  Output:
    Day 0 [6]
    Day 1 [3]
    Day 2 [1]
    ---- EXTINCT ----
```
```
Ex:
  Input:
    20

  Output:
    Day 0 [20]
    Day 1 [10]
    Day 2 [5]
    Day 3 [2]
    Day 4 [1]
    ---- EXTINCT ----
```

    */

    }
}
