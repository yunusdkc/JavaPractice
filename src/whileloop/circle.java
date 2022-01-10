package whileloop;

import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("enter a radius:");
            double radius = scan.nextDouble();
            if (radius <= 0) {
                System.err.println("invalid entry");
                System.exit(0);
            }
            double diameter = 2 * radius;
            double area = (3.14) * radius * radius;
            double perimeter = diameter * (3.14);
            System.out.println("diameter = " + diameter);
            System.out.println("perimeter = " + perimeter);
            System.out.println("area = " + area);

            System.out.println("Would you like to calculate another cycle");
            String answer = scan.next();
            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                System.err.println("invalid entry - please re entry");
                System.out.println("Would you like to calculate another cycle");
                answer = scan.next();
            }
            if (answer.equalsIgnoreCase("no")) {
                System.out.println("thank you:)");
                break;
            }
        }
    }

}
