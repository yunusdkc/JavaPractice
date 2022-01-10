package Strings_moretask;

import java.util.Scanner;

/* 1. Create a class called Reverse, write a program that will reverse a
string.
Your program should reverse a string only 5 characters long.
If word is shorter, display message: "Too short!".
If word is longer, display message: "Too long!".
Otherwise, reverse this word and print out result into the console. */
public class task6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter 5 character word");

        String ytd = input.nextLine();
        input.close();

        if (ytd.length() == 5) {
            String str = "";
            str += ytd.charAt(4);
            str += ytd.charAt(3);
            str += ytd.charAt(2);
            str += ytd.charAt(1);
            str += ytd.charAt(0);
            System.out.println("str = " + str);
        } else if (ytd.length() > 5) {
            System.out.println("too long");
        } else {
            System.out.println("too short ");
        }

    }
}
