package arrays;

import java.util.Arrays;

public class ARRAY1 {
    public static void main(String[] args) {

        int [] num = new int [5];

        for (int i = 0; i < num.length ; i++) {

            num[i]=i;

        }

        System.out.println(Arrays.toString(num));

        System.out.println("-----------------------------------");

        char [] alph = new char[26];

        for (char i = 0, j='A'; i < alph.length; i++,j++) {

            alph[i]=j;

        }
        System.out.println(Arrays.toString(alph));
        System.out.println(alph[2]);
    }
}
