package dayOf_Scanner;

import java.util.Scanner;

public class Scanner_inputs {
        public static void main(String[] args) {


                Scanner input = new Scanner(System.in);

                System.out.println("enter a byte number");
               byte a = input.nextByte();
                System.out.println("a = " + a);

                System.out.println("enter a integer number");
                int num1 = input.nextInt();

                System.out.println("num1 = " + num1);
                System.out.println("enter the long number");
                long digits = input.nextLong();
                System.out.println("digits = " + digits);
                System.out.println("enter a word");
                String one = input.next();
                System.out.println("one = " + one);
            System.out.println("enter whatever you want");
               input.nextLine();
                String ytd = input.nextLine();
            System.out.println("ytd = " + ytd);
           input.close();



        }

        }
