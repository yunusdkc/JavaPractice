package dayOf_Scanner;

import java.util.Scanner;

public class task_scanner {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("please enter your current speed limit");
        int current_lim = input.nextInt();
        int speed_lim = 60;
        if (current_lim > speed_lim) {
            System.out.println("your speed is " + current_lim + " you are driving " + (current_lim - speed_lim) +
                    " mph above the speed limit" + " please slow down!");


        }
        else if (current_lim < speed_lim ){
            System.out.println("your speed is " + current_lim + " you are driving " + (speed_lim - current_lim) +
                    " mph under the speed limit" + " please follow the rules!");


        }
  else{
            System.out.println("your speed is "+ current_lim + " thank you for following the rules" );
        }

    }


}
