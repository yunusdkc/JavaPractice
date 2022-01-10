package day08_If_Condition;

public class If_numbers {

    public static void main(String[] args) {

        int number = 301;

        boolean evenNumber = number % 2 == 0;
        boolean oddNumber = !evenNumber;

        if (evenNumber) {



        }
        else {
            System.out.println(number+"is odd number");
        }
    }
}