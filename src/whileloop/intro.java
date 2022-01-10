package whileloop;

import java.util.Scanner;

public class intro {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("will you marry me:)");
        String answer = scan.next();
        while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {

            System.err.println("invalid enter please re enter");
            answer = scan.next();




        }

        if(answer.equalsIgnoreCase("yes")){

            System.out.println("I love you");
        }
        else{
            System.out.println("your choice");

        }

    }
}