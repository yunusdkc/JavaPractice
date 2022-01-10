package Strings_class;

public class string_substring {
    public static void main(String[] args) {

        String str="java programing";
      String result1=  str.substring(4,12);
      String result2 = str.substring(str.indexOf('a'),str.indexOf('g')); // g dahil olmadi onemli bir point !!!
        String result3 = str.substring(str.indexOf(" ")+1,str.lastIndexOf('a'));
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
      System.out.println("str = " + str);
        System.out.println("result1 = " + result1);


       String last_result = result1.repeat(5).toUpperCase();

        System.out.println("last_result = " + last_result);















    }

















}
