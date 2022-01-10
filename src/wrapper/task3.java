package wrapper;

import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {
        /*3. Write a program that can retrieve the letters, digits and special
characters from the string
Ex:
str = "Wooden Spoon!"
output:
letters= "WoodenSpoon";
Digits = "";
specialChars = " !";
*/

        String str = "Wooden* *954Spoon!";

        String digit ="";
        String letter = "";
        String special = "";


        char [] chr = str.toCharArray();
        System.out.println(Arrays.toString(chr));

        for (char each : chr) {
           if( Character.isDigit(each)){
               digit+=each;

           }
           else if(Character.isLetter(each)){
               letter+=each;
           }
            else {
                special+=each;
           }


        }

        System.out.println("special = " + special);
        System.out.println("letter = " + letter);
        System.out.println("digit = " + digit);

    }
}
