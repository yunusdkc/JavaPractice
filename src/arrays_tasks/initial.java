package arrays_tasks;

public class initial {
 /*1. create an array named classmates, and store 10 of your classmates' full names
     print the initials of each classmates in separate lines*/

    public static void main(String[] args) {

        String[] ytd = {"yunus taha", "taha yunus", "sayin dikici", "yunus dikici", "dikici yunus"};


        for (int i = 0; i < ytd.length; i++) {
          String a=  ytd[i];

        String f =  a.substring(0,1); //charAt(0);
         char l = a.charAt(a.indexOf(" ")+1);
         String j = l+"";
           System.out.println(f.toUpperCase()+". "+ j.toUpperCase());
           /* System.out.println("f = " + f);
            System.out.println("l = " + l);
        */}










    }










}

