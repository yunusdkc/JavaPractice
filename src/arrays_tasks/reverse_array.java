package arrays_tasks;

import java.util.Arrays;

public class reverse_array {
    /*
	5. Write a program that can reverse an array of integers and returns it as new array
      ex: array = {1,2,3,4,5};
       output: reversedArray = {5,4,3,2,1};
*/
    public static void main(String[] args) {

        int [] numbers = {1,2,3,4,5};
        int [] reverse = new int[5];

        for (int i = 0, j =4; i < numbers.length; i++,j--) {
            reverse[i]=numbers[j];


        }

        System.out.println(Arrays.toString(reverse));






    }

}
