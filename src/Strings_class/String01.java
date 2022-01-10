package Strings_class;

public class String01 {

    public static void main(String[] args) {


        String word = "blue";

        System.out.println("word = " + word);

        String word2 = "blue";
        System.out.println(word == word2);

        String w1 = new String("blue");

        System.out.println(word==w1);

       // UPPERcase method
        word = word.toUpperCase();

        System.out.println("word = " + word);

        w1 = w1.toUpperCase();
        System.out.println("w1 = " + w1);
    //  index number char method
      /* word = blue
                0123 index numbers
      charAt(int number)
       */
        char a = word.charAt(2);
        System.out.println("a = " + a);


        System.out.println(word.length());










    }





}
