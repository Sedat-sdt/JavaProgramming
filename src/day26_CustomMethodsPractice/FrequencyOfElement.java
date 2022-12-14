package day26_CustomMethodsPractice;

public class FrequencyOfElement {
    public static void main(String[] args) {

      int[] numbers={1,1,1,2,3,4,5};
      int freq = frequencyOfElement(numbers,1);
        System.out.println(freq);

        System.out.println("-------------------------------------");

        double[] numbers1={1.1,1.1,1.1,2.1,3.1,4.1,5.1};
        int freq1=frequencyOfElement(numbers1,1.1);
        System.out.println(freq1);

        System.out.println("-----------------------------------------");

        char[] chars={'A','B','C','D','A','B','B'};
        int frequency= frequencyOfElement(chars,'B');
        System.out.println("frequency = " + frequency);

        System.out.println("--------------------------------------");

        String[] str= {"1","2","3","3","4","5","5"};
        int frequencyStr=frequencyOfElement(str,"2");
        System.out.println("frequencyStr = " + frequencyStr);

    }

    // returns the frequency of the given element from the given array
    //                                     [1,1,1,2,3,3,4,5]      1
    public static int frequencyOfElement(int[] array, int element){
        int count=0;
        for (int each : array) {
            if( each==element)
                count++;
        }
        return count;
    }
    // returns the frequency of the given element from the given array
    public static int frequencyOfElement(double[] array, double element){
        int count=0;
        for (double each : array) {
            if( each==element)
                count++;
        }
        return count;
    }
    // returns the frequency of the given element from the given array
    public static int frequencyOfElement(char[] array, char element){
        int count=0;
        for (char each : array) {
            if( each==element)
                count++;
        }
        return count;
    }
    // returns the frequency of the given element from the given array
    public static int frequencyOfElement(String[] array, String element){
        int count=0;
        for (String each : array) {
            if( each.equals(element))
                count++;
        }
        return count;
    }











}
/*
1. Create a class named FrequencyOfElement:
			1.1 Create a method that passes two parameters: an integer array and an Integer element.
			The method returns the frequency of the given integer element from the integer array

			1.2 Create a method that passes two parameters: a double array and a double element.
			The method returns the frequency of the given integer from the array

			1.3 Create a method that passes two parameters: a char array and a char element.
			The method returns the frequency of the given char element from the char array

			1.4 Create a method that passes two parameters: a String array and a String element.
			The method returns the frequency of the given String element from the String array
 */