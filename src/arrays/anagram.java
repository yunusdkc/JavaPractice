package arrays;

import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {

        String str1 = "acdb";
        String str2 = "dbca";

        //write a program that can check if str1 & str2 are build out same characters

      char a [] = str1.toCharArray();
      char b []  = str2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

     boolean result =  Arrays.equals(a,b);

        System.out.println("result = " + result);


    }
}
