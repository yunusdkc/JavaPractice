package Strings_class;

import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {

/* write a program that asks user to enter two strings, and print out the longest string    */


        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        System.out.println("enter fist one");
      String result1 =  input1.nextLine();
        System.out.println("enter second one");
        String result2=  input2.nextLine();
     input1.close();
     input2.close();


        if (result1.length()> result2.length()){

            System.out.println("result1 = " + result1);

        }

        else if (result2.length()>result1.length()){

            System.out.println("result2 = " + result2);
        }
     else{
            System.out.println("equal");
        }













    }







}
