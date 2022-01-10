package dayOf_Scanner;

import java.util.Scanner;

public class scanner_cents {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter cents: ");
     int money = input.nextInt();

        int dollar = money/100;

        int cent = money%100;

        System.out.println(money +" cents equal to: " + dollar+ " dollar and " + cent+ " cents");





    }












}
