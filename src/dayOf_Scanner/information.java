package dayOf_Scanner;

import java.util.Scanner;

public class information {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter your full name");
        String name = input.nextLine();
        System.out.println("enter you age");
        int age = input.nextInt();
        System.out.println("enter your gpa");
        double gpa = input.nextDouble();
        System.out.println("enter you marital status");
        String status = input.next();
         input.close();

        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gpa = " + gpa);
        System.out.println("status = " + status);








    }



}
