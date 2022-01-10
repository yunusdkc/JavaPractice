package forTtask;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
 /* 2. Write a program that can remove the duplicated characters from a String
input:  AABBCCBC  Output:  ABC */


        Scanner input = new Scanner(System.in);
        String ytd = input.nextLine();
        input.close();
        int num = ytd.length();
        String result = "";
        for (int i =0; i< num; i++ ){
           String a = "" + ytd.charAt(i);


           if(!result.contains(a))

               result+=a;


        }

        System.out.println("result = " + result);









    }
}
