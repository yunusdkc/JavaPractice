package overloading;

import java.util.Arrays;

public class reverseArray {
    /*Task 6:
    1. Create a method that can reverse an integer array

    2. Create a method that can reverse a double array

    3. Create a method that can reverse a char array

    4. Create a method that can reverse a String array*/

   public static int [] reverse(int [] arr1){

   int [] reversed =new int[arr1.length];

       for (int i = arr1.length - 1,j=0; i >= 0; i--,j++) {

          reversed[j]=arr1[i];


       }

       System.out.println(Arrays.toString(reversed));

return reversed;
   }

    public static char [] reverse(char [] arr1){

        char [] reversed =new char[arr1.length];

        for (int i = arr1.length - 1,j=0; i >= 0; i--,j++) {

            reversed[j]=arr1[i];


        }

        System.out.println(Arrays.toString(reversed));

        return reversed;
    }




    public static void main(String[] args) {

   int [] array = {1,2,3,4,5,6,7,8,9};

 reverse(array);

 char[] array2 ={'f','i','l','e'};
   Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));

 reverse(array2);

 char [] ytd ={'d','t','y'};


    }


}
