package Strings_moretask;

import java.util.Arrays;

public class a {


    // adds the given element to array, returns a new array
    public static int[] addElement(int[] array, int element){
        int[] result = new int[array.length + 1];

        int i =0;
        for (int each : array) {
            result[i++] = each;
        }

        result[i] = element;

        return result;
    }

    public static void main(String[] args) {

        int [] arr = {9,5,4};

       arr = addElement(arr,2);

        System.out.println(Arrays.toString(arr));

    }

}