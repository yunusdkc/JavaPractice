package whileloop;

import java.rmi.ServerError;
import java.util.Scanner;

public class login {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String username = "Cydeo";
        String password ="Cydeo123";

        System.out.println("Please enter your username");
        String u = scan.next();


        System.out.println("Please enter your password");
        String p = scan.next();

        if (u.equals("Cydeo")&& p.equals("Cydeo123")){

            System.out.println("you logged in");

        }
else {
            System.err.println("please try again you have 3 attempts");

            for (int i = 0; i <3 ; i++) {
                System.err.println("incorrect username or password ");
                System.out.println("Please re enter your username");
                u = scan.next();

                System.out.println("Please  re enter your password");
                p = scan.next();

                if (u.equals("Cydeo")&& p.equals("Cydeo123")){

                    System.out.println("you logged in");
                break;
                }

            }

            if (!(u.equals("Cydeo")&& p.equals("Cydeo123"))){

                System.err.println("your account is locked");
            }
        }







    }










}
