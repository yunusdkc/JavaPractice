package overloading;

import java.util.Arrays;

public class keep_intro {
  /* 1. 1. create a method that can merge two integer arrays.   merger(int[] arr1, int[] arr2)

    2. create a method that can merge two double arrays.     merge(double[] arr1, double[] arr2)

    3. create a method that can merge two char arrays.      merge(char[] arr1, char[] arr2)

    4. create a method that can merge two String arrays.    merge(String[] arr1, String[] arr2)*/



public static int[] merger(int[] arr1, int[] arr2){

   int  array[] = new int[arr1.length+ arr2.length];

    for (int i = 0; i < arr1.length; i++) {

        array[i]= arr1[i];

    }
    for (int i = arr1.length,j=0; i < array.length ; i++,j++) {
        array[i] =arr2[j];

    }
    System.out.println(Arrays.toString(array));
    return array;

}

    public static double[] merger(double[] arr1, double[] arr2){

        double  array[] = new double[arr1.length+ arr2.length];

        for (int i = 0; i < arr1.length; i++) {

            array[i]= arr1[i];

        }
        for (int i = arr1.length,j=0; i < array.length ; i++,j++) {
            array[i] =arr2[j];

        }
        System.out.println(Arrays.toString(array));
        return array;

    }



    public static String[] merger(String[] arr1, String[] arr2){

        String  array[] = new String[arr1.length+ arr2.length];

        for (int i = 0; i < arr1.length; i++) {

            array[i]= arr1[i];

        }
        for (int i = arr1.length,j=0; i < array.length ; i++,j++) {
            array[i] =arr2[j];

        }
        System.out.println(Arrays.toString(array));
        return array;

    }


    public static void main(String[] args) {
 int [] arr1 ={1,2,3,4};
 int [] arr2= {5,6};
  int  array[]  = merger(arr1,arr2 );
       // System.out.println(Arrays.toString(array));
        double [] arr3 ={1.1,2.9,3.8,4.5};
        double [] arr4 ={1.5,2.2,3.3,4.0};
        merger(arr3,arr4);


        String [] arr5={"cydeo","wooden"};

        String [] arr6={"eating","love"};

    merger(arr5,arr6);

    }



}
