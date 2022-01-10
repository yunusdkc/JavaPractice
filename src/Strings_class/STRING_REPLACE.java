package Strings_class;
public class STRING_REPLACE {
    public static void main(String[] args) {

        int number = 505;  // we can not use  replace method here because all method just for strings not int number!!!
        String sentence = "ytd java yunus taha java programing";
        String word ="bellevue";

        System.out.println(word.replace("e","i"));
        System.out.println(word.charAt(1));

        String new1 =sentence.replace("ytd","java");
        System.out.println("new1 = " + new1);

        System.out.println(sentence.charAt(1));

       String new2 = word.replaceFirst("l","n");
        System.out.println("new2 = " + new2);
















    }


}
