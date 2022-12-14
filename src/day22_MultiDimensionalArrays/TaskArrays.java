package day22_MultiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class TaskArrays {
    public static void main(String[] args) {
        int[] elements= {34,59,19};
        for (int element : elements) {
            if(element==34)
            System.out.println("First Element: "+element);
            if(element==59)
                System.out.println("Middle Element: "+element);
            if(element==19)
                System.out.println("Last Element: "+element);
        }
        /* ### Create an `int []` that has the values of `34, 59, 19` and print each element on a new line with the following format:

```
First element: $first element
Middle element: $middle element
Last element: $last element
```

Main topics: arrays, primitive datatypes, concatenation, index

Example Flow:
```
First element: 34
Middle element: 59
Last element: 19
```
        */
        System.out.println("----------------------------------------------------------");

    int [] nums={10, 14, -93, 140, -20};

        System.out.println(Arrays.toString(nums));

/*
### Print the given `int []` `nums` to output all of the elements in one line.

#### Note: Think about how you must print out a whole array

Main topics: arrays, primitive datatypes, concatenation

Example Flow:
```
[10, 14, -93, 140, -20]
```
 */
        System.out.println("---------------------------------------------");
        Scanner scan = new Scanner(System.in);
        int[] nums1 = new int[6];
        for(int i =0; i < 3; i++) {
            nums1[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(nums1));
        /*
### Given an `int []` `nums` create a new array that is an expanding version of `nums`.
The new array will hold double the elements,
and the original elements from `nums` should be stored at the beginning of the new array.
You can assume the size of `nums` will be 3.

#### Note: The loop used in the given code is to dynamically create the int array.
You don't need to fully understand this part yet, focus only on having access to an array and has some numbers.

Main topics: arrays, primitive datatypes, concatenation, index, operators
Example:
```Input:
  [4, 5, 6]
Output:
  [4, 5, 6, 0, 0, 0]
```Example:
```Input:
  [3, 100, 140]
Output:
  [3, 100, 140, 0, 0, 0]
```
 */
        System.out.println("-----------------------------------------------");

        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };
double result=0;
int count=0;
        for (double temp : temps) {
            result+=temp;
            count++;
        }
        System.out.println(result/count);
/*
### Given a `double []` `temps` that has the temperature values from the previous couple day,
find and print the average temperature
#### Note: The loop used in the given code is to dynamically create the double array.
You don't need to fully understand this part yet, focus only on having access to an array and has some numbers.
Main topics: arrays, primitive datatypes, concatenation, index, operators, loops
Example:
```Input:
  [80, 88, 88, 84, 82, 78, 60, 68]
Output:78.5
```
 */
        System.out.println("---------------------------------------------------------------");
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        for (String word : words) {
            System.out.println(""+word.charAt(0)+word.charAt(word.length()-1));
            }
        /*
### Given a `String []` `words` print the first and last character of each String element in the array.
Print the first and last character in the same line with no spaces.

#### Note: The loop used in the given code is to dynamically create the String array.
You don't need to fully understand this part yet, focus only on having access to an array.

Main topics: arrays, primitive datatypes, concatenation, index, operators, loops, String

Example:
```
Input:
  ["hello", "why", "by", "apple" , "note"]

Output:
  ho
  wy
  by
  ae
  ne
```
        */





    }
}
