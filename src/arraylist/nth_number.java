package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collections;

public class nth_number {
    public static void main(String[] args) {
Integer [] arr = {1,2,3,4,5,6,7,7,7,7,8,9};
        ArrayList<Integer> numbers= new ArrayList<>(Arrays.asList(arr));



int n = 3;
        for (Integer number : numbers) {
            int count= 0;
            for (Integer each : numbers) {
                if (number < each) {
                    count++;
                }
            }
          if (count==n-1){
              System.out.println(number) ;

          }

            }


        }



    }

