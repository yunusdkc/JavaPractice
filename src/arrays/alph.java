package arrays;

import java.util.Arrays;

public class alph {
    public static void main(String[] args) {

        char [] letter = new char [26];

   // char ch = 'a';   *** this is another way instead of j
        for (char i = 0, j= 'z' ; i < letter.length; i++, j--) {

           // char ch= j;
            letter [i] =  j; // j zaten char yukarida taminlamistin.


        }


        System.out.println(Arrays.toString(letter)+" ");
        System.out.println(letter); // ?








    }
}
