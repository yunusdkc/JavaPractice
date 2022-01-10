package Strings_moretask;

public class task3 {
    public static void main(String[] args) {
  /* write a program that can check if the first and last characters of the
string are same      ex:level  output: same */

        String ytd = "Lol";

        char first = ytd.charAt(0);
        char last = ytd.charAt(ytd.length()-1);
        String f = "" + first;
        String w = "" + last;
        System.out.println("ytd = " + ytd);
        if(f.equalsIgnoreCase(w)){
            System.out.println("same");}

        else{
            System.out.println("not same");
        }


/*
*
*       treeword.(0inde
*
*  */









    }





}
