package day08_If_Condition;

public class If_pract2 {
    public static void main(String[] args) {

        int a = 8;
        int b = 69;
        int c = 1;


        if (a > b && b > c || (c > b && b > a)) {
            System.out.println("median is b");

        } else {
            System.out.println("b is not median");
        }


    }
}