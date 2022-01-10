package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class task {
    public static void main(String[] args) {
   /*write a program that can set the last element of the Integer arraylist  to zero
          list = [1,2,3,4,5];    output: [1,2,3,4,0];*/

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("list = " + list);

        list.set(4, 0); //
        System.out.println("list = " + list);

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        /*write a program that can swap the first and last elements of an  integer arraylist*/
        Collections.swap(list2, 0, 4);    //  when we enter the index numbers which we wanted to swap the numbers
        System.out.println("list2 = " + list2);

        // write a program that can multiply each odd number by 2
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int count = 0;
        for (Integer number : list3) {

            if (number % 2 != 0) {
                list3.set(count, number * 2);
            }
            count++;

        }
        System.out.println("list3 = " + list3);
        //Write a program that can find the maximum number from an ArrayList of integers
        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(1, 2, 3, 6, 5));
      /*  int max = -2020200;
        for (Integer num : list4) {
            if(num>max){
               max=  num;
            }
        }
        System.out.println("max = " + max);
    */
        Collections.sort(list4);
        int max = list4.get(list.size() - 1);
        System.out.println("max = " + max);

   /*Write a program that can return the first duplicated element from an  arrayList of Integer
list = [1,2,2,3,4,4,5,6,7,7];   output:  2 */

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5, 6, 7, 7));

        for (Integer number : numbers) {
            int frequency=0;
            for (Integer each : numbers) {

                if(number==each){
                    frequency++;
                }
            }
            if(frequency>1){
                System.out.println(number);
                break;
            }
        }
        String [] arr1 = {"A", "B", "C"};
        String [] arr2 = {"D", "E", "F", "G"};
        ArrayList<String> merge = new ArrayList<>();
        merge.addAll(Arrays.asList(arr1));
        merge.addAll(Arrays.asList(arr2));
        System.out.println("merge = " + merge);

    }
}
