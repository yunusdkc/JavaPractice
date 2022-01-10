package Strings_moretask;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        /* 5. Ask user to enter a word,
if the word starts with digits, print "first character is digit"
if the word starts with uppercase letters, print "first character
is lowercase letter"
if the word starts with lowercase letters, print "first character
is uppercase letter"
if the word starts with special characters, print "first character
is special character" */

        Scanner input = new Scanner(System.in);

        String ytd = input.next();
        input.close();


        char first = ytd.charAt(0);



        boolean a = first >='0' && first<='9';
        boolean b = first >='a'  && first<='z';
        boolean c = first >='A'  && first<='Z';

        if (a){
            System.out.println("first character is digit");
        }
      else if(b){
            System.out.println(ytd.toUpperCase().charAt(0)+ "  first character is  ");
        }
      else if (c){
            System.out.println(ytd.toLowerCase().charAt(0)+ "  first character is");
        }
else {
            System.out.println("special character");
        }










    }
}
