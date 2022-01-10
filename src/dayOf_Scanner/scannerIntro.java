package dayOf_Scanner;
//import java.util.*;  // wild import: imports everything from the package
import java.util.Scanner;

public class scannerIntro {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int number1 = input.nextInt();
        System.out.println("number1 = " + number1);
        boolean result =input.nextBoolean();
        System.out.println("result = " + result);

        input.close();



    }




}
