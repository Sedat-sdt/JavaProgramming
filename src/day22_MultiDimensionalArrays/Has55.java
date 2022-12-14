package day22_MultiDimensionalArrays;

import java.util.Scanner;

public class Has55 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        String result = "";
        for (int i = 1; i <= nums.length - 2; i++) { // or you may write i<nums.length-1
            if (nums[i] == 5) {
                if (nums[i + 1] == nums[i] || nums[i - 1] == nums[i]) {
                    result = "true";
                    break;
                }
            } else {
                result = "false";
            }

        }
        System.out.println(result);





        /*String ans="";

        for (int i = 1; i < nums.length-2; i++) {
            if (nums[i] == 5) {

                if (((nums[i] == nums[i + 1]) || (nums[i] == nums[i - 1])) && nums[i] == 5) {
                    ans = "true";

                }
                if (!((nums[i] == nums[i + 1]) || (nums[i] == nums[i - 1])) && nums[i] == 5) {
                    ans = "false" + "\n" + "The 5s are not next to each other";

                }
            }else {
                ans = "False" + "\n" + "There is no 5 in this array";
            }
        }
        System.out.println(ans);*/

        /*
        ### Given an `int []` `nums`, print `true` if the array has a `5` that is also next to another `5`.
        Both conditions need to be met otherwise print `false`

#### Note: The loop used in the given code is to dynamically create the int array.
You don't need to fully understand this part yet,
focus only on having access to an array and has some numbers.

Main topics: arrays, primitive datatypes, concatenation, index, operators. loops, if statement

Example:
```
Input:
  [1, 5, 5, 1, 1]

Output:
  true
```
Example:
```
Input:
  [1, 5, 4, 1, 5]

Output:
  false

-> The 5s are not next to each other
```
Example:
```
Input:
  [1, 4, 4, 1, 99]

Output:
  false

-> There is no 5 in this array
```
         */
    }
}
