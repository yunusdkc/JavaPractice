package utility;

import java.util.Arrays;

public class String_utility {

    public static void initial(String ytd){


        char first= ytd.toUpperCase().charAt(0);
        char last= ytd.toUpperCase().charAt(ytd.indexOf(" ")+1);

        System.out.println(first + "." + last);






    }
    public static void separate_digit_char (String ytd) {

        int num = ytd.length();
        String digit = "";
        String letter = "";
        String special = "";
        for (int i = 0; num > i; i++) {
            char ch;
            ch = ytd.charAt(i);
            if (ch >= '0' && ch <= '9') {
                digit += ch;

            } else if (ch >= 'a' && ch <= 'z') {
                letter += ch;
            } else if (ch >= 'A' && ch <= 'Z') {
                letter += ch;
            } else {
                special += ch;
            }
        }
        System.out.println("special = " + special);
        System.out.println("letter = " + letter);
        System.out.println("digit = " + digit);


    }
    public static void anagram ( String str1, String str2){



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
    public static void printEachChar(String str){

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

    }
    public static String reverse(String str){
        String result = "";

        for (int i = str.length()-1; i >= 0 ; i--) {
            result += str.charAt(i);
        }

        return result;
    }
    public static boolean isPalindrome(String str){
        return reverse(str).equalsIgnoreCase(str);
    }
    public static String removeDuplicates(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (!result.contains("" + each)) {
                result += each;
            }

        }

        return result;
    }
}
