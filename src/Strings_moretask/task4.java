package Strings_moretask;

public class task4 {
/* 4. write a program that can return the initials of the user
ex: cybertek school     output: C.S
Note: Pay attention to the example output */

    public static void main(String[] args) {

        String ytd = "Yunus dikici";

        char first= ytd.toUpperCase().charAt(0); //      char first =   C
        char last= ytd.toUpperCase().charAt(ytd.indexOf(" ")+1);  //  S

        System.out.println(first + "." + last);










    }


}
