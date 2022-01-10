package whileloop;

import java.util.Scanner;

public class loop_practice {
    public static void main(String[] args) {
  /*  Write a program that asks user to enter number for 5 times, and print
how many positive and negative numbers user entered
Inputs:10 20 -1 0 3
Output:  3 positive and 1 negative */

int negative =0;
int positive =0;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i <5 ; i++) {
            System.out.println("enter your number");
           int num= scan.nextInt();
            if (num<0){
                negative++;
            }
            if(num>0){
                positive++;
            }


        }


        System.out.println("positive = " + positive);
        System.out.println("negative = " + negative);



    }
}
