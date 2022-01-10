package arrays;

import java.util.Arrays;

public class array_methods {
    public static void main(String[] args) {

        String[] word1 = {"yunus","taha","dikici","ytd","Taha","ali"};

        System.out.println(Arrays.toString(word1));

        Arrays.sort(word1);

        System.out.println(Arrays.toString(word1));
      String[]copy = Arrays.copyOf(word1,3);

        System.out.println(Arrays.toString(word1));
        System.out.println(Arrays.toString(copy));
       String[] copy2 = Arrays.copyOfRange(word1,2,4     );
        System.out.println(Arrays.toString(copy2));
        String a = "abfgytrdytd";
       char [] ar = a.toCharArray();
        System.out.println(a);


        System.out.println(Arrays.toString(ar));
   char [] x = Arrays.copyOfRange(ar,4,9);
        System.out.println(Arrays.toString(x));

    }
}
