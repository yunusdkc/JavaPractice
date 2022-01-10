package Strings_moretask;
import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
  /* 4. Ask user to enter two words. Then add them together and print.
But if the last letter if the first word and the first letter of the last letter is the same, print that character once.
Input: one eight     Output: oneight */

        Scanner input = new Scanner(System.in);
        System.out.println("enter your first word: ");
        String word1= input.next();
        System.out.println("enter your second word");
        String word2 = input.next();
        input.close();

      boolean a = word1.charAt(word1.length()-1) == word2.charAt(0);
     if (a){
         word2 = word2.substring(1);
         System.out.println(word1+word2);

     }
else {
         System.out.println(word1+word2);
     }










    }
}
