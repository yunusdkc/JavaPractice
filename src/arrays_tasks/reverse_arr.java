package arrays_tasks;

import java.util.Scanner;

public class reverse_arr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

   String[] ytd = new String[5];

        for (int i = 0; i < ytd.length; i++) {
            System.out.println("enter five words");
            ytd [i]= input.nextLine();
        }
 input.close();

        for (int i = 0; i < ytd.length; i++) {
            String reverse ="";
           String a = ytd[i];
            for (int j = a.length()-1; j >=0; j--) {
               reverse+= a.charAt(j);

            }
            System.out.println("reverse = " + reverse);

        }












    }
}
