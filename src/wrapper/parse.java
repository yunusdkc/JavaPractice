package wrapper;

import java.util.Arrays;

public class parse {
    public static void main(String[] args) {
        int num;
        String word = "123";

//       num= Integer.parseInt(word);
    //   num++;
        num= Integer.valueOf(word);
        Integer x = Integer.parseInt(word);
        System.out.println("x = " + x);
        System.out.println(num+1);
       System.out.println("num = " + num);
     String [] Arr = word.split("");

       System.out.println(Arrays.toString(Arr));
        System.out.println("-------------------------------------------------------");

        String ytd = "trUe";
        boolean a = Boolean.parseBoolean(ytd);

        System.out.println("a = " + a);


   char chr = 'a';
  boolean digit = Character.isDigit(chr);


        System.out.println("digit = " + digit);


    }
}
