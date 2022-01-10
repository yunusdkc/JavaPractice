package whileloop;

import java.util.Scanner;

public class cal_loopp {
/*
3. Write a program that can calculate two numbers.
			1. Ask user to enter the first number
			2. Ask user to enter a math operator (+,-,/,*)
				(if user enters any invalid operator, repeat this step until user provides a valid operator)
			3. Ask user to enter the second number
			4. Display the result
			5. Ask user if they want to continue? (yes/no)
				if yes ==> repeat the entire steps
				if no ==> print "Thanks for using Cydeo calculator!"
				If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry */


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

      while(true) {
          System.out.println("enter your first number");
          double num1 = input.nextDouble();
          System.out.println("enter a math operator (+,-,*,/)");
          String operator = input.next();
          while (!(operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/"))) {
              System.err.println("invalid operator please re enter");
              operator = input.next();
          }
          System.out.println("enter your second number");
          double num2 = input.nextDouble();
          double result = 0;

          if (operator.equals("+")) {
              result = num1 + num2;
          }
          if (operator.equals("*")) {
              result = num1 * num2;
          }
          if (operator.equals("-")) {
              result = num1 - num2;
          }
          if (operator.equals("/")) {
              result = num1 / num2;
          }
          System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
          System.out.println("result = " + result);
          System.out.println("do you want to continue");
         String answer= input.next();

          while(!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))){
              System.err.println("invalid entry please re enter");
              System.out.println("do you want to continue  (yes or no)");
              answer= input.next();
          }
          if(answer.equalsIgnoreCase("no")){
              System.out.println("thank you to choosing us:)");
              break;
          }

          for (int i = 0; i < 10; i+=2) {
              System.out.println(i);
          }


      }
        input.close();






    }
}