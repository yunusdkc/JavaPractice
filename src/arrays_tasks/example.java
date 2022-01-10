package arrays_tasks;

import java.util.Arrays;
import java.util.Locale;

public class example {
    /*create an array named classmates, and store 5 of your classmates'
full names
print the initials of each classmates in separate lines*/

    public static void main(String[] args) {



        String[] names = {"necati Kartal","Kaan cankurt","Muzaffer  Dokan","yunus Dikici","Elif dastan"};


  /*      for (int i = 0; i < names.length; i++) {

          String name = names[i];

            System.out.println(name);
           name =name.toUpperCase();
           char first= name.charAt(0);
           char last = name.charAt(name.lastIndexOf(" ")+1);

           // System.out.println("first = " + first);
           // System.out.println("last = " + last);

            System.out.println(first + "." +last);
        }


*/
        for (String name : names) {
            name = name.toUpperCase();
            char first= name.charAt(0);
            char last = name.charAt(name.lastIndexOf(" ")+1);

            System.out.println(first + "."+last);
        }








    }














}
