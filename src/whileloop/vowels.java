package whileloop;

import java.util.Scanner;

public class vowels {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();


        for (int i = 0; i < word.length(); i++) {
            String a = "" + word.charAt(i);
            a = a.toLowerCase();
            if (a.contains("a") || a.contains("e") || a.contains("o") || a.contains("u") || a.contains("i")) {
                System.out.println(a);

            }

        }
    }

}
