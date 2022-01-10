package wrapper;

import java.util.Arrays;

public class task4 {
    /*1. Insert Task:
1.1 Create a method named insert that passes three
parameters: integer array, integer index, integer element. the method
inserts the given element to the given index of the array and returns the
new array
Ex:
arr = {10, 20, 30, 40, 50};
insert(arr, 2, 100) ==> {10,
20, 100, 30, 40, 50}*/
    public static int[] insert(int[] arr, int index, int element) {
        arr[index] = element;
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static void main(String[] args) {
        int ytd[] = {10, 20, 30, 40, 50};
        insert(ytd, 2, 100);


    }
}