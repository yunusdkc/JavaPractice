package Strings_class;

public class String_methods {

    public static void main(String[] args) {
String str = "pickles";
//            0123456
        //charAt, length, upperCase, lowerCase,trim
// charAt  parentez in ici int olmasi gerek index number,
 char a = str.charAt(3);
        System.out.println("a = " + a); // pickles

        System.out.println(str.length());   // it shows us the number of charters
        int index_number = str.length()-1 ;
        System.out.println("index_number = " + index_number);
   String upper = str.toUpperCase();
        System.out.println("upper = " + upper);

        String lower = str.toLowerCase();
        System.out.println("lower = " + lower);

        String str2 = "         java       programing         ";
        System.out.println("str2 = " + str2);

   String str3 = str2.trim();
        System.out.println("str3 = " + str3);











    }








}
