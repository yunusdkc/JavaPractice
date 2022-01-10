package Strings_class;

import java.util.Scanner;

public class string_task {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("write a sentence");
      String sentence = input.nextLine();
input.close();
       char first= sentence.charAt(0);
        char last = sentence.charAt(sentence.length()-1);
        System.out.println("first = " + first);
        System.out.println("last = " + last);
       String rst = sentence.substring(sentence.lastIndexOf("")-1,sentence.lastIndexOf(""));
        System.out.println("rst = " + rst);

    }






}
