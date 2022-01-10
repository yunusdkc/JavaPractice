package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class max_num {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int [] nums= new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("enter 10 number");
         nums[i]=  input.nextInt();


        }
   input.close();

    //    int nums [] = {5,8,4,5,6,22,5,7,0,3};

        System.out.println(Arrays.toString(nums));

       int max = 5;
       int min = 5;
        for (int i = 0; i < nums.length; i++) {
           if (max<nums[i]){
               max=nums[i];
           }
        if(min> nums[i]){
            min=nums[i];
        }

        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
double sum= 0;
        for (int i = 0; i < nums.length; i++) {

          sum+=  nums[i];

        }
        double avarage = sum/nums.length;

        System.out.println("sum = " + sum);
        System.out.println("avarage = " + avarage);
    }
}
