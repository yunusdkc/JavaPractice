package Strings_moretask;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
 /* Ask user to enter a word. If the work starts with x, print the
word without x.          Input: xcode       Output: code   */


        Scanner input = new Scanner(System.in);
        System.out.println("enter a word");
        String ytd = input.next();
        input.close();

        if(ytd.charAt(0)=='x'){

            ytd = ytd.substring(1);
            System.out.println("ytd = " + ytd);

        }
        else {

            System.out.println("ytd = " + ytd);
        }










    }
}
