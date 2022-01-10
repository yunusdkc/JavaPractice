
package day06_PRIMITIVEcASTING;
import java.util.Scanner;

public class secondCalculate {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter seconds:");
        int inputSeconds = userInput.nextInt();

        // // CONTINUE WRITE YOUR CODE BELOW THIS LINE:

        int hours = inputSeconds / 3600;

        int minutes = (inputSeconds % 3600) / 60;

        int seconds = (inputSeconds % 3600) % 60;

        System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");


    }


}
