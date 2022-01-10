package overloading;

import java.util.Arrays;

public class s {
    public static int[] remove(int index, int[] arr) {

        int result[] = new int[arr.length-1];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[index] == arr[i]) {
                continue;
            }
            result[j] = arr[i];
            j++;


        }


        return result;
    }


    public static void main(String[] args) {
       int[] arr={1,2,3,5};
     arr    = remove(2,arr);

        System.out.println(Arrays.toString(arr));


    }
}