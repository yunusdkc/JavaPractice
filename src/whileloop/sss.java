package whileloop;

import java.util.Scanner;

public class sss {
    public static class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            char start = scan.next().charAt(0);
            char end = scan.next().charAt(0);
            scan.close();
            for (char i = start; i <= end; i++) {

                System.out.println(i);
            }


        }
    }
}
