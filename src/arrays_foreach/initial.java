package arrays_foreach;

import java.util.Arrays;

public class initial {
    public static void main(String[] args) {

   String[] words = {"Java Programming", "Cydeo School", "Wooden Spoon", "Early Birds", "Angry Birds"};

   for (String each:words){
       System.out.println(each.charAt(0)+"." +each.charAt(each.indexOf(" ")+1)+"." );


   }

        System.out.println("------------------------------------------------");


   String  ytd = "I love java programing language ";
   String boss [] = ytd.split(" ");
        System.out.println(Arrays.toString(boss));
       String[] boss2 = Arrays.copyOfRange(boss,3,5);

        System.out.println(Arrays.toString(boss2));
char[] ari =  ytd.toCharArray();
        System.out.println(Arrays.toString(ari));

String [] re = ytd.split("");
        System.out.println(Arrays.toString(re));


    }
}
