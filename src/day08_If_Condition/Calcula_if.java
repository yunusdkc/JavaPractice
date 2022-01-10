package day08_If_Condition;

public class Calcula_if {

    /*
2. Create a class called Calculator, Given two double variables named n1 & n2, and a char variable named mathOperator, write a program that can calculate result of n1&n2 based on the given math Operator.

		char operator -> -, +, *, /

		when operator is + : add num1, num2
		when operator: - : minus num1, num2
		when operator: * : multiply num1, num2
		when operator: / : divide num1, num2
		for any other operators: print "invalid operator"

		Ex:
			n1 = 10, n2= 20, mathOperator = '+'

		output:
			30

     */

    public static void main(String[] args) {

        double num1 = 7;
        double num2 = 9;
        double result1;

        char opretor = '*';


       if(opretor=='+' ||opretor=='-' || opretor=='*' || opretor == '/' ) {
           if (opretor == '+') {
               result1 = num1 + num2;
           } else if (opretor == '-') {
               result1 = num1 - num2;
           } else if (opretor == '*') {
               result1 = num1 * num2;
           } else {
               result1 = num1 / num2;
           }

           System.out.println(result1);
       }
    else {
           System.out.println("invalid operator");
       }
    }
}