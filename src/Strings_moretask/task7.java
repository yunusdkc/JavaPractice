package Strings_moretask;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args){
 /* 2. ask the user to enter a word. if the word ends with "ly", print  "really???" ,  otherwise, print "never mind" */


        Scanner input = new Scanner(System.in);
        System.out.println("enter a word");
        String word = input.next();
input.close();

        if(word.charAt(word.length()-1) == 'y' && word.charAt(word.length()-2) == 'l'){

            System.out.println("really???");


        }
else{
            System.out.println("never mind");
        }









    }
}
