package dayOf_Scanner;
import java.util.Scanner;
public class Scanner_Week {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the number between 1-7");
        int day = input.nextInt();
        String today = "";
        if (day > 0 && day < 8) {

            switch (day) {
                case 1:
                    today = "monday";
                    break;
                case 2:
                    today = "tuesday";
                    break;

                case 3:
                    today = "wednesday";
                    break;

                case 4:
                    today = "thursday";
                    break;

                case 5:
                    today = "friday";
                    break;
                case 6:
                    today = "saturday";
                    break;

                default:
                    today = "sunday";


            }
            System.out.println("today = " + today);

        } else {
            System.out.println("invalid number");

        }
        input.close();

    }
}
