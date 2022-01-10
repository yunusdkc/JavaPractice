package Strings_moretask;

import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
/*  8. Create a class calledEmailTask1.
Assume that email address is constructed by person's first name and
followed by an underscore and last name.
Write a program that can swap first name with last name in the
email (Seperated by an underscore).
If the email doesn't contain an underscore print the given input
email.
Ex:
input: mike_tyson@gmail.com
output: tyson_mike@gmail.com    */
        Scanner input = new Scanner(System.in);
        System.out.println("enter your email");
        String email = input.nextLine();
        input.close();

       if (email.contains("_")) {
           String last = email.substring(email.indexOf("_")+1, email.lastIndexOf("@"));
           String first = email.substring(0, email.indexOf("_"));
           System.out.println(last+ "_"+first+ "@gmail.com");


       }
else{

           System.out.println("email = " + email);
       }














    }
}
