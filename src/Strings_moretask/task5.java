package Strings_moretask;

import java.util.Scanner;

public class task5 {

    public static void main(String[] args) {
        /*   5. Write a method that asks user to enter a string.
if the string is empty, print: string is empty
if the string has more than 3 characters, print the last three
characters
if the string has less than or equal 3 characters, print the
string itself  */
        Scanner input = new Scanner(System.in);
        System.out.println("enter:");
        String ytd = input.nextLine();
        input.close();
        boolean a = ytd.isEmpty();
        if (a) {
            System.out.println("string is empty");

        } else if (ytd.length() > 3) {
            String last3 = ytd.substring(ytd.lastIndexOf("") - 2, ytd.lastIndexOf(""));
            System.out.println("last3 = " + last3);
        } else {
            System.out.println("ytd = " + ytd);

        }


    }
}
