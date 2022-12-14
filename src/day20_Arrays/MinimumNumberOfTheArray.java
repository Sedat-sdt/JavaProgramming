package day20_Arrays;

public class MinimumNumberOfTheArray {
    public static void main(String[] args) {
        
      int[] numbers = {100,500,30,40,600,80,90};
      
      int minimum=numbers[0];//100

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]<minimum){//if there is an element in the array that's smaller
                minimum=numbers[i];// smaller number will be assigned to the variable min

            }
        }
        System.out.println(minimum);
        
        
        
        
        
        
    }
}
