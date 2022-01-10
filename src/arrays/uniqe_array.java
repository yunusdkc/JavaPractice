package arrays;
import java.util.Arrays;
public class uniqe_array {
   public static void main(String[] args) {
        String[] ytd = {"ytd", "yunus", "muz", "yunus", "muz"};

        int count = 0;
        System.out.println(Arrays.toString(ytd));

        for (int i = 0; i < ytd.length; i++) {
            String element = ytd[i];
            for (int i1 = 0; i1 < ytd.length; i1++) {

                if (element.equals(ytd[i1])) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println("element = " + element);
            }
        }

    }
/*public static void main(String[] args) {
    String ytd = "aabbgfty";

    for (int i = 0; i < ytd.length(); i++) {
char a = ytd.charAt(i);
        int count=0;
        for (int j = 0; j < ytd.length(); j++) {

           if (ytd.charAt(j)== a){
               count++;
           }


        }
        if(count==1){
            System.out.println(a);
        }
    }

}*/


















}
















