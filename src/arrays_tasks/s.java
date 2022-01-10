package arrays_tasks;

import java.util.Arrays;

public class s {
    public static void main(String[] args) {

        /*Write a program that can reverse an array of integers and
returns it as new array
ex:
array = {1,2,3,4,5};
output:
reversedArray = {5,4,3,2,1};*/

        String[] array = {"I", "love", "Cydeo", "School"};
        String[] reverse = new String[4];


    /*    for (String each : array) {
            String a = "";
            for (int i = each.length()-1; i >= 0; i--) {

              a +=  each.charAt(i);



            }
            System.out.println("a = " + a);

        }*/

        for (int i = array.length - 1; i >= 0; i--) {
            String a = "";
            for (int j = array[i].length() - 1; j >= 0; j--) {

                a += array[i].charAt(j);


            }
            System.out.println("a = " + a);
            array[i] = a;

        }


        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {

            reverse[j] = array[i];

        }


        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(reverse));


    }
}
